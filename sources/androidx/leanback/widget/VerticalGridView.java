package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.qv;
import defpackage.vp;
import defpackage.we;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VerticalGridView extends vp {
    public VerticalGridView(Context context) {
        this(context, null);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ab.U(1);
        an(context, attributeSet);
        int[] iArr = we.c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        qv.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        if (typedArrayObtainStyledAttributes.peekValue(0) != null) {
            this.ab.Y(typedArrayObtainStyledAttributes.getLayoutDimension(0, 0));
            requestLayout();
        }
        this.ab.T(typedArrayObtainStyledAttributes.getInt(1, 1));
        requestLayout();
        typedArrayObtainStyledAttributes.recycle();
    }
}
