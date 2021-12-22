package eng.br.mam.digitaltrain.car.service;

import java.util.Collection;
import java.util.function.Consumer;

import org.eclipse.basyx.submodel.metamodel.map.qualifier.LangStrings;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.operation.OperationVariable;

import eng.br.mam.digitaltrain.common.service.Service;

public class LocalLoadService extends Service {

	public static final String IDSHORT = "load";
	public static final LangStrings DESCRIPTION = LangStrings.fromStringPairs(
														"EN","Load a car a specified ammount");
	
	public LocalLoadService(String serverAASId) {
		super(serverAASId, IDSHORT, DESCRIPTION);
	}
	
	@Override
	public Consumer<Object[]> getInvokable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<OperationVariable> getInputVariables() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<OperationVariable> getOutputVariables() {
		// TODO Auto-generated method stub
		return null;
	}
}
