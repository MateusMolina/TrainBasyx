package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.submodel.metamodel.connected.ConnectedSubmodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;
import org.eclipse.basyx.vab.modelprovider.VABElementProxy;

public class ConnectedMaintenanceSM extends ConnectedSubmodel implements IMaintenanceSM {

	public ConnectedMaintenanceSM(VABElementProxy proxy) {
		super(proxy);
	}

	@Override
	public SubmodelElementCollection getMaintenanceMetadata() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getMaintenanceStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
