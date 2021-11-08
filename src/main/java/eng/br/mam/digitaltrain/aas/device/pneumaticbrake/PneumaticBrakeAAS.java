package eng.br.mam.digitaltrain.aas.device.pneumaticbrake;

import eng.br.mam.digitaltrain.aas.device.BaseDeviceAAS;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

public class PneumaticBrakeAAS extends BaseDeviceAAS implements IPneumaticBrakeAAS {

	public PneumaticBrakeAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("PneumaticBrakeAAS");
	}

}
