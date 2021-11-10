package eng.br.mam.digitaltrain.track.aas;

import org.eclipse.basyx.aas.metamodel.connected.ConnectedAssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.connected.ConnectedSubmodel;
import org.eclipse.basyx.vab.modelprovider.VABElementProxy;

import eng.br.mam.digitaltrain.common.submodel.IMaintenanceSM;
import eng.br.mam.digitaltrain.track.submodel.ConnectedTrackTopologySM;
import eng.br.mam.digitaltrain.track.submodel.TrackTopologySM;

public class ConnectedTrackAAS extends ConnectedAssetAdministrationShell implements ITrackAAS {

	public ConnectedTrackAAS(VABElementProxy proxy) {
		super(proxy);
	}

	@Override
	public IMaintenanceSM getMaintenanceSM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConnectedTrackTopologySM getTrackTopologySM() {
		ConnectedSubmodel connectedSM = (ConnectedSubmodel) getSubmodel(new ModelUrn(TrackTopologySM.ID));
		return new ConnectedTrackTopologySM(connectedSM.getProxy());
	}

}
