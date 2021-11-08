package eng.br.mam.digitaltrain.submodel.map.common;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

import eng.br.mam.digitaltrain.submodel.api.common.IMaintenanceSM;

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

	public ISubmodelElementCollection getMaintenanceMetadata() {
		return (SubmodelElementCollection) this.getSubmodelElement(maintenanceMetadataId);
	}

	public IProperty getMaintenanceStatus() {
		return (Property) this.getSubmodelElement(maintenanceStatusId);
	}

}
