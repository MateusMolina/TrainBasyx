package eng.br.mam.digitaltrain.aas.train;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.aas.common.CommonFactory;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.train.TrainTopologySM;

public class TrainAASFactory {
	public static TrainAAS build(ServiceSM serviceSM, SubmodelElementCollection topology) {
		return new TrainAAS(serviceSM,
			CommonFactory.getBlankStatusSM(),
			new TrainTopologySM(topology));
	}
}
