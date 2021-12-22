package eng.br.mam.digitaltrain.component.aas;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.basyx.aas.bundle.AASBundle;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.AssetKind;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.StateSM;

public class ComponentAASFactory {
	
	public static AASBundle buildComponentAAS(String aasIdShort, String aasId) {
		
		IIdentifier ident = new ModelUrn(aasId);
		Asset asset = new Asset(aasIdShort, ident, AssetKind.INSTANCE);
		
		MaintenanceSM maintenanceSM = buildMaintenanceSM(aasId);
		StateSM stateSM = new StateSM(aasId);
		
		Set<ISubmodel> sms = new HashSet<ISubmodel>();
		sms.add(maintenanceSM);
		sms.add(stateSM);
		
		ComponentAAS car = new ComponentAAS(aasIdShort, ident, asset, stateSM, maintenanceSM);
		
		AASBundle bundle = new AASBundle(car, sms);
		return bundle;
		
	}
	
	public static MaintenanceSM buildMaintenanceSM(String aasId) {
		return new MaintenanceSM(aasId);
	}
}
