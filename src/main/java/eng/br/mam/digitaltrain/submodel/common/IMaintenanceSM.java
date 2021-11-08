package eng.br.mam.digitaltrain.submodel.common;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;

public interface IMaintenanceSM extends ISubmodel {
	public ISubmodelElementCollection getMaintenanceMetadata();
	public IProperty getMaintenanceStatus();
	
}
