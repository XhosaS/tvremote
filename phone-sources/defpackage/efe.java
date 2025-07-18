package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efe extends eem implements efn {
    private final String a;
    private eey b;
    private HttpURLConnection c;
    private InputStream d;
    private boolean e;
    private int f;
    private long g;
    private long h;
    private final ghc i;
    private final ghc j;

    public efe(String str, ghc ghcVar) {
        super(true);
        this.a = str;
        this.i = ghcVar;
        this.j = new ghc(null, null, null);
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                edb.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.g;
            if (j != -1) {
                long j2 = j - this.h;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.d;
            String str = edt.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.h += i3;
            g(i3);
            return i3;
        } catch (IOException e) {
            String str2 = edt.a;
            throw efk.a(e, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    @Override // defpackage.ees
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.eey r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efe.b(eey):long");
    }

    @Override // defpackage.ees
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        eey eeyVar = this.b;
        if (eeyVar != null) {
            return eeyVar.a;
        }
        return null;
    }

    @Override // defpackage.ees
    public final void d() {
        try {
            InputStream inputStream = this.d;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = edt.a;
                    throw new efk(e, 2000, 3);
                }
            }
        } finally {
            this.d = null;
            k();
            if (this.e) {
                this.e = false;
                h();
            }
            this.c = null;
            this.b = null;
        }
    }

    @Override // defpackage.eem, defpackage.ees
    public final Map e() {
        HttpURLConnection httpURLConnection = this.c;
        return httpURLConnection == null ? ImmutableMap.of() : new efd(httpURLConnection.getHeaderFields());
    }
}
