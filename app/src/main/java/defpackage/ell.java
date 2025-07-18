package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ell {
    public int a;
    public boolean b;
    private int e;
    private int f;
    private int g;
    private int h;
    private final egy i;
    public final elk d = new elk(this);
    public final List c = new ArrayList(2);

    public ell(int i, int i2, egy egyVar) {
        this.a = i;
        this.e = i2;
        this.f = egyVar.b();
        this.g = egyVar.d();
        this.h = egyVar.h();
        this.i = egyVar;
    }

    public final void a(eli eliVar) {
        if (eliVar == null) {
            return;
        }
        synchronized (this) {
            this.c.add(eliVar);
        }
    }

    final void b(int i) {
        int i2;
        egy egyVar = this.i;
        int iC = egyVar.c();
        int iE = egyVar.e();
        int iB = egyVar.b();
        int iD = egyVar.d();
        int iH = egyVar.h();
        if (iC < 0 || iE < 0) {
            return;
        }
        if (iC != this.a || iE != this.e || iB != this.f || iD != this.g || iH != this.h) {
            i2 = i;
        } else if (i != 1) {
            return;
        } else {
            i2 = 1;
        }
        this.a = iC;
        this.e = iE;
        this.f = iB;
        this.g = iD;
        this.h = iH;
        this.b = false;
        synchronized (this) {
            List list = this.c;
            if (list.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(list);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((eli) arrayList.get(i3)).a(iC, iE, iB, iD, i2);
            }
        }
    }

    public final void c(boolean z) {
        boolean z2 = true;
        if (!this.b && !z) {
            z2 = false;
        }
        this.b = z2;
    }

    final boolean d() {
        return this.a < 0 || this.e < 0 || this.b;
    }

    final boolean e(int i, int i2) {
        if (d()) {
            return true;
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.a <= i3 && i3 <= this.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i, int i2) {
        return d() || i2 == -1 || i <= Math.max((this.a + i2) + (-1), this.e);
    }

    final boolean g(int i) {
        return d() || i <= this.e;
    }
}
