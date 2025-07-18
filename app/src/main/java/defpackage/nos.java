package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nos extends mip implements ndr {
    public static final UpbMiniTable d;
    volatile nrh e;
    volatile nrh f;
    volatile nrl g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$P))3333");
        d = upbMiniTableB;
        UpbMiniTable upbMiniTable = nrh.d;
        UpbMiniTable upbMiniTable2 = nrl.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, upbMiniTable2, upbMiniTable2);
    }

    public nos() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndr
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.ndr
    public final int h() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.ndr
    public final /* bridge */ /* synthetic */ ngp i() {
        if (!m()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nrh nrhVar = new nrh(ap(true != a ? 24 : 32, nrh.d));
        this.f = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ndr
    public final /* bridge */ /* synthetic */ ngp j() {
        if (!n()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nrh nrhVar = new nrh(ap(true != a ? 20 : 24, nrh.d));
        this.e = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ndr
    public final /* bridge */ /* synthetic */ ngr k() {
        if (!o()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nrl nrlVar = new nrl(ap(true != a ? 28 : 40, nrl.d));
        this.g = nrlVar;
        return nrlVar;
    }

    @Override // defpackage.ndr
    public final boolean l() {
        return aw(8, 2);
    }

    @Override // defpackage.ndr
    public final boolean m() {
        return this.f != null || aw(8, 8);
    }

    @Override // defpackage.ndr
    public final boolean n() {
        return this.e != null || aw(8, 4);
    }

    @Override // defpackage.ndr
    public final boolean o() {
        return this.g != null || aw(8, 16);
    }

    public nos(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
