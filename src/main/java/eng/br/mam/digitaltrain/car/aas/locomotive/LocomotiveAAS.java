package eng.br.mam.digitaltrain.car.aas.locomotive;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.car.aas.CarAAS;
import eng.br.mam.digitaltrain.car.submodel.StateSM;
import eng.br.mam.digitaltrain.car.submodel.locomotive.ILocomotiveSM;
import eng.br.mam.digitaltrain.car.submodel.locomotive.LocomotiveSM;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

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
