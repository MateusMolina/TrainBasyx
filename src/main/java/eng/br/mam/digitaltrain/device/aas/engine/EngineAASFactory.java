package eng.br.mam.digitaltrain.device.aas.engine;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.device.aas.DeviceAASFactory;

public class EngineAASFactory extends DeviceAASFactory {
	
	public EngineAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public EngineAAS build() {
		return new EngineAAS(getServiceSM(), getStatusSM());
	}

}
