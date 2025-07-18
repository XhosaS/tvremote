package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mxn extends Drawable {
    public Drawable a;
    private final Rect b;
    private final int c;
    private final int d;

    private mxn(Rect rect, int i, int i2) {
        this.b = rect;
        this.c = i;
        this.d = i2;
    }

    static mxn a(int i, int i2, int i3, int i4, int i5, int i6) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        int iMax3 = Math.max(i3, 0);
        int iMax4 = Math.max(i4, 0);
        int iMax5 = Math.max(i5, 0);
        int iMax6 = Math.max(i6, 0);
        Rect rect = new Rect(0, 0, iMax, iMax2);
        Rect rect2 = new Rect(0, 0, iMax + iMax3 + iMax5, iMax2 + iMax4 + iMax6);
        mxn mxnVar = new mxn(rect, iMax3, iMax4);
        mxnVar.setBounds(rect2);
        return mxnVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.c, this.d);
            drawable.setBounds(this.b);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
