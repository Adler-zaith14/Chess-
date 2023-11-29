package com.chess.engine.pieces;

public abstract class Piece {
  protected final int piecePosition;
  protected final Alliance pieceAlliance;

  Piece(final int piecePosition, final Alliance PieceAlliance) {
    this.pieceAlliance = pieceAlliance;
    this.piecePosition = piecePosition;
  }

  public abstract List<Move> calculateLegalMoves(final Board board);

}