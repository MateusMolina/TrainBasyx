package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

public class MaintenanceSM extends Submodel implements IMaintenanceSM {
	
	private String maintenanceMetadataId;
	private String maintenanceStatusId;
	
	public MaintenanceSM(SubmodelElementCollection maintenanceMetadata, Property maintenanceStatus) {
		super();
		addSubmodelElement(maintenanceMetadata);
		addSubmodelElement(maintenanceStatus);
		this.maintenanceMetadataId = maintenanceMetadata.getIdShort();
		this.maintenanceStatusId = maintenanceStatus.getIdShort();
	}

	@Override
	public ISubmodelElementCollection getMaintenanceMetadata() {
		return (SubmodelElementCollection) this.getSubmodelElement(maintenanceMetadataId);
	}

	@Override
	public IProperty getMaintenanceStatus() {
		return (Property) this.getSubmodelElement(maintenanceStatusId);
	}

}
