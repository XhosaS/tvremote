package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxa {
    public final Object[] a = new Object[5];
    public short b = 0;

    private static String e(int i) {
        if (i == 0) {
            return "CONTENT";
        }
        if (i == 1) {
            return "BACKGROUND";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "HOST";
        }
        if (i != 4) {
            return null;
        }
        return "BORDER";
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException("index=" + i + ", size=" + ((int) this.b));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i) {
            if (this.a[i3] != null) {
                i2++;
            }
            i3++;
        }
        return i3 - 1;
    }

    public final Object b() {
        Object[] objArr = this.a;
        Object obj = objArr[3];
        if (obj != null) {
            return obj;
        }
        Object obj2 = objArr[0];
        if (obj2 != null) {
            return obj2;
        }
        Object obj3 = objArr[1];
        if (obj3 != null) {
            return obj3;
        }
        Object obj4 = objArr[2];
        return obj4 != null ? obj4 : objArr[4];
    }

    public final void c(int i, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("value should not be null");
        }
        Object[] objArr = this.a;
        if (objArr[i] != null) {
            throw new RuntimeException("Already contains unit for type ".concat(String.valueOf(e(i))));
        }
        if (objArr[3] == null) {
            if (i == 3) {
                if (this.b <= 0) {
                    i = 3;
                }
            }
            objArr[i] = obj;
            this.b = (short) (this.b + 1);
            return;
        }
        throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
    }

    public final void d(int i, Object obj) {
        if (obj != null) {
            Object[] objArr = this.a;
            if (objArr[i] != null) {
                objArr[i] = obj;
                return;
            }
        }
        if (obj != null && this.a[i] == null) {
            c(i, obj);
            return;
        }
        if (obj == null) {
            Object[] objArr2 = this.a;
            if (objArr2[i] != null) {
                objArr2[i] = null;
                this.b = (short) (this.b - 1);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dxa dxaVar = (dxa) obj;
            if (this.b == dxaVar.b) {
                for (int i = 0; i < 5; i++) {
                    if (this.a[i] != dxaVar.a[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < this.b; i++) {
            int iA = a(i);
            Object obj = this.a[a(i)];
            sb.append("\n\t");
            sb.append(e(iA));
            sb.append(": ");
            sb.append(obj.toString());
        }
        return sb.toString();
    }
}
