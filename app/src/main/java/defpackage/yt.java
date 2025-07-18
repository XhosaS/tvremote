package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yt {
    static final boolean[] a = new boolean[3];

    static void a(yo yoVar, yc ycVar, yn ynVar) {
        ynVar.q = -1;
        ynVar.r = -1;
        int[] iArr = yoVar.ar;
        if (iArr[0] != 2 && ynVar.ar[0] == 4) {
            ym ymVar = ynVar.K;
            int i = ymVar.f;
            int iH = yoVar.h();
            ym ymVar2 = ynVar.M;
            int i2 = iH - ymVar2.f;
            ymVar.h = ycVar.c(ymVar);
            ymVar2.h = ycVar.c(ymVar2);
            ycVar.g(ymVar.h, i);
            ycVar.g(ymVar2.h, i2);
            ynVar.q = 2;
            ynVar.aa = i;
            int i3 = i2 - i;
            ynVar.W = i3;
            int i4 = ynVar.ad;
            if (i3 < i4) {
                ynVar.W = i4;
            }
        }
        if (iArr[1] == 2 || ynVar.ar[1] != 4) {
            return;
        }
        ym ymVar3 = ynVar.L;
        int i5 = ymVar3.f;
        int iG = yoVar.g();
        ym ymVar4 = ynVar.N;
        int i6 = iG - ymVar4.f;
        ymVar3.h = ycVar.c(ymVar3);
        ymVar4.h = ycVar.c(ymVar4);
        ycVar.g(ymVar3.h, i5);
        ycVar.g(ymVar4.h, i6);
        if (ynVar.ac > 0 || ynVar.ai == 8) {
            ym ymVar5 = ynVar.O;
            ymVar5.h = ycVar.c(ymVar5);
            ycVar.g(ymVar5.h, ynVar.ac + i5);
        }
        ynVar.r = 2;
        ynVar.ab = i5;
        int i7 = i6 - i5;
        ynVar.X = i7;
        int i8 = ynVar.ae;
        if (i7 < i8) {
            ynVar.X = i8;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
