package eng.br.mam.digitaltrain.aas.map.car;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.aas.api.car.ILocomotiveAAS;
import eng.br.mam.digitaltrain.submodel.api.car.ILocomotiveSM;
import eng.br.mam.digitaltrain.submodel.map.car.LocomotiveSM;
import eng.br.mam.digitaltrain.submodel.map.car.StateSM;
import eng.br.mam.digitaltrain.submodel.map.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;

public class LocomotiveAAS extends CarAAS implements ILocomotiveAAS {
	
	private IIdentifier locomotiveId;

	public LocomotiveAAS(ServiceSM serviceSM, StatusSM statusSM, MaintenanceSM maintenanceSM, StateSM stateSM, LocomotiveSM locomotiveSM) {
		super(serviceSM, statusSM, maintenanceSM, stateSM);
		addSubmodel(locomotiveSM);
		this.locomotiveId = locomotiveSM.getIdentification();
	}

	public ILocomotiveSM getLocomotiveSM() {
		return (LocomotiveSM) this.getSubmodel(locomotiveId);
	}

}
