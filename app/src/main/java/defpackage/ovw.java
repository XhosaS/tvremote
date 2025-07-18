package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
class ovw implements ouj {
    final /* synthetic */ owe a;

    public ovw(owe oweVar) {
        this.a = oweVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ouj
    public final /* bridge */ /* synthetic */ void a(oui ouiVar, String str) {
        ((zdv) ((zdv) owe.a.d()).q("com/google/android/libraries/home/grpc/GrpcServerImpl$2", "deliverError", 139, "GrpcServerImpl.java")).F("Encountered error before executing request %s: %s", ouiVar.i().b, str);
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
        owe oweVar = this.a;
        afem afemVarB = afem.a;
        if (ouiVar.c() != null) {
            afemVarB = afemVarB.b(owe.c(ouiVar.c()));
        }
        aern.c();
        synchronized (oweVar.d) {
            if (oweVar.g == null) {
                oweVar.d();
                if (oweVar.i.get()) {
                    try {
                        aere.c();
                        aerk.b();
                        afhqVarA = afmh.c(aere.c(), (int) aerk.b(), (CronetEngine) oweVar.h.a()).c.a();
                    } catch (Throwable th) {
                        Collection.EL.stream(oweVar.e).forEach(new Consumer() { // from class: ovq
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                ((ovn) obj).a();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        ((zdv) ((zdv) owe.a.a(pai.a).p(th)).q("com/google/android/libraries/home/grpc/GrpcServerImpl", "createPeopleApiChannel", 473, "GrpcServerImpl.java")).u("Could not instantiate cronet channel");
                    }
                    oweVar.g = afhqVarA;
                    afhqVar = oweVar.g;
                } else {
                    afhqVarA = ((agbo) afhu.c().b(aere.c(), (int) aerk.b())).c.a();
                    oweVar.g = afhqVarA;
                    afhqVar = oweVar.g;
                }
            } else {
                afhqVar = oweVar.g;
            }
        }
        ouiVar.l(afhqVar, afemVarB);
    }
}
