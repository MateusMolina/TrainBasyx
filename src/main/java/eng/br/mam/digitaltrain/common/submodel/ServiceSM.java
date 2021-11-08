package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public abstract class ServiceSM extends Submodel implements IServiceSM {
	
	private String servicesId;
	
	
	public ServiceSM(SubmodelElementCollection services) {
		super();
		this.addSubmodelElement(services);
		this.servicesId = services.getIdShort();
	}
	
	@Override
	public ISubmodelElementCollection getServices() {
		return (SubmodelElementCollection) this.getSubmodelElement(servicesId);
	}

	@Override
	public Object callService(String name, Object... params) {
		// TODO To implement caller
		return null;
	}

}
