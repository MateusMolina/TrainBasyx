package eng.br.mam.digitaltrain.device.aas.engine;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;
import eng.br.mam.digitaltrain.device.aas.BaseDeviceAAS;

public class EngineAAS extends BaseDeviceAAS implements IEngineAAS {

	public EngineAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("EngineAAS");
	}

}
