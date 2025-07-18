package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.tv.remote.service.RemoteService;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bid implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bid(bie bieVar, int i) {
        this.b = i;
        this.a = bieVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [bob, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        bkc bkcVarA;
        int iA = 0;
        switch (this.b) {
            case 0:
                bie bieVar = (bie) this.a;
                bieVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = bieVar.c;
                tv tvVar = bottomSheetBehavior.x;
                if (tvVar != null && tvVar.l()) {
                    bieVar.a(bieVar.a);
                    return;
                } else {
                    if (bottomSheetBehavior.w == 2) {
                        bottomSheetBehavior.aa(bieVar.a);
                        return;
                    }
                    return;
                }
            case 1:
                ((bgt) this.a).e();
                return;
            case 2:
                MaterialButton materialButton = (MaterialButton) this.a;
                if (materialButton.c && materialButton.e && (bkcVarA = materialButton.b.a()) != null) {
                    iA = (int) (bkcVarA.a() * 0.11f);
                }
                materialButton.d = iA;
                materialButton.g();
                materialButton.invalidate();
                return;
            case 3:
                Object obj = this.a;
                blq blqVar = (blq) obj;
                blqVar.c("Calling listener for user input...");
                try {
                    try {
                        throw new UnsupportedOperationException("Server only.");
                    } catch (bll e) {
                        ((blq) obj).c("Sending exception: " + e.toString());
                        ((blq) obj).e.offer(new blp(e));
                        blqVar.c("Listener finished.");
                        return;
                    }
                } catch (Throwable th) {
                    blqVar.c("Listener finished.");
                    throw th;
                }
            case 4:
                Context context = (Context) this.a;
                nf.d(context, new Intent(context, (Class<?>) RemoteService.class));
                return;
            case 5:
                Thread.currentThread().setName("Send#".concat(this.a.toString()));
                return;
            case 6:
                ((bny) this.a).l();
                return;
            case 7:
                ((bny) this.a).m();
                return;
            case 8:
                Object obj2 = this.a;
                bnx bnxVar = (bnx) obj2;
                bny bnyVar = bnxVar.d;
                if (bnyVar.j.get() == obj2) {
                    bnyVar.j.clear();
                }
                bnxVar.b = Integer.MAX_VALUE;
                return;
            case 9:
                bnx bnxVar2 = (bnx) this.a;
                bny bnyVar2 = bnxVar2.d;
                if (bnyVar2.c == 0) {
                    bnxVar2.b = 0;
                    return;
                }
                bnxVar2.c = false;
                clo cloVarO = bvo.a.o();
                bvi bviVar = bnyVar2.d;
                if (bviVar != null) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bvo bvoVar = (bvo) cloVarO.b;
                    bvoVar.c = bviVar;
                    bvoVar.b |= 1;
                }
                bvj bvjVar = bnyVar2.e;
                if (bvjVar != null) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bvo bvoVar2 = (bvo) cloVarO.b;
                    bvoVar2.d = bvjVar;
                    bvoVar2.b |= 2;
                }
                bug bugVar = bnxVar2.a;
                bvw bvwVar = bvw.a;
                clo cloVarO2 = bvwVar.o();
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                bvw bvwVar2 = (bvw) cloVarO2.b;
                bvo bvoVar3 = (bvo) cloVarO.i();
                bvoVar3.getClass();
                bvwVar2.c = bvoVar3;
                bvwVar2.b = 20;
                bugVar.d((bvw) cloVarO2.i());
                if (bnyVar2.g) {
                    clo cloVarO3 = bvwVar.o();
                    clo cloVarO4 = bvn.a.o();
                    if (!cloVarO4.b.A()) {
                        cloVarO4.l();
                    }
                    clt cltVar = cloVarO4.b;
                    bvn bvnVar = (bvn) cltVar;
                    bvnVar.b |= 1;
                    bvnVar.c = true;
                    int i = bnyVar2.h;
                    if (!cltVar.A()) {
                        cloVarO4.l();
                    }
                    bvn bvnVar2 = (bvn) cloVarO4.b;
                    bvnVar2.b = 2 | bvnVar2.b;
                    bvnVar2.d = i;
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    bvw bvwVar3 = (bvw) cloVarO3.b;
                    bvn bvnVar3 = (bvn) cloVarO4.i();
                    bvnVar3.getClass();
                    bvwVar3.c = bvnVar3;
                    bvwVar3.b = 21;
                    bugVar.d((bvw) cloVarO3.i());
                }
                bnxVar2.b = bnyVar2.c;
                return;
            case 10:
                ((bny) this.a).f();
                return;
            case 11:
                ?? r0 = ((ali) this.a).a;
                ((boq) r0).d.n(r0, true);
                return;
            case 12:
                Object obj3 = this.a;
                RemoteService remoteService = ((bow) obj3).b.c;
                byj byjVar = new byj(obj3, null);
                if (remoteService.b != null) {
                    remoteService.j(byjVar);
                    return;
                } else {
                    remoteService.d.add(new ame(remoteService, byjVar, 15, null));
                    return;
                }
            case 13:
                RemoteService remoteService2 = (RemoteService) this.a;
                remoteService2.unbindService(remoteService2.t);
                remoteService2.b = null;
                return;
            case 14:
                Object obj4 = this.a;
                brj brjVar = (brj) obj4;
                if (brjVar.c) {
                    Context context2 = brjVar.b;
                    context2.unregisterReceiver(brjVar.h);
                    context2.unregisterReceiver(brjVar.g);
                    context2.unregisterReceiver(brjVar.i);
                    synchronized (obj4) {
                        Iterator it = ((brj) obj4).d.values().iterator();
                        while (it.hasNext()) {
                            ((bro) it.next()).b();
                        }
                        ((brj) obj4).d.clear();
                    }
                    return;
                }
                return;
            case 15:
                ((bpo) this.a).b();
                return;
            case 16:
                Thread.currentThread().setName("Send#".concat(this.a.toString()));
                return;
            case 17:
                ((cbs) ((cbs) bpt.a.c().g(btt.a)).j("com/google/android/tv/remote/service/TcpServer", "stopAccepting", 76, "TcpServer.java")).p("Stopping TCP server");
                bpt bptVar = (bpt) this.a;
                bptVar.b.cancel(false);
                bpr bprVar = bptVar.c;
                if (bprVar != null) {
                    bprVar.a.unbindService(bprVar.c);
                    try {
                        bprVar.b.close();
                    } catch (IOException unused) {
                    }
                }
                ((cbs) ((cbs) bpt.a.c().g(btt.a)).j("com/google/android/tv/remote/service/TcpServer", "stopAccepting", 81, "TcpServer.java")).p("TCP Server stopped");
                return;
            case 18:
                Thread.currentThread().setName("Send#".concat(this.a.toString()));
                return;
            case 19:
                ((cbs) ((cbs) bpy.a.c().g(btt.a)).j("com/google/android/tv/remote/service/TcpWakePortServer", "stopAccepting", 82, "TcpWakePortServer.java")).p("Stopping TCP Wake Port server");
                bpy bpyVar = (bpy) this.a;
                bpyVar.c.cancel(false);
                bpv bpvVar = bpyVar.d;
                if (bpvVar != null) {
                    bpvVar.c.b.unbindService(bpvVar.b);
                    try {
                        bpvVar.a.close();
                    } catch (IOException unused2) {
                    }
                }
                ((cbs) ((cbs) bpy.a.c().g(btt.a)).j("com/google/android/tv/remote/service/TcpWakePortServer", "stopAccepting", 87, "TcpWakePortServer.java")).p("TCP Wake Port Server stopped");
                return;
            default:
                Object obj5 = this.a;
                synchronized (obj5) {
                    ((boc) obj5).a = null;
                }
                ((boc) obj5).b.f.a(1013, 1L);
                return;
        }
    }

    public /* synthetic */ bid(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
