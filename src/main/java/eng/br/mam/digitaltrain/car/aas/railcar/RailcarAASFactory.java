package eng.br.mam.digitaltrain.car.aas.railcar;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.basyx.aas.bundle.AASBundle;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.AssetKind;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.car.aas.CarAASFactory;
import eng.br.mam.digitaltrain.car.submodel.railcar.RailcarSM;
import eng.br.mam.digitaltrain.common.service.IServiceProvider;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StateSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

public class RailcarAASFactory extends CarAASFactory {
		
	
	public static AASBundle buildRailcarAAS(String aasIdShort, String aasId, IServiceProvider serviceProvider, Double mass) {
		IIdentifier ident = new ModelUrn(aasId);
		Asset asset = new Asset(aasIdShort, ident, AssetKind.INSTANCE);
		
		ServiceSM serviceSM = buildServiceSM(aasId, serviceProvider);
		StatusSM statusSM = buildStatusSM(aasId);
		MaintenanceSM maintenanceSM = buildMaintenanceSM(aasId);
		StateSM stateSM = buildStateSM(aasId, mass);
		RailcarSM railcarSM = buildRailcarSM(aasId);
		
		
		Set<ISubmodel> sms = new HashSet<ISubmodel>();
		sms.add(serviceSM);
		sms.add(statusSM);
		sms.add(maintenanceSM);
		sms.add(stateSM);
		sms.add(railcarSM);
		
		RailcarAAS car = new RailcarAAS(aasIdShort,ident, asset, serviceSM, statusSM, maintenanceSM, stateSM, railcarSM);
		
		AASBundle bundle = new AASBundle(car, sms);
		return bundle;
		
	}	
	
	
	public static RailcarSM buildRailcarSM(String aasId) {
		// TODO implement method buildRailcarSM
		return null;
	}
}
