package eng.br.mam.digitaltrain.track.submodel;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

public interface ITrackTopologySM extends ISubmodel {
	public ISubmodelElementCollection getTopology();
}
