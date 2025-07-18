package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zjo extends zjh implements Iterable {
    static final zjs c = new zjn(zjo.class);
    protected final zih[] a;
    protected zih[] b;

    public zjo() {
        zih[] zihVarArr = zii.a;
        this.a = zihVarArr;
        this.b = zihVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zjo g(Object obj) {
        if (obj == 0 || (obj instanceof zjo)) {
            return (zjo) obj;
        }
        zjh zjhVarP = obj.p();
        if (zjhVarP instanceof zjo) {
            return (zjo) zjhVarP;
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static zjo h(zjr zjrVar) {
        return (zjo) c.d(zjrVar, false);
    }

    private static void i(zih[] zihVarArr) {
        int i;
        int length = zihVarArr.length;
        if (length < 2) {
            return;
        }
        zih zihVar = zihVarArr[0];
        zih zihVar2 = zihVarArr[1];
        byte[] bArrM = m(zihVar);
        byte[] bArrM2 = m(zihVar2);
        boolean zJ = j(bArrM2, bArrM);
        byte[] bArr = true != zJ ? bArrM2 : bArrM;
        if (true == zJ) {
            bArrM = bArrM2;
        }
        zih zihVar3 = true != zJ ? zihVar2 : zihVar;
        if (true == zJ) {
            zihVar = zihVar2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            zih zihVar4 = zihVarArr[i2];
            byte[] bArrM3 = m(zihVar4);
            if (j(bArr, bArrM3)) {
                zihVarArr[i2 - 2] = zihVar;
                zihVar = zihVar3;
                bArrM = bArr;
                zihVar3 = zihVar4;
                bArr = bArrM3;
            } else if (j(bArrM, bArrM3)) {
                zihVarArr[i2 - 2] = zihVar;
                zihVar = zihVar4;
                bArrM = bArrM3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    zih zihVar5 = zihVarArr[i3 - 2];
                    if (j(m(zihVar5), bArrM3)) {
                        break;
                    }
                    zihVarArr[i] = zihVar5;
                    i3 = i;
                }
                zihVarArr[i] = zihVar4;
            }
        }
        zihVarArr[length - 2] = zihVar;
        zihVarArr[length - 1] = zihVar3;
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

    private static byte[] m(zih zihVar) {
        try {
            return zihVar.p().u();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (!(zjhVar instanceof zjo)) {
            return false;
        }
        zjo zjoVar = (zjo) zjhVar;
        int iB = b();
        if (zjoVar.b() != iB) {
            return false;
        }
        zjh zjhVarK = k();
        zjh zjhVarK2 = zjoVar.k();
        for (int i = 0; i < iB; i++) {
            zjh zjhVarP = ((zkr) zjhVarK).a[i].p();
            zjh zjhVarP2 = ((zkr) zjhVarK2).a[i].p();
            if (zjhVarP != zjhVarP2 && !zjhVarP.d(zjhVarP2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return true;
    }

    public final zih f(int i) {
        return this.a[i];
    }

    @Override // defpackage.zix
    public final int hashCode() {
        zih[] zihVarArr = this.a;
        int length = zihVarArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += zihVarArr[length].p().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<zih> iterator() {
        return new zxl(zii.c(this.a), 0);
    }

    @Override // defpackage.zjh
    public zjh k() {
        if (this.b == null) {
            zih[] zihVarArr = (zih[]) this.a.clone();
            this.b = zihVarArr;
            i(zihVarArr);
        }
        return new zkr(this.b, null);
    }

    @Override // defpackage.zjh
    public zjh l() {
        return new zkz(this.a, this.b);
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

    protected zjo(zih zihVar) {
        zih[] zihVarArr = {zihVar};
        this.a = zihVarArr;
        this.b = zihVarArr;
    }

    public zjo(zih[] zihVarArr, zih[] zihVarArr2) {
        this.a = zihVarArr;
        this.b = zihVarArr2;
    }

    protected zjo(zii ziiVar, boolean z) {
        zih[] zihVarArrD;
        int i;
        if (z && (i = ziiVar.c) >= 2) {
            zihVarArrD = new zih[i];
            System.arraycopy(ziiVar.b, 0, zihVarArrD, 0, i);
            i(zihVarArrD);
        } else {
            zihVarArrD = ziiVar.d();
        }
        this.a = zihVarArrD;
        if (!z && zihVarArrD.length >= 2) {
            zihVarArrD = null;
        }
        this.b = zihVarArrD;
    }

    public zjo(boolean z, zih[] zihVarArr) {
        this.a = zihVarArr;
        if (!z && zihVarArr.length >= 2) {
            zihVarArr = null;
        }
        this.b = zihVarArr;
    }

    protected zjo(zih[] zihVarArr) {
        if (!vxr.bc(zihVarArr)) {
            zih[] zihVarArrC = zii.c(zihVarArr);
            if (zihVarArrC.length >= 2) {
                i(zihVarArrC);
            }
            this.a = zihVarArrC;
            this.b = zihVarArr;
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }
}
