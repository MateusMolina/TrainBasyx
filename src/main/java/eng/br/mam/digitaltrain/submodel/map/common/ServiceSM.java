package eng.br.mam.digitaltrain.submodel.map.common;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;

public abstract class ServiceSM extends Submodel implements IServiceSM {
	
	private String servicesId;
	
	
	public ServiceSM(SubmodelElementCollection services) {
		super();
		this.addSubmodelElement(services);
		this.servicesId = services.getIdShort();
	}
	
	public ISubmodelElementCollection getServices() {
		return (SubmodelElementCollection) this.getSubmodelElement(servicesId);
	}

	public Object callService(String name, Object... params) {
		// TODO To implement caller
		return null;
	}

}
