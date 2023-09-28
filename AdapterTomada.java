public class AdapterTomada extends TomadaDeDoisPinos {
	private TomadaDeTresPinos tomadaDeTresPinos;

	public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
		this.tomadaDeTresPinos = tomadaDeTresPinos;
	}

    @Override
	public void ligarNaTomadaDeDoisPinos() {
		tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
	}
}