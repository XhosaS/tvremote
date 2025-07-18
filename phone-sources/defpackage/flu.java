package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flu {
    public final fel a;
    public final boolean b;
    public final boolean c;
    public int g;
    public int h;
    public long i;
    public boolean j;
    public long k;
    public boolean n;
    public long o;
    public long p;
    public boolean q;
    public boolean r;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public flt l = new flt();
    public flt m = new flt();
    public byte[] f = new byte[128];
    public final iex s = new iex(this.f, 0, 0);

    public flu(fel felVar, boolean z, boolean z2) {
        this.a = felVar;
        this.b = z;
        this.c = z2;
        b();
    }

    public final void a(eed eedVar) {
        this.d.append(eedVar.d, eedVar);
    }

    public final void b() {
        this.j = false;
        this.n = false;
        this.m.a();
    }

    public final void c(rzg rzgVar) {
        this.e.append(rzgVar.c, rzgVar);
    }
}
