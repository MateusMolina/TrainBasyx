package eng.br.mam.digitaltrain.train.submodel;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

public interface ITrainTopologySM extends ISubmodel{
	public ISubmodelElementCollection getTopology();
}
