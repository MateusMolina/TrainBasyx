package eng.br.mam.digitaltrain.common.util;

import java.util.Objects;

import org.camunda.bpm.engine.exception.NullValueException;

public class Enforce {
	
	public static void nonNull(Object nonNullObject) {
		if (Objects.isNull(nonNullObject)) {
			throw new NullValueException(nonNullObject+" should not be null");
		}
	}
	public static void nonBlank(String nonBlankString) {
		if (nonBlankString.isBlank()) {
			throw new RuntimeException(nonBlankString+" should not be blank");
		}
	}
}
