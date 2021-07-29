package eng.br.mam.digitaltrain.aas.factory.car;

import eng.br.mam.digitaltrain.aas.factory.common.CommonFactory;
import eng.br.mam.digitaltrain.submodel.map.car.StateSM;
import eng.br.mam.digitaltrain.submodel.map.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;

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
