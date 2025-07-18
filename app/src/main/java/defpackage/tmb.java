package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmb implements oct {
    private final ohr d;
    private final oin e;
    private final Executor g;
    public boolean b = true;
    public final ConcurrentMap c = new ConcurrentHashMap();
    private final oif f = oie.a();
    private final String h = "";

    public tmb(ohr ohrVar, oin oinVar, Executor executor) {
        this.d = ohrVar;
        this.e = oinVar;
        this.g = executor;
    }

    @Override // defpackage.oct
    public final void a(int i) {
        if (this.b) {
            this.c.putIfAbsent(Integer.valueOf(i), Long.valueOf(((tms) this.d).a.a() / 1000));
            if (i == 3) {
                this.g.execute(wyo.h(new Runnable() { // from class: tma
                    @Override // java.lang.Runnable
                    public final void run() {
                        tmb tmbVar = this.a;
                        ConcurrentMap concurrentMap = tmbVar.c;
                        if (concurrentMap.isEmpty() || !tmbVar.b) {
                            return;
                        }
                        tmbVar.b = false;
                        tmbVar.c(oij.ELEMENTS_LIFECYCLE_CREATE_DRAW.w, 0);
                        tmbVar.c(oij.ELEMENTS_LIFECYCLE_SET_DRAW.w, 1);
                        if (concurrentMap.containsKey(3)) {
                            concurrentMap.clear();
                        }
                    }
                }));
            }
        }
    }

    @Override // defpackage.oct
    public final boolean b() {
        return this.b;
    }

    public final void c(String str, int i) {
        ConcurrentMap concurrentMap = this.c;
        Long l = (Long) ConcurrentMap.EL.getOrDefault(concurrentMap, Integer.valueOf(i), null);
        Long l2 = (Long) ConcurrentMap.EL.getOrDefault(concurrentMap, 3, null);
        if (l == null || l2 == null) {
            return;
        }
        oif oifVar = this.f;
        oih oihVarN = oii.n();
        ((ohn) oihVarN).b = oifVar;
        oihVarN.c(zcp.b);
        ohl ohlVar = new ohl();
        ohlVar.b(str);
        ohlVar.a = l;
        ohlVar.b = l2;
        ohlVar.d = oihVarN.a();
        this.e.d(this.h, ohlVar.a());
    }
}
