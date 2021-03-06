package talsapi.talsapi.api.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.entity.Player;

public class TALSExpChangeEvent extends Event {

    private Player p;
    private double newexp;

    public TALSExpChangeEvent(Player p,Double newexp) {
        this.p = p;
        this.newexp = newexp;
    }

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getPlayer()
    {
        return p;
    }

    public double getNewEXP()
    {
        return newexp;
    }
}
