package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wy implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public wy() {
        throw null;
    }

    public final int a(Object obj) {
        if (this.a) {
            wz.c(this);
        }
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    public final int b(int i) {
        if (this.a) {
            wz.c(this);
        }
        return this.b[i];
    }

    public final int c() {
        if (this.a) {
            wz.c(this);
        }
        return this.d;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        wy wyVar = (wy) objClone;
        wyVar.b = (int[]) this.b.clone();
        wyVar.c = (Object[]) this.c.clone();
        return wyVar;
    }

    public final Object d(int i) {
        if (this.a) {
            wz.c(this);
        }
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void e() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void f(int i, Object obj) {
        int iA = xa.a(this.b, this.d, i);
        if (iA >= 0) {
            this.c[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == wz.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            wz.c(this);
            i2 = ~xa.a(this.b, this.d, i);
        }
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int iD = xa.d(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iD);
            iArrCopyOf.getClass();
            this.b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iD);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr2 = this.b;
            int i6 = i2 + 1;
            agqj.e(iArr2, iArr2, i6, i2, i5);
            Object[] objArr2 = this.c;
            agqj.f(objArr2, objArr2, i6, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object objD = d(i2);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public wy(int i) {
        int iD = xa.d(i);
        this.b = new int[iD];
        this.c = new Object[iD];
    }
}
