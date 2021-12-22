package eng.br.mam.digitaltrain.car.service;

import java.util.Collection;
import java.util.function.Consumer;

import org.eclipse.basyx.submodel.metamodel.map.qualifier.LangStrings;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.operation.OperationVariable;

import eng.br.mam.digitaltrain.common.service.Service;

public class LocalChangeNotchService extends Service {

	public static final String IDSHORT = "changeNotch";
	public static final LangStrings DESCRIPTION = LangStrings.fromStringPairs(
														"EN","Change the notch of a tractive system");
	
	public LocalChangeNotchService(String serverAASId) {
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
