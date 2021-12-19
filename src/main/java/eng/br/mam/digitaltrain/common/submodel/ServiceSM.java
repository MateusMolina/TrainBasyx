package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.common.service.IServiceProvider;

public class ServiceSM extends Submodel implements IServiceSM {

	public static final String IDSHORT = "serviceSM";
	public static final String IDSHORT_SERVICES = "services";

	
	public ServiceSM(IIdentifier ident, IServiceProvider serviceProvider) {
		super(IDSHORT, ident);		
		this.addSubmodelElement(serviceProvider.getServiceCollection());
	}
	
	@Override
	public SubmodelElementCollection getServicesCollection() {
		return (SubmodelElementCollection) this.getSubmodelElement(IDSHORT_SERVICES);
	}

	@Override
	public Object[] callService(String serviceIdShort, Object... params) {
		throw new RuntimeException("callService not available in local mode");
	}


}
