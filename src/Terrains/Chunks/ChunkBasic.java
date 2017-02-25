package Terrains.Chunks;

/**
 * Created by mantarus on 25.02.17.
 */
public class ChunkBasic extends Chunk {

    private Integer MAX_FERTILITY = 10;
    private Integer MIN_FERTILITY = -10;

    private void increaseFertility() {
        setFertility(getFertility() >= MAX_FERTILITY ? MAX_FERTILITY : getFertility() + 1);
    }

    private void decreaseFertility() {
        setFertility(getFertility() <= MIN_FERTILITY ? MIN_FERTILITY : getFertility() - 1);
    }

}
