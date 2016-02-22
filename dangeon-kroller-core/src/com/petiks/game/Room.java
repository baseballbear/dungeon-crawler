package com.petiks.game;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

public class Room {
	private TiledMap tiledMap;
	private Room westRoom, eastRoom, northRoom, southRoom;
	
	
	public Room() {
		tiledMap = new TmxMapLoader().load("room/sample_room.tmx");
	}
	
	public TiledMap getTileRoom() {
		return tiledMap;
	}
	public Room getWestRoom() {
		return westRoom;
	}
	public Room getEastRoom() {
		return eastRoom;
	}
	public Room getNorthRoom() {
		return northRoom;
	}
	public Room getSouthRoom() {
		return southRoom;
	}
	
	
	
}
