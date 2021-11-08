package eng.br.mam.digitaltrain.aas.device;

import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

public class EngineAAS extends BaseDeviceAAS implements IEngineAAS {

	public EngineAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("EngineAAS");
	}

}
