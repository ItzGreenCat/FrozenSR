package me.greencat.frozensr.data;

import java.util.ArrayList;
import java.util.List;

public class VertexGroup3 {
    private final List<Vertex3f> elements = new ArrayList<>();
    public void add(Vertex3f Vertex){
        elements.add(Vertex);
    }
    public void remove(Vertex3f Vertex) {
        elements.remove(Vertex);
    }
    public Vertex3f[] getArray(){
        return elements.toArray(new Vertex3f[0]);
    }
    public List<Vertex3f> getElements() {
        return elements;
    }
    public Vertex3f get(int index) {
        return elements.get(index);
    }
    public void translateWorldToScreen(){
        elements.forEach(Vertex3f::translateWorldToScreen);
    }
}
