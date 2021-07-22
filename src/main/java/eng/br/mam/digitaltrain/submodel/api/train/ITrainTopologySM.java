package eng.br.mam.digitaltrain.submodel.api.train;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public interface ITrainTopologySM extends ISubmodel{
	public SubmodelElementCollection getTopology();
}
