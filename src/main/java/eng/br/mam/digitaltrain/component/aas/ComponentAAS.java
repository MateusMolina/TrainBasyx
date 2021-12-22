package eng.br.mam.digitaltrain.component.aas;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.StateSM;

public class ComponentAAS extends AssetAdministrationShell implements IComponentAAS {

	public ComponentAAS(String idShort, IIdentifier id, Asset asset, StateSM stateSM, MaintenanceSM maintenanceSM) {
		super(idShort, id, asset);
		addSubmodel(maintenanceSM);
		addSubmodel(stateSM);
	}
	
	@Override
	public StateSM getStateSM() {
		throw new RuntimeException("Can not execute getStateSM in local mode");
	}

	@Override
	public MaintenanceSM getMaintenanceSM() {
		throw new RuntimeException("Can not execute getMaintenanceSM in local mode");
	}
	
}
