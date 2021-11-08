package eng.br.mam.digitaltrain.aas.device.pneumaticbrake;

import eng.br.mam.digitaltrain.aas.device.DeviceAASFactory;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;

public class PneumaticBrakeAASFactory extends DeviceAASFactory {
	
	public PneumaticBrakeAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public PneumaticBrakeAAS build() {
		return new PneumaticBrakeAAS(getServiceSM(), getStatusSM());
	}

}
