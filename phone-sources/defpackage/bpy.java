package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpy implements bpw {
    private final bpo a;
    private final RenderNode b;
    private long c;
    private Paint d;
    private Matrix e;
    private boolean f;
    private float g;
    private int h;
    private float i;
    private float j;
    private float k;
    private long l;
    private long m;
    private float n;
    private float o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private final kw t;

    public bpy(kw kwVar, bpo bpoVar) {
        this.t = kwVar;
        this.a = bpoVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.b = renderNode;
        this.c = 0L;
        renderNode.setClipToBounds(false);
        H(renderNode, 0);
        this.g = 1.0f;
        this.h = 3;
        this.i = 1.0f;
        this.j = 1.0f;
        long j = bnq.a;
        this.l = j;
        this.m = j;
        this.o = 8.0f;
        this.s = 0;
    }

    private final Paint F() {
        Paint paint = this.d;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.d = paint2;
        return paint2;
    }

    private final void G() {
        boolean z = this.p;
        boolean z2 = z && !this.f;
        boolean z3 = z && this.f;
        if (z2 != this.q) {
            this.q = z2;
            this.b.setClipToBounds(z2);
        }
        if (z3 != this.r) {
            this.r = z3;
            this.b.setClipToOutline(z3);
        }
    }

    private final void H(RenderNode renderNode, int i) {
        if (a.r(i, 1)) {
            renderNode.setUseCompositingLayer(true, this.d);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.r(i, 2)) {
            renderNode.setUseCompositingLayer(false, this.d);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.d);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void I() {
        int i = this.s;
        if (a.r(i, 1) || !a.r(this.h, 3)) {
            H(this.b, 1);
        } else {
            H(this.b, i);
        }
    }

    @Override // defpackage.bpw
    public final void A(float f) {
        this.k = f;
        this.b.setElevation(f);
    }

    @Override // defpackage.bpw
    public final void B(long j) {
        this.m = j;
        this.b.setSpotShadowColor(bny.h(j));
    }

    @Override // defpackage.bpw
    public final boolean C() {
        return this.b.hasDisplayList();
    }

    @Override // defpackage.bpw
    public final void D() {
        F().setColorFilter(null);
        I();
    }

    @Override // defpackage.bpw
    public final void E() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.b.setRenderEffect(null);
        }
    }

    @Override // defpackage.bpw
    public final float a() {
        return this.g;
    }

    @Override // defpackage.bpw
    public final float b() {
        return this.o;
    }

    @Override // defpackage.bpw
    public final float c() {
        return this.n;
    }

    @Override // defpackage.bpw
    public final float d() {
        return this.i;
    }

    @Override // defpackage.bpw
    public final float e() {
        return this.j;
    }

    @Override // defpackage.bpw
    public final float f() {
        return this.k;
    }

    @Override // defpackage.bpw
    public final int g() {
        return this.h;
    }

    @Override // defpackage.bpw
    public final int h() {
        return this.s;
    }

    @Override // defpackage.bpw
    public final long i() {
        return this.l;
    }

    @Override // defpackage.bpw
    public final long j() {
        return this.m;
    }

    @Override // defpackage.bpw
    public final Matrix k() {
        Matrix matrix = this.e;
        if (matrix == null) {
            matrix = new Matrix();
            this.e = matrix;
        }
        this.b.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.bpw
    public final void l() {
        this.b.discardDisplayList();
    }

    @Override // defpackage.bpw
    public final void m(bnp bnpVar) {
        bnc.a(bnpVar).drawRenderNode(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [bnp, java.lang.Object] */
    @Override // defpackage.bpw
    public final void n(clx clxVar, cmi cmiVar, bpu bpuVar, yjv yjvVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.b.beginRecording();
        try {
            ?? r1 = this.t.a;
            Canvas canvas = ((bnb) r1).a;
            ((bnb) r1).a = recordingCanvasBeginRecording;
            bpo bpoVar = this.a;
            bpn bpnVar = bpoVar.b;
            bpnVar.f(clxVar);
            bpnVar.g(cmiVar);
            bpnVar.a = bpuVar;
            bpnVar.h(this.c);
            bpnVar.e(r1);
            yjvVar.a(bpoVar);
            ((bnb) r1).a = canvas;
        } finally {
            this.b.endRecording();
        }
    }

    @Override // defpackage.bpw
    public final void o(float f) {
        this.g = f;
        this.b.setAlpha(f);
    }

    @Override // defpackage.bpw
    public final void p(long j) {
        this.l = j;
        this.b.setAmbientShadowColor(bny.h(j));
    }

    @Override // defpackage.bpw
    public final void q(int i) {
        this.h = i;
        F().setBlendMode(bnj.k(i));
        I();
    }

    @Override // defpackage.bpw
    public final void r(float f) {
        this.o = f;
        this.b.setCameraDistance(f);
    }

    @Override // defpackage.bpw
    public final void s(boolean z) {
        this.p = z;
        G();
    }

    @Override // defpackage.bpw
    public final void t(int i) {
        this.s = i;
        I();
    }

    @Override // defpackage.bpw
    public final void u(Outline outline, long j) {
        this.b.setOutline(outline);
        this.f = outline != null;
        G();
    }

    @Override // defpackage.bpw
    public final void v(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.b.resetPivot();
            return;
        }
        RenderNode renderNode = this.b;
        renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        renderNode.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.bpw
    public final void w(int i, int i2, long j) {
        this.b.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.c = clw.y(j);
    }

    @Override // defpackage.bpw
    public final void x(float f) {
        this.n = f;
        this.b.setRotationZ(f);
    }

    @Override // defpackage.bpw
    public final void y(float f) {
        this.i = f;
        this.b.setScaleX(f);
    }

    @Override // defpackage.bpw
    public final void z(float f) {
        this.j = f;
        this.b.setScaleY(f);
    }
}
