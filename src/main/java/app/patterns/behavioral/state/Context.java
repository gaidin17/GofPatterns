package app.patterns.behavioral.state;

/**
 * Created by Evgeny_Akulenko on 11/30/2017.
 */
public class Context {
	private State state;

	private Context(State state) {
		this.state = state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void doAction() {
		state.doAction(this);
	}

	public static void main(String[] args) {
		Context context = new Context(new StateA());
		context.doAction();
		context.doAction();
		context.doAction();
	}
}
