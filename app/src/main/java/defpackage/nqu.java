package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqu extends mip implements nfs {
    public static final UpbMiniTable d;
    volatile nsj e;
    volatile nvs f;
    volatile nsp g;
    volatile nvw h;
    volatile ntk i;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$33333");
        d = upbMiniTableB;
        upbMiniTableB.e(nsj.d, nvs.d, nsp.d, nvw.d, ntk.d);
    }

    public nqu() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ nhl g() {
        if (!l()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nsj nsjVar = new nsj(ap(true != a ? 12 : 16, nsj.d));
        this.e = nsjVar;
        return nsjVar;
    }

    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ nhq h() {
        if (!m()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nsp nspVar = new nsp(ap(true != a ? 20 : 32, nsp.d));
        this.g = nspVar;
        return nspVar;
    }

    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ niw i() {
        if (!n()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        ntk ntkVar = new ntk(ap(true != a ? 28 : 48, ntk.d));
        this.i = ntkVar;
        return ntkVar;
    }

    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ nlq j() {
        if (!o()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nvs nvsVar = new nvs(ap(true != a ? 16 : 24, nvs.d));
        this.f = nvsVar;
        return nvsVar;
    }

    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ nls k() {
        if (!p()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nvw nvwVar = new nvw(ap(true != a ? 24 : 40, nvw.d));
        this.h = nvwVar;
        return nvwVar;
    }

    @Override // defpackage.nfs
    public final boolean l() {
        return this.e != null || aw(8, 1);
    }

    @Override // defpackage.nfs
    public final boolean m() {
        return this.g != null || aw(8, 4);
    }

    @Override // defpackage.nfs
    public final boolean n() {
        return this.i != null || aw(8, 16);
    }

    @Override // defpackage.nfs
    public final boolean o() {
        return this.f != null || aw(8, 2);
    }

    @Override // defpackage.nfs
    public final boolean p() {
        return this.h != null || aw(8, 8);
    }

    public nqu(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
