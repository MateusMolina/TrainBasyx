package eng.br.mam.digitaltrain.aas.map.car;

import eng.br.mam.digitaltrain.aas.api.car.ILocomotiveAAS;
import eng.br.mam.digitaltrain.submodel.api.car.ILocomotiveSM;
import eng.br.mam.digitaltrain.submodel.api.car.IStateSM;
import eng.br.mam.digitaltrain.submodel.api.common.IMaintenanceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

public class LocomotiveAAS extends CarAAS implements ILocomotiveAAS {
	
	private ILocomotiveSM locomotiveSM;

	public LocomotiveAAS(IServiceSM serviceSM, IStatusSM statusSM, IMaintenanceSM maintenanceSM, IStateSM stateSM, ILocomotiveSM locomotiveSM) {
		super(serviceSM, statusSM, maintenanceSM, stateSM);
		this.locomotiveSM = locomotiveSM;
	}

	public ILocomotiveSM getLocomotiveSM() {
		return locomotiveSM;
	}

}
