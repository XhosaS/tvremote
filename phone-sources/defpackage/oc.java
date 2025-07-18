package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oc implements nk {
    private final nue a;

    public oc(nue nueVar) {
        this.a = nueVar;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, yjv] */
    @Override // defpackage.nk
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final pw b(bhi bhiVar) {
        int[] iArr;
        Object[] objArr;
        int i;
        int[] iArr2;
        Object[] objArr2;
        char c;
        nue nueVar = this.a;
        jc jcVar = (jc) nueVar.b;
        ja jaVar = new ja(jcVar.e + 2);
        jc jcVar2 = new jc(jcVar.e);
        int[] iArr3 = jcVar.b;
        Object[] objArr3 = jcVar.c;
        long[] jArr = jcVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            c = '\b';
                            int i6 = iArr3[i5];
                            ob obVar = (ob) objArr3[i5];
                            jaVar.d(i6);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            ne neVar = (ne) bhiVar.a.a(obVar.a);
                            nl nlVar = obVar.b;
                            int i7 = obVar.c;
                            jcVar2.f(i6, new pv(neVar, nlVar));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c = '\b';
                        }
                        j >>= c;
                        i4++;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i != 8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!jcVar.b(0)) {
            if (jaVar.b < 0) {
                kv.c("Index must be between 0 and size");
            }
            jaVar.c(jaVar.b + 1);
            int[] iArr4 = jaVar.a;
            int i8 = jaVar.b;
            if (i8 != 0) {
                yfm.bh(iArr4, iArr4, 1, 0, i8);
            }
            iArr4[0] = 0;
            jaVar.b++;
        }
        if (!jcVar.b(nueVar.a)) {
            jaVar.d(nueVar.a);
        }
        int i9 = jaVar.b;
        if (i9 != 0) {
            int[] iArr5 = jaVar.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i9);
        }
        return new pw(jaVar, jcVar2, nueVar.a, no.c);
    }
}
