package eng.br.mam.digitaltrain.common.qualifiers;

import eng.br.mam.digitaltrain.common.submodel.IServiceSM;
import eng.br.mam.digitaltrain.common.submodel.IStatusSM;

public interface Server {
	public IServiceSM getServiceSM();
	public IStatusSM getStatusSM();
}
