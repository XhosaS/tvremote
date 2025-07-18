package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pnn implements pks {
    public final pju a;
    private pju c;
    private List d;
    private final pkg f;
    private boolean e = false;
    public int b = 1;

    public pnn(pju pjuVar) {
        this.a = pjuVar;
        this.f = pjuVar.f;
    }

    private final void a(pju pjuVar) {
        pks pksVar = pjuVar.c;
        if (this.e) {
            a.H(pksVar.n());
            pksVar.i();
        }
        pksVar.f();
    }

    @Override // defpackage.pks
    public final /* synthetic */ Object d() {
        return this.c;
    }

    @Override // defpackage.pks
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        pks pksVar = ((pju) obj).c;
        pksVar.k(this.a);
        a.H(this.d.add(obj));
        if (this.e) {
            pksVar.h();
        }
    }

    @Override // defpackage.pks
    public final void f() {
        sij.z(this.c != null, "No parent override to unset: %s", this.a);
        this.c = null;
    }

    @Override // defpackage.pks
    public final void g() {
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((pju) it.next());
            }
            this.d.clear();
            this.d = null;
        }
        pju pjuVar = this.c;
        if (pjuVar != null) {
            pjuVar.c.j(this.a);
        }
    }

    @Override // defpackage.pks
    public final void h() {
        a.ab(!this.e);
        this.e = true;
        this.f.c(this.a);
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pju) it.next()).c.h();
            }
        }
    }

    @Override // defpackage.pks
    public final void i() {
        a.ab(this.e);
        this.e = false;
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pju) it.next()).c.i();
            }
        }
        this.f.d(this.a);
    }

    @Override // defpackage.pks
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        a.H(this.d.remove(obj));
        a((pju) obj);
    }

    @Override // defpackage.pks
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        obj.getClass();
        sij.z(this.c == null, "Already has a parent override: %s", this.a);
        this.c = (pju) obj;
    }

    @Override // defpackage.pks
    public final void m(pkr pkrVar) {
        List list = this.d;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                pkrVar.b((pju) this.d.get(size));
            }
        }
    }

    @Override // defpackage.pks
    public final boolean n() {
        return this.e;
    }

    @Override // defpackage.pks
    public final boolean o() {
        return this.c == null;
    }

    @Override // defpackage.pks
    public final int r() {
        return this.b;
    }
}
