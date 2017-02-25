package Terrains;

import Terrains.Chunks.Chunk;
import Terrains.Chunks.ChunkBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mantarus on 25.02.17.
 */
public abstract class Terrain {
    private Long horizontalSize;
    private Long verticalSize;
    private List<List<Chunk>> chunks;

    public Terrain() {}

    public Terrain(Long horizontalSize, Long verticalSize) {
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
        this.chunks = new ArrayList<>();

        for (Long i = 0L; i < horizontalSize; i++ ) {
            List<Chunk> list = new ArrayList<>();
            for (Long j = 0L; j < verticalSize; j++) {
                list.add(new ChunkBasic());
            }
            this.chunks.add(list);
        }
    }
}
