package eng.br.mam.digitaltrain.aas.factory.device;

import eng.br.mam.digitaltrain.aas.factory.common.CommonFactory;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;

public class DeviceAASFactory {
	private ServiceSM serviceSM;
	private StatusSM statusSM;
	
	public DeviceAASFactory(ServiceSM serviceSM) {
		this.serviceSM = serviceSM;
		this.statusSM = CommonFactory.getBlankStatusSM();
	}

	protected StatusSM getStatusSM() {
		return statusSM;
	}
	
	protected ServiceSM getServiceSM() {
		return serviceSM;
	}
}
