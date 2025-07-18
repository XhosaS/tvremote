package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dag extends dab implements Iterable {
    static final dam b = new dae(dag.class);
    czb[] a;

    public dag() {
        this.a = czc.a;
    }

    public static dag j(Object obj) {
        if (obj == null || (obj instanceof dag)) {
            return (dag) obj;
        }
        if (obj instanceof czb) {
            dab dabVarP = ((czb) obj).p();
            if (dabVarP instanceof dag) {
                return (dag) dabVarP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (dag) b.c((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static dag m(dal dalVar, boolean z) {
        return (dag) b.d(dalVar, z);
    }

    public int b() {
        return this.a.length;
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (!(dabVar instanceof dag)) {
            return false;
        }
        dag dagVar = (dag) dabVar;
        int iB = b();
        if (dagVar.b() != iB) {
            return false;
        }
        for (int i = 0; i < iB; i++) {
            dab dabVarP = this.a[i].p();
            dab dabVarP2 = dagVar.a[i].p();
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

    public Enumeration f() {
        return new daf(this);
    }

    public abstract cyw g();

    public czb h(int i) {
        return this.a[i];
    }

    @Override // defpackage.czr
    public int hashCode() {
        int length = this.a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.a[length].p().hashCode();
        }
    }

    public abstract czx i();

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new dod(this.a, 0);
    }

    @Override // defpackage.dab
    public dab k() {
        return new dbk(this.a, null);
    }

    @Override // defpackage.dab
    public dab l() {
        return new dbs(this.a);
    }

    public abstract dai n();

    final cyw[] o() {
        int iB = b();
        cyw[] cywVarArr = new cyw[iB];
        for (int i = 0; i < iB; i++) {
            cywVarArr[i] = cyw.i(this.a[i]);
        }
        return cywVarArr;
    }

    final czx[] q() {
        int iB = b();
        czx[] czxVarArr = new czx[iB];
        for (int i = 0; i < iB; i++) {
            czxVarArr[i] = czx.f(this.a[i]);
        }
        return czxVarArr;
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

    public dag(czb[] czbVarArr, byte[] bArr) {
        this.a = czbVarArr;
    }

    protected dag(czb czbVar) {
        if (czbVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.a = new czb[]{czbVar};
    }

    protected dag(czc czcVar) {
        this.a = czcVar.d();
    }

    protected dag(czb[] czbVarArr) {
        if (!dos.o(czbVarArr)) {
            this.a = czc.c(czbVarArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }
}
