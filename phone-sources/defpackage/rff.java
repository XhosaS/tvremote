package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rff {
    public tst a;
    public rfp b;
    public tst c;
    public tst d;
    public rfo e;
    public Runnable f;
    public byte g;
    public int h;
    public rrx i;
    public rrx j;
    private tst k;
    private tst l;
    private tst m;
    private tst n;
    private ImmutableList o;
    private tst p;
    private tst q;
    private tst r;
    private boolean s;

    public rff() {
        throw null;
    }

    public final rfg a() {
        rrx rrxVar;
        rfp rfpVar;
        ImmutableList immutableList;
        rfo rfoVar;
        rrx rrxVar2;
        Runnable runnable;
        if (this.g == 3 && (rrxVar = this.j) != null && (rfpVar = this.b) != null && (immutableList = this.o) != null && (rfoVar = this.e) != null && this.h != 0 && (rrxVar2 = this.i) != null && (runnable = this.f) != null) {
            return new rfg(this.k, this.l, this.m, this.a, rrxVar, this.n, rfpVar, this.c, this.d, immutableList, rfoVar, this.p, this.q, this.r, rrxVar2, this.s, runnable);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" policyFooterCustomizer");
        }
        if (this.b == null) {
            sb.append(" flavorsFeature");
        }
        if (this.o == null) {
            sb.append(" commonActions");
        }
        if (this.e == null) {
            sb.append(" educationManager");
        }
        if ((this.g & 1) == 0) {
            sb.append(" isExperimental");
        }
        if (this.h == 0) {
            sb.append(" largeScreenDialogAlignment");
        }
        if (this.i == null) {
            sb.append(" materialVersion");
        }
        if ((this.g & 2) == 0) {
            sb.append(" enableQuickProfileSwitching");
        }
        if (this.f == null) {
            sb.append(" onSlowAccountSwitchingRunnable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null commonActions");
        }
        this.o = immutableList;
    }

    public final void c(boolean z) {
        this.s = z;
        this.g = (byte) (this.g | 2);
    }

    public rff(rfg rfgVar) {
        trk trkVar = trk.a;
        this.k = trkVar;
        this.l = trkVar;
        this.m = trkVar;
        this.a = trkVar;
        this.n = trkVar;
        this.c = trkVar;
        this.d = trkVar;
        this.p = trkVar;
        this.q = trkVar;
        this.r = trkVar;
        this.k = rfgVar.a;
        this.l = rfgVar.b;
        this.m = rfgVar.c;
        this.a = rfgVar.d;
        this.j = rfgVar.r;
        this.n = rfgVar.e;
        this.b = rfgVar.f;
        this.c = rfgVar.g;
        this.d = rfgVar.h;
        this.o = rfgVar.i;
        this.e = rfgVar.j;
        this.p = rfgVar.k;
        this.q = rfgVar.l;
        this.r = rfgVar.m;
        this.h = rfgVar.p;
        this.i = rfgVar.q;
        this.s = rfgVar.n;
        this.f = rfgVar.o;
        this.g = (byte) 3;
    }

    public rff(byte[] bArr) {
        trk trkVar = trk.a;
        this.k = trkVar;
        this.l = trkVar;
        this.m = trkVar;
        this.a = trkVar;
        this.n = trkVar;
        this.c = trkVar;
        this.d = trkVar;
        this.p = trkVar;
        this.q = trkVar;
        this.r = trkVar;
    }
}
