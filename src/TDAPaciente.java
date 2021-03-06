
import java.util.Date; //pendiente sql.Date o util.Date

public class TDAPaciente {
    
    private String nombre, nss, domicilio, unidad_medica, telefono, curp, doctor,
                    ciudad, estado, edo_civil, ocupacion;
    private Date fecha; //Pendiente analizar el uso de util.Date ó sql.Date para almacenar la fecha
    private int edad, codigo_postal;

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getUnidad_medica() {
        return unidad_medica;
    }

    public void setUnidad_medica(String unidad_medica) {
        this.unidad_medica = unidad_medica;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEdo_civil() {
        return edo_civil;
    }

    public void setEdo_civil(String edo_civil) {
        this.edo_civil = edo_civil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }    
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public void setNss(String nss){
        this.nss = nss;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
    public String getNss(){
        return nss;
    }
    
    public int getEdad() {
        return edad;
    }

}
