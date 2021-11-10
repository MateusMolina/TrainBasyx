package eng.br.mam.digitaltrain.component.aas.pneumaticbrake;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.component.ComponentFactory;

public class PneumaticBrakeAASFactory extends ComponentFactory {
	
	public PneumaticBrakeAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public PneumaticBrakeAAS build() {
		return new PneumaticBrakeAAS(getServiceSM(), getStatusSM());
	}

}
