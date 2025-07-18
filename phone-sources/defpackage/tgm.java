package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgm extends tgj {
    private static final cuj b = new cuk(15);
    public final List a = new ArrayList();

    private tgm() {
        g();
    }

    public static tgm e(int i) {
        tgm tgmVar = (tgm) b.a();
        if (tgmVar == null) {
            tgmVar = new tgm();
        }
        tgmVar.f = i;
        return tgmVar;
    }

    public final int a(int i) {
        List list = this.a;
        int iA = 0;
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            tgi tgiVar = (tgi) list.get(size);
            if (z) {
                iA += tgiVar.h;
            } else if (tgiVar.f <= i) {
                iA = tgiVar.a(i);
                z = true;
            }
        }
        return iA;
    }

    @Override // defpackage.tgj
    protected final int b(boolean z, int i) {
        List list = this.a;
        int size = list.size();
        int iJ = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iJ += ((tgi) list.get(i2)).j(i);
        }
        return iJ;
    }

    @Override // defpackage.tgj
    public final int c() {
        List list = this.a;
        return list.isEmpty() ? this.f : ((tgi) list.get(list.size() - 1)).c();
    }

    public final tgi d() {
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        return (tgi) list.get(list.size() - 1);
    }

    public final void f(tgi tgiVar) {
        this.a.add(tgiVar);
        l();
    }

    @Override // defpackage.tgj
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
            ((tgi) list.get(size)).f();
        }
    }

    @Override // defpackage.tgj
    protected final boolean h(int i) {
        List list = this.a;
        int size = list.size();
        if (size == 0) {
            return false;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 >= 0) {
            tgi tgiVar = (tgi) list.get(i3);
            int iK = tgiVar.k(i);
            if (iK == 0) {
                return i3 != i2;
            }
            if (iK == 1) {
                return true;
            }
            tgiVar.f();
            list.remove(i3);
            i3--;
        }
        throw new Error("Should not reach here");
    }

    public final void i() {
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((tgi) list.get(size)).e();
            }
        }
    }

    @Override // defpackage.tgj
    public final void m(int i) {
        super.m(i);
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((tgi) list.get(size)).m(i);
            }
        }
    }

    public final void n(StringBuilder sb) {
        sb.append('{');
        List list = this.a;
        if (!list.isEmpty()) {
            ((tgi) list.get(0)).i(sb);
            for (int i = 1; i < list.size(); i++) {
                sb.append(',');
                ((tgi) list.get(i)).i(sb);
            }
        }
        sb.append('}');
    }

    public final void o() {
        g();
        b.b(this);
    }
}
