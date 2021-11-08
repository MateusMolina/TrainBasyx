package eng.br.mam.digitaltrain.aas.device;

import eng.br.mam.digitaltrain.submodel.common.ServiceSM;

public class EngineAASFactory extends DeviceAASFactory {
	
	public EngineAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public EngineAAS build() {
		return new EngineAAS(getServiceSM(), getStatusSM());
	}

}
