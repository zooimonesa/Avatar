package guis;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JToggleButton;

// 모서리가 둥근 버튼 만들기
// 버튼을 JButton이 아니라 RoundedButton으로 선언하면 됨.
public class RoundedButton extends JButton {
	public RoundedButton() {
		super();
		decorate();
	}

	public RoundedButton(String text) {
		super(text);
		decorate();
	}

	public RoundedButton(Action action) {
		super(action);
		decorate();
	}

	public RoundedButton(Icon icon) {
		super(icon);
		decorate();
	}

	public RoundedButton(String text, Icon icon) {
		super(text, icon);
		decorate();
	}

	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	    int width = getWidth();
	    int height = getHeight();

	    Graphics2D graphics = (Graphics2D) g;

	    graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	    if (getModel().isArmed()) {
	        graphics.setColor(getBackground().darker());
	    } else if (getModel().isRollover()) {
	        graphics.setColor(getBackground().brighter());
	    } else if (!getModel().isEnabled()){
	        graphics.setColor(getBackground().darker());
	    } else {
	        graphics.setColor(getBackground());
	    }

	    graphics.fillRoundRect(0, 0, width, height, 10, 10);

	    FontMetrics fontMetrics = graphics.getFontMetrics();
	    Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

	    int textX = (width - stringBounds.width) / 2;
	    int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();

	    graphics.setColor(getForeground());
	    graphics.setFont(getFont());
	    graphics.drawString(getText(), textX, textY);
	    graphics.dispose();
	    

	    super.paintComponent(g);
	}
}


// 모서리가 둥근 토글버튼 만들기
class RoundedToggleButton extends JToggleButton {
	public RoundedToggleButton() {
		super();
		decorate();
	}

	public RoundedToggleButton(String text) {
		super(text);
		decorate();
	}

	public RoundedToggleButton(Action action) {
		super(action);
		decorate();
	}

	public RoundedToggleButton(Icon icon) {
		super(icon);
		decorate();
	}

	public RoundedToggleButton(String text, Icon icon) {
		super(text, icon);
		decorate();
	}

	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	    int width = getWidth();
	    int height = getHeight();

	    Graphics2D graphics = (Graphics2D) g;

	    graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	    if (getModel().isArmed()) {
	        graphics.setColor(getBackground().darker());
	    } else if (getModel().isRollover()) {
	        graphics.setColor(getBackground().brighter());
	    } else if (getModel().isSelected()){
	        graphics.setColor(getBackground().PINK);
	    } else if (!getModel().isEnabled()){
	        graphics.setColor(getBackground().darker());
	    } else {
	        graphics.setColor(getBackground());
	    }
	    graphics.fillRoundRect(0, 0, width, height, 10, 10);

	    FontMetrics fontMetrics = graphics.getFontMetrics();
	    Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

	    int textX = (width - stringBounds.width) / 2;
	    int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();

	    graphics.setColor(getForeground());
	    graphics.setFont(getFont());
	    graphics.drawString(getText(), textX, textY);
	    graphics.dispose();
	    

//	    super.paintComponent(g);
	}
}