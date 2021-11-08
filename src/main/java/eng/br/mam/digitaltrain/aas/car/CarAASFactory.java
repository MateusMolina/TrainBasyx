package eng.br.mam.digitaltrain.aas.car;

import eng.br.mam.digitaltrain.aas.common.CommonFactory;
import eng.br.mam.digitaltrain.submodel.car.StateSM;
import eng.br.mam.digitaltrain.submodel.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

public abstract class CarAASFactory {
	
	private ServiceSM serviceSM;
	private StatusSM statusSM;
	private StateSM stateSM;
	private MaintenanceSM maintenanceSM;
	
	public CarAASFactory(ServiceSM serviceSM) {
		this.statusSM = CommonFactory.getBlankStatusSM();
		this.maintenanceSM = CommonFactory.getBlankMaintenanceSM();
		this.stateSM = new StateSM(CommonFactory.getBlankProperty("Mass"));
		this.serviceSM = serviceSM;
	}
	
	protected ServiceSM getServiceSM() {
		return serviceSM;
	}
	
	protected StatusSM getStatusSM() {
		return statusSM;
	}

	protected StateSM getStateSM() {
		return stateSM;
	}

	protected MaintenanceSM getMaintenanceSM() {
		return maintenanceSM;
	}
	

	
}
