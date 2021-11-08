package eng.br.mam.digitaltrain.submodel.service.local.track;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.service.helper.SubmodelElementHelper;

public class LocalTrackServiceSM extends ServiceSM {

	public LocalTrackServiceSM() {
		super(SubmodelElementHelper.getEmptyServices());
		buildServices();
	}
	
	private void buildServices() {
		ISubmodelElementCollection services = getServices();
		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("licenseTrain", e->licenseTrain(e)));
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("clearLicenses", e->clearLicense(e)));		
		services.addSubmodelElement(SubmodelElementHelper.buildOperation("setMaintenance", e->setMaintenance(e)));		

	}
	
	private Object licenseTrain(Object[] pars) {
		return null;
	}
	private Object clearLicense(Object[] pars) {
		return null;
	}	
	private Object setMaintenance(Object[] pars) {
		return null;
	}	

}
