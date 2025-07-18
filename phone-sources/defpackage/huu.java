package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class huu implements Cloneable {
    public int d;
    public boolean i;
    public Resources.Theme n;
    public boolean o;
    public boolean q;
    private int r;
    private Drawable s;
    private int t;
    private Drawable u;
    private Drawable v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;
    public float a = 1.0f;
    public hng b = hng.d;
    public hjw c = hjw.NORMAL;
    public boolean e = true;
    public int f = -1;
    public int g = -1;
    public hlg h = hvz.b;
    public boolean j = true;
    public hll k = new hll();
    public Map l = new hwd();
    public Class m = Object.class;
    public boolean p = true;

    private static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    final huu A(hlp hlpVar, boolean z) {
        if (this.o) {
            return i().A(hlpVar, z);
        }
        hsa hsaVar = new hsa(hlpVar, z);
        C(Bitmap.class, hlpVar, z);
        C(Drawable.class, hsaVar, z);
        C(BitmapDrawable.class, hsaVar, z);
        C(hti.class, new htl(hlpVar), z);
        J();
        return this;
    }

    final huu B(hru hruVar, hlp hlpVar) {
        if (this.o) {
            return i().B(hruVar, hlpVar);
        }
        G(hruVar);
        return z(hlpVar);
    }

    final huu C(Class cls, hlp hlpVar, boolean z) {
        if (this.o) {
            return i().C(cls, hlpVar, z);
        }
        hju.p(cls);
        hju.p(hlpVar);
        this.l.put(cls, hlpVar);
        int i = this.r;
        this.j = true;
        this.r = 67584 | i;
        this.p = false;
        if (z) {
            this.r = i | 198656;
            this.i = true;
        }
        J();
        return this;
    }

    public final boolean D(huu huuVar) {
        if (Float.compare(huuVar.a, this.a) != 0) {
            return false;
        }
        int i = huuVar.t;
        Drawable drawable = huuVar.s;
        char[] cArr = hwp.a;
        if (!a.au(null, null) || this.d != huuVar.d) {
            return false;
        }
        Drawable drawable2 = huuVar.u;
        if (!a.au(null, null)) {
            return false;
        }
        int i2 = huuVar.w;
        Drawable drawable3 = huuVar.v;
        if (!a.au(null, null) || this.e != huuVar.e || this.f != huuVar.f || this.g != huuVar.g || this.i != huuVar.i || this.j != huuVar.j) {
            return false;
        }
        boolean z = huuVar.y;
        boolean z2 = huuVar.z;
        return this.b.equals(huuVar.b) && this.c == huuVar.c && this.k.equals(huuVar.k) && this.l.equals(huuVar.l) && this.m.equals(huuVar.m) && a.au(this.h, huuVar.h) && a.au(this.n, huuVar.n);
    }

    public final boolean E(int i) {
        return a(this.r, i);
    }

    public final boolean F() {
        return hwp.l(this.g, this.f);
    }

    public final void G(hru hruVar) {
        hlk hlkVar = hru.g;
        hju.p(hruVar);
        w(hlkVar, hruVar);
    }

    public final huu H() {
        if (this.o) {
            return i().H();
        }
        this.q = true;
        this.r |= 1048576;
        J();
        return this;
    }

    public final void I() {
        this.x = true;
    }

    protected final void J() {
        if (this.x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final huu K() {
        if (this.o) {
            return i().K();
        }
        this.e = false;
        this.r |= 256;
        J();
        return this;
    }

    public final void L() {
        if (this.x && !this.o) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.o = true;
        I();
    }

    public boolean equals(Object obj) {
        if (obj instanceof huu) {
            return D((huu) obj);
        }
        return false;
    }

    public huu h(huu huuVar) {
        if (this.o) {
            return i().h(huuVar);
        }
        int i = huuVar.r;
        if (a(i, 2)) {
            this.a = huuVar.a;
        }
        if (a(i, 262144)) {
            boolean z = huuVar.y;
            this.y = false;
        }
        if (a(i, 1048576)) {
            this.q = huuVar.q;
        }
        if (a(i, 4)) {
            this.b = huuVar.b;
        }
        if (a(i, 8)) {
            this.c = huuVar.c;
        }
        if (a(i, 16)) {
            Drawable drawable = huuVar.s;
            this.s = null;
            this.t = 0;
            this.r &= -33;
        }
        if (a(huuVar.r, 32)) {
            int i2 = huuVar.t;
            this.t = 0;
            this.s = null;
            this.r &= -17;
        }
        if (a(huuVar.r, 64)) {
            Drawable drawable2 = huuVar.u;
            this.u = null;
            this.d = 0;
            this.r &= -129;
        }
        if (a(huuVar.r, 128)) {
            this.d = huuVar.d;
            this.u = null;
            this.r &= -65;
        }
        int i3 = huuVar.r;
        if (a(i3, 256)) {
            this.e = huuVar.e;
        }
        if (a(i3, 512)) {
            this.g = huuVar.g;
            this.f = huuVar.f;
        }
        if (a(i3, 1024)) {
            this.h = huuVar.h;
        }
        if (a(i3, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.m = huuVar.m;
        }
        if (a(i3, 8192)) {
            Drawable drawable3 = huuVar.v;
            this.v = null;
            this.w = 0;
            this.r &= -16385;
        }
        if (a(huuVar.r, 16384)) {
            int i4 = huuVar.w;
            this.w = 0;
            this.v = null;
            this.r &= -8193;
        }
        int i5 = huuVar.r;
        if (a(i5, 32768)) {
            this.n = huuVar.n;
        }
        if (a(i5, 65536)) {
            this.j = huuVar.j;
        }
        if (a(i5, 131072)) {
            this.i = huuVar.i;
        }
        if (a(i5, RecyclerView.ItemAnimator.FLAG_MOVED)) {
            this.l.putAll(huuVar.l);
            this.p = huuVar.p;
        }
        if (a(huuVar.r, 524288)) {
            boolean z2 = huuVar.z;
            this.z = false;
        }
        if (!this.j) {
            this.l.clear();
            int i6 = this.r;
            this.i = false;
            this.r = i6 & (-133121);
            this.p = true;
        }
        this.r |= huuVar.r;
        this.k.c(huuVar.k);
        J();
        return this;
    }

    public int hashCode() {
        float f = this.a;
        char[] cArr = hwp.a;
        return hwp.d(this.n, hwp.d(this.h, hwp.d(this.m, hwp.d(this.l, hwp.d(this.k, hwp.d(this.c, hwp.d(this.b, hwp.c(0, hwp.c(0, hwp.c(this.j ? 1 : 0, hwp.c(this.i ? 1 : 0, hwp.c(this.g, hwp.c(this.f, hwp.c(this.e ? 1 : 0, hwp.d(null, hwp.c(0, hwp.d(null, hwp.c(this.d, hwp.d(null, hwp.c(0, hwp.c(Float.floatToIntBits(f), 17)))))))))))))))))))));
    }

    @Override // 
    public huu i() {
        try {
            huu huuVar = (huu) super.clone();
            hll hllVar = new hll();
            huuVar.k = hllVar;
            hllVar.c(this.k);
            hwd hwdVar = new hwd();
            huuVar.l = hwdVar;
            hwdVar.putAll(this.l);
            huuVar.x = false;
            huuVar.o = false;
            return huuVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final huu m() {
        return B(hru.d, new hrh());
    }

    public final huu n(Class cls) {
        if (this.o) {
            return i().n(cls);
        }
        hju.p(cls);
        this.m = cls;
        this.r |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        J();
        return this;
    }

    public final huu o(hng hngVar) {
        if (this.o) {
            return i().o(hngVar);
        }
        hju.p(hngVar);
        this.b = hngVar;
        this.r |= 4;
        J();
        return this;
    }

    public final huu p() {
        return q(hru.c, new hri());
    }

    public final huu q(hru hruVar, hlp hlpVar) {
        huu huuVarR = r(hruVar, hlpVar);
        huuVarR.p = true;
        return huuVarR;
    }

    public final huu r(hru hruVar, hlp hlpVar) {
        if (this.o) {
            return i().r(hruVar, hlpVar);
        }
        G(hruVar);
        return A(hlpVar, false);
    }

    public final huu s(int i, int i2) {
        if (this.o) {
            return i().s(i, i2);
        }
        this.g = i;
        this.f = i2;
        this.r |= 512;
        J();
        return this;
    }

    public final huu t(int i) {
        if (this.o) {
            return i().t(i);
        }
        this.d = i;
        int i2 = this.r | 128;
        this.u = null;
        this.r = i2 & (-65);
        J();
        return this;
    }

    public final huu u(hjw hjwVar) {
        if (this.o) {
            return i().u(hjwVar);
        }
        hju.p(hjwVar);
        this.c = hjwVar;
        this.r |= 8;
        J();
        return this;
    }

    final huu v(hlk hlkVar) {
        if (this.o) {
            return i().v(hlkVar);
        }
        this.k.b.remove(hlkVar);
        J();
        return this;
    }

    public final huu w(hlk hlkVar, Object obj) {
        if (this.o) {
            return i().w(hlkVar, obj);
        }
        hju.p(hlkVar);
        hju.p(obj);
        this.k.d(hlkVar, obj);
        J();
        return this;
    }

    public final huu x(hlg hlgVar) {
        if (this.o) {
            return i().x(hlgVar);
        }
        hju.p(hlgVar);
        this.h = hlgVar;
        this.r |= 1024;
        J();
        return this;
    }

    public final huu y(Resources.Theme theme) {
        if (this.o) {
            return i().y(theme);
        }
        this.n = theme;
        if (theme != null) {
            this.r |= 32768;
            return w(hte.a, theme);
        }
        this.r &= -32769;
        return v(hte.a);
    }

    public final huu z(hlp hlpVar) {
        return A(hlpVar, true);
    }
}
