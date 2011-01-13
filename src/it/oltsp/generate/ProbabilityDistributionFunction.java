package it.oltsp.generate;


public interface ProbabilityDistributionFunction<T> {
	public T getGeneratedReleaseTime(T maxTime);
}
