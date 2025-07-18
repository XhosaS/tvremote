package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
class ovv implements ouj {
    final /* synthetic */ owe a;

    public ovv(owe oweVar) {
        this.a = oweVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ouj
    public final /* bridge */ /* synthetic */ void a(oui ouiVar, String str) {
        ((zdv) ((zdv) owe.a.d()).q("com/google/android/libraries/home/grpc/GrpcServerImpl$1", "deliverError", 119, "GrpcServerImpl.java")).F("Encountered error before executing request %s: %s", ouiVar.i().b, str);
        ouiVar.k(new cxr(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ouj
    public final /* synthetic */ void b(oui ouiVar) {
        afhq afhqVar;
        afhq afhqVarA;
        String strC = ouiVar.c();
        if (strC != null) {
            strC.hashCode();
        }
        String str = ouiVar.i().b;
        owe oweVar = this.a;
        afem afemVarB = afem.a;
        if (ouiVar.c() != null) {
            afemVarB = afemVarB.b(owe.c(ouiVar.c()));
        }
        aern.c();
        String str2 = ouiVar.i().b;
        synchronized (oweVar.c) {
            if (oweVar.f == null) {
                oweVar.d();
                aerh aerhVar = aerh.a;
                int iA = (int) aerhVar.eV().a();
                String strC2 = aerhVar.eV().c();
                strC2.getClass();
                if (oweVar.i.get()) {
                    try {
                        CronetEngine cronetEngine = (CronetEngine) oweVar.h.a();
                        aerb aerbVar = aerb.a;
                        if (aerbVar.eV().a() && aerbVar.eV().b()) {
                            cronetEngine.getClass();
                            if (qpo.b == null) {
                                synchronized (qpo.a) {
                                    if (qpo.b == null) {
                                        qpo.b = new qpo();
                                    }
                                }
                            }
                            qpo qpoVar = qpo.b;
                            qpk.a().a.i();
                            ((zdv) ((zdv) qps.a.b()).q("com/google/android/libraries/performance/primes/PrimesCronetExtension", "registerEngine", 75, "PrimesCronetExtension.java")).u("Network metric disabled. Skip initializing network monitor.");
                        }
                        afmh afmhVarC = afmh.c(strC2, iA, cronetEngine);
                        List list = oweVar.l;
                        afuv afuvVar = afmhVarC.c;
                        afuvVar.e(list);
                        afhqVarA = afuvVar.a();
                    } catch (Throwable th) {
                        Collection.EL.stream(oweVar.e).forEach(new Consumer() { // from class: ovu
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                ((ovn) obj).b();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        ((zdv) ((zdv) owe.a.a(pai.a).p(th)).q("com/google/android/libraries/home/grpc/GrpcServerImpl", "createFoyerChannel", 444, "GrpcServerImpl.java")).u("Could not instantiate cronet channel");
                    }
                    oweVar.f = afhqVarA;
                } else {
                    afhs afhsVarB = afhu.c().b(strC2, iA);
                    List list2 = oweVar.l;
                    afuv afuvVar2 = ((agbo) afhsVarB).c;
                    afuvVar2.e(list2);
                    afhqVarA = afuvVar2.a();
                    oweVar.f = afhqVarA;
                }
            }
            afhqVar = oweVar.f;
        }
        ouiVar.l(afhqVar, afemVarB);
    }
}
