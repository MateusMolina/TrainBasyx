package eng.br.mam.digitaltrain.common.service;

import java.util.List;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

/**
 * Interface for the Service Provider
 * 
 * Contains the list of services that the ServiceProvider is able to execute and
 * BaSyx compatibility methods.
 * 
 * @author molina
 *
 */
public interface IServiceProvider {
	
	public List<IService> getServiceList();
	
	public SubmodelElementCollection getServiceCollection();
	
}
