package defpackage;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zyu implements BidirectionalStream$Callback {
    public zyv a;
    private final BidirectionalStream.Callback b;

    public zyu(BidirectionalStream.Callback callback) {
        this.b = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        zzl zzlVarA = zzl.a(urlResponseInfo);
        try {
            this.b.onCanceled(this.a, zzlVarA);
        } finally {
            this.a.a(2, zzlVarA, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        zzl zzlVarA = zzl.a(urlResponseInfo);
        CronetException cronetExceptionAK = vxr.aK(httpException);
        try {
            this.b.onFailed(this.a, zzlVarA, cronetExceptionAK);
        } finally {
            this.a.a(1, zzlVarA, cronetExceptionAK);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onReadCompleted(this.a, zzl.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.b.onResponseHeadersReceived(this.a, zzl.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.b.onResponseTrailersReceived(this.a, zzl.a(urlResponseInfo), new zyx(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.b.onStreamReady(this.a);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        zzl zzlVarA = zzl.a(urlResponseInfo);
        try {
            this.b.onSucceeded(this.a, zzlVarA);
        } finally {
            this.a.a(0, zzlVarA, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onWriteCompleted(this.a, zzl.a(urlResponseInfo), byteBuffer, z);
    }
}
