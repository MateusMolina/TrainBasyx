package eng.br.mam.digitaltrain.car.aas.locomotive;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.basyx.aas.bundle.AASBundle;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.AssetKind;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.car.aas.CarAASFactory;
import eng.br.mam.digitaltrain.car.submodel.locomotive.LocomotiveControlSM;
import eng.br.mam.digitaltrain.common.service.IServiceProvider;
import eng.br.mam.digitaltrain.common.submodel.ComponentsSM;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StateSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

public class LocomotiveAASFactory extends CarAASFactory {
		
	
	public static AASBundle buildLocomotiveAAS(String aasIdShort, String aasId, IServiceProvider serviceProvider, Double mass) {
		IIdentifier ident = new ModelUrn(aasId);
		Asset asset = new Asset(aasIdShort, ident, AssetKind.INSTANCE);
		
		ServiceSM serviceSM = buildServiceSM(aasId, serviceProvider);
		StatusSM statusSM = buildStatusSM(aasId);
		MaintenanceSM maintenanceSM = buildMaintenanceSM(aasId);
		StateSM stateSM = buildStateSM(aasId, mass);
		ComponentsSM componentsSM = buildComponentsSM(aasId);
		LocomotiveControlSM locoControlSM = new LocomotiveControlSM(aasId);
		
		Set<ISubmodel> sms = new HashSet<ISubmodel>();
		sms.add(serviceSM);
		sms.add(statusSM);
		sms.add(maintenanceSM);
		sms.add(stateSM);
		sms.add(componentsSM);
		
		LocomotiveAAS car = new LocomotiveAAS(aasIdShort, ident, asset, componentsSM, maintenanceSM, serviceSM, stateSM, statusSM, locoControlSM);
		
		AASBundle bundle = new AASBundle(car, sms);
		return bundle;
		
	}	
	
	public static ComponentsSM buildComponentsSM(String aasId) {
		ComponentsSM componentsSM = new ComponentsSM(aasId);
		// TODO to add locomotive components
		return componentsSM;
	}	

}
