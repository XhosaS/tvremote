package defpackage;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ahzn implements UrlRequest$Callback {
    public final UrlRequest.Callback a;
    public ahzp b;

    public ahzn(UrlRequest.Callback callback) {
        this.a = callback;
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ahzq ahzqVarB = ahzq.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, ahzqVarB);
        } finally {
            this.b.a(2, ahzqVarB, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        ahzq ahzqVarB = ahzq.b(urlResponseInfo);
        CronetException cronetExceptionB = aiaa.b(httpException);
        try {
            this.a.onFailed(this.b, ahzqVarB, cronetExceptionB);
        } finally {
            this.b.a(1, ahzqVarB, cronetExceptionB);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) throws Exception {
        aiaa.a(new ahzz() { // from class: ahzl
            @Override // defpackage.ahzz
            public final Object a() {
                ahzn ahznVar = this.a;
                ahznVar.a.onReadCompleted(ahznVar.b, ahzq.b(urlResponseInfo), byteBuffer);
                return null;
            }
        }, Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String str) throws Exception {
        aiaa.a(new ahzz() { // from class: ahzm
            @Override // defpackage.ahzz
            public final Object a() {
                ahzn ahznVar = this.a;
                ahznVar.a.onRedirectReceived(ahznVar.b, ahzq.b(urlResponseInfo), str);
                return null;
            }
        }, Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) throws Exception {
        aiaa.a(new ahzz() { // from class: ahzk
            @Override // defpackage.ahzz
            public final Object a() {
                ahzn ahznVar = this.a;
                ahznVar.a.onResponseStarted(ahznVar.b, ahzq.b(urlResponseInfo));
                return null;
            }
        }, Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ahzq ahzqVarB = ahzq.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, ahzqVarB);
        } finally {
            this.b.a(0, ahzqVarB, null);
        }
    }
}
