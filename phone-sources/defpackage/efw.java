package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efw implements ees {
    public long a;
    public Uri b;
    private final ees c;

    public efw(ees eesVar) {
        eesVar.getClass();
        this.c = eesVar;
        this.b = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) {
        int iA = this.c.a(bArr, i, i2);
        if (iA != -1) {
            this.a += iA;
        }
        return iA;
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) {
        this.b = eeyVar.a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jB = this.c.b(eeyVar);
            Uri uriC = c();
            if (uriC != null) {
                this.b = uriC;
            }
            e();
            return jB;
        } catch (Throwable th) {
            Uri uriC2 = c();
            if (uriC2 != null) {
                this.b = uriC2;
            }
            e();
            throw th;
        }
    }

    @Override // defpackage.ees
    public final Uri c() {
        return this.c.c();
    }

    @Override // defpackage.ees
    public final void d() {
        this.c.d();
    }

    @Override // defpackage.ees
    public final Map e() {
        return this.c.e();
    }

    @Override // defpackage.ees
    public final void f(efy efyVar) {
        efyVar.getClass();
        this.c.f(efyVar);
    }

    public final void g() {
        this.a = 0L;
    }
}
