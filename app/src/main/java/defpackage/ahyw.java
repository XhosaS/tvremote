package defpackage;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ahyw implements BidirectionalStream$Callback {
    public ahyx a;
    private final BidirectionalStream.Callback b;

    public ahyw(BidirectionalStream.Callback callback) {
        this.b = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        ahzq ahzqVarA = ahzq.a(urlResponseInfo);
        try {
            this.b.onCanceled(this.a, ahzqVarA);
        } finally {
            this.a.a(2, ahzqVarA, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        ahzq ahzqVarA = ahzq.a(urlResponseInfo);
        CronetException cronetExceptionB = aiaa.b(httpException);
        try {
            this.b.onFailed(this.a, ahzqVarA, cronetExceptionB);
        } finally {
            this.a.a(1, ahzqVarA, cronetExceptionB);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onReadCompleted(this.a, ahzq.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.b.onResponseHeadersReceived(this.a, ahzq.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.b.onResponseTrailersReceived(this.a, ahzq.a(urlResponseInfo), new ahyz(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.b.onStreamReady(this.a);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        ahzq ahzqVarA = ahzq.a(urlResponseInfo);
        try {
            this.b.onSucceeded(this.a, ahzqVarA);
        } finally {
            this.a.a(0, ahzqVarA, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onWriteCompleted(this.a, ahzq.a(urlResponseInfo), byteBuffer, z);
    }
}
