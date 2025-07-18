package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcr {
    public int a;
    public bcs b;
    public bac c;
    public yjz d;
    public int e;
    public jz f;
    public ki g;

    public bcr(bcs bcsVar) {
        this.b = bcsVar;
    }

    public static final boolean p(bbh bbhVar, ki kiVar) {
        bbhVar.getClass();
        bds bdsVar = bbhVar.b;
        if (bdsVar == null) {
            bdsVar = bcz.c;
        }
        return !bdsVar.a(bbhVar.e().e, kiVar.a(bbhVar));
    }

    public final void a() {
        bcs bcsVar = this.b;
        if (bcsVar != null) {
            bcsVar.c(this, null);
        }
    }

    public final void b() {
        bcs bcsVar = this.b;
        if (bcsVar != null) {
            bcsVar.b();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void c(boolean z) {
        int i = this.a;
        this.a = z ? i | 4 : i & (-5);
    }

    public final void d(boolean z) {
        int i = this.a;
        this.a = z ? i | 8 : i & (-9);
    }

    public final void e(boolean z) {
        int i = this.a;
        this.a = z ? i | 32 : i & (-33);
    }

    public final void f(boolean z) {
        int i = this.a;
        this.a = z ? i | 1024 : i & (-1025);
    }

    public final void g(boolean z) {
        int i = this.a;
        this.a = z ? i | 512 : i & (-513);
    }

    public final void h(boolean z) {
        int i = this.a;
        this.a = z ? i | 16 : i & (-17);
    }

    public final boolean i() {
        return (this.a & 128) != 0;
    }

    public final boolean j() {
        return (this.a & 16) != 0;
    }

    public final boolean k() {
        return (this.a & 1) != 0;
    }

    public final boolean l() {
        bac bacVar;
        return (this.b == null || (bacVar = this.c) == null || !bacVar.a()) ? false : true;
    }

    public final boolean m() {
        return this.g != null;
    }

    public final void n() {
        this.a |= 1;
    }

    public final int o(Object obj) {
        bcs bcsVar = this.b;
        if (bcsVar != null) {
            return bcsVar.c(this, obj);
        }
        return 1;
    }
}
