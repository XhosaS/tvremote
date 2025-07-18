package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class aca extends qk {
    protected nu[] o;
    String p;
    int q;
    int r;

    public aca() {
        this.o = null;
        this.q = 0;
    }

    public nu[] getPathData() {
        return this.o;
    }

    public String getPathName() {
        return this.p;
    }

    public void setPathData(nu[] nuVarArr) {
        nu[] nuVarArr2 = this.o;
        if (nuVarArr2 != null && nuVarArr != null) {
            if (nuVarArr2.length == nuVarArr.length) {
                for (int i = 0; i < nuVarArr2.length; i++) {
                    nu nuVar = nuVarArr2[i];
                    char c = nuVar.a;
                    nu nuVar2 = nuVarArr[i];
                    if (c == nuVar2.a && nuVar.b.length == nuVar2.b.length) {
                    }
                }
                nu[] nuVarArr3 = this.o;
                for (int i2 = 0; i2 < nuVarArr.length; i2++) {
                    nuVarArr3[i2].a = nuVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = nuVarArr[i2].b;
                        if (i3 < fArr.length) {
                            nuVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.o = mo.O(nuVarArr);
    }

    public boolean x() {
        return false;
    }

    public aca(aca acaVar) {
        this.o = null;
        this.q = 0;
        this.p = acaVar.p;
        int i = acaVar.r;
        this.r = 0;
        this.o = mo.O(acaVar.o);
    }
}
