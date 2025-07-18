package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zty {
    public static final Object a(Duration duration, agsw agswVar) {
        Object objC = ahce.c(agzn.a(agzp.b(duration.getSeconds(), agzq.d), agzp.a(duration.getNano(), agzq.a)), agswVar);
        return objC == agtg.a ? objC : agpu.a;
    }

    public static final Object b(Duration duration, agvb agvbVar, agsw agswVar) {
        return ahep.a(ahce.a(agzn.a(agzp.b(duration.getSeconds(), agzq.d), agzp.a(duration.getNano(), agzq.a))), agvbVar, agswVar);
    }
}
