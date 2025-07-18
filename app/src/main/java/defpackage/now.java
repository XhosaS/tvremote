package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class now extends mip implements ndt {
    public static final UpbMiniTable d;
    volatile noz e;
    volatile npb f;
    volatile nox g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$333^!|#|$");
        d = upbMiniTableB;
        upbMiniTableB.e(noz.d, npb.d, nox.d);
    }

    public now() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndt
    public final /* bridge */ /* synthetic */ ndu g() {
        if (!j()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nox noxVar = new nox(ap(true != a ? 12 : 16, nox.d));
        this.g = noxVar;
        return noxVar;
    }

    @Override // defpackage.ndt
    public final /* bridge */ /* synthetic */ ndv h() {
        if (!k()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        noz nozVar = new noz(ap(true != a ? 12 : 16, noz.d));
        this.e = nozVar;
        return nozVar;
    }

    @Override // defpackage.ndt
    public final /* bridge */ /* synthetic */ ndw i() {
        if (!l()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        npb npbVar = new npb(ap(true != a ? 12 : 16, npb.d));
        this.f = npbVar;
        return npbVar;
    }

    @Override // defpackage.ndt
    public final boolean j() {
        return this.g != null || ay(8, 3);
    }

    @Override // defpackage.ndt
    public final boolean k() {
        return this.e != null || ay(8, 1);
    }

    @Override // defpackage.ndt
    public final boolean l() {
        return this.f != null || ay(8, 2);
    }

    public now(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
