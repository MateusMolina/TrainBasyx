package eng.br.mam.digitaltrain.submodel.api.common;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public interface IMaintenanceSM extends ISubmodel {
	public SubmodelElementCollection getMaintenanceMetadata();
	public IProperty getMaintenanceStatus();
	
}
