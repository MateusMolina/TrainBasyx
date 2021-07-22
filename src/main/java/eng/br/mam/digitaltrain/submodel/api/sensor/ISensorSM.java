package eng.br.mam.digitaltrain.submodel.api.sensor;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;

public interface ISensorSM extends ISubmodel {
	
	public IProperty getValue();
	// PUBSUP Proxy attribute
	
	public void fetchValue();
	public void setValue(float newValue);
	
	// TODO PUB/SUB Integration
	
}
