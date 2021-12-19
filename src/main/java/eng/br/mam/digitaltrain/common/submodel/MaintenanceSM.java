package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

public class MaintenanceSM extends Submodel implements IMaintenanceSM {
	

	public static final String IDSHORT = "maintenanceSM";
	public static final String ID(String aasId) {
		return aasId+"_"+IDSHORT;
	};
	
	public static final String METADATA_IDSHORT = "metadata";
	public static final String STATUS_IDSHORT = "status";

	
	public MaintenanceSM(String aasId, SubmodelElementCollection maintenanceMetadata, Property maintenanceStatus) {
		super(IDSHORT, new ModelUrn(ID(aasId)));
				
		maintenanceMetadata.setIdShort(METADATA_IDSHORT);
		maintenanceStatus.setIdShort(STATUS_IDSHORT);
		
		addSubmodelElement(maintenanceMetadata);
		addSubmodelElement(maintenanceStatus);
	}
	
	/**
	 * Creates an empty MaintenanceSM
	 * 
	 * @param aasId
	 */
	public MaintenanceSM(String aasId) {
		this(aasId, 
				new SubmodelElementCollection(METADATA_IDSHORT),
				new Property(STATUS_IDSHORT));
	}

	@Override
	public SubmodelElementCollection getMaintenanceMetadata() {
		return (SubmodelElementCollection) this.getSubmodelElement(METADATA_IDSHORT);
	}

	@Override
	public Property getMaintenanceStatus() {
		return (Property) this.getSubmodelElement(STATUS_IDSHORT);
	}

}
