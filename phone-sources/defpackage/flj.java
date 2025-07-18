package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flj implements fdp {
    private final flk a;
    private final edi b;
    private final edi c;
    private final edh d;
    private fdr e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    public flj() {
        this(null);
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        this.h = false;
        this.a.e();
        this.f = j2;
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        edi ediVar;
        int i = 0;
        while (true) {
            ediVar = this.c;
            fdqVar.i(ediVar.a, 0, 10);
            ediVar.K(0);
            if (ediVar.l() != 4801587) {
                break;
            }
            ediVar.L(3);
            int i2 = ediVar.i();
            i += i2 + 10;
            fdqVar.g(i2);
        }
        fdqVar.k();
        fdqVar.g(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = i;
        do {
            fdqVar.i(ediVar.a, 0, 2);
            ediVar.K(0);
            if (flk.f(ediVar.n())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                fdqVar.i(ediVar.a, 0, 4);
                edh edhVar = this.d;
                edhVar.l(14);
                int iD = edhVar.d(13);
                if (iD <= 6) {
                    i5++;
                    fdqVar.k();
                    fdqVar.g(i5);
                } else {
                    fdqVar.g(iD - 6);
                    i4 += iD;
                }
            } else {
                i5++;
                fdqVar.k();
                fdqVar.g(i5);
            }
            i3 = 0;
            i4 = 0;
        } while (i5 - i < 8192);
        return false;
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) {
        eci.e(this.e);
        edi ediVar = this.b;
        int iA = fdqVar.a(ediVar.a, 0, RecyclerView.ItemAnimator.FLAG_MOVED);
        if (!this.i) {
            this.e.r(new fee(-9223372036854775807L));
            this.i = true;
        }
        if (iA == -1) {
            return -1;
        }
        ediVar.K(0);
        ediVar.J(iA);
        if (!this.h) {
            this.a.b = this.f;
            this.h = true;
        }
        this.a.a(ediVar);
        return 0;
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.e = fdrVar;
        this.a.b(fdrVar, new fmr(0, 1));
        fdrVar.j();
    }

    public flj(byte[] bArr) {
        this.a = new flk(true, null, 0, "audio/mp4a-latm");
        this.b = new edi(RecyclerView.ItemAnimator.FLAG_MOVED);
        this.g = -1L;
        edi ediVar = new edi(10);
        this.c = ediVar;
        this.d = new edh(ediVar.a);
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
