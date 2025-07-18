package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bwo extends bwn {
    protected acu[] m;
    String n;
    int o;
    int p;

    public bwo() {
        this.m = null;
        this.o = 0;
    }

    public boolean a() {
        return false;
    }

    public acu[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(acu[] acuVarArr) {
        acu[] acuVarArr2 = this.m;
        if (acuVarArr2 != null && acuVarArr != null) {
            if (acuVarArr2.length == acuVarArr.length) {
                for (int i = 0; i < acuVarArr2.length; i++) {
                    acu acuVar = acuVarArr2[i];
                    char c = acuVar.a;
                    acu acuVar2 = acuVarArr[i];
                    if (c == acuVar2.a && acuVar.b.length == acuVar2.b.length) {
                    }
                }
                acu[] acuVarArr3 = this.m;
                for (int i2 = 0; i2 < acuVarArr.length; i2++) {
                    acuVarArr3[i2].a = acuVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = acuVarArr[i2].b;
                        if (i3 < fArr.length) {
                            acuVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = acv.c(acuVarArr);
    }

    public bwo(bwo bwoVar) {
        this.m = null;
        this.o = 0;
        this.n = bwoVar.n;
        int i = bwoVar.p;
        this.p = 0;
        this.m = acv.c(bwoVar.m);
    }
}
