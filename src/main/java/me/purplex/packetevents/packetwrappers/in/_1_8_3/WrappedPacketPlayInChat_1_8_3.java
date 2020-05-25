package me.purplex.packetevents.packetwrappers.in._1_8_3;

import me.purplex.packetevents.packetwrappers.api.version.WrappedVersionPacket;
import net.minecraft.server.v1_8_R2.PacketPlayInChat;

public class WrappedPacketPlayInChat_1_8_3 extends WrappedVersionPacket {
    public String message;
    public WrappedPacketPlayInChat_1_8_3(Object packet) {
        super(packet);
    }

    @Override
    protected void setup() {
        PacketPlayInChat p = (PacketPlayInChat)packet;
        this.message = p.a();
    }
}
