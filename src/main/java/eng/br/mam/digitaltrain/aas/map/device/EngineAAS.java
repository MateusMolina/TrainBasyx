package eng.br.mam.digitaltrain.aas.map.device;

import eng.br.mam.digitaltrain.aas.api.device.IEngineAAS;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

public class EngineAAS extends BaseDeviceAAS implements IEngineAAS {

	public EngineAAS(IServiceSM serviceSM, IStatusSM statusSM) {
		super(serviceSM, statusSM);
	}

}
