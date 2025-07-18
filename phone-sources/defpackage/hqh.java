package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqh implements hlu, hlt {
    private final List a;
    private final cuj b;
    private int c;
    private hjw d;
    private hlt e;
    private List f;
    private boolean g;

    public hqh(List list, cuj cujVar) {
        this.b = cujVar;
        hju.o(list);
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
            hju.p(this.f);
            this.e.e(new hnr("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.hlu
    public final Class a() {
        return ((hlu) this.a.get(0)).a();
    }

    @Override // defpackage.hlt
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.hlu
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hlu) it.next()).d();
        }
    }

    @Override // defpackage.hlu
    public final void dL() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hlu) it.next()).dL();
        }
    }

    @Override // defpackage.hlt
    public final void e(Exception exc) {
        List list = this.f;
        hju.p(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.hlu
    public final void f(hjw hjwVar, hlt hltVar) {
        this.d = hjwVar;
        this.e = hltVar;
        this.f = (List) this.b.a();
        ((hlu) this.a.get(this.c)).f(hjwVar, this);
        if (this.g) {
            dL();
        }
    }

    @Override // defpackage.hlu
    public final int g() {
        return ((hlu) this.a.get(0)).g();
    }
}
