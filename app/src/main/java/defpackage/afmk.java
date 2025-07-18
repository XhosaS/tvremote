package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afmk implements afmt {
    final /* synthetic */ afmm a;

    public afmk(afmm afmmVar) {
        this.a = afmmVar;
    }

    @Override // defpackage.afmt
    public final void a(Status status) {
        int i = afml.i;
        afmm afmmVar = this.a;
        afml afmlVar = afmmVar.o;
        synchronized (afmlVar.a) {
            if (afmlVar.d) {
                return;
            }
            afmlVar.d = true;
            afmlVar.e = status;
            Collection collection = afmlVar.b;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((afmj) it.next()).a.clear();
            }
            collection.clear();
            BidirectionalStream bidirectionalStream = afmmVar.k;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                afmmVar.i.e(afmmVar, status);
            }
        }
    }

    @Override // defpackage.afmt
    public final void b(agaf agafVar, boolean z, boolean z2, int i) {
        ByteBuffer byteBuffer;
        int i2 = afml.i;
        afmm afmmVar = this.a;
        afml afmlVar = afmmVar.o;
        synchronized (afmlVar.a) {
            if (afmlVar.d) {
                return;
            }
            if (agafVar != null) {
                byteBuffer = ((afmq) agafVar).a;
                byteBuffer.flip();
            } else {
                byteBuffer = afmm.a;
            }
            afmmVar.j().l(byteBuffer.remaining());
            if (afmlVar.c) {
                afmmVar.k(byteBuffer, z, z2);
            } else {
                afmlVar.b.add(new afmj(byteBuffer, z, z2));
            }
        }
    }

    @Override // defpackage.afmt
    public final void c(afih afihVar) {
        afmm afmmVar = this.a;
        afmmVar.j.run();
        afmf afmfVar = afmmVar.p;
        if (afmfVar == null) {
            return;
        }
        afmi afmiVar = new afmi(afmmVar);
        String str = afmmVar.d;
        Executor executor = afmmVar.g;
        afmg afmgVar = (afmg) afmfVar;
        boolean z = afmgVar.b;
        BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = afmgVar.a.newBidirectionalStreamBuilder(str, afmiVar, executor);
        if (z) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(afmgVar.c);
        }
        if (afmgVar.d) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(afmgVar.e);
        }
        if (afmmVar.l) {
            builderNewBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
        }
        Object obj = afmmVar.m;
        if (obj != null || afmmVar.n != null) {
            if (obj != null) {
                builderNewBidirectionalStreamBuilder.addRequestAnnotation(obj);
            }
            Collection collection = afmmVar.n;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    builderNewBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                }
            }
        }
        String str2 = afrq.i.a;
        builderNewBidirectionalStreamBuilder.addHeader(str2, afmmVar.e);
        String str3 = afrq.g.a;
        builderNewBidirectionalStreamBuilder.addHeader(str3, "application/grpc");
        builderNewBidirectionalStreamBuilder.addHeader("te", "trailers");
        byte[][] bArrA = agab.a(afmmVar.h);
        for (int i = 0; i < bArrA.length; i += 2) {
            String str4 = new String(bArrA[i], StandardCharsets.UTF_8);
            if (!str3.equalsIgnoreCase(str4) && !str2.equalsIgnoreCase(str4) && !afrq.h.a.equalsIgnoreCase(str4)) {
                builderNewBidirectionalStreamBuilder.addHeader(str4, new String(bArrA[i + 1], StandardCharsets.UTF_8));
            }
        }
        afmmVar.k = builderNewBidirectionalStreamBuilder.build();
        afmmVar.k.start();
    }
}
