package br.com.MRodrigues;

public class Executor {

	public static void main(String[] args) {
		
		PessoaJuridica pessoa = new PessoaJuridica();
		pessoa.setNome("João Paulo");
		pessoa.setIdade(26);
		pessoa.setCnpj(1342574236l);
		pessoa.setEmpresa("Televissa");
		imprimir(pessoa);
		
		PessoaComum pessoa1 = new PessoaComum();
		pessoa1.setNome("Mathues");
		pessoa1.setIdade(18);
		pessoa1.setClt("empresa Samsung");
		pessoa1.setCpf(123l);
		imprimir1(pessoa1);

	}
	 public static void imprimir (PessoaJuridica pessoa){
		 System.out.println(pessoa.getNome()+  " idade: "+ pessoa.getIdade()+ " tem a empresa " + pessoa.getEmpresa());
		 
	 }
	 public static void imprimir1 (PessoaComum pessoa1){
		 System.out.println(pessoa1.getNome()+  " idade: "+ pessoa1.getIdade()+ " trabalha na  " + pessoa1.getClt());
		 
	 }


}
