package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xub implements xui {
    final /* synthetic */ xud a;

    public xub(xud xudVar) {
        this.a = xudVar;
    }

    @Override // defpackage.xui
    public final void a(xtk xtkVar) {
        int i = xuc.i;
        xud xudVar = this.a;
        xuc xucVar = xudVar.o;
        synchronized (xucVar.a) {
            if (xucVar.d) {
                return;
            }
            xucVar.d = true;
            xucVar.e = xtkVar;
            Collection collection = xucVar.b;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ByteBuffer) ((xua) it.next()).c).clear();
            }
            collection.clear();
            BidirectionalStream bidirectionalStream = xudVar.k;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                xudVar.i.d(xudVar, xtkVar);
            }
        }
    }

    @Override // defpackage.xui
    public final void b(yby ybyVar, boolean z, boolean z2, int i) {
        ByteBuffer byteBuffer;
        int i2 = xuc.i;
        xud xudVar = this.a;
        xuc xucVar = xudVar.o;
        synchronized (xucVar.a) {
            if (xucVar.d) {
                return;
            }
            if (ybyVar != null) {
                byteBuffer = ((xug) ybyVar).a;
                byteBuffer.flip();
            } else {
                byteBuffer = xud.a;
            }
            xudVar.s(byteBuffer.remaining());
            if (xucVar.c) {
                xudVar.e(byteBuffer, z, z2);
            } else {
                xucVar.b.add(new xua(byteBuffer, z, z2));
            }
        }
    }

    @Override // defpackage.xui
    public final void c(xsm xsmVar) {
        xud xudVar = this.a;
        xudVar.j.run();
        xtx xtxVar = xudVar.p;
        if (xtxVar == null) {
            return;
        }
        xtz xtzVar = new xtz(xudVar);
        String str = xudVar.d;
        Executor executor = xudVar.g;
        boolean z = xtxVar.b;
        BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = xtxVar.a.newBidirectionalStreamBuilder(str, xtzVar, executor);
        if (z) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(xtxVar.c);
        }
        if (xtxVar.d) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(xtxVar.e);
        }
        if (xudVar.l) {
            builderNewBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
        }
        Object obj = xudVar.m;
        if (obj != null || xudVar.n != null) {
            if (obj != null) {
                builderNewBidirectionalStreamBuilder.addRequestAnnotation(obj);
            }
            Collection collection = xudVar.n;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    builderNewBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                }
            }
        }
        String str2 = xxc.i.a;
        builderNewBidirectionalStreamBuilder.addHeader(str2, xudVar.e);
        String str3 = xxc.g.a;
        builderNewBidirectionalStreamBuilder.addHeader(str3, "application/grpc");
        builderNewBidirectionalStreamBuilder.addHeader("te", "trailers");
        byte[][] bArrA = ybw.a(xudVar.h);
        for (int i = 0; i < bArrA.length; i += 2) {
            String str4 = new String(bArrA[i], StandardCharsets.UTF_8);
            if (!str3.equalsIgnoreCase(str4) && !str2.equalsIgnoreCase(str4) && !xxc.h.a.equalsIgnoreCase(str4)) {
                builderNewBidirectionalStreamBuilder.addHeader(str4, new String(bArrA[i + 1], StandardCharsets.UTF_8));
            }
        }
        xudVar.k = builderNewBidirectionalStreamBuilder.build();
        xudVar.k.start();
    }
}
