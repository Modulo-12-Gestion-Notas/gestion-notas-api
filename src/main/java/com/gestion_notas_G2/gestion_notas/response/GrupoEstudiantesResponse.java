package com.gestion_notas_G2.gestion_notas.response;

import com.gestion_notas_G2.gestion_notas.dto.*;
import java.util.List;
import lombok.Data;

@Data
public class GrupoEstudiantesResponse {

    private ProfesorDTO profesor;

    private GrupoSimpleDTO grupo;
    private List<EstudianteDTO> estudianteList;

    public GrupoEstudiantesResponse() {
    }
}
