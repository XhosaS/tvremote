package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bee {
    public bed a;
    public boolean b;
    public int d;
    public int g;
    private final bas i;
    private int j;
    public final ira h = new ira((char[]) null);
    public boolean c = true;
    private final ArrayList k = new ArrayList();
    private int l = -1;
    public int e = -1;
    public int f = -1;

    public bee(bas basVar, bed bedVar) {
        this.i = basVar;
        this.a = bedVar;
    }

    public final bdf a() {
        return this.i.p;
    }

    public final void b() {
        if (this.b) {
            j(false);
            j(false);
            this.a.cC();
            this.b = false;
        }
    }

    public final void c(bed bedVar, bhr bhrVar) {
        bed bedVar2 = this.a;
        if (bedVar.cE()) {
            bfu bfuVar = bedVar2.a;
            bfuVar.cC(bei.a);
            bft.b(bfuVar, 0, bedVar, 1, bhrVar);
        }
    }

    public final void d(Object obj) {
        i();
        this.k.add(obj);
    }

    public final void e(int i) {
        this.d += i - a().f;
    }

    public final void f() {
        i();
        ArrayList arrayList = this.k;
        if (bdx.b(arrayList)) {
            bdx.a(arrayList);
        } else {
            this.j++;
        }
    }

    public final void g() {
        int i = this.j;
        if (i > 0) {
            bfu bfuVar = this.a.a;
            bfuVar.cC(bfn.a);
            bfuVar.c[bfuVar.d - bfuVar.a[bfuVar.b - 1].b] = i;
            this.j = 0;
        }
        ArrayList arrayList = this.k;
        if (bdx.b(arrayList)) {
            bed bedVar = this.a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            if (size != 0) {
                bfu bfuVar2 = bedVar.a;
                bfuVar2.cC(ben.a);
                bft.a(bfuVar2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void h() {
        j(false);
        k();
    }

    public final void i() {
        int i = this.g;
        if (i > 0) {
            int i2 = this.l;
            if (i2 >= 0) {
                g();
                bfu bfuVar = this.a.a;
                bfuVar.cC(bfd.a);
                int i3 = bfuVar.d - bfuVar.a[bfuVar.b - 1].b;
                int[] iArr = bfuVar.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.l = -1;
            } else {
                int i4 = this.f;
                int i5 = this.e;
                g();
                bfu bfuVar2 = this.a.a;
                bfuVar2.cC(bey.a);
                int i6 = bfuVar2.d - bfuVar2.a[bfuVar2.b - 1].b;
                int[] iArr2 = bfuVar2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.e = -1;
                this.f = -1;
            }
            this.g = 0;
        }
    }

    public final void j(boolean z) {
        int i = z ? a().h : a().f;
        int i2 = i - this.d;
        if (i2 < 0) {
            bau.i("Tried to seek backward");
        }
        if (i2 > 0) {
            bfu bfuVar = this.a.a;
            bfuVar.cC(beg.a);
            bfuVar.c[bfuVar.d - bfuVar.a[bfuVar.b - 1].b] = i2;
            this.d = i;
        }
    }

    public final void k() {
        if (a().c > 0) {
            bdf bdfVarA = a();
            int i = bdfVarA.h;
            ira iraVar = this.h;
            if (iraVar.d(-2) != i) {
                if (!this.b && this.c) {
                    j(false);
                    this.a.a.cC(bet.a);
                    this.b = true;
                }
                if (i > 0) {
                    bac bacVarG = bdfVarA.g(i);
                    iraVar.g(i);
                    j(false);
                    bfu bfuVar = this.a.a;
                    bfuVar.cC(bes.a);
                    bft.a(bfuVar, 0, bacVarG);
                    this.b = true;
                }
            }
        }
    }

    public final void l(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                bau.i(a.cf(i, "Invalid remove index "));
            }
            if (this.l == i) {
                this.g += i2;
                return;
            }
            i();
            this.l = i;
            this.g = i2;
        }
    }

    public final void m() {
        this.a.a.cC(bfg.a);
    }
}
