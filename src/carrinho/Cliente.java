package carrinho;

public class Cliente {
		
	// Atributos do objeto;
	
			private String nome;
			private int telefone;
			private String email;
			private String produto;
			
			public Cliente(String nome, int telefone, String email, String produto) {
				super();
				this.nome = nome;
				this.telefone = telefone;
				this.email = email;
				this.produto = produto;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getTelefone() {
				return telefone;
			}

			public void setTelefone(int telefone) {
				this.telefone = telefone;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getProduto() {
				return produto;
			}

			public void setProduto(String produto) {
				this.produto = produto;
			}
			
			
			
}
