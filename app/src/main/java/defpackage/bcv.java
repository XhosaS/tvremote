package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bcv {
    final bcy c;
    boolean d;
    int e = -1;
    final /* synthetic */ bcw f;

    public bcv(bcw bcwVar, bcy bcyVar) {
        this.f = bcwVar;
        this.c = bcyVar;
    }

    public boolean c(bcl bclVar) {
        return false;
    }

    public abstract boolean ct();

    public final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        bcw bcwVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = bcwVar.d;
        bcwVar.d = i + i2;
        if (!bcwVar.e) {
            bcwVar.e = true;
            while (true) {
                try {
                    int i3 = bcwVar.d;
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
                        bcwVar.d();
                    } else if (z3) {
                        bcwVar.e();
                    }
                    i2 = i3;
                } finally {
                    bcwVar.e = false;
                }
            }
        }
        if (this.d) {
            this.f.b(this);
        }
    }

    public void b() {
    }
}
