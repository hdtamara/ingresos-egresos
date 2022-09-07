package co.gov.mintic.carte.ingresosegresos.entities;

import javax.persistence.*;

@Entity //Lo convierte en entidad
@Table(name = "tipo_documentos")//Cambia el nombre de la tabla
public class TipoDocumento {
    @Id //Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*autoincrementable */
    @Column(name = "id_tipo_documento")
    private long idTipoDocumento;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "siglas",nullable = false)
    private String siglas;
    @Column(name="estado")
    private boolean estado;

    public long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "idTipoDocumento=" + idTipoDocumento +
                ", descripcion='" + descripcion + '\'' +
                ", siglas='" + siglas + '\'' +
                ", estado=" + estado +
                '}';
    }
}
