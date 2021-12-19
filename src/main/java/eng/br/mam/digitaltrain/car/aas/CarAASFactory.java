package eng.br.mam.digitaltrain.car.aas;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

import eng.br.mam.digitaltrain.common.service.IServiceProvider;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StateSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

public class CarAASFactory {	

	public static StatusSM buildStatusSM(String aasId) {
		return new StatusSM(aasId);
	}
	
	public static MaintenanceSM buildMaintenanceSM(String aasId) {
		return new MaintenanceSM(aasId);
	}
	
	public static ServiceSM buildServiceSM(String aasId, IServiceProvider serviceProvider) {
		return new ServiceSM(aasId, serviceProvider);
	}
	
	public static StateSM buildStateSM(String aasId, Double mass) {
		SubmodelElementCollection col = new SubmodelElementCollection();
		col.addSubmodelElement(new Property("mass", mass));
		col.addSubmodelElement(new Property("speed", 0.0));
		return new StateSM(aasId, col);
	}
}
