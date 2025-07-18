package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ahj;
import defpackage.awj;
import defpackage.azo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VerticalGridView extends awj {
    public VerticalGridView(Context context) {
        this(context, null);
    }

    public void setColumnWidth(int i) {
        this.ad.ap(i);
        requestLayout();
    }

    public void setNumColumns(int i) {
        this.ad.ag(i);
        requestLayout();
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad.am(1);
        fa(context, attributeSet);
        int[] iArr = azo.c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ahj.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        if (typedArrayObtainStyledAttributes.peekValue(0) != null) {
            setColumnWidth(typedArrayObtainStyledAttributes.getLayoutDimension(0, 0));
        }
        setNumColumns(typedArrayObtainStyledAttributes.getInt(1, 1));
        typedArrayObtainStyledAttributes.recycle();
    }
}
