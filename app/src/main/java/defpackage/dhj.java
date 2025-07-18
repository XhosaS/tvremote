package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class dhj implements daw, dav {
    private final List a;
    private final afh b;
    private int c;
    private cyn d;
    private dav e;
    private List f;
    private boolean g;

    public dhj(List list, afh afhVar) {
        this.b = afhVar;
        dqk.c(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            f(this.d, this.e);
        } else {
            dqk.d(this.f, "Argument must not be null");
            this.e.e(new ddj("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.daw
    public final Class a() {
        return ((daw) this.a.get(0)).a();
    }

    @Override // defpackage.dav
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.daw
    public final void cz() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((daw) it.next()).cz();
        }
    }

    @Override // defpackage.daw
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((daw) it.next()).d();
        }
    }

    @Override // defpackage.dav
    public final void e(Exception exc) {
        List list = this.f;
        dqk.d(list, "Argument must not be null");
        list.add(exc);
        h();
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        this.d = cynVar;
        this.e = davVar;
        this.f = (List) this.b.a();
        ((daw) this.a.get(this.c)).f(cynVar, this);
        if (this.g) {
            cz();
        }
    }

    @Override // defpackage.daw
    public final int g() {
        return ((daw) this.a.get(0)).g();
    }
}
