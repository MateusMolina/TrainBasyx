package eng.br.mam.digitaltrain.aas.device;

import eng.br.mam.digitaltrain.submodel.common.ServiceSM;

public class CompressorAASFactory extends DeviceAASFactory {
	
	public CompressorAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public CompressorAAS build() {
		return new CompressorAAS(getServiceSM(), getStatusSM());
	}

}
