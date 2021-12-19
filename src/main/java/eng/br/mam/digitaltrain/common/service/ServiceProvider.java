package eng.br.mam.digitaltrain.common.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.operation.Operation;

public abstract class ServiceProvider implements IServiceProvider {
	
	private List<IService>  serviceList;
	
	public ServiceProvider(List<IService> serviceList){
		this.serviceList = serviceList;
	}

	public ServiceProvider(){
		this.serviceList = new ArrayList<IService>();
	}
	
	protected void addService(IService service) {
		serviceList.add(service);
	}
	
	@Override
	public List<IService> getServiceList(){
		return serviceList;
	}
	
	@Override
	public SubmodelElementCollection getServiceCollection() {
		SubmodelElementCollection serCol = new SubmodelElementCollection("Services");
		for (IService service : getServiceList()) {
			Operation op = new Operation(service.getIdShort());
			if (!Objects.isNull(op.getInputVariables())) {
				op.setInputVariables(service.getInputVariables());
			}
			if (!Objects.isNull(op.getOutputVariables())) {
				op.setOutputVariables(service.getOutputVariables());
			}
			op.setInvokable(service.getInvokable());
			op.setDescription(service.getDescription());
			serCol.addSubmodelElement(op);
		}
		
		return serCol;
	}
	
}
