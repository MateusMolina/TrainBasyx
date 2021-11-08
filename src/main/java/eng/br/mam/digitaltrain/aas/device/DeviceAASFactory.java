package eng.br.mam.digitaltrain.aas.device;

import eng.br.mam.digitaltrain.aas.common.CommonFactory;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

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
