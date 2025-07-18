package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkm extends aghv {
    final agfs a;
    final Iterator b;
    volatile boolean c;
    boolean d;
    boolean e;
    boolean f;

    public agkm(agfs agfsVar, Iterator it) {
        this.a = agfsVar;
        this.b = it;
    }

    @Override // defpackage.aghs
    public final void b() {
        this.e = true;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.c = true;
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.aghs
    public final Object ff() {
        if (this.e) {
            return null;
        }
        if (!this.f) {
            this.f = true;
        } else if (!this.b.hasNext()) {
            this.e = true;
            return null;
        }
        Object next = this.b.next();
        aghn.b(next, "The iterator returned a null value");
        return next;
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        return this.e;
    }

    @Override // defpackage.aghq
    public final int i() {
        this.d = true;
        return 1;
    }
}
