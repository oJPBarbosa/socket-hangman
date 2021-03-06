package com.company;

public class ComunicadoDeInicio extends Comunicado {
  private int grupo;
  private Palavra palavra;
  private Tracinhos tracinhos;
  private ControladorDeErros controladorDeErros;
  private ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas;

  public ComunicadoDeInicio(
      int grupo,
      Palavra palavra,
      Tracinhos tracinhos,
      ControladorDeErros controladorDeErros,
      ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas) {
    this.grupo = grupo;
    this.palavra = palavra;
    this.tracinhos = tracinhos;
    this.controladorDeErros = controladorDeErros;
    this.controladorDeLetrasJaDigitadas = controladorDeLetrasJaDigitadas;
  }

  public int getGrupo() {
    return this.grupo;
  }

  public Palavra getPalavra() {
    return this.palavra;
  }

  public Tracinhos getTracinhos() {
    return this.tracinhos;
  }

  public ControladorDeErros getControladorDeErros() {
    return this.controladorDeErros;
  }

  public ControladorDeLetrasJaDigitadas getControladorDeLetrasJaDigitadas() {
    return this.controladorDeLetrasJaDigitadas;
  }

  public void setPalavra(Palavra palavra) {
    this.palavra = palavra;
  }

  public void setTracinhos(Tracinhos tracinhos) {
    this.tracinhos = tracinhos;
  }

  public void setControladorDeErros(ControladorDeErros controladorDeErros) {
    this.controladorDeErros = controladorDeErros;
  }

  public void setControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas) {
    this.controladorDeLetrasJaDigitadas = controladorDeLetrasJaDigitadas;
  }
}