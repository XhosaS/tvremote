package defpackage;

import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rph implements rou {
    private static final long d = TimeUnit.MINUTES.toNanos(20);
    public final rrc b;
    private final rqb f;
    private final mcw g;
    private final Deque e = new ArrayDeque();
    public final Object a = new Object();
    public yqt c = ypv.a;

    public rph(rrl rrlVar, yqt yqtVar, mcw mcwVar, yqt yqtVar2, rpk rpkVar) {
        rqb rqbVar = (rqb) yqtVar2.e(rqb.b().a());
        this.f = rqbVar;
        int iA = rqbVar.a();
        Integer.valueOf(iA).getClass();
        ((Integer) ((roy) rpkVar).d.a(yqtVar).e(0)).intValue();
        this.g = mcwVar;
        ((mcw) rrlVar.a.a()).getClass();
        yqt yqtVar3 = (yqt) rrlVar.b.a();
        yqtVar3.getClass();
        rrk rrkVar = new rrk(yqtVar3, iA);
        this.b = rrkVar;
        synchronized (rrkVar.a) {
            rrkVar.b = yqt.i(this);
        }
    }

    private static rqo c(rrh rrhVar) {
        yyk yykVarA = rrhVar.a();
        return rrhVar.b() + (-1) != 3 ? ((rqm) ((rqv) zag.e(yykVarA)).c().a).c : ((rqm) ((rqv) yykVarA.get(0)).c().a).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rru a(defpackage.rrh r24) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rph.a(rrh):rru");
    }

    public final void b(rru rruVar) {
        Deque deque = this.e;
        synchronized (deque) {
            long jA = this.g.a();
            deque.addLast(new rov(new rqz(((rrx) rruVar).a, yqt.i(Long.valueOf(Instant.now().toEpochMilli())), false), jA));
            if (deque.size() > 10) {
                while (true) {
                    if (deque.size() <= 30 && (deque.size() <= 10 || jA <= ((rpf) deque.getFirst()).a() + d)) {
                        break;
                    }
                    deque.removeFirst();
                }
            }
        }
    }
}
