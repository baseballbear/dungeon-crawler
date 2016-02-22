package com.petiks.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;


public class GameScreen extends AbstractScreen {

	private OrthogonalTiledMapRenderer tileRenderer;
	private OrthographicCamera camera;
	private Room currentRoom;
	private Batch batch;
	
	public GameScreen(DandeonKroller game) {
		super(game);
		currentRoom = new Room();
		tileRenderer = new OrthogonalTiledMapRenderer(currentRoom.getTileRoom());
		int roomWidth = 176, roomHeight = 144;
		camera = new OrthographicCamera(roomWidth, roomHeight);
		batch = tileRenderer.getBatch();
		camera.position.x = roomWidth/2;
		camera.position.y = roomHeight/2;
		camera.update();
	}

	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		tileRenderer.setView(camera);
		
		tileRenderer.render();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}

}
