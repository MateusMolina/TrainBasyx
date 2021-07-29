package eng.br.mam.digitaltrain.submodel.service.local.car;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.service.helper.SubmodelElementHelper;

public class LocalRailcarServiceSM extends ServiceSM {

	public LocalRailcarServiceSM() {
		super(SubmodelElementHelper.getEmptyServices());
		buildServices();
	}
	
	private void buildServices() {
		ISubmodelElementCollection services = getServices();
		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("load", e->load(e)));
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("unload", e->unload(e)));
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("couple", e->couple(e)));		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("uncouple", e->uncouple(e)));		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("maintainance", e->maintenance(e)));		

	}
	
	private Object load(Object[] pars) {
		return null;
	}
	private Object unload(Object[] pars) {
		return null;
	}
	private Object couple(Object[] pars) {
		return null;
	}
	private Object uncouple(Object[] pars) {
		return null;
	}
	private Object maintenance(Object[] pars) {
		return null;
	}
	
	

}
