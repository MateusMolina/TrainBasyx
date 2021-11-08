package eng.br.mam.digitaltrain.aas.device.compressor;

import eng.br.mam.digitaltrain.aas.device.DeviceAASFactory;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;

public class CompressorAASFactory extends DeviceAASFactory {
	
	public CompressorAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public CompressorAAS build() {
		return new CompressorAAS(getServiceSM(), getStatusSM());
	}

}
