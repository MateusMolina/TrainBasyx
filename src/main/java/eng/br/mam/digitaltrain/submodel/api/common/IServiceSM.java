package eng.br.mam.digitaltrain.submodel.api.common;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public interface IServiceSM extends ISubmodel {
	public SubmodelElementCollection getServices();
	public void setServices(SubmodelElementCollection services);
	public Object callService(String name, Object... params);

}
