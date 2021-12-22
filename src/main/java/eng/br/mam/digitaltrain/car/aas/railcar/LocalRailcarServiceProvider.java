package eng.br.mam.digitaltrain.car.aas.railcar;

import eng.br.mam.digitaltrain.car.service.LocalLoadService;
import eng.br.mam.digitaltrain.common.service.ServiceProvider;


public class LocalRailcarServiceProvider extends ServiceProvider {

	public LocalRailcarServiceProvider(String serverAASId) {
		super();
		addService(new LocalLoadService(serverAASId));
	}
	
}
