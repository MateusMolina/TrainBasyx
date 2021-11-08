package eng.br.mam.digitaltrain.device.aas.pneumaticbrake;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.device.aas.DeviceAASFactory;

public class PneumaticBrakeAASFactory extends DeviceAASFactory {
	
	public PneumaticBrakeAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public PneumaticBrakeAAS build() {
		return new PneumaticBrakeAAS(getServiceSM(), getStatusSM());
	}

}
