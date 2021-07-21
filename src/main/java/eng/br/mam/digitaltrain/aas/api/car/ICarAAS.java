package eng.br.mam.digitaltrain.aas.api.car;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.submodel.api.car.IStateSM;
/**
 * 
 * * Status: should contain operative info about the car
 * * State: should contain general information regarding its position and velocity
 * 
 * @author mateusmolina
 *
 */

public interface ICarAAS extends IAssetAdministrationShell {
	
	public IStatusSM getStatusSM();
	public IStateSM getStateSM();
	public IDetailsSM getDetailsSM();
	public IServiceSM getServiceSM(); 

}
