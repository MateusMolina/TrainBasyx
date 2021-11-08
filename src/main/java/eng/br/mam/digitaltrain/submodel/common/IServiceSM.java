package eng.br.mam.digitaltrain.submodel.api.common;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

public interface IServiceSM extends ISubmodel {
	public ISubmodelElementCollection getServices();
	public Object callService(String name, Object... params);
//	public AssetAdministrationShell getAAS();

}
