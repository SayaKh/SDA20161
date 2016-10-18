/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author aashgar
 */
public class WaitState implements GameState{

    @Override
    public void addState(Player player) {
        player.setState(this);
        System.out.println("Player in Wait State");
    }

    @Override
    public void view() {
        System.out.println("Wait State..");
    }
    
}
