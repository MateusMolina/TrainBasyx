package eng.br.mam.digitaltrain.aas.map.track;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.api.track.ITrackAAS;
import eng.br.mam.digitaltrain.submodel.api.common.IMaintenanceSM;
import eng.br.mam.digitaltrain.submodel.api.track.ITrackTopologySM;

public class TrackAAS extends AssetAdministrationShell implements ITrackAAS {

	private IMaintenanceSM maintenanceSM;
	public TrackAAS(IMaintenanceSM maintenanceSM, ITrackTopologySM trackTopologySM) {
		super();
		this.maintenanceSM = maintenanceSM;
		this.trackTopologySM = trackTopologySM;
	}

	private ITrackTopologySM trackTopologySM;
	
	public IMaintenanceSM getMaintenanceSM() {
		return maintenanceSM;
	}

	public ITrackTopologySM getTrackTopologySM() {
		return trackTopologySM;
	}

}
