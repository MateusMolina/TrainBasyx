package eng.br.mam.digitaltrain.common.service;

import java.util.Collection;
import java.util.function.Consumer;

import org.eclipse.basyx.submodel.metamodel.map.qualifier.LangStrings;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.operation.OperationVariable;

public interface IService {

	public String getServerAASId();
	
	public String getIdShort();
	
	public LangStrings getDescription();

	public Consumer<Object[]> getInvokable();
	
	public Collection<OperationVariable> getInputVariables();
	
	public Collection<OperationVariable> getOutputVariables();
	
}
