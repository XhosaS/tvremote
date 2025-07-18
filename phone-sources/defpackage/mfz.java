package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfz extends RelativeLayout.LayoutParams {
    public final boolean a;

    public mfz(int i, int i2, boolean z) {
        super(i, i2);
        this.a = z;
    }

    public mfz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lds.a);
        this.a = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public mfz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = false;
    }
}
