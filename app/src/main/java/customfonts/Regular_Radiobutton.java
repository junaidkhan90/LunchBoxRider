package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class Regular_Radiobutton extends android.support.v7.widget.AppCompatRadioButton {
    public Regular_Radiobutton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Regular_Radiobutton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Regular_Radiobutton(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "myfonts/Roboto-Regular.ttf");
            setTypeface(tf);
        }
    }

}