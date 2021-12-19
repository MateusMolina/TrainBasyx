package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.common.service.IServiceProvider;

public class ServiceSM extends Submodel implements IServiceSM {
	
	public static final String IDSHORT = "serviceSM";
	public static final String ID(String aasId) {
		return aasId+"_"+IDSHORT;
	}
	public static final String SERVICES_IDSHORT = "services";

	
	public ServiceSM(String aasId, IServiceProvider serviceProvider) {
		super(IDSHORT, new ModelUrn(ID(aasId)));		
		this.addSubmodelElement(serviceProvider.getServiceCollection());
	}
	
	@Override
	public SubmodelElementCollection getServicesCollection() {
		return (SubmodelElementCollection) this.getSubmodelElement(SERVICES_IDSHORT);
	}

	@Override
	public Object[] callService(String serviceIdShort, Object... params) {
		throw new RuntimeException("callService not available in local mode");
	}


}
