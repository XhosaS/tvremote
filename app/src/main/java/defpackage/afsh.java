package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsh implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ afsv b;

    public afsh(afsv afsvVar, List list) {
        this.a = list;
        this.b = afsvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afvc afvcVar;
        afsv afsvVar = this.b;
        afsp afspVar = afsvVar.h;
        SocketAddress socketAddressB = afspVar.b();
        List list = this.a;
        afspVar.a = list;
        afspVar.c();
        afsvVar.i = list;
        affe affeVar = afsvVar.r.a;
        affe affeVar2 = affe.READY;
        if (affeVar == affeVar2 || afsvVar.r.a == affe.CONNECTING) {
            int i = 0;
            while (true) {
                if (i < afspVar.a.size()) {
                    int iIndexOf = ((affy) afspVar.a.get(i)).b.indexOf(socketAddressB);
                    if (iIndexOf != -1) {
                        afspVar.b = i;
                        afspVar.c = iIndexOf;
                        break;
                    }
                    i++;
                } else if (afsvVar.r.a == affeVar2) {
                    afvcVar = afsvVar.q;
                    afsvVar.q = null;
                    afspVar.c();
                    afsvVar.d(affe.IDLE);
                } else {
                    afsvVar.p.f(Status.l.withDescription("InternalSubchannel closed pending transport due to address change"));
                    afsvVar.p = null;
                    afspVar.c();
                    afsvVar.i();
                }
            }
            afvcVar = null;
        } else {
            afvcVar = null;
        }
        if (afvcVar != null) {
            if (afsvVar.l != null) {
                afsvVar.m.f(Status.l.withDescription("InternalSubchannel closed transport early due to address change"));
                afsvVar.l.a();
                afsvVar.l = null;
            }
            afsvVar.m = afvcVar;
            afsvVar.l = afsvVar.g.a(new afsg(this), 5L, TimeUnit.SECONDS, afsvVar.b);
        }
    }
}
