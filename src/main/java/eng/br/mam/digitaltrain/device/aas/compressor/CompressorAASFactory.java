package eng.br.mam.digitaltrain.device.aas.compressor;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.device.aas.DeviceAASFactory;

public class CompressorAASFactory extends DeviceAASFactory {
	
	public CompressorAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public CompressorAAS build() {
		return new CompressorAAS(getServiceSM(), getStatusSM());
	}

}
