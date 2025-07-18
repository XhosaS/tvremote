package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqa implements bpw {
    private static final Canvas a = new bpz();
    private final bqd b;
    private final bqc c;
    private final Resources d;
    private final Rect e;
    private Paint f;
    private int g;
    private int h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private float q;
    private float r;
    private float s;
    private long t;
    private long u;
    private float v;
    private final kw w;

    public /* synthetic */ bqa(bqd bqdVar) {
        kw kwVar = new kw((byte[]) null, (char[]) null);
        bpo bpoVar = new bpo();
        this.b = bqdVar;
        this.w = kwVar;
        bqc bqcVar = new bqc(bqdVar, kwVar, bpoVar);
        this.c = bqcVar;
        this.d = bqdVar.getResources();
        this.e = new Rect();
        bqdVar.addView(bqcVar);
        bqcVar.setClipBounds(null);
        this.i = 0L;
        View.generateViewId();
        this.m = 3;
        this.n = 0;
        this.o = 1.0f;
        this.q = 1.0f;
        this.r = 1.0f;
        long j = bnq.a;
        this.t = j;
        this.u = j;
    }

    private final Paint G() {
        Paint paint = this.f;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f = paint2;
        return paint2;
    }

    private final void H(int i) {
        bqc bqcVar = this.c;
        boolean z = true;
        if (a.r(i, 1)) {
            bqcVar.setLayerType(2, this.f);
        } else if (a.r(i, 2)) {
            bqcVar.setLayerType(0, this.f);
            z = false;
        } else {
            bqcVar.setLayerType(0, this.f);
        }
        if (bqcVar.c != z) {
            bqcVar.c = z;
            bqcVar.invalidate();
        }
    }

    private final void I() {
        int i = this.n;
        if (a.r(i, 1) || !a.r(this.m, 3)) {
            H(1);
        } else {
            H(i);
        }
    }

    @Override // defpackage.bpw
    public final void A(float f) {
        this.s = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.bpw
    public final void B(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            this.c.setOutlineSpotShadowColor(bny.h(j));
        }
    }

    @Override // defpackage.bpw
    public final /* synthetic */ boolean C() {
        return true;
    }

    @Override // defpackage.bpw
    public final void D() {
        G().setColorFilter(null);
        I();
    }

    @Override // defpackage.bpw
    public final void E() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.c.setRenderEffect(null);
        }
    }

    public final boolean F() {
        return this.l || this.c.getClipToOutline();
    }

    @Override // defpackage.bpw
    public final float a() {
        return this.o;
    }

    @Override // defpackage.bpw
    public final float b() {
        return this.c.getCameraDistance() / this.d.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.bpw
    public final float c() {
        return this.v;
    }

    @Override // defpackage.bpw
    public final float d() {
        return this.q;
    }

    @Override // defpackage.bpw
    public final float e() {
        return this.r;
    }

    @Override // defpackage.bpw
    public final float f() {
        return this.s;
    }

    @Override // defpackage.bpw
    public final int g() {
        return this.m;
    }

    @Override // defpackage.bpw
    public final int h() {
        return this.n;
    }

    @Override // defpackage.bpw
    public final long i() {
        return this.t;
    }

    @Override // defpackage.bpw
    public final long j() {
        return this.u;
    }

    @Override // defpackage.bpw
    public final Matrix k() {
        return this.c.getMatrix();
    }

    @Override // defpackage.bpw
    public final void l() {
        this.b.removeViewInLayout(this.c);
    }

    @Override // defpackage.bpw
    public final void m(bnp bnpVar) {
        if (this.j) {
            bqc bqcVar = this.c;
            Rect rect = null;
            if (F() && !this.k) {
                rect = this.e;
                rect.left = 0;
                rect.top = 0;
                rect.right = bqcVar.getWidth();
                rect.bottom = bqcVar.getHeight();
            }
            bqcVar.setClipBounds(rect);
        }
        if (bnc.a(bnpVar).isHardwareAccelerated()) {
            bqd bqdVar = this.b;
            bqc bqcVar2 = this.c;
            bqdVar.a(bnpVar, bqcVar2, bqcVar2.getDrawingTime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [bnp, java.lang.Object] */
    @Override // defpackage.bpw
    public final void n(clx clxVar, cmi cmiVar, bpu bpuVar, yjv yjvVar) {
        bqc bqcVar = this.c;
        if (bqcVar.getParent() == null) {
            this.b.addView(bqcVar);
        }
        bqcVar.d = clxVar;
        bqcVar.e = cmiVar;
        bqcVar.f = yjvVar;
        bqcVar.g = bpuVar;
        if (bqcVar.isAttachedToWindow()) {
            bqcVar.setVisibility(4);
            bqcVar.setVisibility(0);
            try {
                kw kwVar = this.w;
                Canvas canvas = a;
                ?? r4 = kwVar.a;
                Canvas canvas2 = ((bnb) r4).a;
                ((bnb) r4).a = canvas;
                this.b.a(r4, bqcVar, bqcVar.getDrawingTime());
                ((bnb) r4).a = canvas2;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.bpw
    public final void o(float f) {
        this.o = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.bpw
    public final void p(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            this.c.setOutlineAmbientShadowColor(bny.h(j));
        }
    }

    @Override // defpackage.bpw
    public final void q(int i) {
        this.m = i;
        G().setXfermode(new PorterDuffXfermode(bnj.l(i)));
        I();
    }

    @Override // defpackage.bpw
    public final void r(float f) {
        this.c.setCameraDistance(f * this.d.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.bpw
    public final void s(boolean z) {
        this.l = z && !this.k;
        this.j = true;
        this.c.setClipToOutline(z && this.k);
    }

    @Override // defpackage.bpw
    public final void t(int i) {
        this.n = i;
        I();
    }

    @Override // defpackage.bpw
    public final void u(Outline outline, long j) {
        bqc bqcVar = this.c;
        bqcVar.b = outline;
        bqcVar.invalidateOutline();
        if (F() && outline != null) {
            bqcVar.setClipToOutline(true);
            if (this.l) {
                this.l = false;
                this.j = true;
            }
        }
        this.k = outline != null;
    }

    @Override // defpackage.bpw
    public final void v(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            this.p = false;
            bqc bqcVar = this.c;
            bqcVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            bqcVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.c.resetPivot();
            return;
        }
        this.p = true;
        bqc bqcVar2 = this.c;
        bqcVar2.setPivotX(((int) (this.i >> 32)) / 2.0f);
        bqcVar2.setPivotY(((int) (4294967295L & this.i)) / 2.0f);
    }

    @Override // defpackage.bpw
    public final void w(int i, int i2, long j) {
        if (a.s(this.i, j)) {
            int i3 = this.g;
            if (i3 != i) {
                this.c.offsetLeftAndRight(i - i3);
            }
            int i4 = this.h;
            if (i4 != i2) {
                this.c.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (F()) {
                this.j = true;
            }
            bqc bqcVar = this.c;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            bqcVar.layout(i, i2, i + i5, i2 + i6);
            this.i = j;
            if (this.p) {
                bqcVar.setPivotX(i5 / 2.0f);
                bqcVar.setPivotY(i6 / 2.0f);
            }
        }
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.bpw
    public final void x(float f) {
        this.v = f;
        this.c.setRotation(f);
    }

    @Override // defpackage.bpw
    public final void y(float f) {
        this.q = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.bpw
    public final void z(float f) {
        this.r = f;
        this.c.setScaleY(f);
    }
}
