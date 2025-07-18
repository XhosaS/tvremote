package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class clt extends cke {
    public static final Map t = new ConcurrentHashMap();
    public int u = -1;
    protected cny v = cny.a;

    public static void B(clt cltVar) throws cmh {
        if (cltVar != null && !cltVar.m()) {
            throw new cnw().a();
        }
    }

    public static cmt C(cmz cmzVar, Object obj, cmz cmzVar2, int i, cog cogVar) {
        return new cmt(cmzVar, obj, cmzVar2, new cls(i, cogVar));
    }

    public static clt q(clt cltVar, byte[] bArr, int i, int i2, cli cliVar) throws cmh {
        if (i2 == 0) {
            return cltVar;
        }
        clt cltVarP = cltVar.p();
        try {
            cno cnoVarB = cni.a.b(cltVarP);
            cnoVarB.i(cltVarP, bArr, i, i + i2, new ckj(cliVar));
            cnoVarB.g(cltVarP);
            return cltVarP;
        } catch (cmh e) {
            if (e.a) {
                throw new cmh(e);
            }
            throw e;
        } catch (cnw e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof cmh) {
                throw ((cmh) e3.getCause());
            }
            throw new cmh(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static cma r(cma cmaVar) {
        int size = cmaVar.size();
        return cmaVar.d(size + size);
    }

    public static cmd s(cmd cmdVar) {
        int size = cmdVar.size();
        return cmdVar.d(size + size);
    }

    public static cme t(cme cmeVar) {
        int size = cmeVar.size();
        return cmeVar.d(size + size);
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static void y(Class cls, clt cltVar) {
        cltVar.x();
        t.put(cls, cltVar);
    }

    public static final boolean z(clt cltVar, boolean z) {
        byte bByteValue = ((Byte) cltVar.a(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zK = cni.a.b(cltVar).k(cltVar);
        if (z) {
            cltVar.a(2, true == zK ? cltVar : null);
        }
        return zK;
    }

    public final boolean A() {
        return (this.u & Integer.MIN_VALUE) != 0;
    }

    public abstract Object a(int i, Object obj);

    @Override // defpackage.cmz
    public final /* synthetic */ cmy aH() {
        return (clo) a(5, null);
    }

    @Override // defpackage.cmz
    public final /* synthetic */ cmy aJ() {
        clo cloVar = (clo) a(5, null);
        cloVar.n(this);
        return cloVar;
    }

    @Override // defpackage.cke
    public final int c(cno cnoVar) {
        if (A()) {
            int iL = l(cnoVar);
            if (iL >= 0) {
                return iL;
            }
            throw new IllegalStateException(b.e(iL, "serialized size must be non-negative, was "));
        }
        int i = this.u & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iL2 = l(cnoVar);
        if (iL2 < 0) {
            throw new IllegalStateException(b.e(iL2, "serialized size must be non-negative, was "));
        }
        this.u = (this.u & Integer.MIN_VALUE) | iL2;
        return iL2;
    }

    @Override // defpackage.cmz
    public final void e(cld cldVar) {
        cno cnoVarB = cni.a.b(this);
        asv asvVar = cldVar.f;
        if (asvVar == null) {
            asvVar = new asv(cldVar);
        }
        cnoVarB.m(this, asvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return cni.a.b(this).j(this, (clt) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (A()) {
            return j();
        }
        int i = this.s;
        if (i != 0) {
            return i;
        }
        int iJ = j();
        this.s = iJ;
        return iJ;
    }

    public final int j() {
        return cni.a.b(this).b(this);
    }

    @Override // defpackage.cna
    public final /* synthetic */ cmz k() {
        return (clt) a(6, null);
    }

    public final int l(cno cnoVar) {
        return cnoVar == null ? cni.a.b(this).a(this) : cnoVar.a(this);
    }

    @Override // defpackage.cna
    public final boolean m() {
        return z(this, true);
    }

    @Override // defpackage.cmz
    public final int n() {
        if (A()) {
            int iL = l(null);
            if (iL >= 0) {
                return iL;
            }
            throw new IllegalStateException(b.e(iL, "serialized size must be non-negative, was "));
        }
        int i = this.u & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iL2 = l(null);
        if (iL2 < 0) {
            throw new IllegalStateException(b.e(iL2, "serialized size must be non-negative, was "));
        }
        this.u = (this.u & Integer.MIN_VALUE) | iL2;
        return iL2;
    }

    public final clo o() {
        return (clo) a(5, null);
    }

    public final clt p() {
        return (clt) a(4, null);
    }

    public final String toString() {
        String string = super.toString();
        int i = cnb.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        cnb.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.cmz
    public final cng u() {
        return (cng) a(7, null);
    }

    protected final void w() {
        cni.a.b(this).g(this);
        x();
    }

    final void x() {
        this.u &= Integer.MAX_VALUE;
    }
}
