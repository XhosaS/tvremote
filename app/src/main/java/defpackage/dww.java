package defpackage;

import android.util.SparseArray;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dww implements dtn {
    public dtu A;
    public long H;
    public CharSequence a;
    public CharSequence b;
    public Object c;
    public SparseArray d;
    public ViewOutlineProvider g;
    public boolean h;
    public dtu q;
    public dtu r;
    public dtu s;
    public dtu t;
    public dtu u;
    public dtu v;
    public dtu w;
    public dtu x;
    public String y;
    public dtu z;
    public int e = -16777216;
    public int f = -16777216;
    public boolean i = true;
    public boolean j = true;
    public float k = 1.0f;
    public float l = 1.0f;
    public float m = 1.0f;
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = 0.0f;
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;

    public final void A(float f) {
        this.l = f;
        this.H |= 524288;
    }

    public final void B(dtu dtuVar) {
        this.H |= 32;
        this.w = dtuVar;
    }

    public final void C(float f) {
        this.o = f;
        this.H |= -2147483648L;
    }

    public final void D(float f) {
        this.p = f;
        this.H |= -2147483648L;
    }

    public final void E(Object obj) {
        this.H |= 2;
        this.c = obj;
    }

    public final void F(SparseArray sparseArray) {
        this.H |= 4;
        this.d = sparseArray;
    }

    public final boolean G() {
        return (this.q == null && this.s == null && this.t == null && this.w == null && this.x == null) ? false : true;
    }

    public final boolean H() {
        return (this.H & 1048576) != 0;
    }

    public final boolean I() {
        return (this.H & 8388608) != 0;
    }

    public final boolean J() {
        return (this.H & 2097152) != 0;
    }

    public final boolean K() {
        return (this.H & 33554432) != 0;
    }

    public final boolean L() {
        return (this.H & 67108864) != 0;
    }

    public final boolean M() {
        return (this.H & 524288) != 0;
    }

    public final boolean N() {
        return (this.H & 524288) != 0;
    }

    public final boolean O() {
        return (this.H & (-2147483648L)) != 0;
    }

    public final boolean P() {
        return (this.H & (-2147483648L)) != 0;
    }

    public final boolean Q() {
        return (this.z == null && this.A == null && this.y == null) ? false : true;
    }

    @Override // defpackage.dtn
    public final /* synthetic */ boolean a(Object obj) {
        return dwx.a(this, (dww) obj);
    }

    public final float b() {
        float f = this.k;
        if (f == this.l) {
            return f;
        }
        return 1.0f;
    }

    public final void c(dww dwwVar) {
        if ((this.H & 8) != 0) {
            dwwVar.h(this.q);
        }
        if ((this.H & 16) != 0) {
            dwwVar.t(this.s);
        }
        if ((this.H & 1073741824) != 0) {
            dwwVar.m(this.t);
        }
        if ((this.H & 4294967296L) != 0) {
            dwwVar.r(this.u);
        }
        if ((this.H & 8589934592L) != 0) {
            dwwVar.s(this.v);
        }
        if ((this.H & 131072) != 0) {
            dwwVar.p(this.r);
        }
        if ((this.H & 32) != 0) {
            dwwVar.B(this.w);
        }
        if ((this.H & 536870912) != 0) {
            dwwVar.n(this.x);
        }
        if ((this.H & 262144) != 0) {
            dwwVar.H |= 262144;
        }
        if ((this.H & 4194304) != 0) {
            dwwVar.f(this.y);
        }
        if ((this.H & 16777216) != 0) {
            dwwVar.H |= 16777216;
        }
        if ((this.H & 64) != 0) {
            dwwVar.H |= 64;
        }
        if ((this.H & 128) != 0) {
            dwwVar.H |= 128;
        }
        if ((this.H & 256) != 0) {
            dwwVar.v(this.z);
        }
        if ((this.H & 512) != 0) {
            dwwVar.H |= 512;
        }
        if ((this.H & 1024) != 0) {
            dwwVar.H |= 1024;
        }
        if ((this.H & 2048) != 0) {
            dwwVar.x(this.A);
        }
        if ((this.H & 4096) != 0) {
            dwwVar.H |= 4096;
        }
        if ((this.H & 8192) != 0) {
            dwwVar.H |= 8192;
        }
        if ((this.H & 1) != 0) {
            dwwVar.l(this.a);
        }
        if ((this.H & 17179869184L) != 0) {
            dwwVar.d(this.b);
        }
        if ((this.H & 16384) != 0) {
            dwwVar.H |= 16384;
        }
        if ((this.H & 134217728) != 0) {
            int i = this.e;
            dwwVar.H = 134217728 | dwwVar.H;
            dwwVar.e = i;
        }
        if ((this.H & 268435456) != 0) {
            int i2 = this.f;
            dwwVar.H = 268435456 | dwwVar.H;
            dwwVar.f = i2;
        }
        if ((this.H & 32768) != 0) {
            dwwVar.w(this.g);
        }
        if ((this.H & 65536) != 0) {
            dwwVar.k(this.h);
        }
        dwwVar.i = this.i;
        if ((this.H & 8388608) != 0) {
            dwwVar.j(this.j);
        }
        Object obj = this.c;
        if (obj != null) {
            dwwVar.E(obj);
        }
        SparseArray sparseArray = this.d;
        if (sparseArray != null) {
            dwwVar.F(sparseArray);
        }
        int i3 = this.B;
        if (i3 != 0) {
            dwwVar.q(i3 == 1);
        }
        int i4 = this.C;
        if (i4 != 0) {
            dwwVar.i(i4 == 1);
        }
        int i5 = this.D;
        if (i5 != 0) {
            dwwVar.u(i5 == 1);
        }
        int i6 = this.E;
        if (i6 != 0) {
            dwwVar.o(i6 == 1);
        }
        int i7 = this.F;
        if (i7 != 0) {
            if (i7 == 1) {
                dwwVar.F = 1;
            } else {
                dwwVar.F = 2;
            }
        }
        int i8 = this.G;
        if (i8 != 0) {
            dwwVar.e(i8 == 1);
        }
        if ((this.H & 524288) != 0) {
            dwwVar.z(this.k);
            dwwVar.A(this.l);
        }
        if ((this.H & 1048576) != 0) {
            dwwVar.g(this.m);
        }
        if ((this.H & 2097152) != 0) {
            dwwVar.y(this.n);
        }
        if ((this.H & 33554432) != 0) {
            dwwVar.H |= 33554432;
        }
        if ((this.H & 67108864) != 0) {
            dwwVar.H |= 67108864;
        }
        if ((this.H & (-2147483648L)) != 0) {
            dwwVar.C(this.o);
        }
        if ((this.H & (-2147483648L)) != 0) {
            dwwVar.D(this.p);
        }
    }

    public final void d(CharSequence charSequence) {
        this.H |= 17179869184L;
        this.b = charSequence;
    }

    public final void e(boolean z) {
        this.G = true != z ? 2 : 1;
    }

    public final void f(String str) {
        this.H |= 4194304;
        this.y = str;
    }

    public final void g(float f) {
        this.m = f;
        long j = this.H;
        this.H = f == 1.0f ? j & (-1048577) : j | 1048576;
    }

    public final void h(dtu dtuVar) {
        this.H |= 8;
        this.q = dtuVar;
    }

    public final void i(boolean z) {
        this.C = true != z ? 2 : 1;
    }

    public final void j(boolean z) {
        this.H |= 8388608;
        this.j = z;
    }

    public final void k(boolean z) {
        this.H |= 65536;
        this.h = z;
    }

    public final void l(CharSequence charSequence) {
        this.H |= 1;
        this.a = charSequence;
    }

    public final void m(dtu dtuVar) {
        this.H |= 1073741824;
        this.t = dtuVar;
    }

    public final void n(dtu dtuVar) {
        this.H |= 536870912;
        this.x = dtuVar;
    }

    public final void o(boolean z) {
        this.E = true != z ? 2 : 1;
    }

    public final void p(dtu dtuVar) {
        this.H |= 131072;
        this.r = dtuVar;
    }

    public final void q(boolean z) {
        this.B = true != z ? 2 : 1;
    }

    public final void r(dtu dtuVar) {
        this.H |= 4294967296L;
        this.u = dtuVar;
    }

    public final void s(dtu dtuVar) {
        this.H |= 8589934592L;
        this.v = dtuVar;
    }

    public final void t(dtu dtuVar) {
        this.H |= 16;
        this.s = dtuVar;
    }

    public final void u(boolean z) {
        this.D = true != z ? 2 : 1;
    }

    public final void v(dtu dtuVar) {
        this.H |= 256;
        this.z = dtuVar;
    }

    public final void w(ViewOutlineProvider viewOutlineProvider) {
        this.H |= 32768;
        this.g = viewOutlineProvider;
    }

    public final void x(dtu dtuVar) {
        this.H |= 2048;
        this.A = dtuVar;
    }

    public final void y(float f) {
        this.n = f;
        long j = this.H;
        this.H = f == 0.0f ? j & (-2097153) : j | 2097152;
    }

    public final void z(float f) {
        this.k = f;
        this.H |= 524288;
    }
}
