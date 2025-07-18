package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psn implements prk {
    public final pvv a;
    public final Executor b;
    private final qbv c;
    private final pyb d;
    private final pvv e;
    private final pvx f;
    private final Uri g;
    private final Uri h;
    private final ueg i;
    private final phg j;

    public psn(qbv qbvVar, pyb pybVar, pvv pvvVar, pvv pvvVar2, Uri uri, Uri uri2, pvx pvxVar, ueg uegVar, Executor executor, phg phgVar) {
        this.c = qbvVar;
        this.d = pybVar;
        this.e = pvvVar2;
        this.a = pvvVar;
        this.g = uri;
        this.h = uri2;
        this.f = pvxVar;
        this.i = uegVar;
        this.b = executor;
        this.j = phgVar;
    }

    private static zyd q() {
        return zxn.g(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) throws ufx {
        ueg uegVar = this.i;
        if (uegVar.h(uri)) {
            uegVar.f(uri);
        }
    }

    @Override // defpackage.prk
    public final zyd a(final pia piaVar) {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.a(piaVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.a(piaVar);
        }
        return zuz.h(n(this.d.a(piaVar)), wyo.c(new zvi() { // from class: psk
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.a(piaVar)), wyo.c(new zvi() { // from class: prp
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1096);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd b() {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.b();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.b();
        }
        return zuz.h(n(this.d.b()), wyo.c(new zvi() { // from class: prt
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.b()), wyo.c(new zvi() { // from class: psb
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1099);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd c() {
        final Comparator comparator = new Comparator() { // from class: psm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qer.e(((pyj) obj).b()).compareTo(qer.e(((pyj) obj2).b()));
            }
        };
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.c();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.c();
        }
        return zuz.h(n(this.d.c()), wyo.c(new zvi() { // from class: prm
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                zyd zydVarN = psnVar.n(psnVar.a.c());
                final Comparator comparator2 = comparator;
                return zuz.h(zydVarN, wyo.c(new zvi() { // from class: psa
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.p(qefVar, (qef) obj2, comparator2, 1093);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd d() {
        final Comparator comparator = new Comparator() { // from class: prw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qer.e((piy) obj).compareTo(qer.e((piy) obj2));
            }
        };
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.d();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.d();
        }
        return zuz.h(n(this.d.d()), wyo.c(new zvi() { // from class: psf
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                zyd zydVarN = psnVar.n(psnVar.a.d());
                final Comparator comparator2 = comparator;
                return zuz.h(zydVarN, wyo.c(new zvi() { // from class: pse
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.p(qefVar, (qef) obj2, comparator2, 1092);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd e() {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.e();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.e();
        }
        return zuz.h(n(this.d.e()), wyo.c(new zvi() { // from class: psj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.e()), wyo.c(new zvi() { // from class: prr
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1095);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd f() {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            try {
                try {
                    r(this.g);
                    r(this.h);
                    return zxy.a;
                } catch (Throwable th) {
                    r(this.h);
                    throw th;
                }
            } catch (IOException e) {
                return zxn.g(e);
            }
        }
        if (iOrdinal == 2) {
            try {
                r(this.h);
                return zxy.a;
            } catch (IOException e2) {
                return zxn.g(e2);
            }
        }
        if (iOrdinal != 3) {
            return q();
        }
        try {
            r(this.g);
            return zxy.a;
        } catch (IOException e3) {
            return zxn.g(e3);
        }
    }

    @Override // defpackage.prk
    public final zyd g(final piy piyVar) {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.g(piyVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.g(piyVar);
        }
        return zuz.h(n(this.d.g(piyVar)), wyo.c(new zvi() { // from class: psi
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.g(piyVar)), wyo.c(new zvi() { // from class: prl
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1087);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd h(final piy piyVar) {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.h(piyVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.h(piyVar);
        }
        return zuz.h(n(this.d.h(piyVar)), wyo.c(new zvi() { // from class: prx
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.h(piyVar)), wyo.c(new zvi() { // from class: psl
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1090);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd i(final piy piyVar) {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.i(piyVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.i(piyVar);
        }
        return zuz.h(n(this.d.i(piyVar)), wyo.c(new zvi() { // from class: prv
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.i(piyVar)), wyo.c(new zvi() { // from class: psh
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1089);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd j(final List list) {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.j(list);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.j(list);
        }
        return zuz.h(n(this.d.j(list)), wyo.c(new zvi() { // from class: psg
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.j(list)), wyo.c(new zvi() { // from class: prn
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1094);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd k() {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.k();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.k();
        }
        return zuz.h(n(this.d.k()), wyo.c(new zvi() { // from class: psc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.k()), wyo.c(new zvi() { // from class: pro
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1098);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd l(final piy piyVar, final pia piaVar) {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.l(piyVar, piaVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.l(piyVar, piaVar);
        }
        return zuz.h(n(this.d.l(piyVar, piaVar)), wyo.c(new zvi() { // from class: psd
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.l(piyVar, piaVar)), wyo.c(new zvi() { // from class: prs
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1088);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    @Override // defpackage.prk
    public final zyd m(final List list) {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            return this.d.m(list);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.m(list);
        }
        return zuz.h(n(this.d.m(list)), wyo.c(new zvi() { // from class: prq
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final psn psnVar = this.a;
                final qef qefVar = (qef) obj;
                return zuz.h(psnVar.n(psnVar.a.m(list)), wyo.c(new zvi() { // from class: pru
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return psnVar.o(qefVar, (qef) obj2, 1097);
                    }
                }), psnVar.b);
            }
        }), this.b);
    }

    public final zyd n(zyd zydVar) {
        yqi yqiVarA = wyo.a(new yqi() { // from class: pry
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new qef(true, obj, null);
            }
        });
        Executor executor = this.b;
        return zud.g(zuz.g(zydVar, yqiVarA, executor), Exception.class, wyo.a(new yqi() { // from class: prz
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new qef(false, null, (Exception) obj);
            }
        }), executor);
    }

    public final zyd o(qef qefVar, qef qefVar2, int i) {
        int iN = this.j.n();
        if (qce.a(iN)) {
            if (qefVar.equals(qefVar2)) {
                this.c.j(1107, iN);
            } else {
                this.c.j(i, iN);
            }
        }
        return qefVar.a ? zxn.h(qefVar.a()) : zxn.g((Throwable) qefVar.b());
    }

    public final zyd p(qef qefVar, qef qefVar2, Comparator comparator, int i) {
        int iN = this.j.n();
        if (qce.a(iN)) {
            if (qef.e(qefVar, qefVar2, comparator)) {
                this.c.j(1106, iN);
            } else {
                this.c.j(i, iN);
            }
        }
        if (qefVar.a) {
            List list = (List) qefVar.a();
            list.getClass();
            return zxn.h(list);
        }
        Object objB = qefVar.b();
        objB.getClass();
        return zxn.g((Throwable) objB);
    }
}
