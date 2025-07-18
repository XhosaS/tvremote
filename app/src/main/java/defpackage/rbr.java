package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbr extends rbn implements quz, rbi {
    static final yzq a = yzq.u("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    public static final /* synthetic */ int g = 0;
    public final qux b;
    final ConcurrentHashMap c = new ConcurrentHashMap();
    public final aehf d;
    public final aehf e;
    public final yrp f;
    private final Executor h;

    public rbr(quy quyVar, Executor executor, final aehf aehfVar, aehf aehfVar2, agow agowVar, final rcu rcuVar) {
        this.b = quyVar.a(zwk.a, aehfVar, agowVar);
        this.h = executor;
        this.d = aehfVar;
        this.e = aehfVar2;
        this.f = yru.a(new yrp() { // from class: rbq
            @Override // defpackage.yrp
            public final Object eV() {
                int i = rbr.g;
                return rcuVar.a(((rbk) aehfVar.a()).d());
            }
        });
    }

    private final zyd e(final String str, final long j, final rbm rbmVar, final ahqu ahquVar) {
        return zxn.l(new zvh() { // from class: rbp
            @Override // defpackage.zvh
            public final zyd a() {
                long jA;
                rbr rbrVar = this.a;
                if (!((rct) rbrVar.f.eV()).a()) {
                    return zxy.a;
                }
                rbm rbmVar2 = rbmVar;
                long j2 = j;
                ((rbk) rbrVar.d.a()).e();
                qux quxVar = rbrVar.b;
                qup qupVarN = quq.n();
                int i = 1;
                qupVarN.c(true);
                quh quhVar = (quh) qupVarN;
                quhVar.e = Long.valueOf(j2);
                yqt yqtVar = (yqt) rbrVar.e.a();
                ahvw ahvwVar = ahvw.a;
                ahvv ahvvVar = new ahvv();
                boolean zBooleanValue = ((Boolean) yqtVar.b(new yqi() { // from class: rbo
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        ((quk) obj).b();
                        return false;
                    }
                }).e(false)).booleanValue();
                ahvy ahvyVar = ahvy.a;
                ahvx ahvxVar = new ahvx();
                if (zBooleanValue) {
                    qve qveVar = rbmVar2.b;
                    jA = ((quj) qveVar.b).b - ((quj) qveVar.a).b;
                } else {
                    jA = rbmVar2.b.a();
                }
                if ((ahvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahvxVar.y();
                }
                ahvy ahvyVar2 = (ahvy) ahvxVar.b;
                ahvyVar2.b |= 1;
                ahvyVar2.c = jA;
                int iOrdinal = rbmVar2.c.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i = 3;
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new RuntimeException(null, null);
                            }
                            i = 4;
                        }
                    } else {
                        i = 2;
                    }
                }
                if ((ahvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahvxVar.y();
                }
                ahvy ahvyVar3 = (ahvy) ahvxVar.b;
                ahvyVar3.d = i - 1;
                ahvyVar3.b = 2 | ahvyVar3.b;
                ahvy ahvyVar4 = (ahvy) ahvxVar.v();
                if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahvvVar.y();
                }
                ahqu ahquVar2 = ahquVar;
                String str2 = str;
                ahvw ahvwVar2 = (ahvw) ahvvVar.b;
                ahvyVar4.getClass();
                ahvwVar2.g = ahvyVar4;
                ahvwVar2.b |= 16;
                qupVarN.f((ahvw) ahvvVar.v());
                quhVar.a = str2;
                quhVar.c = ahquVar2;
                return quxVar.b(qupVarN.a());
            }
        }, this.h);
    }

    private final synchronized zyd f(String str, String str2, ahqu ahquVar, rbl rblVar) throws Throwable {
        Throwable th;
        rbm rbmVar;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            rbmVar = (rbm) this.c.remove(str);
        } catch (Throwable th3) {
            th = th3;
            th = th;
            throw th;
        }
        try {
            if (rbm.a(rbmVar)) {
                return zxy.a;
            }
            long jA = this.b.a(str);
            if (jA == -1) {
                return zxy.a;
            }
            rbmVar.b.b = qvf.d();
            if (rblVar == null) {
                rblVar = rbl.UNKNOWN;
            }
            rbmVar.c = rblVar;
            return e(true == yqv.c(str2) ? str : str2, jA, rbmVar, ahquVar);
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    @Override // defpackage.rbi
    public final zyd a(qpi qpiVar, long j, long j2, ahqu ahquVar) {
        rbm rbmVar = new rbm(j, j2, rbl.UNKNOWN);
        qux quxVar = this.b;
        String str = qpiVar.a;
        long jA = quxVar.a(str);
        return jA == -1 ? zxy.a : e(str, jA, rbmVar, ahquVar);
    }

    @Override // defpackage.rbn
    public final rbm b(qpi qpiVar) {
        rbm rbmVar = (rbm) this.c.remove(qpiVar.a);
        return rbm.a(rbmVar) ? rbm.a : rbmVar;
    }

    @Override // defpackage.rbn
    public final rbm c(qpi qpiVar) {
        yzq yzqVar = a;
        String str = qpiVar.a;
        if (yzqVar.contains(str)) {
            ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "startGlobal", 133, "TimerMetricServiceImpl.java")).x("%s is reserved event. Dropping timer.", str);
            return rbm.a;
        }
        if (!this.b.d()) {
            return rbm.a;
        }
        rbm rbmVar = new rbm();
        this.c.put(str, rbmVar);
        return rbmVar;
    }

    @Override // defpackage.rbn
    public final zyd d(qpi qpiVar, qpi qpiVar2, ahqu ahquVar, rbl rblVar) {
        return f(qpiVar.a, qpi.b(qpiVar2), ahquVar, rblVar);
    }

    @Override // defpackage.quz
    public final /* synthetic */ void k() {
    }
}
