package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zjm extends zjh implements Iterable {
    static final zjs b = new zjk(zjm.class);
    zih[] a;

    public zjm() {
        this.a = zii.a;
    }

    public static zjm j(Object obj) {
        if (obj == null || (obj instanceof zjm)) {
            return (zjm) obj;
        }
        if (obj instanceof zih) {
            zjh zjhVarP = ((zih) obj).p();
            if (zjhVarP instanceof zjm) {
                return (zjm) zjhVarP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (zjm) b.c((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static zjm m(zjr zjrVar, boolean z) {
        return (zjm) b.d(zjrVar, z);
    }

    public int b() {
        return this.a.length;
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (!(zjhVar instanceof zjm)) {
            return false;
        }
        zjm zjmVar = (zjm) zjhVar;
        int iB = b();
        if (zjmVar.b() != iB) {
            return false;
        }
        for (int i = 0; i < iB; i++) {
            zjh zjhVarP = this.a[i].p();
            zjh zjhVarP2 = zjmVar.a[i].p();
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

    public Enumeration f() {
        return new zjl(this);
    }

    public abstract zic g();

    public zih h(int i) {
        return this.a[i];
    }

    @Override // defpackage.zix
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

    public abstract zjd i();

    @Override // java.lang.Iterable
    public Iterator<zih> iterator() {
        return new zxl(this.a, 0);
    }

    @Override // defpackage.zjh
    public zjh k() {
        return new zkq(this.a, null);
    }

    @Override // defpackage.zjh
    public zjh l() {
        return new zky(this.a);
    }

    public abstract zjo n();

    final zic[] o() {
        int iB = b();
        zic[] zicVarArr = new zic[iB];
        for (int i = 0; i < iB; i++) {
            zicVarArr[i] = zic.i(this.a[i]);
        }
        return zicVarArr;
    }

    final zjd[] q() {
        int iB = b();
        zjd[] zjdVarArr = new zjd[iB];
        for (int i = 0; i < iB; i++) {
            zjdVarArr[i] = zjd.f(this.a[i]);
        }
        return zjdVarArr;
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

    public zjm(zih[] zihVarArr, byte[] bArr) {
        this.a = zihVarArr;
    }

    protected zjm(zih zihVar) {
        if (zihVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.a = new zih[]{zihVar};
    }

    protected zjm(zii ziiVar) {
        this.a = ziiVar.d();
    }

    protected zjm(zih[] zihVarArr) {
        if (!vxr.bc(zihVarArr)) {
            this.a = zii.c(zihVarArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }
}
