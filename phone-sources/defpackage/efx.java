package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efx implements ees {
    private final ees a;
    private boolean b;
    private long c;
    private final egf d;

    public efx(ees eesVar, egf egfVar) {
        this.a = eesVar;
        this.d = egfVar;
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (this.c == 0) {
            return -1;
        }
        int iA = this.a.a(bArr, i, i2);
        if (iA > 0) {
            egf egfVar = this.d;
            eey eeyVar = egfVar.a;
            if (eeyVar != null) {
                int i3 = 0;
                while (i3 < iA) {
                    try {
                        if (egfVar.d == egfVar.b) {
                            egfVar.b();
                            egfVar.c(eeyVar);
                        }
                        int iMin = (int) Math.min(iA - i3, egfVar.b - egfVar.d);
                        OutputStream outputStream = egfVar.c;
                        String str = edt.a;
                        outputStream.write(bArr, i + i3, iMin);
                        i3 += iMin;
                        long j = iMin;
                        egfVar.d += j;
                        egfVar.e += j;
                    } catch (IOException e) {
                        throw new egd(e);
                    }
                }
            }
            long j2 = this.c;
            if (j2 != -1) {
                this.c = j2 - iA;
            }
        }
        return iA;
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) throws egd {
        long jB = this.a.b(eeyVar);
        this.c = jB;
        if (jB == 0) {
            return 0L;
        }
        if (eeyVar.g == -1 && jB != -1) {
            eeyVar = eeyVar.b(0L, jB);
        }
        this.b = true;
        egf egfVar = this.d;
        eeyVar.h.getClass();
        if (eeyVar.g == -1 && eeyVar.f(2)) {
            egfVar.a = null;
        } else {
            egfVar.a = eeyVar;
            egfVar.b = true != eeyVar.f(4) ? Long.MAX_VALUE : 5242880L;
            egfVar.e = 0L;
            try {
                egfVar.c(eeyVar);
            } catch (IOException e) {
                throw new egd(e);
            }
        }
        return this.c;
    }

    @Override // defpackage.ees
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.ees
    public final void d() {
        try {
            this.a.d();
            if (this.b) {
                this.b = false;
                this.d.a();
            }
        } catch (Throwable th) {
            if (this.b) {
                this.b = false;
                this.d.a();
            }
            throw th;
        }
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
