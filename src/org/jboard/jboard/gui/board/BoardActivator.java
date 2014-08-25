package org.jboard.jboard.gui.board;

import org.jboard.jboard.chess.Move;

/**
 * Interface of directives sent from the user to the engine.
 * These directives are generated by user's operations on the board.
 * Currently, the only directive is to make a move.
 * 
 * @author Asher Stern
 * Date: Jul 15, 2014
 *
 */
public interface BoardActivator
{
	public void makeMove(Move move);
}