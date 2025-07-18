package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzn implements Cloneable {
    public hyg a;
    public boolean b;
    public boolean c;
    public Paint d;
    public Paint e;
    public hxf f;
    public hxf g;
    public boolean h;
    public boolean i;

    public hzn() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(385);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setTypeface(Typeface.DEFAULT);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(385);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setTypeface(Typeface.DEFAULT);
        this.a = hyg.a();
    }

    protected final Object clone() {
        try {
            hzn hznVar = (hzn) super.clone();
            hznVar.a = (hyg) this.a.clone();
            hznVar.d = new Paint(this.d);
            hznVar.e = new Paint(this.e);
            return hznVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
