package eng.br.mam.digitaltrain.submodel.car.locomotive;

import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import eng.br.mam.digitaltrain.aas.device.compressor.ICompressorAAS;
import eng.br.mam.digitaltrain.aas.device.engine.IEngineAAS;

public class LocomotiveSM extends Submodel implements ILocomotiveSM {
	
	private ICompressorAAS compressorAAS;
	private IEngineAAS engineAAS;

	public LocomotiveSM(ICompressorAAS compressorAAS, IEngineAAS engineAAS) {
		super();
		this.compressorAAS = compressorAAS;
		this.engineAAS = engineAAS;
	}

	@Override
	public ICompressorAAS getCompressor() {
		return compressorAAS;
	}

	@Override
	public IEngineAAS getEngine() {
		return engineAAS;
	}


}
