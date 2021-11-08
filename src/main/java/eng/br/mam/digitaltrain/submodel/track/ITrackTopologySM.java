package eng.br.mam.digitaltrain.submodel.track;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

public interface ITrackTopologySM extends ISubmodel {
	public ISubmodelElementCollection getTopology();
}
