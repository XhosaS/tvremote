package defpackage;

import java.io.Closeable;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
class jta implements Closeable {
    public final UrlRequest a;
    public final UrlResponseInfo b;
    public final zyu c;
    public final jsz d;
    public final String e = "";

    public jta(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, zyu zyuVar, jsz jszVar) {
        this.a = urlRequest;
        this.b = urlResponseInfo;
        this.c = zyuVar;
        this.d = jszVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.cancel();
    }
}
