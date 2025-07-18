package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qns implements qlz {
    public final qlz a;
    final /* synthetic */ qnt b;
    private final qlz c;
    private zfh d;

    public qns(qnt qntVar, qlz qlzVar, qlz qlzVar2) {
        this.b = qntVar;
        this.c = qlzVar;
        this.a = qlzVar2;
    }

    private final zyd h(final yqi yqiVar) {
        zyd zydVar = (zyd) yqiVar.apply(this.c);
        zvi zviVar = new zvi() { // from class: qnr
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                qns qnsVar = this.a;
                qnsVar.g((qna) obj);
                return (zyd) yqiVar.apply(qnsVar.a);
            }
        };
        return zud.h(zydVar, qna.class, wyo.c(zviVar), zwk.a);
    }

    private final zyd i(final qnl qnlVar, final String str, final int i) {
        zyd zydVarA = qnlVar.a(this.c, str, i);
        zvi zviVar = new zvi() { // from class: qnq
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                qns qnsVar = this.a;
                qnsVar.g((qna) obj);
                return qnlVar.a(qnsVar.a, str, i);
            }
        };
        return zud.h(zydVarA, qna.class, wyo.c(zviVar), zwk.a);
    }

    @Override // defpackage.qlz
    public final zyd a() {
        return h(new yqi() { // from class: qnm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((qlz) obj).a();
            }
        });
    }

    @Override // defpackage.qlz
    public final zyd b() {
        return h(new yqi() { // from class: qnn
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((qlz) obj).b();
            }
        });
    }

    @Override // defpackage.qlz
    public final void c(qly qlyVar) {
        List list = this.b.b;
        synchronized (list) {
            list.add(qlyVar);
            this.c.c(qlyVar);
        }
    }

    @Override // defpackage.qlz
    public final void d(qly qlyVar) {
        List list = this.b.b;
        synchronized (list) {
            list.remove(qlyVar);
            this.c.d(qlyVar);
        }
    }

    @Override // defpackage.qlz
    public final zyd e(String str, int i) {
        return i(new qnl() { // from class: qno
            @Override // defpackage.qnl
            public final zyd a(qlz qlzVar, String str2, int i2) {
                return qlzVar.e(str2, i2);
            }
        }, str, i);
    }

    @Override // defpackage.qlz
    public final zyd f(String str, int i) {
        return i(new qnl() { // from class: qnp
            @Override // defpackage.qnl
            public final zyd a(qlz qlzVar, String str2, int i2) {
                return qlzVar.f(str2, i2);
            }
        }, str, i);
    }

    public final void g(Exception exc) {
        qnt qntVar = this.b;
        List list = qntVar.b;
        synchronized (list) {
            if (this.d == null) {
                this.d = zfh.h("OneGoogle");
            }
            ((zfd) ((zfd) this.d.d()).q("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", 190, "SafeMdiOwnersProvider.java")).x("MDI Profile Sync not available on device. Reverting to backup implementation. Exception: %s", qjs.a(exc));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.c((qly) it.next());
            }
            qntVar.a = this.a;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.c.d((qly) it2.next());
            }
            list.clear();
        }
    }
}
