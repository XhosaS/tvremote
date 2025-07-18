package defpackage;

import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahkr {
    public static final zyd a(final ahcb ahcbVar) {
        final ahkn ahknVar = new ahkn(ahcbVar);
        ahcbVar.w(new agux() { // from class: ahkp
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ahkn ahknVar2 = ahknVar;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    ahknVar2.a.p(ahcbVar.d());
                } else {
                    ahknVar2.a(th);
                }
                return agpu.a;
            }
        });
        return ahknVar;
    }

    public static final Object b(zyd zydVar, agsw agswVar) throws Throwable {
        try {
            if (zydVar.isDone()) {
                return zze.a(zydVar);
            }
            ahar aharVar = new ahar(agth.c(agswVar), 1);
            aharVar.z();
            zydVar.d(new ahks(zydVar, aharVar), zwk.a);
            aharVar.a(new ahkq(zydVar));
            return aharVar.m();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static /* synthetic */ zyd c(ahbt ahbtVar, int i, agvb agvbVar, int i2) {
        agtf agtfVar = (i2 & 1) != 0 ? agtf.a : null;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if (ahbv.c(i)) {
            Objects.toString(ahbv.a(i));
            throw new IllegalArgumentException(ahbv.a(i).concat(" start is not supported"));
        }
        ahko ahkoVar = new ahko(ahbj.b(ahbtVar, agtfVar));
        ahbv.b(i, agvbVar, ahkoVar, ahkoVar);
        return ahkoVar.b;
    }
}
