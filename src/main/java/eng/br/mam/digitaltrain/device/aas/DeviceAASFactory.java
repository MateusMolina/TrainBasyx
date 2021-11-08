package eng.br.mam.digitaltrain.device.aas;

import eng.br.mam.digitaltrain.common.CommonFactory;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

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
