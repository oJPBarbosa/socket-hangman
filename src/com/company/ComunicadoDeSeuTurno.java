package com.company;

public class ComunicadoDeSeuTurno extends Comunicado {
  private Palavra palavra;
  private Tracinhos tracinhos;
  private ControladorDeErros controladorDeErros;
  private ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas;

  public ComunicadoDeSeuTurno(Palavra palavra, Tracinhos tracinhos, ControladorDeErros controladorDeErros,
      ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas) {
    this.palavra = palavra;
    this.tracinhos = tracinhos;
    this.controladorDeErros = controladorDeErros;
    this.controladorDeLetrasJaDigitadas = controladorDeLetrasJaDigitadas;
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
}