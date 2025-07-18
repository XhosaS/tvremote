package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nuu extends mip implements nki {
    public static final UpbMiniTable e;
    volatile nuy f;
    volatile nrh g;
    volatile nrh h;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$333");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nrh.d;
        upbMiniTableB.e(nuy.d, upbMiniTable, upbMiniTable);
    }

    public nuu() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nki
    public final /* bridge */ /* synthetic */ ngp g() {
        if (!j()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nrh nrhVar = new nrh(ap(true != a ? 16 : 24, nrh.d));
        this.g = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nki
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!l()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nrh nrhVar = new nrh(ap(true != a ? 20 : 32, nrh.d));
        this.h = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nki
    public final /* bridge */ /* synthetic */ nkp i() {
        if (!k()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nuy nuyVar = new nuy(ap(true != a ? 12 : 16, nuy.d));
        this.f = nuyVar;
        return nuyVar;
    }

    @Override // defpackage.nki
    public final boolean j() {
        return this.g != null || aw(8, 2);
    }

    @Override // defpackage.nki
    public final boolean k() {
        return this.f != null || aw(8, 1);
    }

    @Override // defpackage.nki
    public final boolean l() {
        return this.h != null || aw(8, 4);
    }

    public nuu(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
