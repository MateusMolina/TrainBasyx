package eng.br.mam.digitaltrain.aas.qualifiers;

import eng.br.mam.digitaltrain.submodel.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.common.IStatusSM;

public interface ServiceProvider {
	public IServiceSM getServiceSM();
	public IStatusSM getStatusSM();
}
