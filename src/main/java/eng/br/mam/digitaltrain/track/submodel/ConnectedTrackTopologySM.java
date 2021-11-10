package eng.br.mam.digitaltrain.track.submodel;

import org.eclipse.basyx.submodel.metamodel.connected.ConnectedSubmodel;
import org.eclipse.basyx.submodel.metamodel.connected.submodelelement.ConnectedSubmodelElementCollection;
import org.eclipse.basyx.vab.modelprovider.VABElementProxy;

public class ConnectedTrackTopologySM extends ConnectedSubmodel implements ITrackTopologySM {

	public ConnectedTrackTopologySM(VABElementProxy proxy) {
		super(proxy);
	}

	@Override
	public ConnectedSubmodelElementCollection getTopology() {
		return (ConnectedSubmodelElementCollection) getSubmodelElement(TrackTopologySM.ID_SHORT);
	}

}
