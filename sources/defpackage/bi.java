package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bi extends ViewGroup.MarginLayoutParams {
    public int a;

    public bi() {
        super(-2, -2);
        this.a = 8388627;
    }

    public bi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cu.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public bi(bi biVar) {
        super((ViewGroup.MarginLayoutParams) biVar);
        this.a = 0;
        this.a = biVar.a;
    }

    public bi(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
