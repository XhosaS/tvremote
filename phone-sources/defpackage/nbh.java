package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbh {
    public boolean a;
    public tst b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public nbh() {
        throw null;
    }

    public final void a(boolean z) {
        this.a = z;
        this.c = (byte) 1;
    }

    public final kuv b() {
        Object obj;
        Object obj2;
        if (!this.b.g()) {
            int iIntValue = ((Integer) ((tst) this.e).e(0)).intValue();
            int iIntValue2 = ((Integer) ((tst) this.d).e(0)).intValue();
            if (iIntValue != 0 && iIntValue2 != 0) {
                this.b = tst.i(Float.valueOf(iIntValue / iIntValue2));
            }
        }
        if (this.c == 1 && (obj = this.f) != null && (obj2 = this.g) != null) {
            return new kuv((Uri) obj, (kuu) obj2, this.a, this.b, (tst) this.e, (tst) this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" uri");
        }
        if (this.g == null) {
            sb.append(" type");
        }
        if (this.c == 0) {
            sb.append(" fife");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) 1;
    }

    public final void d(kuu kuuVar) {
        if (kuuVar == null) {
            throw new NullPointerException("Null type");
        }
        this.g = kuuVar;
    }

    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f = uri;
    }

    public nbh(byte[] bArr) {
        this.b = trk.a;
    }

    public nbh(byte[] bArr, byte[] bArr2) {
        trk trkVar = trk.a;
        this.b = trkVar;
        this.e = trkVar;
        this.d = trkVar;
    }
}
