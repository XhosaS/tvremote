package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
class jsz extends UrlRequest.Callback {
    public WritableByteChannel a;
    private final zyu b;
    private final zyu c = new zyu();
    private jta d;
    private long e;

    public jsz(zyu zyuVar) {
        this.b = zyuVar;
    }

    private final void a() {
        jta jtaVar = this.d;
        if (jtaVar == null) {
            return;
        }
        jtaVar.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        a();
        this.c.q(new jvb());
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        juz juzVarA;
        int cronetInternalErrorCode;
        Throwable cause;
        a();
        if (urlResponseInfo != null && urlResponseInfo.getHttpStatusCode() >= 400) {
            juzVarA = juz.f(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getAllHeaders(), urlResponseInfo.getHttpStatusText());
        } else if (cronetException instanceof NetworkException) {
            NetworkException networkException = (NetworkException) cronetException;
            juy juyVarE = juz.e();
            juyVarE.c(networkException.getCronetInternalErrorCode());
            ((jsw) juyVarE).a = yqv.b(networkException.getMessage());
            boolean z = true;
            if (!networkException.immediatelyRetryable() && networkException.getErrorCode() != 3 && (cronetInternalErrorCode = networkException.getCronetInternalErrorCode()) != -106 && cronetInternalErrorCode != -103) {
                z = false;
            }
            juyVarE.d(z);
            juzVarA = juyVarE.a();
        } else {
            juy juyVarE2 = juz.e();
            ((jsw) juyVarE2).a = yqv.b(cronetException.getMessage());
            juzVarA = juyVarE2.a();
        }
        int i = jte.a;
        if ((cronetException instanceof CallbackException) && (cause = cronetException.getCause()) != null) {
            cronetException = cause;
        }
        jvb jvbVar = new jvb(juzVarA, cronetException);
        zyu zyuVar = this.b;
        if (zyuVar.isDone()) {
            this.c.q(jvbVar);
        } else {
            zyuVar.q(jvbVar);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (urlRequest.isDone()) {
            return;
        }
        if (this.c.valueField instanceof zue) {
            urlRequest.cancel();
            return;
        }
        byteBuffer.flip();
        long j = this.e;
        this.a.getClass();
        long jWrite = 0;
        while (byteBuffer.hasRemaining()) {
            jWrite += r8.write(byteBuffer);
        }
        this.e = j + jWrite;
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode >= 400) {
            this.b.q(new jvb(juz.f(httpStatusCode, urlResponseInfo.getAllHeaders(), urlResponseInfo.getHttpStatusText())));
            urlRequest.cancel();
        } else {
            jta jtaVar = new jta(urlRequest, urlResponseInfo, this.c, this);
            this.d = jtaVar;
            this.b.p(jtaVar);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        a();
        this.c.p(Long.valueOf(this.e));
    }
}
