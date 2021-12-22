package eng.br.mam.digitaltrain.car.aas.locomotive;

import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.car.aas.CarAAS;
import eng.br.mam.digitaltrain.car.submodel.locomotive.LocomotiveControlSM;
import eng.br.mam.digitaltrain.common.submodel.ComponentsSM;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StateSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

public class LocomotiveAAS extends CarAAS implements ILocomotiveAAS {
	
	public LocomotiveAAS(String idShort, IIdentifier id, Asset asset, ComponentsSM componentsSM, MaintenanceSM maintenanceSM, ServiceSM serviceSM, StateSM stateSM, StatusSM statusSM, LocomotiveControlSM locomotiveControlSM) {
		super(idShort, id, asset, componentsSM, maintenanceSM, serviceSM, stateSM, statusSM);
		addSubmodel(locomotiveControlSM);
	}

	@Override
	public LocomotiveControlSM getLocomotiveControlSM() {
		throw new RuntimeException("getLocomotiveSM() can not be execcuted locally");
	}

}
