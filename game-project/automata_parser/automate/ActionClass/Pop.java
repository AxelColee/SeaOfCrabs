package automate.ActionClass;

import java.util.List;

import automate.FunCall;
import automate.Parameter;
import info3.game.modele.Entity;

public class Pop extends FunCall {

	protected int probability;

	public Pop(List<Parameter> parameters, int proba) {
		super("Pop", parameters, proba);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exec(Entity e) {
		System.out.println(this.toString());
		// TODO Auto-generated method stub

	}

	@Override
	public boolean eval(Entity e) {
		return false;
	}

	public String toString() {
		String s = "";
		s += "Pop(";
		for (Parameter p : parameters) {
			s += p.toString();
			s += ", ";
		}
		s += ");";
		return s;
	}

}
