package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvv implements prk {
    public final pkn a;
    public final ujk b;
    public final Executor c;
    private final pmq d;

    public pvv(pmq pmqVar, pkn pknVar, ujk ujkVar, Executor executor) {
        this.d = pmqVar;
        this.a = pknVar;
        this.b = ujkVar;
        this.c = executor;
    }

    @Override // defpackage.prk
    public final zyd a(pia piaVar) {
        int i = qce.a;
        pia piaVarD = qeg.d(piaVar, (Instant.now().toEpochMilli() / 1000) + piaVar.k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(piaVarD);
        return m(arrayList);
    }

    @Override // defpackage.prk
    public final zyd b() {
        return qfr.c(k()).g(new zvi() { // from class: pvp
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                yqi yqiVar = new yqi() { // from class: pva
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        pir pirVar = new pir();
                        pirVar.B((piu) obj2);
                        abxd abxdVar = pirVar.a;
                        if ((abxdVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
                            throw new IllegalArgumentException("Default instance must be immutable.");
                        }
                        pirVar.b = (abxd) abxdVar.cM(4, null);
                        return (piu) pirVar.v();
                    }
                };
                pvv pvvVar = this.a;
                return pvvVar.b.a(yqiVar, pvvVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.prk
    public final zyd c() {
        final ArrayList arrayList = new ArrayList();
        yqi yqiVar = new yqi() { // from class: pvt
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                piu piuVar = (piu) obj;
                pir pirVar = new pir();
                pirVar.B(piuVar);
                List list = arrayList;
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(piuVar.b).entrySet()) {
                    String str = (String) entry.getKey();
                    try {
                        list.add(new pyh(qei.a(str), (pia) entry.getValue()));
                    } catch (qeh e) {
                        pirVar.b(str);
                        qce.f(e, "Failed to deserialized file group key: ".concat(String.valueOf(str)));
                    }
                }
                return (piu) pirVar.v();
            }
        };
        Executor executor = this.c;
        return qfr.c(this.b.a(yqiVar, executor)).e(new yqi() { // from class: pvu
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return arrayList;
            }
        }, executor);
    }

    @Override // defpackage.prk
    public final zyd d() {
        final ArrayList arrayList = new ArrayList();
        yqi yqiVar = new yqi() { // from class: pvi
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                piu piuVar = (piu) obj;
                pir pirVar = new pir();
                pirVar.B(piuVar);
                List list = arrayList;
                for (String str : DesugarCollections.unmodifiableMap(piuVar.b).keySet()) {
                    try {
                        list.add(qei.a(str));
                    } catch (qeh e) {
                        pvv pvvVar = this.a;
                        qce.f(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                        pvvVar.a.a();
                        pirVar.b(str);
                    }
                }
                return (piu) pirVar.v();
            }
        };
        Executor executor = this.c;
        return qfr.c(this.b.a(yqiVar, executor)).e(new yqi() { // from class: pvj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return arrayList;
            }
        }, executor);
    }

    @Override // defpackage.prk
    public final zyd e() {
        return zuz.g(this.b.c(), wyo.a(new yqi() { // from class: pvf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((piu) obj).d;
            }
        }), this.c);
    }

    @Override // defpackage.prk
    public final zyd f() {
        return zxy.a;
    }

    @Override // defpackage.prk
    public final zyd g(piy piyVar) {
        final String strC = qei.c(piyVar);
        return zuz.g(this.b.c(), wyo.a(new yqi() { // from class: pvo
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (pia) DesugarCollections.unmodifiableMap(((piu) obj).b).get(strC);
            }
        }), this.c);
    }

    @Override // defpackage.prk
    public final zyd h(piy piyVar) {
        final String strC = qei.c(piyVar);
        return zuz.g(this.b.c(), wyo.a(new yqi() { // from class: pvb
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (pja) DesugarCollections.unmodifiableMap(((piu) obj).c).get(strC);
            }
        }), this.c);
    }

    @Override // defpackage.prk
    public final zyd i(piy piyVar) {
        final String strC = qei.c(piyVar);
        yqi yqiVar = new yqi() { // from class: pvq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pir pirVar = new pir();
                pirVar.B((piu) obj);
                pirVar.b(strC);
                return (piu) pirVar.v();
            }
        };
        Executor executor = this.c;
        return qfr.c(this.b.a(yqiVar, executor)).e(new yqi() { // from class: pvr
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).a(IOException.class, new yqi() { // from class: pvs
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    @Override // defpackage.prk
    public final zyd j(final List list) {
        yqi yqiVar = new yqi() { // from class: pvc
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pir pirVar = new pir();
                pirVar.B((piu) obj);
                for (piy piyVar : list) {
                    String str = piyVar.d;
                    String str2 = piyVar.e;
                    int i = qce.a;
                    pirVar.b(qei.c(piyVar));
                }
                return (piu) pirVar.v();
            }
        };
        Executor executor = this.c;
        return qfr.c(this.b.a(yqiVar, executor)).e(new yqi() { // from class: pvd
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).a(IOException.class, new yqi() { // from class: pve
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    @Override // defpackage.prk
    public final zyd k() {
        return this.b.a(new yqi() { // from class: pvg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pir pirVar = new pir();
                pirVar.B((piu) obj);
                if ((pirVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pirVar.y();
                }
                piu piuVar = (piu) pirVar.b;
                piu piuVar2 = piu.a;
                piuVar.d = abzb.b;
                return (piu) pirVar.v();
            }
        }, this.c);
    }

    @Override // defpackage.prk
    public final zyd l(piy piyVar, final pia piaVar) {
        final String strC = qei.c(piyVar);
        yqi yqiVar = new yqi() { // from class: pvk
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pir pirVar = new pir();
                pirVar.B((piu) obj);
                pirVar.a(strC, piaVar);
                return (piu) pirVar.v();
            }
        };
        Executor executor = this.c;
        return qfr.c(this.b.a(yqiVar, executor)).e(new yqi() { // from class: pvl
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).a(IOException.class, new yqi() { // from class: pvm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }

    @Override // defpackage.prk
    public final zyd m(final List list) {
        yqi yqiVar = new yqi() { // from class: puz
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                pir pirVar = new pir();
                pirVar.B((piu) obj);
                if ((pirVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pirVar.y();
                }
                piu piuVar = (piu) pirVar.b;
                piu piuVar2 = piu.a;
                abxs abxsVar = piuVar.d;
                if (!abxsVar.c()) {
                    int size = abxsVar.size();
                    piuVar.d = abxsVar.d(size + size);
                }
                abus.m(list, piuVar.d);
                return (piu) pirVar.v();
            }
        };
        Executor executor = this.c;
        return qfr.c(this.b.a(yqiVar, executor)).e(new yqi() { // from class: pvh
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return true;
            }
        }, executor).a(IOException.class, new yqi() { // from class: pvn
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return false;
            }
        }, executor);
    }
}
