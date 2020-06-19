package ec.gob.mag.scsemillasmicro.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "topografia")
public class Topografia {
	
	@Id
	@ApiModelProperty(value = "Este campo es la clave primaria de la tabla", required = true, readOnly = true)
	@Column(name = "top_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("topid")
	private Long topid;
	
	@Column(name = "top_nombre")
	private String topnombre;
	
	@Column(name = "top_estado")
	private boolean topestado;
	
	/*******************************************
	 * CAMPOS DE AUDITORIA
	 * *****************************************/
	
	@ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
	@Column(name = "top_reg_usu", nullable = false)
	@JsonProperty("topregusu")
	@JsonInclude(Include.NON_NULL)
	private int topregusu;
	
	@ApiModelProperty(value = "Fecha de registro del campo", example = "")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "top_reg_fecha", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@JsonProperty("topregfecha")
	@JsonInclude(Include.NON_NULL)
	private Date topregfecha;
	
	@ApiModelProperty(value = "Id de usuario que actualizacio del campo", example = "")
	@Column(name = "top_act_usu", nullable = false)
	@JsonProperty("topactusu")
	@JsonInclude(Include.NON_NULL)
	private int topactusu;
	
	@ApiModelProperty(value = "Fecha de registro del campo", example = "")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "top_act_fecha", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@JsonProperty("topactfecha")
	@JsonInclude(Include.NON_NULL)
	private Date topactfecha;
}
