package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class dvr {
    final dvw c;
    boolean d;
    int e = -1;
    final /* synthetic */ dvs f;

    public dvr(dvs dvsVar, dvw dvwVar) {
        this.f = dvsVar;
        this.c = dvwVar;
    }

    public boolean c(dvk dvkVar) {
        return false;
    }

    public abstract boolean cG();

    final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        dvs dvsVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = dvsVar.c;
        dvsVar.c = i + i2;
        if (!dvsVar.d) {
            dvsVar.d = true;
            while (true) {
                try {
                    int i3 = dvsVar.c;
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
                        dvsVar.f();
                    } else if (z3) {
                        dvsVar.g();
                    }
                    i2 = i3;
                } finally {
                    dvsVar.d = false;
                }
            }
        }
        if (this.d) {
            this.f.c(this);
        }
    }

    public void b() {
    }
}
