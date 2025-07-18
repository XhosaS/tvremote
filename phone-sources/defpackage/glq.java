package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glq extends ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;

    public glq() {
        super(-1, -1);
        this.c = 0.0f;
    }

    public glq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
        this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
