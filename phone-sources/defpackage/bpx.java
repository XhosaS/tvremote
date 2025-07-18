package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpx implements bpw {
    private static final AtomicBoolean a = new AtomicBoolean(true);
    private final bpo b;
    private final RenderNode c;
    private long d;
    private Paint e;
    private Matrix f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private float k;
    private boolean l;
    private float m;
    private float n;
    private float o;
    private long p;
    private long q;
    private float r;
    private float s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final kw w;

    public bpx(View view, kw kwVar, bpo bpoVar) {
        this.w = kwVar;
        this.b = bpoVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.c = renderNodeCreate;
        this.d = 0L;
        this.h = 0L;
        if (a.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                renderNodeCreate.setAmbientShadowColor(renderNodeCreate.getAmbientShadowColor());
                renderNodeCreate.setSpotShadowColor(renderNodeCreate.getSpotShadowColor());
            }
            F();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        H(0);
        this.i = 0;
        this.j = 3;
        this.k = 1.0f;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = bnq.a;
        this.p = j;
        this.q = j;
        this.s = 8.0f;
    }

    private final void G() {
        boolean z = this.t;
        boolean z2 = z && !this.g;
        boolean z3 = z && this.g;
        if (z2 != this.u) {
            this.u = z2;
            this.c.setClipToBounds(z2);
        }
        if (z3 != this.v) {
            this.v = z3;
            this.c.setClipToOutline(z3);
        }
    }

    private final void H(int i) {
        RenderNode renderNode = this.c;
        if (a.r(i, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.e);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.r(i, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.e);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.e);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void I() {
        int i = this.i;
        if (a.r(i, 1) || !a.r(this.j, 3)) {
            H(1);
        } else {
            H(i);
        }
    }

    @Override // defpackage.bpw
    public final void A(float f) {
        this.o = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.bpw
    public final void B(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            this.c.setSpotShadowColor(bny.h(j));
        }
    }

    @Override // defpackage.bpw
    public final boolean C() {
        return this.c.isValid();
    }

    @Override // defpackage.bpw
    public final void D() {
        I();
    }

    public final void F() {
        this.c.discardDisplayList();
    }

    @Override // defpackage.bpw
    public final float a() {
        return this.k;
    }

    @Override // defpackage.bpw
    public final float b() {
        return this.s;
    }

    @Override // defpackage.bpw
    public final float c() {
        return this.r;
    }

    @Override // defpackage.bpw
    public final float d() {
        return this.m;
    }

    @Override // defpackage.bpw
    public final float e() {
        return this.n;
    }

    @Override // defpackage.bpw
    public final float f() {
        return this.o;
    }

    @Override // defpackage.bpw
    public final int g() {
        return this.j;
    }

    @Override // defpackage.bpw
    public final int h() {
        return this.i;
    }

    @Override // defpackage.bpw
    public final long i() {
        return this.p;
    }

    @Override // defpackage.bpw
    public final long j() {
        return this.q;
    }

    @Override // defpackage.bpw
    public final Matrix k() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.c.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.bpw
    public final void l() {
        F();
    }

    @Override // defpackage.bpw
    public final void m(bnp bnpVar) {
        DisplayListCanvas displayListCanvasA = bnc.a(bnpVar);
        displayListCanvasA.getClass();
        displayListCanvasA.drawRenderNode(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [bnp, java.lang.Object] */
    @Override // defpackage.bpw
    public final void n(clx clxVar, cmi cmiVar, bpu bpuVar, yjv yjvVar) {
        DisplayListCanvas displayListCanvasStart = this.c.start(Math.max((int) (this.d >> 32), (int) (this.h >> 32)), Math.max((int) (this.d & 4294967295L), (int) (4294967295L & this.h)));
        try {
            kw kwVar = this.w;
            ?? r3 = kwVar.a;
            Canvas canvas = ((bnb) r3).a;
            ((bnb) r3).a = displayListCanvasStart;
            bpo bpoVar = this.b;
            long jY = clw.y(this.d);
            bpn bpnVar = bpoVar.b;
            clx clxVarC = bpnVar.c();
            cmi cmiVarD = bpnVar.d();
            bnp bnpVarB = bpnVar.b();
            long jA = bpnVar.a();
            bpu bpuVar2 = bpnVar.a;
            bpnVar.f(clxVar);
            bpnVar.g(cmiVar);
            bpnVar.e(r3);
            bpnVar.h(jY);
            bpnVar.a = bpuVar;
            r3.g();
            try {
                yjvVar.a(bpoVar);
                r3.e();
                bpn bpnVar2 = bpoVar.b;
                bpnVar2.f(clxVarC);
                bpnVar2.g(cmiVarD);
                bpnVar2.e(bnpVarB);
                bpnVar2.h(jA);
                bpnVar2.a = bpuVar2;
                ((bnb) kwVar.a).a = canvas;
            } catch (Throwable th) {
                r3.e();
                bpn bpnVar3 = bpoVar.b;
                bpnVar3.f(clxVarC);
                bpnVar3.g(cmiVarD);
                bpnVar3.e(bnpVarB);
                bpnVar3.h(jA);
                bpnVar3.a = bpuVar2;
                throw th;
            }
        } finally {
            this.c.end(displayListCanvasStart);
        }
    }

    @Override // defpackage.bpw
    public final void o(float f) {
        this.k = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.bpw
    public final void p(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.p = j;
            this.c.setAmbientShadowColor(bny.h(j));
        }
    }

    @Override // defpackage.bpw
    public final void q(int i) {
        if (a.r(this.j, i)) {
            return;
        }
        this.j = i;
        Paint paint = this.e;
        if (paint == null) {
            paint = new Paint();
            this.e = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(bnj.l(i)));
        I();
    }

    @Override // defpackage.bpw
    public final void r(float f) {
        this.s = f;
        this.c.setCameraDistance(-f);
    }

    @Override // defpackage.bpw
    public final void s(boolean z) {
        this.t = z;
        G();
    }

    @Override // defpackage.bpw
    public final void t(int i) {
        this.i = i;
        I();
    }

    @Override // defpackage.bpw
    public final void u(Outline outline, long j) {
        this.h = j;
        this.c.setOutline(outline);
        this.g = outline != null;
        G();
    }

    @Override // defpackage.bpw
    public final void v(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.l = true;
            RenderNode renderNode = this.c;
            renderNode.setPivotX(((int) (this.d >> 32)) / 2.0f);
            renderNode.setPivotY(((int) (4294967295L & this.d)) / 2.0f);
            return;
        }
        this.l = false;
        RenderNode renderNode2 = this.c;
        renderNode2.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        renderNode2.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.bpw
    public final void w(int i, int i2, long j) {
        int i3 = (int) (4294967295L & j);
        int i4 = (int) (j >> 32);
        RenderNode renderNode = this.c;
        renderNode.setLeftTopRightBottom(i, i2, i + i4, i2 + i3);
        if (a.s(this.d, j)) {
            return;
        }
        if (this.l) {
            renderNode.setPivotX(i4 / 2.0f);
            renderNode.setPivotY(i3 / 2.0f);
        }
        this.d = j;
    }

    @Override // defpackage.bpw
    public final void x(float f) {
        this.r = f;
        this.c.setRotation(f);
    }

    @Override // defpackage.bpw
    public final void y(float f) {
        this.m = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.bpw
    public final void z(float f) {
        this.n = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.bpw
    public final void E() {
    }
}
