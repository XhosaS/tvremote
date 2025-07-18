package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evp implements ees {
    private final ees a;
    private final int b;
    private final byte[] c;
    private int d;
    private final ewm e;

    public evp(ees eesVar, int i, ewm ewmVar) {
        a.H(i > 0);
        this.a = eesVar;
        this.b = i;
        this.e = ewmVar;
        this.c = new byte[1];
        this.d = i;
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            ees eesVar = this.a;
            byte[] bArr2 = this.c;
            int i4 = 0;
            if (eesVar.a(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iA = eesVar.a(bArr3, i4, i6);
                        if (iA != -1) {
                            i4 += iA;
                            i6 -= iA;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        ewm ewmVar = this.e;
                        edi ediVar = new edi(bArr3, i5);
                        long jMax = !ewmVar.f ? ewmVar.c : Math.max(ewmVar.g.k(true), ewmVar.c);
                        int iA2 = ediVar.a();
                        fel felVar = ewmVar.e;
                        felVar.getClass();
                        felVar.c(ediVar, iA2);
                        felVar.e(jMax, 1, iA2, 0, null);
                        ewmVar.f = true;
                    }
                }
                i3 = this.b;
                this.d = i3;
            }
            return -1;
        }
        int iA3 = this.a.a(bArr, i, Math.min(i3, i2));
        if (iA3 != -1) {
            this.d -= iA3;
        }
        return iA3;
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ees
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.ees
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ees
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.ees
    public final void f(efy efyVar) {
        efyVar.getClass();
        this.a.f(efyVar);
    }
}
