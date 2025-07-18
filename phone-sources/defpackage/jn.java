package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jn<E> implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public jn() {
        this((byte[]) null);
    }

    public final int a(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != jo.a) {
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
        return ku.b(this.b, this.d, j);
    }

    public final int b() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != jo.a) {
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

    public final long c(int i) {
        if (i < 0 || i >= this.d) {
            kv.a(a.cf(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != jo.a) {
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
        return this.b[i];
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final jn clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        jn jnVar = (jn) objClone;
        jnVar.b = (long[]) this.b.clone();
        jnVar.c = (Object[]) this.c.clone();
        return jnVar;
    }

    public final Object e(long j) {
        Object obj;
        int iB = ku.b(this.b, this.d, j);
        if (iB < 0 || (obj = this.c[iB]) == jo.a) {
            return null;
        }
        return obj;
    }

    public final Object f(long j, Object obj) {
        Object obj2;
        int iB = ku.b(this.b, this.d, j);
        return (iB < 0 || (obj2 = this.c[iB]) == jo.a) ? obj : obj2;
    }

    public final Object g(int i) {
        if (i < 0 || i >= this.d) {
            kv.a(a.cf(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != jo.a) {
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

    public final void h(long j, Object obj) {
        int i = this.d;
        if (i != 0 && j <= this.b[i - 1]) {
            j(j, obj);
            return;
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                Object[] objArr = this.c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj2 = objArr[i3];
                    if (obj2 != jo.a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj2;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.a = false;
                this.d = i2;
                i = i2;
            }
        }
        long[] jArr2 = this.b;
        if (i >= jArr2.length) {
            int iE = ku.e(i + 1);
            long[] jArrCopyOf = Arrays.copyOf(jArr2, iE);
            jArrCopyOf.getClass();
            this.b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iE);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d = i + 1;
    }

    public final void i() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void j(long j, Object obj) {
        int iB = ku.b(this.b, this.d, j);
        if (iB >= 0) {
            this.c[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == jo.a) {
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
                    if (obj2 != jo.a) {
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
                i = ~ku.b(this.b, i3, j);
            }
        }
        int i5 = this.d;
        long[] jArr2 = this.b;
        if (i5 >= jArr2.length) {
            int iE = ku.e(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(jArr2, iE);
            jArrCopyOf.getClass();
            this.b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iE);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i6 = this.d;
        if (i6 - i != 0) {
            long[] jArr3 = this.b;
            int i7 = i + 1;
            yfm.bi(jArr3, jArr3, i7, i, i6);
            Object[] objArr3 = this.c;
            yfm.bj(objArr3, objArr3, i7, i, this.d);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final void k(long j) {
        int iB = ku.b(this.b, this.d, j);
        if (iB >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[iB];
            Object obj2 = jo.a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.a = true;
            }
        }
    }

    public final boolean l(long j) {
        return a(j) >= 0;
    }

    public final boolean m() {
        return b() == 0;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object objG = g(i2);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public jn(int i) {
        if (i == 0) {
            this.b = ku.b;
            this.c = ku.c;
        } else {
            int iE = ku.e(i);
            this.b = new long[iE];
            this.c = new Object[iE];
        }
    }

    public /* synthetic */ jn(byte[] bArr) {
        this(10);
    }
}
