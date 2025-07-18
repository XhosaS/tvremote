package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doc {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public doc() {
    }

    private static void a(dob[] dobVarArr, int i, int i2) {
        dob dobVar = dobVarArr[i];
        dobVarArr[i] = dobVarArr[i2];
        dobVarArr[i2] = dobVar;
    }

    public doc(dnw dnwVar, dob dobVar) {
        int i;
        int iB;
        int[] iArr;
        this.a = dnwVar;
        this.b = dobVar;
        int iC = dobVar.c();
        this.c = new dob[iC];
        int i2 = 0;
        while (true) {
            i = iC >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3 + 1];
            iArr2[i3] = 1;
            ((dob[]) this.c)[i2] = new dob((dnw) this.a, iArr2);
            i2++;
        }
        while (i < iC) {
            int i4 = i + i;
            int[] iArr3 = new int[i4 + 1];
            iArr3[i4] = 1;
            dob dobVar2 = new dob((dnw) this.a, iArr3);
            Object obj = this.c;
            Object obj2 = this.b;
            int[] iArr4 = dobVar2.c;
            int[] iArr5 = ((dob) obj2).c;
            int iA = dob.a(iArr5);
            if (iA == -1) {
                throw new ArithmeticException("Division by zero");
            }
            int length = iArr4.length;
            int[] iArrI = new int[length];
            int iA2 = dobVar2.a.a(dob.d(iArr5));
            System.arraycopy(iArr4, 0, iArrI, 0, length);
            while (iA <= dob.a(iArrI)) {
                int iB2 = dobVar2.a.b(dob.d(iArrI), iA2);
                int iA3 = dob.a(iArrI) - iA;
                int iA4 = dob.a(iArr5);
                if (iA4 == -1) {
                    iArr = new int[1];
                } else {
                    int[] iArr6 = new int[iA4 + iA3 + 1];
                    System.arraycopy(iArr5, 0, iArr6, iA3, iA4 + 1);
                    iArr = iArr6;
                }
                iArrI = dob.i(dobVar2.h(iArr, iB2), iArrI);
            }
            ((dob[]) obj)[i] = new dob(dobVar2.a, iArrI);
            i++;
        }
        int iC2 = ((dob) this.b).c();
        dob[] dobVarArr = new dob[iC2];
        int i5 = iC2 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            dobVarArr[i6] = new dob(((dob[]) this.c)[i6]);
        }
        this.d = new dob[iC2];
        while (i5 >= 0) {
            ((dob[]) this.d)[i5] = new dob((dnw) this.a, i5);
            i5--;
        }
        int i7 = 0;
        while (i7 < iC2) {
            int i8 = i7 + 1;
            if (dobVarArr[i7].b(i7) == 0) {
                boolean z = false;
                int i9 = i8;
                while (i9 < iC2) {
                    if (dobVarArr[i9].b(i7) != 0) {
                        a(dobVarArr, i7, i9);
                        a((dob[]) this.d, i7, i9);
                        i9 = iC2;
                        z = true;
                    }
                    i9++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iA5 = ((dnw) this.a).a(dobVarArr[i7].b(i7));
            dobVarArr[i7].g(iA5);
            ((dob[]) this.d)[i7].g(iA5);
            for (int i10 = 0; i10 < iC2; i10++) {
                if (i10 != i7 && (iB = dobVarArr[i10].b(i7)) != 0) {
                    dob dobVarE = dobVarArr[i7].e(iB);
                    dob dobVarE2 = ((dob[]) this.d)[i7].e(iB);
                    dobVarArr[i10].f(dobVarE);
                    ((dob[]) this.d)[i10].f(dobVarE2);
                }
            }
            i7 = i8;
        }
    }
}
