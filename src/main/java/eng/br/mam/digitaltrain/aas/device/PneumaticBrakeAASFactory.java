package eng.br.mam.digitaltrain.aas.factory.device;

import eng.br.mam.digitaltrain.aas.map.device.PneumaticBrakeAAS;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;

public class PneumaticBrakeAASFactory extends DeviceAASFactory {
	
	public PneumaticBrakeAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public PneumaticBrakeAAS build() {
		return new PneumaticBrakeAAS(getServiceSM(), getStatusSM());
	}

}
