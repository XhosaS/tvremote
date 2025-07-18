package defpackage;

import defpackage.yvk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yvi<S extends yvk<?>> {
    private int a;
    private ywf b;
    public yvk[] d;
    public int e;

    public final yva b() {
        ywf ywfVar;
        synchronized (this) {
            ywfVar = this.b;
            if (ywfVar == null) {
                ywfVar = new ywf(this.e);
                this.b = ywfVar;
            }
        }
        return ywfVar;
    }

    protected abstract yvk h();

    protected abstract yvk[] k();

    protected final yvk l() {
        yvk yvkVarH;
        ywf ywfVar;
        synchronized (this) {
            yvk[] yvkVarArrK = this.d;
            if (yvkVarArrK == null) {
                yvkVarArrK = k();
                this.d = yvkVarArrK;
            } else {
                int i = this.e;
                int length = yvkVarArrK.length;
                if (i >= length) {
                    Object[] objArrCopyOf = Arrays.copyOf(yvkVarArrK, length + length);
                    objArrCopyOf.getClass();
                    yvkVarArrK = (yvk[]) objArrCopyOf;
                    this.d = yvkVarArrK;
                }
            }
            int i2 = this.a;
            do {
                yvkVarH = yvkVarArrK[i2];
                if (yvkVarH == null) {
                    yvkVarH = h();
                    yvkVarArrK[i2] = yvkVarH;
                }
                i2++;
                if (i2 >= yvkVarArrK.length) {
                    i2 = 0;
                }
            } while (!yvkVarH.a(this));
            this.a = i2;
            this.e++;
            ywfVar = this.b;
        }
        if (ywfVar != null) {
            ywfVar.n(1);
        }
        return yvkVarH;
    }

    protected final void m(yvk yvkVar) {
        ywf ywfVar;
        int i;
        yih[] yihVarArrB;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            ywfVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            yvkVar.getClass();
            yihVarArrB = yvkVar.b(this);
        }
        for (yih yihVar : yihVarArrB) {
            if (yihVar != null) {
                yihVar.resumeWith(ygi.a);
            }
        }
        if (ywfVar != null) {
            ywfVar.n(-1);
        }
    }
}
