package eng.br.mam.digitaltrain.component.aas.pneumaticbrake;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;
import eng.br.mam.digitaltrain.component.aas.ComponentAAS;

public class PneumaticBrakeAAS extends ComponentAAS implements IPneumaticBrakeAAS {

	public PneumaticBrakeAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("PneumaticBrakeAAS");
	}

}
