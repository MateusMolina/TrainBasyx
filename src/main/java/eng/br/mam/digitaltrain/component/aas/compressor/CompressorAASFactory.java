package eng.br.mam.digitaltrain.component.aas.compressor;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.component.ComponentFactory;

public class CompressorAASFactory extends ComponentFactory {
	
	public CompressorAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public CompressorAAS build() {
		return new CompressorAAS(getServiceSM(), getStatusSM());
	}

}
