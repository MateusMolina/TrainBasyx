package eng.br.mam.digitaltrain.service.submodel.local.device;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.service.submodel.helper.SubmodelElementHelper;

public class LocalCompressorServiceSM extends ServiceSM {

	public LocalCompressorServiceSM() {
		super(SubmodelElementHelper.getEmptyServices());
		buildServices();
	}
	
	private void buildServices() {
		ISubmodelElementCollection services = getServices();
		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("enable", e->enable(e)));
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("disable", e->disable(e)));		

	}
	
	private Object enable(Object[] pars) {
		return null;
	}
	private Object disable(Object[] pars) {
		return null;
	}
	
	

}