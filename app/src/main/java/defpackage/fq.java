package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fq extends ViewGroup.MarginLayoutParams {
    public int a;

    public fq() {
        super(-2, -2);
        this.a = 8388627;
    }

    public fq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hs.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public fq(fq fqVar) {
        super((ViewGroup.MarginLayoutParams) fqVar);
        this.a = 0;
        this.a = fqVar.a;
    }

    public fq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
