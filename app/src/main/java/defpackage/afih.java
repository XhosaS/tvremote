package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afih {
    public Object[] d;
    public int e;
    public static final Logger a = Logger.getLogger(afih.class.getName());
    public static final afhy f = new afhy();
    public static final afib b = new afhz();
    static final zkl c = zkl.d.g();

    public afih() {
    }

    private final int i() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void j(int i) {
        Object[] objArr = new Object[i];
        if (!k()) {
            Object[] objArr2 = this.d;
            int i2 = this.e;
            System.arraycopy(objArr2, 0, objArr, 0, i2 + i2);
        }
        this.d = objArr;
    }

    private final boolean k() {
        return this.e == 0;
    }

    public final Object a(afid afidVar) {
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(afidVar.b, g(i)));
        Object objB = b(i);
        if (objB instanceof byte[]) {
            return afidVar.a((byte[]) objB);
        }
        throw null;
    }

    public final Object b(int i) {
        return this.d[i + i + 1];
    }

    public final void c(afid afidVar) {
        if (k()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.e;
            if (i >= i3) {
                Arrays.fill(this.d, i2 + i2, i3 + i3, (Object) null);
                this.e = i2;
                return;
            }
            if (!Arrays.equals(afidVar.b, g(i))) {
                int i4 = i2 + i2;
                this.d[i4] = g(i);
                Object objB = b(i);
                if (this.d instanceof byte[][]) {
                    j(i());
                }
                this.d[i4 + 1] = objB;
                i2++;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.afih r6) {
        /*
            r5 = this;
            boolean r0 = r6.k()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r5.i()
            int r1 = r5.e
            int r1 = r1 + r1
            int r0 = r0 - r1
            boolean r2 = r5.k()
            if (r2 != 0) goto L1a
            int r2 = r6.e
            int r2 = r2 + r2
            if (r0 >= r2) goto L21
        L1a:
            int r0 = r6.e
            int r0 = r0 + r0
            int r1 = r1 + r0
            r5.j(r1)
        L21:
            java.lang.Object[] r0 = r6.d
            java.lang.Object[] r1 = r5.d
            int r2 = r5.e
            int r2 = r2 + r2
            int r3 = r6.e
            int r3 = r3 + r3
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r1, r2, r3)
            int r0 = r5.e
            int r6 = r6.e
            int r0 = r0 + r6
            r5.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afih.d(afih):void");
    }

    public final void e(afid afidVar, Object obj) {
        afidVar.getClass();
        obj.getClass();
        int i = this.e;
        int i2 = i + i;
        if (i2 == 0 || i2 == i()) {
            j(Math.max(i2 + i2, 8));
        }
        int i3 = this.e;
        int i4 = i3 + i3;
        this.d[i4] = afidVar.b;
        this.d[i4 + 1] = afidVar.b(obj);
        this.e++;
    }

    public final boolean f(afid afidVar) {
        for (int i = 0; i < this.e; i++) {
            if (Arrays.equals(afidVar.b, g(i))) {
                return true;
            }
        }
        return false;
    }

    public final byte[] g(int i) {
        return (byte[]) this.d[i + i];
    }

    public final byte[] h(int i) {
        Object objB = b(i);
        if (objB instanceof byte[]) {
            return (byte[]) objB;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(g(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                zkl zklVar = c;
                byte[] bArrH = h(i);
                sb.append(zklVar.k(bArrH, bArrH.length));
            } else {
                sb.append(new String(h(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public afih(int i, Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    public afih(byte[]... bArr) {
        this(bArr.length >> 1, bArr);
    }
}
