package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptk implements pxy {
    public final qbv a;
    public final pye b;
    public final pwt c;
    public final Executor d;
    public final phg e;
    private final pwt f;
    private final Uri g;
    private final Uri h;
    private final pvx i;
    private final ueg j;

    public ptk(qbv qbvVar, pye pyeVar, pwt pwtVar, pwt pwtVar2, Uri uri, Uri uri2, pvx pvxVar, ueg uegVar, Executor executor, phg phgVar) {
        this.a = qbvVar;
        this.b = pyeVar;
        this.c = pwtVar;
        this.f = pwtVar2;
        this.g = uri;
        this.h = uri2;
        this.i = pvxVar;
        this.j = uegVar;
        this.d = executor;
        this.e = phgVar;
    }

    private static zyd j() {
        return zxn.g(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void k(Uri uri) throws ufx {
        ueg uegVar = this.j;
        if (uegVar.h(uri)) {
            uegVar.f(uri);
        }
    }

    @Override // defpackage.pxy
    public final zyd a() {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.b.a();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.a();
        }
        return zuz.h(b(this.b.a()), wyo.c(new zvi() { // from class: pst
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final ptk ptkVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(ptkVar.b(ptkVar.c.a()), wyo.c(new zvi() { // from class: pta
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return ptkVar.i(qefVar, (qef) obj2, 1104);
                    }
                }), ptkVar.d);
            }
        }), this.d);
    }

    public final zyd b(zyd zydVar) {
        yqi yqiVarA = wyo.a(new yqi() { // from class: ptg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new qef(true, obj, null);
            }
        });
        Executor executor = this.d;
        return zud.g(zuz.g(zydVar, yqiVarA, executor), Exception.class, wyo.a(new yqi() { // from class: pth
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new qef(false, null, (Exception) obj);
            }
        }), executor);
    }

    @Override // defpackage.pxy
    public final zyd c() {
        final Comparator comparator = new Comparator() { // from class: pte
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qer.e((pjf) obj).compareTo(qer.e((pjf) obj2));
            }
        };
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.b.c();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.c();
        }
        return zuz.h(b(this.b.c()), wyo.c(new zvi() { // from class: ptf
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final ptk ptkVar = this.a;
                final qef qefVar = (qef) obj;
                zyd zydVarB = ptkVar.b(ptkVar.c.c());
                final Comparator comparator2 = comparator;
                return zuz.h(zydVarB, wyo.c(new zvi() { // from class: psz
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        qef qefVar2 = (qef) obj2;
                        ptk ptkVar2 = ptkVar;
                        int iN = ptkVar2.e.n();
                        qef qefVar3 = qefVar;
                        if (qce.a(iN)) {
                            if (qef.e(qefVar3, qefVar2, comparator2)) {
                                ptkVar2.a.j(1106, iN);
                            } else {
                                ptkVar2.a.j(1103, iN);
                            }
                        }
                        if (qefVar3.a) {
                            List list = (List) qefVar3.a();
                            list.getClass();
                            return zxn.h(list);
                        }
                        Object objB = qefVar3.b();
                        objB.getClass();
                        return zxn.g((Throwable) objB);
                    }
                }), ptkVar.d);
            }
        }), this.d);
    }

    @Override // defpackage.pxy
    public final zyd d() {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            try {
                try {
                    k(this.g);
                    return this.b.d();
                } finally {
                    k(this.h);
                }
            } catch (IOException e) {
                return zxn.g(e);
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return j();
            }
            try {
                k(this.g);
                return this.f.d();
            } catch (IOException e2) {
                return zxn.g(e2);
            }
        }
        try {
            zyd zydVarD = this.b.d();
            zvi zviVar = new zvi() { // from class: psp
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    final ptk ptkVar = this.a;
                    final Boolean bool = (Boolean) obj;
                    return zuz.h(ptkVar.b.c(), wyo.c(new zvi() { // from class: psv
                        @Override // defpackage.zvi
                        public final zyd a(Object obj2) {
                            final List list = (List) obj2;
                            final ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (true) {
                                final ptk ptkVar2 = ptkVar;
                                if (!it.hasNext()) {
                                    final Boolean bool2 = bool;
                                    return qft.a(arrayList).b(new zvh() { // from class: pti
                                        @Override // defpackage.zvh
                                        public final zyd a() {
                                            zyd zydVarH = zxn.h(true);
                                            int i = 0;
                                            while (true) {
                                                List list2 = list;
                                                final ptk ptkVar3 = ptkVar2;
                                                if (i >= list2.size()) {
                                                    final Boolean bool3 = bool2;
                                                    yqi yqiVar = new yqi() { // from class: psx
                                                        @Override // defpackage.yqi
                                                        public final Object apply(Object obj3) {
                                                            boolean z = false;
                                                            if (((Boolean) obj3).booleanValue() && bool3.booleanValue()) {
                                                                z = true;
                                                            }
                                                            return Boolean.valueOf(z);
                                                        }
                                                    };
                                                    return zuz.g(zydVarH, wyo.a(yqiVar), ptkVar3.d);
                                                }
                                                List list3 = arrayList;
                                                final pjf pjfVar = (pjf) list2.get(i);
                                                final pjj pjjVar = (pjj) zxn.o((Future) list3.get(i));
                                                zvi zviVar2 = new zvi() { // from class: psw
                                                    @Override // defpackage.zvi
                                                    public final zyd a(Object obj3) {
                                                        ptk ptkVar4 = ptkVar3;
                                                        final Boolean bool4 = (Boolean) obj3;
                                                        return zuz.g(ptkVar4.c.h(pjfVar, pjjVar), wyo.a(new yqi() { // from class: psq
                                                            @Override // defpackage.yqi
                                                            public final Object apply(Object obj4) {
                                                                boolean z = false;
                                                                if (((Boolean) obj4).booleanValue() && bool4.booleanValue()) {
                                                                    z = true;
                                                                }
                                                                return Boolean.valueOf(z);
                                                            }
                                                        }), ptkVar4.d);
                                                    }
                                                };
                                                zydVarH = zuz.h(zydVarH, wyo.c(zviVar2), ptkVar3.d);
                                                i++;
                                            }
                                        }
                                    }, ptkVar2.d);
                                }
                                arrayList.add(ptkVar2.b.e((pjf) it.next()));
                            }
                        }
                    }), ptkVar.d);
                }
            };
            return zuz.h(zydVarD, wyo.c(zviVar), this.d);
        } catch (IOException e3) {
            return zxn.g(e3);
        }
    }

    @Override // defpackage.pxy
    public final zyd e(final pjf pjfVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.b.e(pjfVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.e(pjfVar);
        }
        return zuz.h(b(this.b.e(pjfVar)), wyo.c(new zvi() { // from class: psu
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final ptk ptkVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(ptkVar.b(ptkVar.c.e(pjfVar)), wyo.c(new zvi() { // from class: ptd
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return ptkVar.i(qefVar, (qef) obj2, 1100);
                    }
                }), ptkVar.d);
            }
        }), this.d);
    }

    @Override // defpackage.pxy
    public final zyd f(final yzq yzqVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.b.f(yzqVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.f(yzqVar);
        }
        return zuz.h(b(this.b.f(yzqVar)), wyo.c(new zvi() { // from class: psy
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final ptk ptkVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(ptkVar.b(ptkVar.c.f(yzqVar)), wyo.c(new zvi() { // from class: ptj
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return ptkVar.i(qefVar, (qef) obj2, 1100);
                    }
                }), ptkVar.d);
            }
        }), this.d);
    }

    @Override // defpackage.pxy
    public final zyd g(final pjf pjfVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.b.g(pjfVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.g(pjfVar);
        }
        return zuz.h(b(this.b.g(pjfVar)), wyo.c(new zvi() { // from class: ptb
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final ptk ptkVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(ptkVar.b(ptkVar.c.g(pjfVar)), wyo.c(new zvi() { // from class: pss
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return ptkVar.i(qefVar, (qef) obj2, 1102);
                    }
                }), ptkVar.d);
            }
        }), this.d);
    }

    @Override // defpackage.pxy
    public final zyd h(final pjf pjfVar, final pjj pjjVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.b.h(pjfVar, pjjVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.h(pjfVar, pjjVar);
        }
        return zuz.h(b(this.b.h(pjfVar, pjjVar)), wyo.c(new zvi() { // from class: ptc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final ptk ptkVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(ptkVar.b(ptkVar.c.h(pjfVar, pjjVar)), wyo.c(new zvi() { // from class: psr
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return ptkVar.i(qefVar, (qef) obj2, 1101);
                    }
                }), ptkVar.d);
            }
        }), this.d);
    }

    public final zyd i(qef qefVar, qef qefVar2, int i) {
        int iN = this.e.n();
        if (qce.a(iN)) {
            if (qefVar.equals(qefVar2)) {
                this.a.j(1106, iN);
            } else {
                this.a.j(i, iN);
            }
        }
        return qefVar.a ? zxn.h(qefVar.a()) : zxn.g((Throwable) qefVar.b());
    }
}
