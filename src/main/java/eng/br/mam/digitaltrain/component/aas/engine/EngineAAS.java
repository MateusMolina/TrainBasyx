package eng.br.mam.digitaltrain.component.aas.engine;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;
import eng.br.mam.digitaltrain.component.aas.ComponentAAS;

public class EngineAAS extends ComponentAAS implements IEngineAAS {

	public EngineAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("EngineAAS");
	}

}
