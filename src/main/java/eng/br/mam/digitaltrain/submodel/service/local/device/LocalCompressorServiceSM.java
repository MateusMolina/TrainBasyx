package eng.br.mam.digitaltrain.submodel.service.local.device;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.service.helper.SubmodelElementHelper;

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
