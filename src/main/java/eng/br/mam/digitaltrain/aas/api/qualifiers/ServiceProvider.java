package eng.br.mam.digitaltrain.aas.api.qualifiers;

import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

public interface ServiceProvider {
	public IServiceSM getServiceSM();
	public IStatusSM getStatusSM();
}
