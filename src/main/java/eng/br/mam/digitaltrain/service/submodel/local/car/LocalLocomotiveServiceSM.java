package eng.br.mam.digitaltrain.service.submodel.local.car;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.service.submodel.helper.SubmodelElementHelper;

public class LocalLocomotiveServiceSM extends ServiceSM {

	public LocalLocomotiveServiceSM() {
		super(SubmodelElementHelper.getEmptyServices());
		buildServices();
	}
	
	private void buildServices() {
		ISubmodelElementCollection services = getServices();
		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("couple", e->couple(e)));
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("uncouple", e->uncouple(e)));		

	}
	
	private Object couple(Object[] pars) {
		return null;
	}
	private Object uncouple(Object[] pars) {
		return null;
	}
	
	

}