package app.patterns.behavioral.state;

/**
 * Created by Evgeny_Akulenko on 11/30/2017.
 */
public class StateA implements State {
	@Override
	public void doAction(Context context) {
		context.setState(new StateB());
		System.out.println("Now Context in State B");
	}
}
