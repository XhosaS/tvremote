package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dai extends dab implements Iterable {
    static final dam c = new dah(dai.class);
    protected final czb[] a;
    protected czb[] b;

    public dai() {
        czb[] czbVarArr = czc.a;
        this.a = czbVarArr;
        this.b = czbVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dai g(Object obj) {
        if (obj == 0 || (obj instanceof dai)) {
            return (dai) obj;
        }
        dab dabVarP = obj.p();
        if (dabVarP instanceof dai) {
            return (dai) dabVarP;
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static dai h(dal dalVar) {
        return (dai) c.d(dalVar, false);
    }

    private static void i(czb[] czbVarArr) {
        int i;
        int length = czbVarArr.length;
        if (length < 2) {
            return;
        }
        czb czbVar = czbVarArr[0];
        czb czbVar2 = czbVarArr[1];
        byte[] bArrM = m(czbVar);
        byte[] bArrM2 = m(czbVar2);
        boolean zJ = j(bArrM2, bArrM);
        byte[] bArr = true != zJ ? bArrM2 : bArrM;
        if (true == zJ) {
            bArrM = bArrM2;
        }
        czb czbVar3 = true != zJ ? czbVar2 : czbVar;
        if (true == zJ) {
            czbVar = czbVar2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            czb czbVar4 = czbVarArr[i2];
            byte[] bArrM3 = m(czbVar4);
            if (j(bArr, bArrM3)) {
                czbVarArr[i2 - 2] = czbVar;
                czbVar = czbVar3;
                bArrM = bArr;
                czbVar3 = czbVar4;
                bArr = bArrM3;
            } else if (j(bArrM, bArrM3)) {
                czbVarArr[i2 - 2] = czbVar;
                czbVar = czbVar4;
                bArrM = bArrM3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    czb czbVar5 = czbVarArr[i3 - 2];
                    if (j(m(czbVar5), bArrM3)) {
                        break;
                    }
                    czbVarArr[i] = czbVar5;
                    i3 = i;
                }
                czbVarArr[i] = czbVar4;
            }
        }
        czbVarArr[length - 2] = czbVar;
        czbVarArr[length - 1] = czbVar3;
    }

    private static boolean j(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    private static byte[] m(czb czbVar) {
        try {
            return czbVar.p().u();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (!(dabVar instanceof dai)) {
            return false;
        }
        dai daiVar = (dai) dabVar;
        int iB = b();
        if (daiVar.b() != iB) {
            return false;
        }
        dab dabVarK = k();
        dab dabVarK2 = daiVar.k();
        for (int i = 0; i < iB; i++) {
            dab dabVarP = ((dbl) dabVarK).a[i].p();
            dab dabVarP2 = ((dbl) dabVarK2).a[i].p();
            if (dabVarP != dabVarP2 && !dabVarP.d(dabVarP2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dab
    public final boolean e() {
        return true;
    }

    public final czb f(int i) {
        return this.a[i];
    }

    @Override // defpackage.czr
    public final int hashCode() {
        czb[] czbVarArr = this.a;
        int length = czbVarArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += czbVarArr[length].p().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dod(czc.c(this.a), 0);
    }

    @Override // defpackage.dab
    public dab k() {
        if (this.b == null) {
            czb[] czbVarArr = (czb[]) this.a.clone();
            this.b = czbVarArr;
            i(czbVarArr);
        }
        return new dbl(this.b, null);
    }

    @Override // defpackage.dab
    public dab l() {
        return new dbt(this.a, this.b);
    }

    public final String toString() {
        int iB = b();
        if (iB == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.a[i]);
            i++;
            if (i >= iB) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    protected dai(czb czbVar) {
        czb[] czbVarArr = {czbVar};
        this.a = czbVarArr;
        this.b = czbVarArr;
    }

    public dai(czb[] czbVarArr, czb[] czbVarArr2) {
        this.a = czbVarArr;
        this.b = czbVarArr2;
    }

    protected dai(czc czcVar, boolean z) {
        czb[] czbVarArrD;
        int i;
        if (z && (i = czcVar.c) >= 2) {
            czbVarArrD = new czb[i];
            System.arraycopy(czcVar.b, 0, czbVarArrD, 0, i);
            i(czbVarArrD);
        } else {
            czbVarArrD = czcVar.d();
        }
        this.a = czbVarArrD;
        if (!z && czbVarArrD.length >= 2) {
            czbVarArrD = null;
        }
        this.b = czbVarArrD;
    }

    public dai(boolean z, czb[] czbVarArr) {
        this.a = czbVarArr;
        if (!z && czbVarArr.length >= 2) {
            czbVarArr = null;
        }
        this.b = czbVarArr;
    }

    protected dai(czb[] czbVarArr) {
        if (!dos.o(czbVarArr)) {
            czb[] czbVarArrC = czc.c(czbVarArr);
            if (czbVarArrC.length >= 2) {
                i(czbVarArrC);
            }
            this.a = czbVarArrC;
            this.b = czbVarArr;
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }
}
