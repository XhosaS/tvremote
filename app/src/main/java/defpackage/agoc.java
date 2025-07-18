package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agoc {
    public int a;
    public int b;
    public int c;
    public Object[] d;

    public agoc() {
        int iA = agod.a(16);
        this.a = iA - 1;
        this.c = (int) (iA * 0.75f);
        this.d = new Object[iA];
    }

    public static int a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public final void b(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iA = a(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= iA || iA > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else if (i < iA || iA <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
