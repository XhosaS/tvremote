package defpackage;

import j$.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwd {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/statesync/service/StateSyncer");
    public final ahbt b;
    public final Duration c;
    public final List d;
    public final List e;
    public volatile boolean g;
    public ahdl h;
    private final agte k;
    public final ReentrantLock f = new ReentrantLock();
    public final Map i = new LinkedHashMap();
    public final Map j = new LinkedHashMap();

    public iwd(agte agteVar, ahbt ahbtVar, Duration duration, List list, List list2) {
        this.k = agteVar;
        this.b = ahbtVar;
        this.c = duration;
        this.d = list;
        this.e = list2;
    }

    static /* synthetic */ Object b(iwd iwdVar, List list, agsw agswVar, int i) throws Throwable {
        if ((i & 1) != 0) {
            list = iwdVar.d;
        }
        Object objA = ahal.a(iwdVar.k, new ivx(list, (i & 2) != 0, iwdVar, null), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    public final void a(ite iteVar) {
        ahal.e(this.b, null, 0, new ivw(iteVar, this, null), 3);
    }
}
