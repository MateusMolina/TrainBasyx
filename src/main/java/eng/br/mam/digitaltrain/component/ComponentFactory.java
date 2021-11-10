package eng.br.mam.digitaltrain.component;

import eng.br.mam.digitaltrain.common.CommonFactory;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

public class ComponentFactory {
	private ServiceSM serviceSM;
	private StatusSM statusSM;
	
	public ComponentFactory(ServiceSM serviceSM) {
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
