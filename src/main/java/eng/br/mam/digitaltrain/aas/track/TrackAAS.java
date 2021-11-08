package eng.br.mam.digitaltrain.aas.map.track;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.aas.api.track.ITrackAAS;
import eng.br.mam.digitaltrain.submodel.api.common.IMaintenanceSM;
import eng.br.mam.digitaltrain.submodel.api.track.ITrackTopologySM;
import eng.br.mam.digitaltrain.submodel.map.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.map.track.TrackTopologySM;

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

	public IMaintenanceSM getMaintenanceSM() {
		return (MaintenanceSM) this.getSubmodel(maintenanceId);
	}

	public ITrackTopologySM getTrackTopologySM() {
		return (TrackTopologySM) this.getSubmodel(trackTopologyId);
	}

}
