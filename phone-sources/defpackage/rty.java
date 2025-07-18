package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rty extends rrx implements rqf, roq {
    private final rou a;
    private final yfo b;
    private final yfo c;
    private final yfo d;
    private final AtomicBoolean e;
    private final yfo f;
    private final yfo g;

    public rty(rou rouVar, yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, xbw xbwVar) {
        super(null);
        this.e = new AtomicBoolean();
        this.g = yfoVar4;
        this.a = rouVar;
        this.b = yfoVar;
        this.c = yfoVar2;
        this.d = yfoVar3;
        this.f = new lii(xbwVar, 10);
    }

    private static long a(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static yzx b(rtt rttVar) {
        vtw vtwVarM = yzx.a.m();
        if (rttVar.a != null) {
            String str = rttVar.a;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzx yzxVar = (yzx) vtwVarM.b;
            str.getClass();
            yzxVar.b |= 1;
            yzxVar.c = str;
        }
        if (rttVar.b != null) {
            long j = rttVar.b.a;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzx yzxVar2 = (yzx) vtwVarM.b;
            yzxVar2.b |= 2;
            yzxVar2.d = j;
        }
        if (rttVar.c != null) {
            long j2 = rttVar.c.a;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzx yzxVar3 = (yzx) vtwVarM.b;
            yzxVar3.b |= 4;
            yzxVar3.e = j2;
        }
        if (rttVar.d != null) {
            long j3 = rttVar.d.a;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzx yzxVar4 = (yzx) vtwVarM.b;
            yzxVar4.b |= 8;
            yzxVar4.f = j3;
        }
        return (yzx) vtwVarM.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b6  */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.roq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.rmp r24) {
        /*
            Method dump skipped, instructions count: 1975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rty.g(rmp):void");
    }

    @Override // defpackage.rqf
    public final void k() {
        this.a.a(this);
    }

    @Override // defpackage.roq
    public final /* synthetic */ void j(rmp rmpVar) {
    }
}
