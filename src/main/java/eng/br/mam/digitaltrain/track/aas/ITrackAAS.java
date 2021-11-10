package eng.br.mam.digitaltrain.track.aas;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.common.qualifiers.Maintainable;
import eng.br.mam.digitaltrain.track.submodel.ITrackTopologySM;

public interface ITrackAAS extends IAssetAdministrationShell, Maintainable {	
	public ITrackTopologySM getTrackTopologySM();  // Data about track elevation y(km), curvature p(km)
}
