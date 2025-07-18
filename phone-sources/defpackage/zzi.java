package defpackage;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zzi implements UrlRequest$Callback {
    public final UrlRequest.Callback a;
    public zzk b;

    public zzi(UrlRequest.Callback callback) {
        this.a = callback;
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        zzl zzlVarB = zzl.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, zzlVarB);
        } finally {
            this.b.a(2, zzlVarB, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        zzl zzlVarB = zzl.b(urlResponseInfo);
        CronetException cronetExceptionAK = vxr.aK(httpException);
        try {
            this.a.onFailed(this.b, zzlVarB, cronetExceptionAK);
        } finally {
            this.b.a(1, zzlVarB, cronetExceptionAK);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        vxr.aJ(new zzh(this, urlResponseInfo, byteBuffer, 1), Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        vxr.aJ(new zzh(this, urlResponseInfo, str, 0), Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
        vxr.aJ(new zzg(this, urlResponseInfo, 0), Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        zzl zzlVarB = zzl.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, zzlVarB);
        } finally {
            this.b.a(0, zzlVarB, null);
        }
    }
}
