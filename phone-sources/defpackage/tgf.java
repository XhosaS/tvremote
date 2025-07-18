package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgf extends tgi {
    public static final cuj a = new cuk(10);
    public int b;
    public int c;
    public final List d = new ArrayList();

    public tgf() {
        g();
    }

    @Override // defpackage.tgi
    public final int a(int i) {
        return ((tgg) this.d.get(i - this.f)).p;
    }

    @Override // defpackage.tgj
    protected final int b(boolean z, int i) {
        int i2 = Integer.MIN_VALUE;
        if (z) {
            List list = this.d;
            int size = list.size();
            int i3 = Integer.MIN_VALUE;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                tgg tggVar = (tgg) list.get(i6);
                if (tggVar.k == 0) {
                    int i7 = -tggVar.n;
                    tggVar.p = i7;
                    if (i7 < i5) {
                        i5 = i7;
                    }
                    int i8 = i7 + tggVar.m;
                    if (i8 > i4) {
                        i4 = i8;
                    }
                } else {
                    int i9 = tggVar.m;
                    if (i9 > i3) {
                        i3 = i9;
                    }
                }
            }
            if (i3 != Integer.MIN_VALUE) {
                int i10 = i4 - i5;
                if (i10 < i3) {
                    i5 = i10 == 0 ? 0 : (int) (i3 * (i5 / i10));
                    i4 = i5 + i3;
                }
                for (int i11 = 0; i11 < size; i11++) {
                    tgg tggVar2 = (tgg) list.get(i11);
                    int i12 = tggVar2.k;
                    if (i12 == 1) {
                        tggVar2.p = i4 - tggVar2.m;
                    } else if (i12 == 2) {
                        tggVar2.p = i5;
                    }
                }
            }
        }
        int i13 = this.f;
        List list2 = this.d;
        int size2 = list2.size() + i13;
        int size3 = list2.size();
        if (size3 == 0) {
            return 0;
        }
        int i14 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (int i15 = 0; i15 < size3; i15++) {
            tgg tggVar3 = (tgg) list2.get(i15);
            int i16 = tggVar3.p;
            int i17 = i16 - (i13 == 0 ? tggVar3.f : tggVar3.e);
            if (i17 < i14) {
                i14 = i17;
            }
            int i18 = i16 + tggVar3.m + (size2 == i ? tggVar3.j : tggVar3.i);
            if (i18 > i2) {
                i2 = i18;
            }
        }
        if (i14 != 0) {
            for (int i19 = 0; i19 < size3; i19++) {
                ((tgg) list2.get(i19)).p -= i14;
            }
            i2 -= i14;
        }
        return Math.max(0, i2);
    }

    @Override // defpackage.tgj
    public final int c() {
        return this.f + this.d.size();
    }

    public final void d(tgg tggVar) {
        if (!tggVar.o) {
            throw new IllegalArgumentException("Item not measured");
        }
        this.c += tggVar.l + tggVar.g + tggVar.h;
        this.d.add(tggVar);
        l();
    }

    @Override // defpackage.tgi
    public final void e() {
        List list = this.d;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((tgg) list.get(size)).o = false;
            }
        }
    }

    @Override // defpackage.tgi
    public final void f() {
        g();
        a.b(this);
    }

    @Override // defpackage.tgj
    protected final void g() {
        super.g();
        this.b = 0;
        this.c = 0;
        List list = this.d;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                list.clear();
                return;
            }
            ((tgg) list.get(size)).b();
        }
    }

    @Override // defpackage.tgj
    protected final boolean h(int i) {
        List list = this.d;
        int size = list.size();
        int i2 = this.f;
        if (i2 + size <= i) {
            return false;
        }
        int i3 = i - i2;
        while (true) {
            size--;
            if (size < i3) {
                return true;
            }
            tgg tggVar = (tgg) list.remove(size);
            this.c -= (tggVar.l + tggVar.g) + tggVar.h;
            tggVar.b();
        }
    }

    @Override // defpackage.tgi
    public final void i(StringBuilder sb) {
        sb.append('@');
        sb.append(this.f);
        sb.append('-');
        sb.append(c());
    }
}
