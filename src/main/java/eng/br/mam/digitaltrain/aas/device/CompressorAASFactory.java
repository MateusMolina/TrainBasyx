package eng.br.mam.digitaltrain.aas.factory.device;

import eng.br.mam.digitaltrain.aas.map.device.CompressorAAS;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;

public class CompressorAASFactory extends DeviceAASFactory {
	
	public CompressorAASFactory(ServiceSM serviceSM) {
		super(serviceSM);
	}
	
	public CompressorAAS build() {
		return new CompressorAAS(getServiceSM(), getStatusSM());
	}

}
