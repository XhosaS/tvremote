package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bar extends baw {
    public final Set a = new LinkedHashSet();
    public final bcb b = new bci(bhu.d, bcz.a);
    final /* synthetic */ bas c;
    private final long d;
    private final boolean e;
    private final boolean f;
    private Set g;

    public bar(bas basVar, long j, boolean z, boolean z2) {
        this.c = basVar;
        this.d = j;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.baw
    public final long a() {
        return this.d;
    }

    @Override // defpackage.baw
    public final bav b() {
        return this.c.f;
    }

    @Override // defpackage.baw
    public final yil c() {
        return this.c.b.c();
    }

    @Override // defpackage.baw
    public final void d(bca bcaVar) {
        this.c.b.d(bcaVar);
    }

    public final void e() {
        Set<bas> set = this.a;
        if (set.isEmpty()) {
            return;
        }
        Set set2 = this.g;
        if (set2 != null) {
            for (bas basVar : set) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(basVar.c);
                }
            }
        }
        set.clear();
    }

    @Override // defpackage.baw
    public final void f() {
        bas basVar = this.c;
        basVar.m--;
    }

    @Override // defpackage.baw
    public final void g(Set set) {
        Set hashSet = this.g;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.g = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.baw
    public final void h(bao baoVar) {
        this.a.add(baoVar);
    }

    @Override // defpackage.baw
    public final void i() {
        this.c.m++;
    }

    @Override // defpackage.baw
    public final void j(bao baoVar) {
        Set set = this.g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(((bas) baoVar).c);
            }
        }
        Set set2 = this.a;
        ylh.e(set2);
        set2.remove(baoVar);
    }

    @Override // defpackage.baw
    public final boolean k() {
        return this.c.b.k();
    }

    @Override // defpackage.baw
    public final boolean l() {
        return this.e;
    }

    @Override // defpackage.baw
    public final boolean m() {
        return this.f;
    }

    @Override // defpackage.baw
    public final bhu n() {
        return (bhu) this.b.a();
    }

    @Override // defpackage.baw
    public final void o(baz bazVar, yjz yjzVar) {
        this.c.b.o(bazVar, yjzVar);
    }

    @Override // defpackage.baw
    public final void p(baz bazVar) {
        bas basVar = this.c;
        baw bawVar = basVar.b;
        bawVar.p(basVar.f);
        bawVar.p(bazVar);
    }

    @Override // defpackage.baw
    public final void q(baz bazVar) {
        this.c.b.q(bazVar);
    }

    @Override // defpackage.baw
    public final void r(baz bazVar) {
        this.c.b.r(bazVar);
    }

    @Override // defpackage.baw
    public final cb s(bca bcaVar) {
        return this.c.b.s(bcaVar);
    }

    @Override // defpackage.baw
    public final void t(bca bcaVar, cb cbVar, bad badVar) {
        this.c.b.t(bcaVar, cbVar, badVar);
    }
}
