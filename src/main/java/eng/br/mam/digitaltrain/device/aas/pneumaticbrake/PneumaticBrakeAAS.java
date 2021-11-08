package eng.br.mam.digitaltrain.device.aas.pneumaticbrake;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;
import eng.br.mam.digitaltrain.device.aas.BaseDeviceAAS;

public class PneumaticBrakeAAS extends BaseDeviceAAS implements IPneumaticBrakeAAS {

	public PneumaticBrakeAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("PneumaticBrakeAAS");
	}

}
