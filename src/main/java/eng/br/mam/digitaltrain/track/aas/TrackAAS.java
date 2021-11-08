package eng.br.mam.digitaltrain.track.aas;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.common.submodel.IMaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.track.submodel.ITrackTopologySM;
import eng.br.mam.digitaltrain.track.submodel.TrackTopologySM;

public class TrackAAS extends AssetAdministrationShell implements ITrackAAS {

	private IIdentifier maintenanceId;
	private IIdentifier trackTopologyId;
	
	public TrackAAS(MaintenanceSM maintenanceSM, TrackTopologySM trackTopologySM) {
		super();
		this.addSubmodel(maintenanceSM);
		this.addSubmodel(trackTopologySM);
		setIdShort("Track");
		this.maintenanceId = maintenanceSM.getIdentification();
		this.trackTopologyId = trackTopologySM.getIdentification();
	}

	@Override
	public IMaintenanceSM getMaintenanceSM() {
		return (MaintenanceSM) this.getSubmodel(maintenanceId);
	}

	@Override
	public ITrackTopologySM getTrackTopologySM() {
		return (TrackTopologySM) this.getSubmodel(trackTopologyId);
	}

}
