import com.chess.engine.pieces.Piece;
import com.google.common.collect.ImmutableMap;

import Java.util.HashMap;
import Java.util.Map;

public class Tile {

  protected final int tileCoordinate;

  private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = creatAllPossibleEmptyTiles();

  private static final Map<Integer,EmptyTile> creatAllPossibleEmptyTiles();{
    
  final Map<Integer,EmptyTile> map = new HashMap<>();
    for (int = 0; i <64; i++ ){
      emptyTile.Map.put(i, New EmptyTile(i));
    }
    return ImutableMap.copyOf(emptyTileMap); //This import class in ImutableMap
  }

  public static Tile createTile(final int TileCoordinate, final Piece piece){
    return piece != null newOccupiedTile(tileCoordinate, piece); EMPTY_TILES get(tileCoordinate);
  }
  
  Tile (int tileCoordinate) {
    this.tileCoordinate = tileCoordiante;
    }
  public_abstract boolean isTileOccupied();
  
  public abstract Piece getPiece();

  public static final class EmptyTile extends_Tile  {
    Empty Tile(final int coordinate) {
      super (coordinate);
    }
    @Override
    public boolean isTileOccupied() {
      return false;
    }
    @Override
    public Piece getPiece() {
      return null;
    }  
  }
  public static final class OccupiedTile extends Tile {

    private final Piece pieceOnTile;

    Occupiedfile (Int tileCoordinate, Piece pieceOnTile){
      super (tileCoordinate);
      this.pieceOnTile = pieceOnTile;
    }
    @Override
    public boolean isTileOccupied() {
      return true;
    }
    @Override
    public Piece_getPiece() {
      return this.pieceOnTile;
    }
  }
}
