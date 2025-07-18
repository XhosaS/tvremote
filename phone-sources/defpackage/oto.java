package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oto extends otl {
    private static final cuj b = new cuk(15);
    public final List a = new ArrayList();

    private oto() {
        g();
    }

    public static oto e(int i) {
        oto otoVar = (oto) b.a();
        if (otoVar == null) {
            otoVar = new oto();
        }
        otoVar.f = i;
        return otoVar;
    }

    public final int a(int i) {
        List list = this.a;
        int iA = 0;
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            otk otkVar = (otk) list.get(size);
            if (z) {
                iA += otkVar.h;
            } else if (otkVar.f <= i) {
                iA = otkVar.a(i);
                z = true;
            }
        }
        return iA;
    }

    @Override // defpackage.otl
    protected final int b(boolean z, int i) {
        List list = this.a;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((otk) list.get(i3)).i(i);
        }
        return i2;
    }

    @Override // defpackage.otl
    public final int c() {
        List list = this.a;
        return list.isEmpty() ? this.f : ((otk) list.get(list.size() - 1)).c();
    }

    public final otk d() {
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        return (otk) list.get(list.size() - 1);
    }

    public final void f(otk otkVar) {
        this.a.add(otkVar);
        k();
    }

    @Override // defpackage.otl
    protected final void g() {
        super.g();
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                list.clear();
                return;
            }
            ((otk) list.get(size)).f();
        }
    }

    @Override // defpackage.otl
    protected final boolean h(int i) {
        List list = this.a;
        int size = list.size();
        if (size == 0) {
            return false;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 >= 0) {
            otk otkVar = (otk) list.get(i3);
            int iJ = otkVar.j(i);
            if (iJ == 0) {
                return i3 != i2;
            }
            if (iJ == 1) {
                return true;
            }
            otkVar.f();
            list.remove(i3);
            i3--;
        }
        throw new Error("Should not reach here");
    }

    @Override // defpackage.otl
    public final void l(int i) {
        super.l(i);
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((otk) list.get(size)).l(i);
            }
        }
    }

    public final void m() {
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((otk) list.get(size)).e();
            }
        }
    }

    public final void n() {
        g();
        b.b(this);
    }
}
