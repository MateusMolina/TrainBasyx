package eng.br.mam.digitaltrain.common;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

public class CommonFactory {
	public static StatusSM getBlankStatusSM(){
		StatusSM statusSM = new StatusSM(getBlankProperty("Status"));
		return statusSM;
	}
	
	public static MaintenanceSM getBlankMaintenanceSM() {
		MaintenanceSM maintenanceSM = new MaintenanceSM(getBlankSubmodelElementCollection("MaintenanceMetadata"), getBlankProperty("MaintenanceStatus"));
		return maintenanceSM;
	}
	
	public static SubmodelElementCollection getBlankSubmodelElementCollection(String shortId) {
		return new SubmodelElementCollection(shortId);
	}
	
	public static Property getBlankProperty(String shortId) {
		return new Property(shortId, "");
	}
}
