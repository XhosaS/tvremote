package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrk implements jrj {
    private boolean b;
    private final jri e;
    private final jri f;
    private final jri g;
    private final jri h;
    private final jri i;
    private final jri j;
    private final jrl k;
    private final jrh l;
    private final List a = new ArrayList(6);
    private float c = 75.0f;
    private float d = 25.0f;

    public jrk(jri jriVar, jri jriVar2, jri jriVar3, jri jriVar4, jri jriVar5, jri jriVar6, jrl jrlVar, jrh jrhVar, boolean z) {
        this.e = jriVar;
        int i = true != z ? -12483341 : -1;
        jriVar.a(12.0f, 3.1415927f, 1.0f, i);
        this.f = jriVar2;
        int i2 = true != z ? -1424587 : -1;
        jriVar2.a(4.0f, 3.1415927f, 1.0f, i2);
        this.g = jriVar3;
        jriVar3.a(4.0f, 0.0f, 1.0f, true != z ? -279547 : -1);
        this.h = jriVar4;
        jriVar4.a(12.0f, 0.0f, 1.0f, true != z ? -13326253 : -1);
        this.i = jriVar5;
        jriVar5.a(8.0f, 0.0f, 0.0f, i);
        this.j = jriVar6;
        jriVar6.a(16.0f, 0.0f, 0.0f, i2);
        this.k = jrlVar;
        this.l = jrhVar;
        jrhVar.e(1.0f);
        i(false);
    }

    @Override // defpackage.jrj
    public final float a() {
        return this.l.f;
    }

    @Override // defpackage.jrj
    public final float b() {
        return this.d;
    }

    @Override // defpackage.jrj
    public final float c() {
        return this.k.b.f;
    }

    @Override // defpackage.jrj
    public final float d() {
        return this.c;
    }

    @Override // defpackage.jrj
    public final void e(float f) {
        this.l.c(f);
    }

    @Override // defpackage.jrj
    public final void f() {
        this.e.f(3.1415927f, 12.0f);
        this.f.f(3.1415927f, 4.0f);
        this.g.f(0.0f, 4.0f);
        this.h.f(0.0f, 12.0f);
        this.i.f(0.0f, 8.0f);
        this.j.f(0.0f, 8.0f);
    }

    @Override // defpackage.jrj
    public final void g() {
        jrl jrlVar = this.k;
        jrh jrhVar = jrlVar.b;
        jrh jrhVar2 = jrlVar.c;
        float f = jrhVar2.f;
        if (f != jrhVar.g) {
            jrhVar.g = f;
            jrhVar.c = false;
        }
        jrhVar.c(0.0f);
        jrhVar2.e(0.0f);
        jrlVar.a = false;
    }

    @Override // defpackage.jrj
    public final void h() {
        Iterator it = iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jrh jrhVar = jriVar.c;
            jrhVar.e(jrhVar.e);
            jrh jrhVar2 = jriVar.d;
            jrhVar2.e(jrhVar2.e);
            jrh jrhVar3 = jriVar.e;
            jrhVar3.e(jrhVar3.e);
            jrh jrhVar4 = jriVar.f;
            jrhVar4.e(jrhVar4.e);
            jrh jrhVar5 = jriVar.g;
            jrhVar5.e(jrhVar5.e);
            jrh jrhVar6 = jriVar.h;
            jrhVar6.e(jrhVar6.e);
            jrh jrhVar7 = jriVar.j;
            jrhVar7.e(jrhVar7.e);
            jrh jrhVar8 = jriVar.k;
            jrhVar8.e(jrhVar8.e);
            jrh jrhVar9 = jriVar.i;
            jrhVar9.e(jrhVar9.e);
        }
        jrl jrlVar = this.k;
        jrh jrhVar10 = jrlVar.c;
        jrhVar10.e(jrhVar10.e);
        jrh jrhVar11 = jrlVar.b;
        jrhVar11.e(jrhVar11.e);
        jrh jrhVar12 = this.l;
        jrhVar12.e(jrhVar12.e);
    }

    @Override // defpackage.jrj
    public final void i(boolean z) {
        List list = this.a;
        if (list.isEmpty()) {
            list.add(this.h);
            list.add(this.g);
            list.add(this.f);
            list.add(this.e);
        }
        if (z != this.b) {
            if (z) {
                list.add(1, this.i);
                list.add(0, this.j);
            } else {
                list.remove(this.i);
                list.remove(this.j);
            }
        }
        this.b = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // defpackage.jrj
    public final void j(float[] fArr) {
        int i = 0;
        while (i < 4 && i < this.a.size()) {
            (i != 0 ? i != 1 ? i != 2 ? this.b ? this.i : this.h : this.g : this.f : this.e).b = fArr[i];
            i++;
        }
    }

    @Override // defpackage.jrj
    public final void k(float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalArgumentException("Width and height cannot be 0 or below");
        }
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.jrj
    public final void l(float f) {
        jrl jrlVar = this.k;
        jrlVar.c.c(f);
        jrlVar.a = true;
    }

    @Override // defpackage.jrj
    public final void m(long j) {
        Iterator it = iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            jriVar.c.g(j);
            jriVar.d.g(j);
            jriVar.e.g(j);
            jriVar.f.g(j);
            jriVar.g.g(j);
            jriVar.h.g(j);
            jriVar.j.g(j);
            jriVar.k.g(j);
            jriVar.i.g(j);
        }
        jrl jrlVar = this.k;
        if (jrlVar.a) {
            jrh jrhVar = jrlVar.c;
            jrhVar.g(j);
            jrh jrhVar2 = jrlVar.b;
            jrhVar2.e(jrhVar2.f + (jrhVar.f * (Math.min(j, 50.0f) / 1000.0f)));
        } else {
            jrlVar.b.g(j);
        }
        this.l.g(j);
    }

    @Override // defpackage.jrj
    public final boolean n() {
        Iterator it = iterator();
        while (it.hasNext()) {
            jri jriVar = (jri) it.next();
            if (!jriVar.c.c || !jriVar.d.c || !jriVar.e.c || !jriVar.f.c || !jriVar.g.c || !jriVar.h.c || !jriVar.j.c || !jriVar.k.c || !jriVar.i.c) {
                return false;
            }
        }
        jrl jrlVar = this.k;
        return !jrlVar.a && jrlVar.b.c && this.l.c;
    }

    @Override // defpackage.jrj
    public final float o(jri jriVar) {
        if (jriVar == this.e) {
            return -16.0f;
        }
        if (jriVar == this.f) {
            return -7.85f;
        }
        if (jriVar == this.g) {
            return -2.55f;
        }
        if (jriVar == this.h) {
            return 11.5f;
        }
        if (jriVar == this.i) {
            return 6.7f;
        }
        if (jriVar == this.j) {
            return 16.1f;
        }
        throw new IllegalArgumentException("Unknown dot");
    }

    @Override // defpackage.jrj
    public final int p(jri jriVar) {
        if (jriVar == this.e) {
            return 0;
        }
        if (jriVar == this.f) {
            return 1;
        }
        if (jriVar == this.g) {
            return 2;
        }
        if (jriVar == this.h) {
            return this.b ? 4 : 3;
        }
        if (jriVar == this.i && this.b) {
            return 3;
        }
        if (jriVar == this.j && this.b) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown or unexpected dot");
    }

    @Override // defpackage.jrj
    public final jri q() {
        return this.e;
    }

    @Override // defpackage.jrj
    public final jri r() {
        return this.h;
    }

    @Override // defpackage.jrj
    public final jri s() {
        return this.f;
    }

    @Override // defpackage.jrj
    public final jri t() {
        return this.i;
    }

    @Override // defpackage.jrj
    public final jri u() {
        return this.j;
    }

    @Override // defpackage.jrj
    public final jri v() {
        return this.g;
    }

    @Override // defpackage.jrj
    public final void w(jri jriVar, float f) {
        jrh jrhVar = jriVar.d;
        float f2 = f - jrhVar.e;
        jrhVar.b(f2);
        Iterator it = iterator();
        while (it.hasNext()) {
            jri jriVar2 = (jri) it.next();
            if (jriVar2 != jriVar) {
                jriVar2.d.b(f2);
            }
        }
        this.k.b.b(-f2);
    }

    @Override // defpackage.jrj
    public final void y() {
        jrh jrhVar = this.k.b;
        float f = (-0.3926991f) - jrhVar.f;
        jrhVar.b(f);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((jri) it.next()).d.b(-f);
        }
    }

    @Override // defpackage.jrj
    public final void x() {
    }
}
