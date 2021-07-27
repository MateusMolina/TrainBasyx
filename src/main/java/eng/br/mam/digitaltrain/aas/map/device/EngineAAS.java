package eng.br.mam.digitaltrain.aas.map.device;

import eng.br.mam.digitaltrain.aas.api.device.IEngineAAS;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;

public class EngineAAS extends BaseDeviceAAS implements IEngineAAS {

	public EngineAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
	}

}
