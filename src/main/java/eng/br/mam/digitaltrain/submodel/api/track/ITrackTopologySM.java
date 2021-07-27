package eng.br.mam.digitaltrain.submodel.api.track;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

public interface ITrackTopologySM extends ISubmodel {
	public ISubmodelElementCollection getTopology();
}
