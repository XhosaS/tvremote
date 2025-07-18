package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fll implements fln {
    private final edi a;
    private final String c;
    private final int d;
    private String f;
    private fel g;
    private int i;
    private int j;
    private long k;
    private dze l;
    private int m;
    private int n;
    private int h = 0;
    private long q = -9223372036854775807L;
    private final AtomicInteger b = new AtomicInteger();
    private int o = -1;
    private int p = -1;
    private final String e = "video/mp2t";

    public fll(String str, int i, int i2) {
        this.a = new edi(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    private final void f(fdn fdnVar) {
        int i;
        int i2 = fdnVar.b;
        if (i2 == -2147483647 || (i = fdnVar.c) == -1) {
            return;
        }
        dze dzeVar = this.l;
        if (dzeVar != null && i == dzeVar.aq && i2 == dzeVar.ar && Objects.equals(fdnVar.a, dzeVar.Y)) {
            return;
        }
        dze dzeVar2 = this.l;
        dzd dzdVar = dzeVar2 == null ? new dzd() : new dzd(dzeVar2);
        dzdVar.a = this.f;
        dzdVar.a(this.e);
        dzdVar.d(fdnVar.a);
        dzdVar.E = i;
        dzdVar.F = i2;
        dzdVar.d = this.c;
        dzdVar.f = this.d;
        dze dzeVar3 = new dze(dzdVar);
        this.l = dzeVar3;
        this.g.b(dzeVar3);
    }

    private final boolean g(edi ediVar, byte[] bArr, int i) {
        int iMin = Math.min(ediVar.a(), i - this.i);
        ediVar.F(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a3  */
    @Override // defpackage.fln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.edi r31) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fll.a(edi):void");
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.f = fmrVar.b();
        this.g = fdrVar.dq(fmrVar.a(), 1);
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.q = j;
    }

    @Override // defpackage.fln
    public final void e() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
    }
}
