package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class xj {
    boolean c;
    int d = -1;
    final /* synthetic */ xk e;
    final yj f;

    public xj(xk xkVar, yj yjVar) {
        this.e = xkVar;
        this.f = yjVar;
    }

    public boolean c(xf xfVar) {
        throw null;
    }

    public abstract boolean d();

    public final void e(boolean z) {
        boolean z2;
        if (z == this.c) {
            return;
        }
        this.c = z;
        xk xkVar = this.e;
        int i = true != z ? -1 : 1;
        int i2 = xkVar.d;
        xkVar.d = i + i2;
        if (!xkVar.e) {
            xkVar.e = true;
            while (true) {
                try {
                    int i3 = xkVar.d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        xkVar.c();
                    } else if (z3) {
                        xkVar.d();
                    }
                    i2 = i3;
                } finally {
                    xkVar.e = false;
                }
            }
        }
        if (this.c) {
            this.e.b(this);
        }
    }

    public void b() {
    }
}
