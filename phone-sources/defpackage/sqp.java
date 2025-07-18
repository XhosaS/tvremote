package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqp extends LinearLayout.LayoutParams {
    public Drawable a;
    public CharSequence b;

    public sqp(int i, int i2) {
        super(i, i2);
        this.a = null;
        this.b = null;
    }

    public sqp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
        this.b = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, squ.c);
        this.a = typedArrayObtainStyledAttributes.getDrawable(0);
        this.b = typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public sqp(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = null;
        this.b = null;
    }

    public sqp(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = null;
        this.b = null;
    }

    public sqp(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = null;
        this.b = null;
    }
}
