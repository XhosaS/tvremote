package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpj {
    static final boolean[] a = new boolean[3];

    static void a(cpe cpeVar, cov covVar, cpd cpdVar) {
        cpdVar.q = -1;
        cpdVar.r = -1;
        int[] iArr = cpeVar.ar;
        if (iArr[0] != 2 && cpdVar.ar[0] == 4) {
            cpc cpcVar = cpdVar.K;
            int i = cpcVar.f;
            int iJ = cpeVar.j();
            cpc cpcVar2 = cpdVar.M;
            int i2 = iJ - cpcVar2.f;
            cpcVar.h = covVar.b(cpcVar);
            cpcVar2.h = covVar.b(cpcVar2);
            covVar.f(cpcVar.h, i);
            covVar.f(cpcVar2.h, i2);
            cpdVar.q = 2;
            cpdVar.aa = i;
            int i3 = i2 - i;
            cpdVar.W = i3;
            int i4 = cpdVar.ad;
            if (i3 < i4) {
                cpdVar.W = i4;
            }
        }
        if (iArr[1] == 2 || cpdVar.ar[1] != 4) {
            return;
        }
        cpc cpcVar3 = cpdVar.L;
        int i5 = cpcVar3.f;
        int iH = cpeVar.h();
        cpc cpcVar4 = cpdVar.N;
        int i6 = iH - cpcVar4.f;
        cpcVar3.h = covVar.b(cpcVar3);
        cpcVar4.h = covVar.b(cpcVar4);
        covVar.f(cpcVar3.h, i5);
        covVar.f(cpcVar4.h, i6);
        if (cpdVar.ac > 0 || cpdVar.ai == 8) {
            cpc cpcVar5 = cpdVar.O;
            cpcVar5.h = covVar.b(cpcVar5);
            covVar.f(cpcVar5.h, cpdVar.ac + i5);
        }
        cpdVar.r = 2;
        cpdVar.ab = i5;
        int i7 = i6 - i5;
        cpdVar.X = i7;
        int i8 = cpdVar.ae;
        if (i7 < i8) {
            cpdVar.X = i8;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
