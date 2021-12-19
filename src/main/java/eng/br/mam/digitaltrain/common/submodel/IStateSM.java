package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

public interface IStateSM extends ISubmodel {
	
	public ISubmodelElementCollection getStates();
	
	public void addState(String stateName, Object initialValue);

}
