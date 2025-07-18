package defpackage;

import android.net.Uri;
import android.util.Base64;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eep extends eem {
    private eey a;
    private byte[] b;
    private int c;
    private int d;

    public eep() {
        super(false);
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.b;
        String str = edt.a;
        System.arraycopy(bArr2, this.c, bArr, i, iMin);
        this.c += iMin;
        this.d -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) throws eev, eaf {
        i(eeyVar);
        this.a = eeyVar;
        Uri uriNormalizeScheme = eeyVar.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        eci.a("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] strArrAt = edt.at(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrAt.length != 2) {
            throw new eaf("Unexpected URI format: ".concat(String.valueOf(String.valueOf(uriNormalizeScheme))), null, true, 0);
        }
        String str = strArrAt[1];
        if (strArrAt[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new eaf("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e, true, 0);
            }
        } else {
            this.b = edt.ar(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j = eeyVar.f;
        int length = this.b.length;
        if (j > length) {
            this.b = null;
            throw new eev(2008);
        }
        int i = (int) j;
        this.c = i;
        int i2 = length - i;
        this.d = i2;
        long j2 = eeyVar.g;
        if (j2 != -1) {
            this.d = (int) Math.min(i2, j2);
        }
        j(eeyVar);
        return j2 != -1 ? j2 : this.d;
    }

    @Override // defpackage.ees
    public final Uri c() {
        eey eeyVar = this.a;
        if (eeyVar != null) {
            return eeyVar.a;
        }
        return null;
    }

    @Override // defpackage.ees
    public final void d() {
        if (this.b != null) {
            this.b = null;
            h();
        }
        this.a = null;
    }
}
