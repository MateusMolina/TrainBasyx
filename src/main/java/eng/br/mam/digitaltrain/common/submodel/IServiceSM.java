package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

public interface IServiceSM extends ISubmodel {
	public ISubmodelElementCollection getServices();
	public Object callService(String name, Object... params);
//	public AssetAdministrationShell getAAS();

}