package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

public interface IServiceSM extends ISubmodel {
	public ISubmodelElementCollection getServicesCollection();
	public Object[] callService(String serviceIdShort, Object... params);

}
