package com.petiks.game;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;

public abstract class AbstractScreen extends InputAdapter implements Screen {
	private DandeonKroller game;

	public AbstractScreen(DandeonKroller game) {
		this.game = game;
	}
	
}
