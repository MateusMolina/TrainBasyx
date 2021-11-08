package eng.br.mam.digitaltrain.aas.map.device;

import eng.br.mam.digitaltrain.aas.api.device.ICompressorAAS;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;

public class CompressorAAS extends BaseDeviceAAS implements ICompressorAAS {

	public CompressorAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("CompressorAAS");
	}

}
