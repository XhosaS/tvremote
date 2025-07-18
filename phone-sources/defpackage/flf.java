package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flf implements fdp {
    private final flg a = new flg("audio/ac3");
    private final edi b = new edi(2786);
    private boolean c;

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        this.c = false;
        this.a.e();
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        int iA;
        edi ediVar = new edi(10);
        int i = 0;
        while (true) {
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
        int i3 = 0;
        int i4 = i;
        while (true) {
            fdqVar.i(ediVar.a, 0, 6);
            ediVar.K(0);
            if (ediVar.n() != 2935) {
                fdqVar.k();
                i4++;
                if (i4 - i >= 8192) {
                    return false;
                }
                fdqVar.g(i4);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = ediVar.a;
                int[] iArr = fcv.a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i5 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    iA = i5 + i5;
                } else {
                    byte b = bArr[4];
                    iA = fcv.a((b & 192) >> 6, b & 63);
                }
                if (iA == -1) {
                    return false;
                }
                fdqVar.g(iA - 6);
            }
        }
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) {
        edi ediVar = this.b;
        int iA = fdqVar.a(ediVar.a, 0, 2786);
        if (iA == -1) {
            return -1;
        }
        ediVar.K(0);
        ediVar.J(iA);
        if (!this.c) {
            this.a.a = 0L;
            this.c = true;
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
        this.a.b(fdrVar, new fmr(0, 1));
        fdrVar.j();
        fdrVar.r(new fee(-9223372036854775807L));
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
