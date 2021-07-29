package eng.br.mam.digitaltrain.aas.factory.device;

import eng.br.mam.digitaltrain.aas.map.device.EngineAAS;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;

public class EngineAASFactory extends DeviceAASFactory {
	
	public EngineAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public EngineAAS build() {
		return new EngineAAS(getServiceSM(), getStatusSM());
	}

}
