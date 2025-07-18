package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsm {
    public static final Logger a = Logger.getLogger(xsm.class.getName());
    public static final xsg b = new xsc();
    public static final xse c = new xxb(1);
    static final tzs d = tzs.d.f();
    public Object[] e;
    public int f;

    public xsm() {
    }

    private final int m() {
        Object[] objArr = this.e;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final Object n(int i) {
        return this.e[i + i + 1];
    }

    private final void o(int i) {
        Object[] objArr = new Object[i];
        if (!r()) {
            System.arraycopy(this.e, 0, objArr, 0, a());
        }
        this.e = objArr;
    }

    private final void p(int i, byte[] bArr) {
        this.e[i + i] = bArr;
    }

    private final void q(int i, Object obj) {
        if (this.e instanceof byte[][]) {
            o(m());
        }
        this.e[i + i + 1] = obj;
    }

    private final boolean r() {
        return this.f == 0;
    }

    public final int a() {
        int i = this.f;
        return i + i;
    }

    public final Iterable b(xsj xsjVar) {
        for (int i = 0; i < this.f; i++) {
            if (Arrays.equals(xsjVar.b, j(i))) {
                return new xsi(this, xsjVar, i);
            }
        }
        return null;
    }

    public final Object c(xsj xsjVar) {
        int i = this.f;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(xsjVar.b, j(i)));
        return d(i, xsjVar);
    }

    public final Object d(int i, xsj xsjVar) {
        Object objN = n(i);
        if (objN instanceof byte[]) {
            return xsjVar.a((byte[]) objN);
        }
        throw null;
    }

    public final Set e() {
        if (r()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(this.f);
        for (int i = 0; i < this.f; i++) {
            hashSet.add(new String(j(i), 0));
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    public final void f(xsj xsjVar) {
        if (r()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (!Arrays.equals(xsjVar.b, j(i2))) {
                p(i, j(i2));
                q(i, n(i2));
                i++;
            }
        }
        Arrays.fill(this.e, i + i, a(), (Object) null);
        this.f = i;
    }

    public final void g(xsm xsmVar) {
        if (xsmVar.r()) {
            return;
        }
        int iM = m() - a();
        if (r() || iM < xsmVar.a()) {
            o(a() + xsmVar.a());
        }
        System.arraycopy(xsmVar.e, 0, this.e, a(), xsmVar.a());
        this.f += xsmVar.f;
    }

    public final void h(xsj xsjVar, Object obj) {
        xsjVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == m()) {
            int iA = a();
            o(Math.max(iA + iA, 8));
        }
        p(this.f, xsjVar.b);
        int i = this.f;
        this.e[i + i + 1] = xsjVar.b(obj);
        this.f++;
    }

    public final boolean i(xsj xsjVar) {
        for (int i = 0; i < this.f; i++) {
            if (Arrays.equals(xsjVar.b, j(i))) {
                return true;
            }
        }
        return false;
    }

    public final byte[] j(int i) {
        return (byte[]) this.e[i + i];
    }

    public final byte[] k(int i) {
        Object objN = n(i);
        if (objN instanceof byte[]) {
            return (byte[]) objN;
        }
        throw null;
    }

    public final void l(xsj xsjVar) {
        if (r()) {
            return;
        }
        int i = 0;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (Arrays.equals(xsjVar.b, j(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(d(i2, xsjVar));
            } else {
                p(i, j(i2));
                q(i, n(i2));
                i++;
            }
        }
        Arrays.fill(this.e, i + i, a(), (Object) null);
        this.f = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(j(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(d.i(k(i)));
            } else {
                sb.append(new String(k(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public xsm(byte[]... bArr) {
        this.f = bArr.length >> 1;
        this.e = bArr;
    }
}
