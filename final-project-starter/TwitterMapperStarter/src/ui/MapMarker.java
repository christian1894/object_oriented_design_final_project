package ui;
import static ui.MapMarkerSimple.defaultMarkerSize;
import org.openstreetmap.gui.jmapviewer.MapMarkerCircle;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.Layer;

public class MapMarker extends MapMarkerCircle {

    public MapMarker(Layer layer , Coordinate coordinate)
    {
        super(layer, null, coordinate, defaultMarkerSize, STYLE.VARIABLE, getDefaultStyle());

    }
}
