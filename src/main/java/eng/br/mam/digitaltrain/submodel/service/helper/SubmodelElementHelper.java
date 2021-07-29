package eng.br.mam.digitaltrain.submodel.service.helper;

import java.util.function.Function;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.operation.Operation;

public class SubmodelElementHelper {
	public static Operation buildOperation(String idShort, Function<Object[], Object> function) {
		Operation operation = new Operation(function);
		operation.setIdShort(idShort);
		return operation;
	}
	public static SubmodelElementCollection getEmptyServices() {
		return new SubmodelElementCollection("Services");
	}
}
