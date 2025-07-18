package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvc extends azd {
    public final boolean a;
    public final List b = new ArrayList();
    public Object c;
    public Object d;
    private final Context g;
    private Object h;
    private Object i;

    public hvc(Context context, boolean z) {
        this.g = context;
        this.a = z;
    }

    private final int B() {
        return x() ? 1 : 0;
    }

    private final Object C() {
        return y() ? this.d : j(0);
    }

    private final void D() {
        Object obj = this.d;
        obj.getClass();
        uua uuaVar = (uua) obj;
        A(uuaVar);
        uuaVar.p(uuh.class, null);
        n(a() - 1);
    }

    private final void E(boolean z) {
        Object objC;
        Object objC2;
        if (!z) {
            if (v() && (objC = C()) != null && (objC instanceof uua)) {
                z((uua) objC);
                n(f());
                return;
            }
            return;
        }
        if (v() || (objC2 = C()) == null || !(objC2 instanceof uua)) {
            return;
        }
        uua uuaVar = (uua) objC2;
        uuaVar.p(ayj.class, null);
        uuaVar.p(uuh.class, null);
        n(f());
    }

    private final boolean F() {
        if (u()) {
            return false;
        }
        return y() || !this.a;
    }

    public final void A(uua uuaVar) {
        Context context = this.g;
        Object objC = c(uuaVar);
        if (context == null || !(objC instanceof huy)) {
            return;
        }
        uuaVar.p(ayj.class, ((huy) objC).p(context));
    }

    @Override // defpackage.azd
    public final int a() {
        return this.b.size() + f() + ((u() && t()) ? 2 : (u() || t()) ? 1 : 0);
    }

    @Override // defpackage.azd
    public final Object b(int i) {
        Object obj = this.c;
        if (obj != null && i == 0) {
            return obj;
        }
        Object obj2 = this.h;
        if (obj2 != null && i == B()) {
            return obj2;
        }
        Object obj3 = this.d;
        if (obj3 != null && i == f() + e()) {
            return obj3;
        }
        Object obj4 = this.i;
        return (obj4 == null || i != (f() + e()) + (u() ? 1 : 0)) ? this.b.get(i - f()) : obj4;
    }

    public final int e() {
        return this.b.size();
    }

    public final int f() {
        if (x() && w()) {
            return 2;
        }
        return (x() || w()) ? 1 : 0;
    }

    public final int g() {
        if (w()) {
            return !x() ? 0 : 1;
        }
        return -1;
    }

    public final int h(Object obj) {
        obj.getClass();
        if (agvy.c(obj, this.h) || agvy.c(obj, this.c) || agvy.c(obj, this.i)) {
            return -1;
        }
        return agvy.c(obj, this.d) ? this.b.size() : this.b.indexOf(obj);
    }

    public final int i(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return 0;
            }
            obj2 = null;
        }
        if (obj == null || obj2 != null) {
            return !agvy.c(obj, obj2) ? 2 : 3;
        }
        return 1;
    }

    public final Object j(int i) {
        return this.b.get(i);
    }

    public final void k(Object obj) {
        obj.getClass();
        if (this.a) {
            if (!u() && e() > 1) {
                Object objQ = agqq.q(this.b);
                if (objQ instanceof uua) {
                    ((uua) objQ).p(ayj.class, null);
                    o();
                }
            } else if (y() && (this.d instanceof uua)) {
                D();
            }
            if (obj instanceof uua) {
                if (y()) {
                    if (v()) {
                        z((uua) obj);
                    }
                } else if (!u()) {
                    A((uua) obj);
                }
            }
        }
        this.b.add(obj);
        this.e.d((f() + e()) - 1, 1);
    }

    public final void l() {
        int iE = e();
        if (iE > 0) {
            this.b.clear();
            this.e.e(f(), iE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r6, java.lang.Object r7) {
        /*
            r5 = this;
            r7.getClass()
            boolean r0 = r5.a
            r1 = 1
            if (r0 == 0) goto La9
            int r0 = r5.e()
            r2 = 0
            if (r0 <= 0) goto L5a
            if (r6 != 0) goto L5a
            boolean r6 = r5.v()
            r3 = 0
            if (r6 != 0) goto L1d
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r6 = r3
            goto L5a
        L1d:
            java.lang.Object r6 = r5.j(r3)
            boolean r4 = r6 instanceof defpackage.uua
            if (r4 == 0) goto L58
            boolean r4 = r5.u()
            if (r4 != 0) goto L3f
            if (r0 != r1) goto L3f
            uua r6 = (defpackage.uua) r6
            r5.A(r6)
            java.lang.Class<uuh> r0 = defpackage.uuh.class
            r6.p(r0, r2)
            int r6 = r5.f()
            r5.n(r6)
            goto L58
        L3f:
            boolean r0 = r5.v()
            if (r0 == 0) goto L58
            uua r6 = (defpackage.uua) r6
            java.lang.Class<ayj> r0 = defpackage.ayj.class
            r6.p(r0, r2)
            java.lang.Class<uuh> r0 = defpackage.uuh.class
            r6.p(r0, r2)
            int r6 = r5.f()
            r5.n(r6)
        L58:
            r6 = r3
            goto L84
        L5a:
            if (r0 <= r1) goto L79
            int r3 = r0 + (-1)
            if (r6 <= r3) goto L79
            java.lang.Object r3 = r5.d
            if (r3 != 0) goto L79
            java.util.List r0 = r5.b
            java.lang.Object r0 = defpackage.agqq.q(r0)
            boolean r3 = r0 instanceof defpackage.uua
            if (r3 == 0) goto L84
            uua r0 = (defpackage.uua) r0
            java.lang.Class<ayj> r3 = defpackage.ayj.class
            r0.p(r3, r2)
            r5.o()
            goto L84
        L79:
            if (r0 != 0) goto L84
            java.lang.Object r0 = r5.d
            boolean r0 = r0 instanceof defpackage.uua
            if (r0 == 0) goto L84
            r5.D()
        L84:
            boolean r0 = r7 instanceof defpackage.uua
            if (r0 == 0) goto La9
            if (r6 != 0) goto L97
            boolean r0 = r5.v()
            if (r0 == 0) goto La9
            r0 = r7
            uua r0 = (defpackage.uua) r0
            r5.z(r0)
            goto La9
        L97:
            boolean r0 = r5.u()
            if (r0 != 0) goto La9
            int r0 = r5.e()
            if (r6 < r0) goto La9
            r0 = r7
            uua r0 = (defpackage.uua) r0
            r5.A(r0)
        La9:
            java.util.List r0 = r5.b
            r0.add(r6, r7)
            int r7 = r5.f()
            int r6 = r6 + r7
            azb r7 = r5.e
            r7.d(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvc.m(int, java.lang.Object):void");
    }

    public final void n(int i) {
        this.e.c(i, 1, "PAYLOAD_UPDATE_ITEM_FACETS");
    }

    public final void o() {
        n(f() + (e() - 1));
    }

    public final void p(int i, int i2) {
        if (i == 0) {
            this.e.d(i2, 1);
        } else if (i == 1) {
            this.e.e(i2, 1);
        } else {
            if (i != 2) {
                return;
            }
            this.e.f(i2);
        }
    }

    public final void q(Object obj) {
        int i = i(this.i, obj);
        this.i = obj;
        p(i, f() + e() + (u() ? 1 : 0));
    }

    public final void r(Object obj) {
        int i = i(this.h, obj);
        if (F()) {
            this.h = obj;
        } else {
            boolean zV = v();
            this.h = obj;
            E(zV);
        }
        p(i, B());
    }

    public final void s(Object obj) {
        int i = i(this.c, obj);
        if (F()) {
            this.c = obj;
        } else {
            boolean zV = v();
            this.c = obj;
            E(zV);
        }
        p(i, 0);
    }

    public final boolean t() {
        return this.i != null;
    }

    public final boolean u() {
        return this.d != null;
    }

    public final boolean v() {
        return x() || w();
    }

    public final boolean w() {
        return this.h != null;
    }

    public final boolean x() {
        return this.c != null;
    }

    public final boolean y() {
        return this.b.isEmpty();
    }

    public final void z(uua uuaVar) {
        Context context = this.g;
        Object objC = c(uuaVar);
        if (context == null || !(objC instanceof huy)) {
            return;
        }
        huy huyVar = (huy) objC;
        uuaVar.p(ayj.class, huyVar.n(context));
        uuaVar.p(uuh.class, huyVar.D(context));
    }
}
