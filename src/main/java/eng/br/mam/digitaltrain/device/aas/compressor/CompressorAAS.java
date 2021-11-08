package eng.br.mam.digitaltrain.device.aas.compressor;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;
import eng.br.mam.digitaltrain.device.aas.BaseDeviceAAS;

public class CompressorAAS extends BaseDeviceAAS implements ICompressorAAS {

	public CompressorAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("CompressorAAS");
	}

}
