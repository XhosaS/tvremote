package defpackage;

import android.support.v7.widget.ActivityChooserView;
import defpackage.vtw;
import defpackage.vuc;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vuc<MessageType extends vuc<MessageType, BuilderType>, BuilderType extends vtw<MessageType, BuilderType>> extends vsg<MessageType, BuilderType> {
    public static final Map N = new ConcurrentHashMap();
    public int O = -1;
    protected vwh P = vwh.a;

    public static void B(vuc vucVar) {
        if (vucVar != null && !vucVar.v()) {
            throw new vwf().a();
        }
    }

    public static vvd C(vvj vvjVar, Object obj, vvj vvjVar2, int i, vwo vwoVar) {
        return new vvd(vvjVar, obj, vvjVar2, new vub(i, vwoVar));
    }

    public static vuc p(vuc vucVar, byte[] bArr, int i, int i2, vtp vtpVar) {
        if (i2 == 0) {
            return vucVar;
        }
        vuc vucVarO = vucVar.o();
        try {
            vvy vvyVarB = vvs.a.b(vucVarO);
            vvyVarB.i(vucVarO, bArr, i, i + i2, new vsm(vtpVar));
            vvyVarB.g(vucVarO);
            return vucVarO;
        } catch (vuq e) {
            if (e.a) {
                throw new vuq(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof vuq) {
                throw ((vuq) e2.getCause());
            }
            throw new vuq(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (vwf e3) {
            throw e3.a();
        }
    }

    public static vuj q(vuj vujVar) {
        int size = vujVar.size();
        return vujVar.d(size + size);
    }

    public static vum r(vum vumVar) {
        int size = vumVar.size();
        return vumVar.f(size + size);
    }

    public static vun s(vun vunVar) {
        int size = vunVar.size();
        return vunVar.d(size + size);
    }

    protected static void y(Class cls, vuc vucVar) {
        vucVar.x();
        N.put(cls, vucVar);
    }

    public static final boolean z(vuc vucVar, boolean z) {
        byte bByteValue = ((Byte) vucVar.a(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zK = vvs.a.b(vucVar).k(vucVar);
        if (z) {
            vucVar.a(2, true == zK ? vucVar : null);
        }
        return zK;
    }

    public final boolean A() {
        return (this.O & Integer.MIN_VALUE) != 0;
    }

    public abstract Object a(int i, Object obj);

    @Override // defpackage.vsg
    public final int d(vvy vvyVar) {
        if (A()) {
            int iK = k(vvyVar);
            if (iK >= 0) {
                return iK;
            }
            throw new IllegalStateException(a.cf(iK, "serialized size must be non-negative, was "));
        }
        int i = this.O & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iK2 = k(vvyVar);
        if (iK2 < 0) {
            throw new IllegalStateException(a.cf(iK2, "serialized size must be non-negative, was "));
        }
        this.O = (this.O & Integer.MIN_VALUE) | iK2;
        return iK2;
    }

    @Override // defpackage.vvj
    public final /* synthetic */ vvi dN() {
        return (vtw) a(5, null);
    }

    @Override // defpackage.vvj
    public final void dO(vtj vtjVar) {
        vvy vvyVarB = vvs.a.b(this);
        ulp ulpVar = vtjVar.f;
        if (ulpVar == null) {
            ulpVar = new ulp(vtjVar);
        }
        vvyVarB.m(this, ulpVar);
    }

    @Override // defpackage.vvj
    public final /* synthetic */ vvi dZ() {
        vtw vtwVar = (vtw) a(5, null);
        vtwVar.x(this);
        return vtwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return vvs.a.b(this).j(this, (vuc) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (A()) {
            return j();
        }
        int i = this.M;
        if (i != 0) {
            return i;
        }
        int iJ = j();
        this.M = iJ;
        return iJ;
    }

    public final int j() {
        return vvs.a.b(this).b(this);
    }

    public final int k(vvy vvyVar) {
        return vvyVar == null ? vvs.a.b(this).a(this) : vvyVar.a(this);
    }

    @Override // defpackage.vvj
    public final int l() {
        if (A()) {
            int iK = k(null);
            if (iK >= 0) {
                return iK;
            }
            throw new IllegalStateException(a.cf(iK, "serialized size must be non-negative, was "));
        }
        int i = this.O & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iK2 = k(null);
        if (iK2 < 0) {
            throw new IllegalStateException(a.cf(iK2, "serialized size must be non-negative, was "));
        }
        this.O = (this.O & Integer.MIN_VALUE) | iK2;
        return iK2;
    }

    public final vtw m() {
        return (vtw) a(5, null);
    }

    public final vtw n(vuc vucVar) {
        vtw vtwVarM = m();
        vtwVarM.x(vucVar);
        return vtwVarM;
    }

    public final vuc o() {
        return (vuc) a(4, null);
    }

    @Override // defpackage.vvk
    public final /* synthetic */ vvj t() {
        return (vuc) a(6, null);
    }

    public final String toString() {
        String string = super.toString();
        int i = vvl.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        vvl.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.vvj
    public final vvq u() {
        return (vvq) a(7, null);
    }

    @Override // defpackage.vvk
    public final boolean v() {
        return z(this, true);
    }

    protected final void w() {
        vvs.a.b(this).g(this);
        x();
    }

    final void x() {
        this.O &= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }
}
