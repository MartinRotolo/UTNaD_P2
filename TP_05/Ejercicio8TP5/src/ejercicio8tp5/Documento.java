/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8tp5;

/**
 *
 * @author Martin
 */
// Composición: el Documento construye su FirmaDigital
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, String hash, String fecha, Usuario usuario) {
        this.titulo = titulo; this.contenido = contenido;
        this.firma = new FirmaDigital(hash, fecha, usuario);
    }
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }
}