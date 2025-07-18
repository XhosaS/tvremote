package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqc extends View {
    public static final /* synthetic */ int h = 0;
    private static final ViewOutlineProvider i = new bqb();
    public boolean a;
    public Outline b;
    public boolean c;
    public clx d;
    public cmi e;
    public yjv f;
    public bpu g;
    private final bpo j;
    private final kw k;

    public bqc(View view, kw kwVar, bpo bpoVar) {
        super(view.getContext());
        this.k = kwVar;
        this.j = bpoVar;
        setOutlineProvider(i);
        this.c = true;
        this.d = bpp.a;
        this.e = cmi.a;
        this.f = bpv.a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [bnp, java.lang.Object] */
    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        kw kwVar = this.k;
        ?? r2 = kwVar.a;
        bnb bnbVar = (bnb) r2;
        Canvas canvas2 = bnbVar.a;
        bnbVar.a = canvas;
        clx clxVar = this.d;
        cmi cmiVar = this.e;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = Float.floatToRawIntBits(width);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(height);
        bpo bpoVar = this.j;
        bpn bpnVar = bpoVar.b;
        bpu bpuVar = this.g;
        yjv yjvVar = this.f;
        clx clxVarC = bpnVar.c();
        cmi cmiVarD = bpnVar.d();
        bnp bnpVarB = bpnVar.b();
        long jA = bpnVar.a();
        bpu bpuVar2 = bpnVar.a;
        bpnVar.f(clxVar);
        bpnVar.g(cmiVar);
        bpnVar.e(r2);
        bpnVar.h((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
        bpnVar.a = bpuVar;
        r2.g();
        try {
            yjvVar.a(bpoVar);
            r2.e();
            bpn bpnVar2 = bpoVar.b;
            bpnVar2.f(clxVarC);
            bpnVar2.g(cmiVarD);
            bpnVar2.e(bnpVarB);
            bpnVar2.h(jA);
            bpnVar2.a = bpuVar2;
            ((bnb) kwVar.a).a = canvas2;
            this.a = false;
        } catch (Throwable th) {
            r2.e();
            bpn bpnVar3 = bpoVar.b;
            bpnVar3.f(clxVarC);
            bpnVar3.g(cmiVarD);
            bpnVar3.e(bnpVarB);
            bpnVar3.h(jA);
            bpnVar3.a = bpuVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.a) {
            return;
        }
        this.a = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
