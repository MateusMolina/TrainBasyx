package eng.br.mam.digitaltrain.aas.map.device;

import eng.br.mam.digitaltrain.aas.api.device.IPneumaticBrakeAAS;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;

public class PneumaticBrakeAAS extends BaseDeviceAAS implements IPneumaticBrakeAAS {

	public PneumaticBrakeAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
	}

}
