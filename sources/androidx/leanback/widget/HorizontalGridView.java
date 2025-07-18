package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.qv;
import defpackage.vp;
import defpackage.we;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HorizontalGridView extends vp {
    private Paint ad;

    public HorizontalGridView(Context context) {
        this(context, null);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = new Paint();
        new Rect();
        this.ab.U(0);
        an(context, attributeSet);
        int[] iArr = we.b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        qv.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        if (typedArrayObtainStyledAttributes.peekValue(1) != null) {
            this.ab.Y(typedArrayObtainStyledAttributes.getLayoutDimension(1, 0));
            requestLayout();
        }
        this.ab.T(typedArrayObtainStyledAttributes.getInt(0, 1));
        requestLayout();
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(0, null);
        setWillNotDraw(true);
        Paint paint = new Paint();
        this.ad = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }
}
