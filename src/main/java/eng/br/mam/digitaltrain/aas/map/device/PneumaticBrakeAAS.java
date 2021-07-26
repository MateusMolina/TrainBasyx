package eng.br.mam.digitaltrain.aas.map.device;

import eng.br.mam.digitaltrain.aas.api.device.IPneumaticBrakeAAS;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

public class PneumaticBrakeAAS extends BaseDeviceAAS implements IPneumaticBrakeAAS {

	public PneumaticBrakeAAS(IServiceSM serviceSM, IStatusSM statusSM) {
		super(serviceSM, statusSM);
	}

}
