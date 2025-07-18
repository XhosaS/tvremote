package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oth extends otk {
    public static final cuj a = new cuk(10);
    public int b;
    public int c;
    public final List d = new ArrayList();

    public oth() {
        g();
    }

    @Override // defpackage.otk
    public final int a(int i) {
        return ((oti) this.d.get(i - this.f)).p;
    }

    @Override // defpackage.otl
    protected final int b(boolean z, int i) {
        int i2 = Integer.MIN_VALUE;
        if (z) {
            List list = this.d;
            int size = list.size();
            int i3 = Integer.MIN_VALUE;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                oti otiVar = (oti) list.get(i6);
                if (otiVar.k == 0) {
                    int i7 = -otiVar.n;
                    otiVar.p = i7;
                    if (i7 < i5) {
                        i5 = i7;
                    }
                    int i8 = i7 + otiVar.m;
                    if (i8 > i4) {
                        i4 = i8;
                    }
                } else {
                    int i9 = otiVar.m;
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
                    oti otiVar2 = (oti) list.get(i11);
                    int i12 = otiVar2.k;
                    if (i12 == 1) {
                        otiVar2.p = i4 - otiVar2.m;
                    } else if (i12 == 2) {
                        otiVar2.p = i5;
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
            oti otiVar3 = (oti) list2.get(i15);
            int i16 = otiVar3.p;
            int i17 = i16 - (i13 == 0 ? otiVar3.f : otiVar3.e);
            if (i17 < i14) {
                i14 = i17;
            }
            int i18 = i16 + otiVar3.m + (size2 == i ? otiVar3.j : otiVar3.i);
            if (i18 > i2) {
                i2 = i18;
            }
        }
        if (i14 != 0) {
            for (int i19 = 0; i19 < size3; i19++) {
                ((oti) list2.get(i19)).p -= i14;
            }
            i2 -= i14;
        }
        return Math.max(0, i2);
    }

    @Override // defpackage.otl
    public final int c() {
        return this.f + this.d.size();
    }

    public final void d(oti otiVar) {
        if (!otiVar.o) {
            throw new IllegalArgumentException("Item not measured");
        }
        this.c += otiVar.l + otiVar.g + otiVar.h;
        this.d.add(otiVar);
        k();
    }

    @Override // defpackage.otk
    public final void e() {
        List list = this.d;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((oti) list.get(size)).o = false;
            }
        }
    }

    @Override // defpackage.otk
    public final void f() {
        g();
        a.b(this);
    }

    @Override // defpackage.otl
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
            ((oti) list.get(size)).b();
        }
    }

    @Override // defpackage.otl
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
            oti otiVar = (oti) list.remove(size);
            this.c -= (otiVar.l + otiVar.g) + otiVar.h;
            otiVar.b();
        }
    }
}
