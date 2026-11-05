package core.basesyntax.model.figure;

import jakarta.persistence.*;

@Entity
@Table(name = "triangles")
public class Triangle extends Figure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
