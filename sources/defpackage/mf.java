package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mf implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public mf() {
        int iE = ml.e(10);
        this.b = new long[iE];
        this.c = new Object[iE];
    }

    public final int a() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != mg.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final Object b(long j) {
        Object obj;
        int iB = ml.b(this.b, this.d, j);
        if (iB < 0 || (obj = this.c[iB]) == mg.a) {
            return null;
        }
        return obj;
    }

    public final Object c(int i) {
        if (i < 0 || i >= this.d) {
            mo.u(b.e(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != mg.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        mf mfVar = (mf) objClone;
        mfVar.b = (long[]) this.b.clone();
        mfVar.c = (Object[]) this.c.clone();
        return mfVar;
    }

    public final void d() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void e(long j, Object obj) {
        int iB = ml.b(this.b, this.d, j);
        if (iB >= 0) {
            this.c[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == mg.a) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != mg.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~ml.b(this.b, i3, j);
            }
        }
        int i5 = this.d;
        long[] jArr2 = this.b;
        if (i5 >= jArr2.length) {
            int iE = ml.e(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(jArr2, iE);
            jArrCopyOf.getClass();
            this.b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iE);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i6 = this.d - i;
        if (i6 != 0) {
            long[] jArr3 = this.b;
            int i7 = i + 1;
            jArr3.getClass();
            jArr3.getClass();
            System.arraycopy(jArr3, i, jArr3, i7, i6);
            Object[] objArr3 = this.c;
            dnx.aV(objArr3, objArr3, i7, i, this.d);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (i2 < 0 || i2 >= this.d) {
                mo.u(b.e(i2, "Expected index to be within 0..size()-1, but was "));
            }
            if (this.a) {
                int i3 = this.d;
                long[] jArr = this.b;
                Object[] objArr = this.c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj = objArr[i5];
                    if (obj != mg.a) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr[i4] = obj;
                            objArr[i5] = null;
                        }
                        i4++;
                    }
                }
                this.a = false;
                this.d = i4;
            }
            sb.append(this.b[i2]);
            sb.append('=');
            Object objC = c(i2);
            if (objC != sb) {
                sb.append(objC);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
