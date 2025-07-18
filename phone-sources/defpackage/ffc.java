package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffc implements fdp {
    private final byte[] a;
    private final edi b;
    private fdr c;
    private fel d;
    private int e;
    private ead f;
    private fdu g;
    private int h;
    private int i;
    private int j;
    private long k;
    private fdf l;
    private final rsj m;

    public ffc() {
        this(null);
    }

    private final long h(edi ediVar, boolean z) {
        boolean zAd;
        this.g.getClass();
        int i = ediVar.b;
        while (i <= ediVar.c - 16) {
            ediVar.K(i);
            fdu fduVar = this.g;
            int i2 = this.i;
            rsj rsjVar = this.m;
            if (fki.ad(ediVar, fduVar, i2, rsjVar)) {
                ediVar.K(i);
                return rsjVar.a;
            }
            i++;
        }
        if (!z) {
            ediVar.K(i);
            return -1L;
        }
        while (true) {
            int i3 = ediVar.c;
            if (i > i3 - this.h) {
                ediVar.K(i3);
                return -1L;
            }
            ediVar.K(i);
            try {
                zAd = fki.ad(ediVar, this.g, this.i, this.m);
            } catch (IndexOutOfBoundsException unused) {
                zAd = false;
            }
            if (ediVar.b <= ediVar.c && zAd) {
                ediVar.K(i);
                return this.m.a;
            }
            i++;
        }
    }

    private final void i() {
        long j = this.k * 1000000;
        fdu fduVar = this.g;
        String str = edt.a;
        this.d.e(j / fduVar.e, 1, this.j, 0, null);
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        if (j == 0) {
            this.e = 0;
        } else {
            fdf fdfVar = this.l;
            if (fdfVar != null) {
                fdfVar.a(j2);
            }
        }
        this.k = j2 != 0 ? -1L : 0L;
        this.j = 0;
        this.b.G(0);
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        fki.R(fdqVar, false);
        edi ediVar = new edi(4);
        fdqVar.i(ediVar.a, 0, 4);
        return ediVar.r() == 1716281667;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.fdq r41, defpackage.rsj r42) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffc.g(fdq, rsj):int");
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.c = fdrVar;
        this.d = fdrVar.dq(0, 1);
        fdrVar.j();
    }

    public ffc(byte[] bArr) {
        this.a = new byte[42];
        this.b = new edi(new byte[32768], 0);
        this.m = new rsj();
        this.e = 0;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
