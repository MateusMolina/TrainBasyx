package eng.br.mam.digitaltrain.aas.track;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.qualifiers.Maintainable;
import eng.br.mam.digitaltrain.submodel.track.ITrackTopologySM;

public interface ITrackAAS extends IAssetAdministrationShell, Maintainable {	
	public ITrackTopologySM getTrackTopologySM();  // Data about track elevation y(km), curvature p(km)
}
