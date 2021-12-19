package eng.br.mam.digitaltrain.car.aas.railcar;

import eng.br.mam.digitaltrain.car.service.LoadService;
import eng.br.mam.digitaltrain.common.service.ServiceProvider;

public class DefaultRailcarServiceProvider extends ServiceProvider {

	public DefaultRailcarServiceProvider(String serverAASId) {
		super();
		addService(new LoadService(serverAASId));
	}
	
}
