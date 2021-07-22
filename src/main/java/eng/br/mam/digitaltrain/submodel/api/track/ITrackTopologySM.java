package eng.br.mam.digitaltrain.submodel.api.track;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public interface ITrackTopologySM extends ISubmodel {
	public SubmodelElementCollection getTopology();
}
