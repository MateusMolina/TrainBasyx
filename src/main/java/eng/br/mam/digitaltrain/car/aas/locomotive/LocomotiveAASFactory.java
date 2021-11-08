package eng.br.mam.digitaltrain.car.aas.locomotive;

import eng.br.mam.digitaltrain.car.aas.CarAASFactory;
import eng.br.mam.digitaltrain.car.submodel.locomotive.LocomotiveSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.device.aas.compressor.CompressorAASFactory;
import eng.br.mam.digitaltrain.device.aas.engine.EngineAASFactory;

public class LocomotiveAASFactory extends CarAASFactory {
	private LocomotiveSM locomotiveSM;
		
	public LocomotiveAASFactory(ServiceSM locomotiveServiceSM, ServiceSM compressorServiceSM, ServiceSM engineServiceSM) {
		super(locomotiveServiceSM);
		this.locomotiveSM = new LocomotiveSM(new CompressorAASFactory(compressorServiceSM).build(),
										new EngineAASFactory(engineServiceSM).build()); 
		
	}	
	
	public LocomotiveAAS build() {
		LocomotiveAAS locomotiveAAS = new LocomotiveAAS(getServiceSM(),
												getStatusSM(),
												getMaintenanceSM(),
												getStateSM(),
												getLocomotiveSM());
		return locomotiveAAS;
	}
	
	public LocomotiveSM getLocomotiveSM() {
		return this.locomotiveSM;
	}
}
