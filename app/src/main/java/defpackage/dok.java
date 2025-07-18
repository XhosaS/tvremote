package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dok implements Cloneable {
    public int b;
    public Drawable f;
    public int g;
    public Drawable h;
    public int i;
    public boolean n;
    public boolean r;
    public Resources.Theme s;
    public boolean t;
    public boolean v;
    private Drawable w;
    private int x;
    private boolean y;
    private boolean z;
    public float c = 1.0f;
    public dcr d = dcr.d;
    public cyn e = cyn.NORMAL;
    public boolean j = true;
    public int k = -1;
    public int l = -1;
    public daj m = dps.b;
    private boolean a = true;
    public dan o = new dan();
    public Map p = new dpx();
    public Class q = Object.class;
    public boolean u = true;

    public static boolean G(int i, int i2) {
        return (i & i2) != 0;
    }

    final dok A(dam damVar) {
        if (this.t) {
            return o().A(damVar);
        }
        this.o.b.remove(damVar);
        M();
        return this;
    }

    public dok B(dam damVar, Object obj) {
        if (this.t) {
            return o().B(damVar, obj);
        }
        dqk.d(damVar, "Argument must not be null");
        this.o.b.put(damVar, obj);
        M();
        return this;
    }

    public dok C(daj dajVar) {
        if (this.t) {
            return o().C(dajVar);
        }
        this.m = dajVar;
        this.b |= 1024;
        M();
        return this;
    }

    public dok D(Resources.Theme theme) {
        if (this.t) {
            return o().D(theme);
        }
        this.s = theme;
        if (theme != null) {
            this.b |= 32768;
            return B(dlr.a, theme);
        }
        this.b &= -32769;
        return A(dlr.a);
    }

    public dok E(dar darVar) {
        return I(darVar);
    }

    public final boolean F(dok dokVar) {
        if (Float.compare(dokVar.c, this.c) != 0 || this.g != dokVar.g || !dqm.g(this.f, dokVar.f) || this.i != dokVar.i || !dqm.g(this.h, dokVar.h)) {
            return false;
        }
        int i = dokVar.x;
        Drawable drawable = dokVar.w;
        if (!dqm.g(null, null) || this.j != dokVar.j || this.k != dokVar.k || this.l != dokVar.l || this.n != dokVar.n || this.a != dokVar.a) {
            return false;
        }
        boolean z = dokVar.y;
        boolean z2 = dokVar.z;
        return this.d.equals(dokVar.d) && this.e == dokVar.e && this.o.equals(dokVar.o) && this.p.equals(dokVar.p) && this.q.equals(dokVar.q) && dqm.g(this.m, dokVar.m) && dqm.g(this.s, dokVar.s);
    }

    public final boolean H() {
        return dqm.k(this.l, this.k);
    }

    public final dok I(dar darVar) {
        if (this.t) {
            return o().I(darVar);
        }
        dkb dkbVar = new dkb(darVar);
        J(Bitmap.class, darVar);
        J(Drawable.class, dkbVar);
        J(BitmapDrawable.class, dkbVar);
        J(dlz.class, new dmc(darVar));
        M();
        return this;
    }

    final dok J(Class cls, dar darVar) {
        if (this.t) {
            return o().J(cls, darVar);
        }
        this.p.put(cls, darVar);
        int i = this.b;
        this.a = true;
        this.u = false;
        this.b = i | 198656;
        this.n = true;
        M();
        return this;
    }

    public dok K() {
        if (this.t) {
            return o().K();
        }
        this.v = true;
        this.b |= 1048576;
        M();
        return this;
    }

    public void L() {
        this.r = true;
    }

    protected final void M() {
        if (this.r) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public dok N() {
        if (this.t) {
            return o().N();
        }
        this.j = false;
        this.b |= 256;
        M();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dok) {
            return F((dok) obj);
        }
        return false;
    }

    public int hashCode() {
        float f = this.c;
        char[] cArr = dqm.a;
        return dqm.c(this.s, dqm.c(this.m, dqm.c(this.q, dqm.c(this.p, dqm.c(this.o, dqm.c(this.e, dqm.c(this.d, ((((((((((dqm.c(null, dqm.c(this.h, (dqm.c(this.f, ((Float.floatToIntBits(f) + 527) * 31) + this.g) * 31) + this.i) * 31) * 31) + (this.j ? 1 : 0)) * 31) + this.k) * 31) + this.l) * 31) + (this.n ? 1 : 0)) * 31) + (this.a ? 1 : 0)) * 961)))))));
    }

    public dok n(dok dokVar) {
        if (this.t) {
            return o().n(dokVar);
        }
        int i = dokVar.b;
        if (G(i, 2)) {
            this.c = dokVar.c;
        }
        if (G(i, 262144)) {
            boolean z = dokVar.y;
            this.y = false;
        }
        if (G(i, 1048576)) {
            this.v = dokVar.v;
        }
        if (G(i, 4)) {
            this.d = dokVar.d;
        }
        if (G(i, 8)) {
            this.e = dokVar.e;
        }
        if (G(i, 16)) {
            this.f = dokVar.f;
            this.g = 0;
            this.b &= -33;
        }
        if (G(dokVar.b, 32)) {
            this.g = dokVar.g;
            this.f = null;
            this.b &= -17;
        }
        if (G(dokVar.b, 64)) {
            this.h = dokVar.h;
            this.i = 0;
            this.b &= -129;
        }
        if (G(dokVar.b, 128)) {
            this.i = dokVar.i;
            this.h = null;
            this.b &= -65;
        }
        int i2 = dokVar.b;
        if (G(i2, 256)) {
            this.j = dokVar.j;
        }
        if (G(i2, 512)) {
            this.l = dokVar.l;
            this.k = dokVar.k;
        }
        if (G(i2, 1024)) {
            this.m = dokVar.m;
        }
        if (G(i2, 4096)) {
            this.q = dokVar.q;
        }
        if (G(i2, 8192)) {
            Drawable drawable = dokVar.w;
            this.w = null;
            this.x = 0;
            this.b &= -16385;
        }
        if (G(dokVar.b, 16384)) {
            int i3 = dokVar.x;
            this.x = 0;
            this.w = null;
            this.b &= -8193;
        }
        int i4 = dokVar.b;
        if (G(i4, 32768)) {
            this.s = dokVar.s;
        }
        if (G(i4, 65536)) {
            this.a = dokVar.a;
        }
        if (G(i4, 131072)) {
            this.n = dokVar.n;
        }
        if (G(i4, 2048)) {
            this.p.putAll(dokVar.p);
            this.u = dokVar.u;
        }
        if (G(dokVar.b, 524288)) {
            boolean z2 = dokVar.z;
            this.z = false;
        }
        if (!this.a) {
            this.p.clear();
            int i5 = this.b;
            this.n = false;
            this.b = i5 & (-133121);
            this.u = true;
        }
        this.b |= dokVar.b;
        this.o.c(dokVar.o);
        M();
        return this;
    }

    @Override // 
    public dok o() {
        try {
            dok dokVar = (dok) super.clone();
            dan danVar = new dan();
            dokVar.o = danVar;
            danVar.c(this.o);
            dpx dpxVar = new dpx();
            dokVar.p = dpxVar;
            dpxVar.putAll(this.p);
            dokVar.r = false;
            dokVar.t = false;
            return dokVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public dok q() {
        if (this.r && !this.t) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.t = true;
        L();
        return this;
    }

    public dok r(Class cls) {
        if (this.t) {
            return o().r(cls);
        }
        this.q = cls;
        this.b |= 4096;
        M();
        return this;
    }

    public dok s(dcr dcrVar) {
        if (this.t) {
            return o().s(dcrVar);
        }
        this.d = dcrVar;
        this.b |= 4;
        M();
        return this;
    }

    public dok t(djv djvVar) {
        dam damVar = djv.g;
        dqk.d(djvVar, "Argument must not be null");
        return B(damVar, djvVar);
    }

    public dok u(int i) {
        if (this.t) {
            return o().u(i);
        }
        this.g = i;
        int i2 = this.b | 32;
        this.f = null;
        this.b = i2 & (-17);
        M();
        return this;
    }

    public dok v(Drawable drawable) {
        if (this.t) {
            return o().v(drawable);
        }
        this.f = drawable;
        int i = this.b | 16;
        this.g = 0;
        this.b = i & (-33);
        M();
        return this;
    }

    public dok w(int i, int i2) {
        if (this.t) {
            return o().w(i, i2);
        }
        this.l = i;
        this.k = i2;
        this.b |= 512;
        M();
        return this;
    }

    public dok x(int i) {
        if (this.t) {
            return o().x(i);
        }
        this.i = i;
        int i2 = this.b | 128;
        this.h = null;
        this.b = i2 & (-65);
        M();
        return this;
    }

    public dok y(Drawable drawable) {
        if (this.t) {
            return o().y(drawable);
        }
        this.h = drawable;
        int i = this.b | 64;
        this.i = 0;
        this.b = i & (-129);
        M();
        return this;
    }

    public dok z(cyn cynVar) {
        if (this.t) {
            return o().z(cynVar);
        }
        dqk.d(cynVar, "Argument must not be null");
        this.e = cynVar;
        this.b |= 8;
        M();
        return this;
    }
}
