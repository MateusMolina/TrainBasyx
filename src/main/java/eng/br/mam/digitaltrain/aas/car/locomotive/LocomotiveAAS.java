package eng.br.mam.digitaltrain.aas.car.locomotive;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.aas.car.CarAAS;
import eng.br.mam.digitaltrain.submodel.car.StateSM;
import eng.br.mam.digitaltrain.submodel.car.locomotive.ILocomotiveSM;
import eng.br.mam.digitaltrain.submodel.car.locomotive.LocomotiveSM;
import eng.br.mam.digitaltrain.submodel.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

public class LocomotiveAAS extends CarAAS implements ILocomotiveAAS {
	
	private IIdentifier locomotiveId;

	public LocomotiveAAS(ServiceSM serviceSM, StatusSM statusSM, MaintenanceSM maintenanceSM, StateSM stateSM, LocomotiveSM locomotiveSM) {
		super(serviceSM, statusSM, maintenanceSM, stateSM);
		addSubmodel(locomotiveSM);
		setIdShort("LocomotiveAAS");
		this.locomotiveId = locomotiveSM.getIdentification();
	}

	@Override
	public ILocomotiveSM getLocomotiveSM() {
		return (LocomotiveSM) this.getSubmodel(locomotiveId);
	}

}
