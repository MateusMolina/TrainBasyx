package eng.br.mam.digitaltrain.common.submodelelement;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;

/**
 * Adds a numeric property with defined boundaries
 * 
 * @author molina
 *
 */
public interface IBoundedProperty extends IProperty{
	public Object getUpperLimit();
	public Object getBottomLimit();
	public void setBottomLimit(Object bottomLimit);
	public void setUpperLimit(Object upperLimit);
}
