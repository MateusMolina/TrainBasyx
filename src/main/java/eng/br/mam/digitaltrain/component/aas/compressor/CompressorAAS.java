package eng.br.mam.digitaltrain.component.aas.compressor;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;
import eng.br.mam.digitaltrain.component.aas.ComponentAAS;

public class CompressorAAS extends ComponentAAS implements ICompressorAAS {

	public CompressorAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super(serviceSM, statusSM);
		setIdShort("CompressorAAS");
	}

}
