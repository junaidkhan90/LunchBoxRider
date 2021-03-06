package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class Medium_Edittext extends android.support.v7.widget.AppCompatEditText {
    public Medium_Edittext(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Medium_Edittext(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Medium_Edittext(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "myfonts/Roboto-Medium.ttf");
            setTypeface(tf);
        }
    }

}