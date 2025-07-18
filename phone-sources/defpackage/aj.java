package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aj {
    private static int h = 1000;
    public ah[] c;
    public final ivx g;
    int a = 0;
    public final ai b = new ai();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private ak[] l = new ak[h];
    private int m = 0;
    private ah[] n = new ah[32];

    public aj() {
        this.c = null;
        this.c = new ah[32];
        r();
        this.g = new ivx((byte[]) null, (byte[]) null);
    }

    public static ah b(aj ajVar, ak akVar, ak akVar2, int i, float f, ak akVar3, ak akVar4, int i2, boolean z) {
        ah ahVarA = ajVar.a();
        ahVarA.d(akVar, akVar2, i, f, akVar3, akVar4, i2);
        if (z) {
            ak akVarD = ajVar.d();
            ak akVarD2 = ajVar.d();
            akVarD.c = 4;
            akVarD2.c = 4;
            ahVarA.c(akVarD, akVarD2);
        }
        return ahVarA;
    }

    public static ah c(aj ajVar, ak akVar, ak akVar2, int i, boolean z) {
        ah ahVarA = ajVar.a();
        ahVarA.h(akVar, akVar2, i);
        if (z) {
            ajVar.k(ahVarA, 1);
        }
        return ahVarA;
    }

    public static final int p(Object obj) {
        ak akVar = ((al) obj).f;
        if (akVar != null) {
            return (int) (akVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (ah[]) Arrays.copyOf(this.c, i2);
        ivx ivxVar = this.g;
        ivxVar.c = (ak[]) Arrays.copyOf((Object[]) ivxVar.c, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            ah[] ahVarArr = this.c;
            if (i >= ahVarArr.length) {
                return;
            }
            ah ahVar = ahVarArr[i];
            if (ahVar != null) {
                ((nue) this.g.b).p(ahVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final ak s(int i) {
        ak akVar = (ak) ((nue) this.g.a).o();
        if (akVar == null) {
            akVar = new ak(i);
        } else {
            akVar.b();
            akVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (ak[]) Arrays.copyOf(this.l, i4);
        }
        ak[] akVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        akVarArr[i5] = akVar;
        return akVar;
    }

    public final ah a() {
        ivx ivxVar = this.g;
        ah ahVar = (ah) ((nue) ivxVar.b).o();
        if (ahVar == null) {
            return new ah(ivxVar);
        }
        ahVar.a = null;
        ag agVar = ahVar.d;
        agVar.e = -1;
        agVar.f = -1;
        agVar.g = false;
        agVar.a = 0;
        ahVar.b = 0.0f;
        ahVar.e = false;
        return ahVar;
    }

    public final ak d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        ak akVarS = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        akVarS.a = i;
        ((ak[]) this.g.c)[i] = akVarS;
        return akVarS;
    }

    public final ak e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        al alVar = (al) obj;
        ak akVar = alVar.f;
        if (akVar == null) {
            alVar.e();
            akVar = alVar.f;
        }
        int i = akVar.a;
        if (i != -1) {
            if (i <= this.a && ((ak[]) this.g.c)[i] != null) {
                return akVar;
            }
            if (i != -1) {
                akVar.b();
            }
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        akVar.a = i2;
        akVar.h = 1;
        ((ak[]) this.g.c)[i2] = akVar;
        return akVar;
    }

    public final ak f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        ak akVarS = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        akVarS.a = i;
        ((ak[]) this.g.c)[i] = akVarS;
        return akVarS;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.ah r14) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj.g(ah):void");
    }

    public final void h(ak akVar, int i) {
        int i2 = akVar.b;
        if (i2 != -1) {
            ah ahVar = this.c[i2];
            if (ahVar.e) {
                ahVar.b = i;
                return;
            }
            ah ahVarA = a();
            ahVarA.g(akVar, i);
            g(ahVarA);
            return;
        }
        float f = i;
        ah ahVarA2 = a();
        ahVarA2.a = akVar;
        akVar.d = f;
        ahVarA2.b = f;
        ahVarA2.e = true;
        g(ahVarA2);
    }

    public final void i(ak akVar, ak akVar2, int i, int i2) {
        ah ahVarA = a();
        ak akVarF = f();
        akVarF.c = i2;
        ahVarA.i(akVar, akVar2, akVarF, i);
        g(ahVarA);
    }

    public final void j(ak akVar, ak akVar2, int i, int i2) {
        ah ahVarA = a();
        ak akVarF = f();
        akVarF.c = i2;
        ahVarA.j(akVar, akVar2, akVarF, i);
        g(ahVarA);
    }

    public final void k(ah ahVar, int i) {
        ahVar.d.f(d(), i);
    }

    public final void l() {
        ivx ivxVar;
        int i = 0;
        while (true) {
            ivxVar = this.g;
            ak[] akVarArr = (ak[]) ivxVar.c;
            if (i >= akVarArr.length) {
                break;
            }
            ak akVar = akVarArr[i];
            if (akVar != null) {
                akVar.b();
            }
            i++;
        }
        Object obj = ivxVar.a;
        ak[] akVarArr2 = this.l;
        int i2 = this.m;
        int length = akVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ak akVar2 = akVarArr2[i3];
            nue nueVar = (nue) obj;
            int i4 = nueVar.a;
            if (i4 < 256) {
                ((Object[]) nueVar.b)[i4] = akVar2;
                nueVar.a = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill((Object[]) ivxVar.c, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(ak akVar, ak akVar2, int i, float f, ak akVar3, ak akVar4, int i2) {
        ah ahVarA = a();
        ahVarA.d(akVar, akVar2, i, f, akVar3, akVar4, i2);
        ak akVarD = d();
        ak akVarD2 = d();
        akVarD.c = 4;
        akVarD2.c = 4;
        ahVarA.c(akVarD, akVarD2);
        g(ahVarA);
    }

    public final void n(ak akVar, ak akVar2, int i, int i2) {
        ah ahVarA = a();
        ahVarA.h(akVar, akVar2, i);
        ak akVarD = d();
        ak akVarD2 = d();
        akVarD.c = i2;
        akVarD2.c = i2;
        ahVarA.c(akVarD, akVarD2);
        g(ahVarA);
    }

    public final void o(ai aiVar) {
        int i = 0;
        while (true) {
            if (i >= this.f) {
                break;
            }
            ah ahVar = this.c[i];
            if (ahVar.a.h != 1 && ahVar.b < 0.0f) {
                while (true) {
                    float f = Float.MAX_VALUE;
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        ah ahVar2 = this.c[i5];
                        if (ahVar2.a.h != 1 && ahVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                ak akVar = ((ak[]) this.g.c)[i6];
                                float fA = ahVar2.d.a(akVar);
                                if (fA > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = akVar.e[i7] / fA;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    ah ahVar3 = this.c[i2];
                    ahVar3.a.b = -1;
                    ahVar3.a(((ak[]) this.g.c)[i3]);
                    ahVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(ahVar3);
                    }
                    aiVar.a(this);
                }
            } else {
                i++;
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            ah ahVar4 = this.c[i9];
            if (ahVar4.a.h != 1 && ahVar4.b < 0.0f) {
                return;
            }
        }
    }
}
