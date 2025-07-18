package defpackage;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ic extends dwt {
    public rld A;
    private eux B;
    private eux C;
    public Executor a;
    public hr b;
    public DialogInterface.OnClickListener c;
    public DialogInterface.OnClickListener d;
    public CharSequence e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public dvv o;
    public dvv p;
    public dvv q;
    public dvv r;
    public dvv s;
    public dvv t;
    public dvv v;
    public dvv x;
    public dvv y;
    public hq z;
    public int f = 0;
    public boolean u = true;
    public int w = 0;

    public static void n(dvv dvvVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dvvVar.k(obj);
        } else {
            dvvVar.h(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    final CharSequence a() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence;
        }
        rld rldVar = this.A;
        if (rldVar == null) {
            return null;
        }
        ?? r0 = rldVar.c;
        return r0 != 0 ? r0 : "";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    final CharSequence b() {
        rld rldVar = this.A;
        if (rldVar != null) {
            return rldVar.d;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    final CharSequence c() {
        rld rldVar = this.A;
        if (rldVar != null) {
            return rldVar.b;
        }
        return null;
    }

    public final Executor e() {
        Executor executor = this.a;
        return executor != null ? executor : new ia(0);
    }

    final void f(ig igVar) {
        if (this.p == null) {
            this.p = new dvv();
        }
        n(this.p, igVar);
    }

    final void g(boolean z) {
        if (this.r == null) {
            this.r = new dvv();
        }
        n(this.r, Boolean.valueOf(z));
    }

    final void h(boolean z) {
        if (this.v == null) {
            this.v = new dvv();
        }
        n(this.v, Boolean.valueOf(z));
    }

    public final void i(CharSequence charSequence) {
        if (this.y == null) {
            this.y = new dvv();
        }
        n(this.y, charSequence);
    }

    public final void j(int i) {
        if (this.x == null) {
            this.x = new dvv();
        }
        n(this.x, Integer.valueOf(i));
    }

    final void k(boolean z) {
        if (this.t == null) {
            this.t = new dvv();
        }
        n(this.t, Boolean.valueOf(z));
    }

    public final void l(boolean z) {
        if (this.s == null) {
            this.s = new dvv();
        }
        n(this.s, Boolean.valueOf(z));
    }

    public final void m() {
        rld rldVar = this.A;
        this.n = rldVar == null ? 0 : rldVar.a;
    }

    public final hq o() {
        if (this.z == null) {
            this.z = new hq();
        }
        return this.z;
    }

    final eux p() {
        if (this.B == null) {
            this.B = new eux((char[]) null);
        }
        return this.B;
    }

    final eux q() {
        if (this.C == null) {
            this.C = new eux(new hz(this));
        }
        return this.C;
    }

    final void r(zuw zuwVar) {
        if (this.o == null) {
            this.o = new dvv();
        }
        n(this.o, zuwVar);
    }
}
