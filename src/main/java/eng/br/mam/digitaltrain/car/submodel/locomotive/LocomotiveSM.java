package eng.br.mam.digitaltrain.car.submodel.locomotive;

import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import eng.br.mam.digitaltrain.component.aas.compressor.ICompressorAAS;
import eng.br.mam.digitaltrain.component.aas.engine.IEngineAAS;

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
