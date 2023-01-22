package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify.AreaNotify;

public class PacketWindSeedClientNotify extends BasePacket {

	public PacketWindSeedClientNotify(ByteString data) {
		super(PacketOpcodes.WindSeedClientNotify); //why it was hardcoded?
		WindSeedClientNotify proto = WindSeedClientNotify
			.newBuilder()
			.setAreaNotify(
				AreaNotify.newBuilder().setAreaId(1).setAreaType(1).setAreaCode(data).build()
			)
			.build();
		this.setData(proto);
	}
}
