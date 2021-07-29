package eng.br.mam.digitaltrain.aas.factory.train;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.aas.factory.common.CommonFactory;
import eng.br.mam.digitaltrain.aas.map.train.TrainAAS;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.train.TrainTopologySM;

public class TrainAASFactory {
	public static TrainAAS build(ServiceSM serviceSM, SubmodelElementCollection topology) {
		return new TrainAAS(serviceSM,
			CommonFactory.getBlankStatusSM(),
			new TrainTopologySM(topology));
	}
}
