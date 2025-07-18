package defpackage;

import android.support.v7.widget.RecyclerView;
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
/* loaded from: classes3.dex */
final class xtz extends BidirectionalStream.Callback {
    final /* synthetic */ xud a;
    private List b;

    public xtz(xud xudVar) {
        this.a = xudVar;
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
        byte[][] bArrB = ybw.b(bArr);
        Charset charset = xrg.a;
        xsm xsmVar = new xsm(bArrB);
        xud xudVar = this.a;
        int i3 = xuc.i;
        xuc xucVar = xudVar.o;
        synchronized (xucVar.a) {
            if (z) {
                xucVar.p(xsmVar);
            } else {
                xucVar.o(xsmVar);
            }
        }
    }

    private static final xtk b(UrlResponseInfo urlResponseInfo) {
        return xxc.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        xtk xtkVarB;
        int i = xuc.i;
        xuc xucVar = this.a.o;
        synchronized (xucVar.a) {
            xtkVarB = xucVar.e;
            if (xtkVarB == null) {
                xtkVarB = urlResponseInfo != null ? b(urlResponseInfo) : xtk.c.e("stream cancelled without reason");
            }
        }
        this.a.d(xtkVarB);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.d(xtk.k.d(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        int i = xuc.i;
        xuc xucVar = this.a.o;
        synchronized (xucVar.a) {
            xucVar.f = z;
            if (byteBuffer.remaining() != 0) {
                xuc.f(xucVar, byteBuffer);
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List<Map.Entry<String, String>> asList = headerBlock.getAsList();
        this.b = asList;
        int i = xuc.i;
        xuc xucVar = this.a.o;
        synchronized (xucVar.a) {
            z = xucVar.f;
        }
        if (z) {
            a(asList, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        int i = xuc.i;
        xuc xucVar = this.a.o;
        synchronized (xucVar.a) {
            xucVar.d();
            xucVar.c = true;
            Collection<xua> collection = xucVar.b;
            for (xua xuaVar : collection) {
                xucVar.h.e((ByteBuffer) xuaVar.c, xuaVar.a, xuaVar.b);
            }
            collection.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        int i = xuc.i;
        xuc xucVar = this.a.o;
        synchronized (xucVar.a) {
            z = false;
            if (this.b != null && xucVar.f) {
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
        this.a.d(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        int i = xuc.i;
        xud xudVar = this.a;
        xuc xucVar = xudVar.o;
        synchronized (xucVar.a) {
            if (!xucVar.g) {
                xucVar.g = true;
                xudVar.f.a();
            }
            xucVar.g(byteBuffer.position());
        }
    }
}
