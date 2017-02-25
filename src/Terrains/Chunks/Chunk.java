package Terrains.Chunks;

import Terrains.Terrain;

/**
 * Created by mantarus on 25.02.17.
 */
public abstract class Chunk {
    private Terrain terrain;
    private Long xPosition;
    private Long yPosition;
    private Integer fertility;

    public Chunk() {}

    public Chunk(Terrain terrain, Long xPosition, Long yPosition) {
        this.terrain = terrain;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Long getxPosition() {
        return xPosition;
    }

    public void setxPosition(Long xPosition) {
        this.xPosition = xPosition;
    }

    public Long getyPosition() {
        return yPosition;
    }

    public void setyPosition(Long yPosition) {
        this.yPosition = yPosition;
    }

    public Integer getFertility() {
        return fertility;
    }

    public void setFertility(Integer fertility) {
        this.fertility = fertility;
    }
}
