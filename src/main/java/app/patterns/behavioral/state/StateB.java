package app.patterns.behavioral.state;

/**
 * Created by Evgeny_Akulenko on 11/30/2017.
 */
public class StateB implements State {
	@Override
	public void doAction(Context context) {
		context.setState(new StateA());
		System.out.println("Now Context in State A");
	}
}
