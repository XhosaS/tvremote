package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahje {
    private int a;
    public ahjg[] d;
    public int e;

    protected abstract ahjg d();

    protected abstract ahjg[] g();

    protected final ahjg i() {
        ahjg ahjgVarD;
        synchronized (this) {
            ahjg[] ahjgVarArrG = this.d;
            if (ahjgVarArrG == null) {
                ahjgVarArrG = g();
                this.d = ahjgVarArrG;
            } else {
                int i = this.e;
                int length = ahjgVarArrG.length;
                if (i >= length) {
                    Object[] objArrCopyOf = Arrays.copyOf(ahjgVarArrG, length + length);
                    objArrCopyOf.getClass();
                    ahjgVarArrG = (ahjg[]) objArrCopyOf;
                    this.d = ahjgVarArrG;
                }
            }
            int i2 = this.a;
            do {
                ahjgVarD = ahjgVarArrG[i2];
                if (ahjgVarD == null) {
                    ahjgVarD = d();
                    ahjgVarArrG[i2] = ahjgVarD;
                }
                i2++;
                if (i2 >= ahjgVarArrG.length) {
                    i2 = 0;
                }
            } while (!ahjgVarD.a(this));
            this.a = i2;
            this.e++;
        }
        return ahjgVarD;
    }

    protected final void j(ahjg ahjgVar) {
        int i;
        agsw[] agswVarArrB;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            if (i2 == 0) {
                this.a = 0;
            }
            ahjgVar.getClass();
            agswVarArrB = ahjgVar.b(this);
        }
        for (agsw agswVar : agswVarArrB) {
            if (agswVar != null) {
                agswVar.e(agpu.a);
            }
        }
    }
}
