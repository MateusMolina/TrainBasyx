package eng.br.mam.digitaltrain.submodel.service.local.device;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.service.helper.SubmodelElementHelper;

public class LocalPneumaticBrakeServiceSM extends ServiceSM {

	public LocalPneumaticBrakeServiceSM() {
		super(SubmodelElementHelper.getEmptyServices());
		buildServices();
	}
	
	private void buildServices() {
		ISubmodelElementCollection services = getServices();
		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("relieve", e->relieve(e)));
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("center", e->center(e)));		
	}
	
	private Object relieve(Object[] pars) {
		return null;
	}
	private Object center(Object[] pars) {
		return null;
	}
	

}
