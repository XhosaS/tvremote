package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehd extends eem implements efn {
    public UrlRequest a;
    ehc b;
    public eey c;
    public UrlResponseInfo d;
    public IOException e;
    public boolean f;
    public final shx g;
    private final CronetEngine h;
    private final Executor i;
    private final String j;
    private boolean k;
    private long l;
    private ByteBuffer m;
    private volatile long n;
    private final ghc o;
    private final ghc p;

    static {
        dzz.b("media3.datasource.cronet");
    }

    protected ehd(CronetEngine cronetEngine, Executor executor, String str, ghc ghcVar) {
        super(true);
        this.h = cronetEngine;
        this.i = executor;
        this.j = str;
        this.o = ghcVar;
        this.p = new ghc(null, null, null);
        this.g = new shx();
    }

    private static String k(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    private final ByteBuffer l() {
        if (this.m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.m = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.m;
    }

    private final void m(ByteBuffer byteBuffer, eey eeyVar) throws SocketTimeoutException, efk {
        UrlRequest urlRequest = this.a;
        String str = edt.a;
        urlRequest.read(byteBuffer);
        try {
        } catch (InterruptedException unused) {
            if (byteBuffer == this.m) {
                this.m = null;
            }
            Thread.currentThread().interrupt();
            this.e = new InterruptedIOException();
        } catch (SocketTimeoutException e) {
            if (byteBuffer == this.m) {
                this.m = null;
            }
            this.e = new efk(e, 2002, 2);
        }
        if (!this.g.d(8000L)) {
            throw new SocketTimeoutException();
        }
        IOException iOException = this.e;
        if (iOException != null) {
            if (!(iOException instanceof efk)) {
                throw efk.a(iOException, 2);
            }
            throw ((efk) iOException);
        }
    }

    private static void n(UrlRequest urlRequest) {
        shx shxVar = new shx();
        urlRequest.getStatus(new egz(new int[1], shxVar));
        shxVar.b();
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) throws SocketTimeoutException, efk {
        a.ab(this.k);
        if (i2 == 0) {
            return 0;
        }
        if (this.l == 0) {
            return -1;
        }
        ByteBuffer byteBufferL = l();
        if (!byteBufferL.hasRemaining()) {
            this.g.h();
            byteBufferL.clear();
            eey eeyVar = this.c;
            String str = edt.a;
            m(byteBufferL, eeyVar);
            if (this.f) {
                this.l = 0L;
                return -1;
            }
            byteBufferL.flip();
            a.ab(byteBufferL.hasRemaining());
        }
        long j = this.l;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        long[] jArr = {j, byteBufferL.remaining(), i2};
        a.H(true);
        long j2 = jArr[0];
        for (int i3 = 1; i3 < 3; i3++) {
            long j3 = jArr[i3];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        int i4 = (int) j2;
        byteBufferL.get(bArr, i, i4);
        long j4 = this.l;
        if (j4 != -1) {
            this.l = j4 - i4;
        }
        g(i4);
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    @Override // defpackage.ees
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.eey r19) throws defpackage.efk, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehd.b(eey):long");
    }

    @Override // defpackage.ees
    public final Uri c() {
        UrlResponseInfo urlResponseInfo = this.d;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        eey eeyVar = this.c;
        if (eeyVar != null) {
            return eeyVar.a;
        }
        return null;
    }

    @Override // defpackage.ees
    public final synchronized void d() {
        UrlRequest urlRequest = this.a;
        if (urlRequest != null) {
            urlRequest.cancel();
            this.a = null;
        }
        ehc ehcVar = this.b;
        if (ehcVar != null) {
            ehcVar.a = true;
            this.b = null;
        }
        ByteBuffer byteBuffer = this.m;
        if (byteBuffer != null) {
            byteBuffer.limit(0);
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        if (this.k) {
            this.k = false;
            h();
        }
    }

    @Override // defpackage.eem, defpackage.ees
    public final Map e() {
        UrlResponseInfo urlResponseInfo = this.d;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getAllHeaders();
    }
}
