package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gld extends gli {
    protected css[] m;
    String n;
    int o;
    int p;

    public gld() {
        super(null);
        this.m = null;
        this.o = 0;
    }

    public boolean a() {
        return false;
    }

    public css[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(css[] cssVarArr) {
        css[] cssVarArr2 = this.m;
        if (cssVarArr2 != null && cssVarArr != null) {
            if (cssVarArr2.length == cssVarArr.length) {
                for (int i = 0; i < cssVarArr2.length; i++) {
                    css cssVar = cssVarArr2[i];
                    char c = cssVar.a;
                    css cssVar2 = cssVarArr[i];
                    if (c == cssVar2.a && cssVar.b.length == cssVar2.b.length) {
                    }
                }
                css[] cssVarArr3 = this.m;
                for (int i2 = 0; i2 < cssVarArr.length; i2++) {
                    cssVarArr3[i2].a = cssVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = cssVarArr[i2].b;
                        if (i3 < fArr.length) {
                            cssVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = crn.f(cssVarArr);
    }

    public gld(gld gldVar) {
        super(null);
        this.m = null;
        this.o = 0;
        this.n = gldVar.n;
        int i = gldVar.p;
        this.p = 0;
        this.m = crn.f(gldVar.m);
    }
}
