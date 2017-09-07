public class Context {
	private Strategy strategy;

	// gets an interface!
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public int exeStrategy(int a, int b){
		return strategy.doOp(a,b);
	}
}
