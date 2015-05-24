package model;

public class FormFactory {

	public Formulario getForm (String form) { 
	
		if (form.equals("ocorrencia"))
			return new Ocorrencia();
		else if (form.equals("vitima"))
			return new Vitima();
		else if (form.equals("endereco"))
			return new Endereco();
		else if (form.equals("isolamento"))
			return new Isolamento();
		else if (form.equals("pertence"))
			return new Pertence();
		else if (form.equals("lesao"))
			return new Lesao();
		else if (form.equals("equipeSocorro"))
			return new EquipeSocorro();
		else if (form.equals("vestigio"))
			return new Vestigio();
		else if (form.equals("observacao"))
			return new Observacao();
		else if (form.equals("pessoa"))
			return new Pessoa();
		else if (form.equals("laudo"))
			return new Laudo();
		else
			return new Ocorrencia();
	} 
	
}
