package eng.br.mam.digitaltrain.submodel.service.local.train;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.service.helper.SubmodelElementHelper;

public class LocalTrainServiceSM extends ServiceSM {

	public LocalTrainServiceSM() {
		super(SubmodelElementHelper.getEmptyServices());
		buildServices();
	}
	
	private void buildServices() {
		ISubmodelElementCollection services = getServices();
		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("addCar", e->addCar(e)));
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("delCar", e->delCar(e)));		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("getNumberCars", e->getNumberCars(e)));		
		
	}
	
	private Object addCar(Object[] pars) {
		return null;
	}
	private Object delCar(Object[] pars) {
		return null;
	}
	private Object getNumberCars(Object[] pars) {
		return null;
	}
	

}
