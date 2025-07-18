package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flh implements fdp {
    private final fli a = new fli(null, 0, "audio/ac4");
    private final edi b = new edi(16384);
    private boolean c;

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        this.c = false;
        this.a.e();
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        int i;
        edi ediVar = new edi(10);
        int i2 = 0;
        while (true) {
            fdqVar.i(ediVar.a, 0, 10);
            ediVar.K(0);
            if (ediVar.l() != 4801587) {
                break;
            }
            ediVar.L(3);
            int i3 = ediVar.i();
            i2 += i3 + 10;
            fdqVar.g(i3);
        }
        fdqVar.k();
        fdqVar.g(i2);
        int i4 = 0;
        int i5 = i2;
        while (true) {
            int i6 = 7;
            fdqVar.i(ediVar.a, 0, 7);
            ediVar.K(0);
            int iN = ediVar.n();
            if (iN == 44096 || iN == 44097) {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = ediVar.a;
                int i7 = fcx.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i8 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i8 == 65535) {
                        i8 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i6 = 4;
                    }
                    if (iN == 44097) {
                        i6 += 2;
                    }
                    i = i8 + i6;
                }
                if (i == -1) {
                    return false;
                }
                fdqVar.g(i - 7);
            } else {
                fdqVar.k();
                i5++;
                if (i5 - i2 >= 8192) {
                    return false;
                }
                fdqVar.g(i5);
                i4 = 0;
            }
        }
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) {
        edi ediVar = this.b;
        int iA = fdqVar.a(ediVar.a, 0, 16384);
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
