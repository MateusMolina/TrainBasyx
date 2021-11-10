package eng.br.mam.digitaltrain.component.aas.engine;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.component.ComponentFactory;

public class EngineAASFactory extends ComponentFactory {
	
	public EngineAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public EngineAAS build() {
		return new EngineAAS(getServiceSM(), getStatusSM());
	}

}
