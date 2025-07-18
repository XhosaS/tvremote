package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nvk extends mip implements nky {
    public static final UpbMiniTable e;
    static final miv f;
    volatile nuy g;
    volatile nuy h;
    volatile String i;
    volatile nrh j;
    volatile nrh k;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$3313333");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nuy.d;
        UpbMiniTable upbMiniTable2 = nrh.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, upbMiniTable2, upbMiniTable2, upbMiniTable2, nvb.d);
        f = upbMiniTableB.d(3);
    }

    public nvk() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ ngp g() {
        if (!l()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nrh nrhVar = new nrh(ap(true != a ? 20 : 48, nrh.d));
        this.j = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!m()) {
            return null;
        }
        if (this.k != null) {
            return this.k;
        }
        nrh nrhVar = new nrh(ap(true != a ? 24 : 56, nrh.d));
        this.k = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ nkp i() {
        if (!n()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nuy nuyVar = new nuy(ap(true != a ? 12 : 32, nuy.d));
        this.g = nuyVar;
        return nuyVar;
    }

    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ nkp j() {
        if (!o()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nuy nuyVar = new nuy(ap(true != a ? 16 : 40, nuy.d));
        this.h = nuyVar;
        return nuyVar;
    }

    @Override // defpackage.nky
    public final String k() {
        if (!aw(8, 4)) {
            return null;
        }
        if (this.i == null) {
            this.i = aq(f.b);
        }
        return this.i;
    }

    @Override // defpackage.nky
    public final boolean l() {
        return this.j != null || aw(8, 8);
    }

    @Override // defpackage.nky
    public final boolean m() {
        return this.k != null || aw(8, 16);
    }

    @Override // defpackage.nky
    public final boolean n() {
        return this.g != null || aw(8, 1);
    }

    @Override // defpackage.nky
    public final boolean o() {
        return this.h != null || aw(8, 2);
    }

    public nvk(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
