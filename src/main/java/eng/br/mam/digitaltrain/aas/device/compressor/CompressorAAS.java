package eng.br.mam.digitaltrain.aas.device.compressor;

import eng.br.mam.digitaltrain.aas.device.BaseDeviceAAS;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

public class CompressorAAS extends BaseDeviceAAS implements ICompressorAAS {

	public CompressorAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("CompressorAAS");
	}

}
