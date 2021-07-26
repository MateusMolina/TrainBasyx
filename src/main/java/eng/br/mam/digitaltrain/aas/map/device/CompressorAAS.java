package eng.br.mam.digitaltrain.aas.map.device;

import eng.br.mam.digitaltrain.aas.api.device.ICompressorAAS;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

public class CompressorAAS extends BaseDeviceAAS implements ICompressorAAS {

	public CompressorAAS(IServiceSM serviceSM, IStatusSM statusSM) {
		super(serviceSM, statusSM);
	}

}
