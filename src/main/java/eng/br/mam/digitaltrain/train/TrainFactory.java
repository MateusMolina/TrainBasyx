package eng.br.mam.digitaltrain.train;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.common.CommonFactory;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.train.aas.TrainAAS;
import eng.br.mam.digitaltrain.train.submodel.TrainTopologySM;

public class TrainFactory {
	public static TrainAAS build(ServiceSM serviceSM, SubmodelElementCollection topology) {
		return new TrainAAS(serviceSM,
			CommonFactory.getBlankStatusSM(),
			new TrainTopologySM(topology));
	}
}
