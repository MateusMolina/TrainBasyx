package eng.br.mam.digitaltrain.submodel.map.sensor;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

import eng.br.mam.digitaltrain.submodel.api.sensor.ISensorSM;

public class SensorSM extends Submodel implements ISensorSM {

	private String valueId;
	
	
	public SensorSM() {
		super();
		IProperty value = new Property("value", 0f);
		addSubmodelElement(value);
		this.valueId = value.getIdShort();
	}
	
	
	public IProperty getValue() {
		return (Property) this.getSubmodelElement(valueId);
	}

	public float fetchValue() {
		return (Float) this.getSubmodelElement(valueId).getValue();
	}

	public void setValue(float newValue) {
		IProperty value = (Property) this.getSubmodelElement(valueId);
		value.setValue(newValue);
	}

}
