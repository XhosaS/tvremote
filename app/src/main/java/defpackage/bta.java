package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bta {
    final RectF a = new RectF();
    final Paint b;
    final Paint c;
    final Paint d;
    float e;
    float f;
    float g;
    float h;
    public int[] i;
    int j;
    float k;
    float l;
    float m;
    boolean n;
    Path o;
    float p;
    float q;
    int r;
    int s;
    int t;
    int u;

    public bta() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.p = 1.0f;
        this.t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    final void a() {
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }

    final void b(boolean z) {
        if (this.n != z) {
            this.n = z;
        }
    }

    final void c(float f) {
        this.h = f;
        this.b.setStrokeWidth(f);
    }

    final void d() {
        this.k = this.e;
        this.l = this.f;
        this.m = this.g;
    }

    public final void e() {
        this.j = 0;
        this.u = this.i[0];
    }
}
