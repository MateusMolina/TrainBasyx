package eng.br.mam.digitaltrain.qualifiers;

import eng.br.mam.digitaltrain.common.submodel.IServiceSM;
import eng.br.mam.digitaltrain.common.submodel.IStatusSM;

public interface ServiceProvider {
	public IServiceSM getServiceSM();
	public IStatusSM getStatusSM();
}
