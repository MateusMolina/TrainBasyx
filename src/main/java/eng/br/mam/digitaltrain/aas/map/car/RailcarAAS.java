package eng.br.mam.digitaltrain.aas.map.car;

import eng.br.mam.digitaltrain.aas.api.car.IRailcarAAS;
import eng.br.mam.digitaltrain.submodel.api.car.IRailcarSM;
import eng.br.mam.digitaltrain.submodel.api.car.IStateSM;
import eng.br.mam.digitaltrain.submodel.api.common.IMaintenanceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

public class RailcarAAS extends CarAAS implements IRailcarAAS {

	private IRailcarSM railcarSM;
	public RailcarAAS(IServiceSM serviceSM, IStatusSM statusSM, IMaintenanceSM maintenanceSM, IStateSM stateSM, IRailcarSM railcarSM) {
		super(serviceSM, statusSM, maintenanceSM, stateSM);
		this.railcarSM = railcarSM;
	}

	public IRailcarSM getRailcarSM() {
		return railcarSM;
	}

}
