package com.petiks.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DandeonKroller extends Game {
	Color clearColor = new Color(0, 0, 0, 1);
	
	@Override
	public void create () {
		GameScreen gameScreen = new GameScreen(this);
		switchScreen(gameScreen);
		
	}
	
	public void switchScreen(AbstractScreen screen) {
		setScreen(screen);
		Gdx.input.setInputProcessor(screen);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(clearColor.r, clearColor.g, clearColor.b, clearColor.a);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}
}
