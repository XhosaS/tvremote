package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdj implements qcf {
    public static final /* synthetic */ int e = 0;
    private static final TimeZone f = DesugarTimeZone.getTimeZone("UTC");
    public final ujk a;
    public final Executor b;
    public final Random c;
    public final pmq d;

    public qdj(ujk ujkVar, pmq pmqVar, Executor executor, Random random) {
        this.a = ujkVar;
        this.d = pmqVar;
        this.b = executor;
        this.c = random;
    }

    public static long f(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f);
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Override // defpackage.qcf
    public final zyd a() {
        int i = yyk.e;
        final AtomicReference atomicReference = new AtomicReference(zcg.b);
        yqi yqiVar = new yqi() { // from class: qdh
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjd pjdVar = (pjd) obj;
                int i2 = qdj.e;
                atomicReference.set(pjdVar.d);
                pjb pjbVar = new pjb();
                pjbVar.B(pjdVar);
                if ((pjbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjbVar.y();
                }
                ((pjd) pjbVar.b).d = abzb.b;
                return (pjd) pjbVar.v();
            }
        };
        ujk ujkVar = this.a;
        Executor executor = this.b;
        return zuz.g(ujkVar.a(yqiVar, executor), wyo.a(wyo.a(new yqi() { // from class: qcw
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i2 = qdj.e;
                return (List) atomicReference.get();
            }
        })), executor);
    }

    @Override // defpackage.qcf
    public final zyd b() {
        final AtomicReference atomicReference = new AtomicReference(ypv.a);
        yqi yqiVar = new yqi() { // from class: qdf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjd pjdVar = (pjd) obj;
                long epochMilli = Instant.now().toEpochMilli();
                Long lValueOf = Long.valueOf(epochMilli);
                abzy abzyVar = pjdVar.c;
                if (abzyVar == null) {
                    abzyVar = abzy.a;
                }
                long jA = acbj.a(abzyVar);
                Long lValueOf2 = Long.valueOf(jA);
                pjb pjbVar = new pjb();
                pjbVar.B(pjdVar);
                lValueOf.getClass();
                abzy abzyVarC = acbj.c(epochMilli);
                if ((pjbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjbVar.y();
                }
                pjd pjdVar2 = (pjd) pjbVar.b;
                abzyVarC.getClass();
                pjdVar2.c = abzyVarC;
                pjdVar2.b |= 1;
                pjd pjdVar3 = (pjd) pjbVar.v();
                if ((pjdVar.b & 1) != 0) {
                    AtomicReference atomicReference2 = atomicReference;
                    lValueOf.getClass();
                    long jF = qdj.f(epochMilli);
                    lValueOf2.getClass();
                    atomicReference2.set(yqt.i(Integer.valueOf(ztm.d(TimeUnit.MILLISECONDS.toDays(jF - qdj.f(jA))))));
                }
                return pjdVar3;
            }
        };
        ujk ujkVar = this.a;
        zwk zwkVar = zwk.a;
        return zuz.g(ujkVar.a(yqiVar, zwkVar), wyo.a(new yqi() { // from class: qdg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = qdj.e;
                return (yqt) atomicReference.get();
            }
        }), zwkVar);
    }

    @Override // defpackage.qcf
    public final zyd c(final String str) {
        final AtomicReference atomicReference = new AtomicReference(ypv.a);
        yqi yqiVar = new yqi() { // from class: qda
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjd pjdVar = (pjd) obj;
                long epochMilli = Instant.now().toEpochMilli();
                yqt yqtVarI = ypv.a;
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(pjdVar.g);
                String str2 = str;
                if (mapUnmodifiableMap.containsKey(str2)) {
                    yqtVarI = yqt.i(Long.valueOf(acbj.a((abzy) DesugarCollections.unmodifiableMap(pjdVar.g).get(str2))));
                }
                pjb pjbVar = new pjb();
                pjbVar.B(pjdVar);
                abzy abzyVarC = acbj.c(epochMilli);
                abzyVarC.getClass();
                if ((pjbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjbVar.y();
                }
                pjd pjdVar2 = (pjd) pjbVar.b;
                abyl abylVar = pjdVar2.g;
                if (!abylVar.b) {
                    pjdVar2.g = abylVar.a();
                }
                pjdVar2.g.put(str2, abzyVarC);
                if ((pjbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjbVar.y();
                }
                pjd pjdVar3 = (pjd) pjbVar.b;
                pjdVar3.c = null;
                pjdVar3.b &= -2;
                pjd pjdVar4 = (pjd) pjbVar.v();
                if (yqtVarI.g()) {
                    atomicReference.set(yqt.i(Long.valueOf(TimeUnit.MILLISECONDS.toHours(epochMilli - ((Long) yqtVarI.c()).longValue()))));
                }
                return pjdVar4;
            }
        };
        ujk ujkVar = this.a;
        zwk zwkVar = zwk.a;
        return zuz.g(ujkVar.a(yqiVar, zwkVar), wyo.a(new yqi() { // from class: qdb
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = qdj.e;
                return (yqt) atomicReference.get();
            }
        }), zwkVar);
    }

    @Override // defpackage.qcf
    public final zyd d() {
        return zuz.h(this.a.c(), wyo.c(new zvi() { // from class: qcz
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pjd pjdVar = (pjd) obj;
                pjh pjhVar = pjdVar.f;
                if (pjhVar == null) {
                    pjhVar = pjh.a;
                }
                if ((pjhVar.b & 1) != 0) {
                    pjh pjhVar2 = pjdVar.f;
                    if (pjhVar2 == null) {
                        pjhVar2 = pjh.a;
                    }
                    return zxn.h(pjhVar2);
                }
                final qdj qdjVar = this.a;
                yqi yqiVar = new yqi() { // from class: qdc
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        pjd pjdVar2 = (pjd) obj2;
                        pjh pjhVar3 = pjdVar2.f;
                        if (pjhVar3 == null) {
                            pjhVar3 = pjh.a;
                        }
                        if ((pjhVar3.b & 1) != 0) {
                            return pjdVar2;
                        }
                        long jNextLong = qdjVar.c.nextLong();
                        pjb pjbVar = new pjb();
                        pjbVar.B(pjdVar2);
                        pjh pjhVar4 = pjdVar2.f;
                        if (pjhVar4 == null) {
                            pjhVar4 = pjh.a;
                        }
                        pjg pjgVar = new pjg();
                        pjgVar.B(pjhVar4);
                        if ((pjgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            pjgVar.y();
                        }
                        pjh pjhVar5 = (pjh) pjgVar.b;
                        pjhVar5.b |= 1;
                        pjhVar5.c = jNextLong;
                        abzy abzyVarC = acbj.c(Instant.now().toEpochMilli());
                        if ((pjgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            pjgVar.y();
                        }
                        pjh pjhVar6 = (pjh) pjgVar.b;
                        abzyVarC.getClass();
                        pjhVar6.d = abzyVarC;
                        pjhVar6.b |= 2;
                        if ((pjbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            pjbVar.y();
                        }
                        pjd pjdVar3 = (pjd) pjbVar.b;
                        pjh pjhVar7 = (pjh) pjgVar.v();
                        pjhVar7.getClass();
                        pjdVar3.f = pjhVar7;
                        pjdVar3.b |= 4;
                        return (pjd) pjbVar.v();
                    }
                };
                ujk ujkVar = qdjVar.a;
                Executor executor = qdjVar.b;
                return qfr.c(ujkVar.a(yqiVar, executor)).g(new zvi() { // from class: qdd
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return qdjVar.a.c();
                    }
                }, executor).e(new yqi() { // from class: qde
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        pjh pjhVar3 = ((pjd) obj2).f;
                        return pjhVar3 == null ? pjh.a : pjhVar3;
                    }
                }, executor);
            }
        }), this.b);
    }

    @Override // defpackage.qcf
    public final zyd e(final piq piqVar) {
        return this.a.a(new yqi() { // from class: qcx
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pjd pjdVar = (pjd) obj;
                int i = qdj.e;
                abxs abxsVar = pjdVar.d;
                final piq piqVar2 = piqVar;
                int iA = zag.a(abxsVar, new yqx() { // from class: qcy
                    @Override // defpackage.yqx
                    public final boolean a(Object obj2) {
                        piq piqVar3 = (piq) obj2;
                        int i2 = qdj.e;
                        piq piqVar4 = piqVar2;
                        piy piyVar = piqVar4.c;
                        if (piyVar == null) {
                            piyVar = piy.a;
                        }
                        piy piyVar2 = piqVar3.c;
                        if (piyVar2 == null) {
                            piyVar2 = piy.a;
                        }
                        return (piyVar == piyVar2 || (piyVar2 != null && piyVar.getClass() == piyVar2.getClass() && abza.a.a(piyVar.getClass()).k(piyVar, piyVar2))) && piqVar4.f == piqVar3.f && piqVar4.d == piqVar3.d;
                    }
                });
                if (iA == -1) {
                    pjb pjbVar = new pjb();
                    pjbVar.B(pjdVar);
                    if ((pjbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        pjbVar.y();
                    }
                    pjd pjdVar2 = (pjd) pjbVar.b;
                    piqVar2.getClass();
                    abxs abxsVar2 = pjdVar2.d;
                    if (!abxsVar2.c()) {
                        int size = abxsVar2.size();
                        pjdVar2.d = abxsVar2.d(size + size);
                    }
                    pjdVar2.d.add(piqVar2);
                    return (pjd) pjbVar.v();
                }
                piq piqVar3 = (piq) pjdVar.d.get(iA);
                pip pipVar = new pip();
                pipVar.B(piqVar3);
                long j = piqVar3.g + piqVar2.g;
                if ((pipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pipVar.y();
                }
                piq piqVar4 = (piq) pipVar.b;
                piqVar4.b |= 16;
                piqVar4.g = j;
                long j2 = piqVar3.h + piqVar2.h;
                if ((pipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pipVar.y();
                }
                piq piqVar5 = (piq) pipVar.b;
                piqVar5.b |= 32;
                piqVar5.h = j2;
                piq piqVar6 = (piq) pipVar.v();
                pjb pjbVar2 = new pjb();
                pjbVar2.B(pjdVar);
                if ((pjbVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjbVar2.y();
                }
                pjd pjdVar3 = (pjd) pjbVar2.b;
                piqVar6.getClass();
                abxs abxsVar3 = pjdVar3.d;
                if (!abxsVar3.c()) {
                    int size2 = abxsVar3.size();
                    pjdVar3.d = abxsVar3.d(size2 + size2);
                }
                pjdVar3.d.set(iA, piqVar6);
                return (pjd) pjbVar2.v();
            }
        }, this.b);
    }
}
