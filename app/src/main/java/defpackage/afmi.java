package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afmi extends BidirectionalStream.Callback {
    final /* synthetic */ afmm a;
    private List b;

    public afmi(afmm afmmVar) {
        this.a = afmmVar;
    }

    private final void a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(StandardCharsets.UTF_8);
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(StandardCharsets.UTF_8);
        }
        byte[][] bArrB = agab.b(bArr);
        Charset charset = afgt.a;
        afih afihVar = new afih(bArrB);
        afmm afmmVar = this.a;
        int i3 = afml.i;
        afml afmlVar = afmmVar.o;
        synchronized (afmlVar.a) {
            if (z) {
                afmlVar.r(afihVar);
            } else {
                afmlVar.q(afihVar);
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        Status statusA;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onCanceled");
        }
        afmm afmmVar = this.a;
        int i = afml.i;
        afml afmlVar = afmmVar.o;
        synchronized (afmlVar.a) {
            statusA = afmlVar.e;
            if (statusA == null) {
                statusA = urlResponseInfo != null ? afrq.a(urlResponseInfo.getHttpStatusCode()) : Status.b.withDescription("stream cancelled without reason");
            }
        }
        afmm afmmVar2 = this.a;
        afmmVar2.i.e(afmmVar2, statusA);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onFailed");
        }
        afmm afmmVar = this.a;
        afmmVar.i.e(afmmVar, Status.l.c(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onReadCompleted. Size=" + byteBuffer.remaining());
        }
        afmm afmmVar = this.a;
        int i = afml.i;
        afml afmlVar = afmmVar.o;
        synchronized (afmlVar.a) {
            afmlVar.f = z;
            if (byteBuffer.remaining() != 0) {
                afmlVar.f(byteBuffer);
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseHeadersReceived. Header=".concat(String.valueOf(String.valueOf(urlResponseInfo.getAllHeadersAsList()))));
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.b = asList;
        int i = afml.i;
        afml afmlVar = this.a.o;
        synchronized (afmlVar.a) {
            z = afmlVar.f;
        }
        if (z) {
            a(asList, true);
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseTrailersReceived. Trailer=".concat(String.valueOf(asList.toString())));
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onStreamReady");
        }
        afmm afmmVar = this.a;
        int i = afml.i;
        afml afmlVar = afmmVar.o;
        synchronized (afmlVar.a) {
            afmlVar.d();
            afmlVar.c = true;
            Collection<afmj> collection = afmlVar.b;
            for (afmj afmjVar : collection) {
                afmlVar.h.k(afmjVar.a, afmjVar.b, afmjVar.c);
            }
            collection.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onSucceeded");
        }
        afmm afmmVar = this.a;
        int i = afml.i;
        afml afmlVar = afmmVar.o;
        synchronized (afmlVar.a) {
            z = false;
            if (this.b != null && afmlVar.f) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else {
                if (urlResponseInfo == null) {
                    throw new AssertionError("No response header or trailer");
                }
                a(urlResponseInfo.getAllHeadersAsList(), true);
            }
        }
        afmm afmmVar2 = this.a;
        afmmVar2.i.e(afmmVar2, afrq.a(urlResponseInfo.getHttpStatusCode()));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onWriteCompleted");
        }
        afmm afmmVar = this.a;
        int i = afml.i;
        afml afmlVar = afmmVar.o;
        synchronized (afmlVar.a) {
            if (!afmlVar.g) {
                afmlVar.g = true;
                afmmVar.f.a();
            }
            afmlVar.m(byteBuffer.position());
        }
    }
}
