package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahnw {
    public static final Object a(lvf lvfVar, agsw agswVar) {
        if (!lvfVar.h()) {
            ahar aharVar = new ahar(agth.c(agswVar), 1);
            aharVar.z();
            lvfVar.l(ahnu.a, new ahnv(aharVar));
            return aharVar.m();
        }
        Exception excD = lvfVar.d();
        if (excD != null) {
            throw excD;
        }
        if (lvfVar.g()) {
            throw new CancellationException(a.c(lvfVar, "Task ", " was cancelled normally."));
        }
        return lvfVar.e();
    }
}
