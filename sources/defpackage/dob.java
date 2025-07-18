package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dob {
    public dnw a;
    public int b;
    public int[] c;

    public dob(dnw dnwVar, int i) {
        this.a = dnwVar;
        this.b = i;
        int[] iArr = new int[i + 1];
        this.c = iArr;
        iArr[i] = 1;
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (iArr[length] == 0);
        return length;
    }

    public static int d(int[] iArr) {
        int iA = a(iArr);
        if (iA == -1) {
            return 0;
        }
        return iArr[iA];
    }

    public static final int[] i(int[] iArr, int[] iArr2) {
        int[] iArr3;
        int length = iArr.length;
        int length2 = iArr2.length;
        if (length < length2) {
            iArr3 = new int[length2];
            System.arraycopy(iArr2, 0, iArr3, 0, length2);
        } else {
            int[] iArr4 = new int[length];
            System.arraycopy(iArr, 0, iArr4, 0, length);
            iArr = iArr2;
            iArr3 = iArr4;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (length3 < 0) {
                return iArr3;
            }
            iArr3[length3] = iArr3[length3] ^ iArr[length3];
        }
    }

    private final void j() {
        this.b = this.c.length - 1;
        while (true) {
            int i = this.b;
            if (i < 0 || this.c[i] != 0) {
                return;
            } else {
                this.b = i - 1;
            }
        }
    }

    public final int b(int i) {
        if (i < 0 || i > this.b) {
            return 0;
        }
        return this.c[i];
    }

    public final int c() {
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public final dob e(int i) {
        if (!this.a.c(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new dob(this.a, h(this.c, i));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dob)) {
            dob dobVar = (dob) obj;
            if (this.a.equals(dobVar.a) && this.b == dobVar.b) {
                int[] iArr = this.c;
                int[] iArr2 = dobVar.c;
                int iA = a(iArr);
                if (iA == a(iArr2)) {
                    for (int i = 0; i <= iA; i++) {
                        if (iArr[i] == iArr2[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(dob dobVar) {
        this.c = i(this.c, dobVar.c);
        j();
    }

    public final void g(int i) {
        if (!this.a.c(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.c = h(this.c, i);
        j();
    }

    public final int[] h(int[] iArr, int i) {
        int iA = a(iArr);
        if (iA == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return dnx.b(iArr);
        }
        int[] iArr2 = new int[iA + 1];
        while (iA >= 0) {
            iArr2[iA] = this.a.b(iArr[iA], i);
            iA--;
        }
        return iArr2;
    }

    public final int hashCode() {
        int i = this.a.b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 >= iArr.length) {
                return i;
            }
            i = (i * 31) + iArr[i2];
            i2++;
        }
    }

    public final String toString() {
        String str = " Polynomial over " + this.a.toString() + ": \n";
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                return str.concat(";");
            }
            dnw dnwVar = this.a;
            int i2 = iArr[i];
            String strConcat = "";
            for (int i3 = 0; i3 < dnwVar.a; i3++) {
                strConcat = ((((byte) i2) & 1) == 0 ? "0" : "1").concat(strConcat);
                i2 >>>= 1;
            }
            str = str + strConcat + "Y^" + i + "+";
            i++;
        }
    }

    public dob(dnw dnwVar, byte[] bArr) {
        this.a = dnwVar;
        int i = 8;
        int i2 = 1;
        while (dnwVar.a > i) {
            i += 8;
            i2++;
        }
        int length = bArr.length;
        if (length % i2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c = new int[length / i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.c;
            int length2 = iArr.length;
            if (i3 >= length2) {
                if (length2 != 1 && iArr[length2 - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                j();
                return;
            }
            int i5 = 0;
            while (i5 < i) {
                int[] iArr2 = this.c;
                iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                i5 += 8;
                i4++;
            }
            if (!this.a.c(this.c[i3])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i3++;
        }
    }

    public dob(dnw dnwVar, int[] iArr) {
        int[] iArrB;
        this.a = dnwVar;
        int iA = a(iArr);
        if (iA == -1) {
            iArrB = new int[1];
        } else {
            int i = iA + 1;
            if (iArr.length == i) {
                iArrB = dnx.b(iArr);
            } else {
                int[] iArr2 = new int[i];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArrB = iArr2;
            }
        }
        this.c = iArrB;
        j();
    }

    public dob(dob dobVar) {
        this.a = dobVar.a;
        this.b = dobVar.b;
        this.c = dnx.b(dobVar.c);
    }
}
