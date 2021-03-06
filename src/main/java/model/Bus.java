package model;

import lombok.Data;
import model.enumeration.BusType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahsa Alikhani m-58
 */
@Data
@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int capacity;
    private String busPlate;
    @ManyToOne
    private Trip trip;
}
