package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nux extends mip implements nkm {
    public static final UpbMiniTable e;
    volatile nuy f;
    volatile nuy g;
    volatile nrh h;
    volatile nrh i;
    volatile nrh j;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$33)3333");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nuy.d;
        UpbMiniTable upbMiniTable2 = nrh.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, upbMiniTable2, upbMiniTable2, upbMiniTable2, upbMiniTable2);
    }

    public nux() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nkm
    public final int g() {
        long j = true != a ? 20L : 12L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!o()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nrh nrhVar = new nrh(ap(true != a ? 28 : 40, nrh.d));
        this.i = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ ngp i() {
        if (!p()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nrh nrhVar = new nrh(ap(true != a ? 32 : 48, nrh.d));
        this.j = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ ngp j() {
        if (!q()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nrh nrhVar = new nrh(ap(true != a ? 24 : 32, nrh.d));
        this.h = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ nkp k() {
        if (!m()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nuy nuyVar = new nuy(ap(true != a ? 12 : 16, nuy.d));
        this.f = nuyVar;
        return nuyVar;
    }

    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ nkp l() {
        if (!n()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nuy nuyVar = new nuy(ap(true != a ? 16 : 24, nuy.d));
        this.g = nuyVar;
        return nuyVar;
    }

    @Override // defpackage.nkm
    public final boolean m() {
        return this.f != null || aw(8, 1);
    }

    @Override // defpackage.nkm
    public final boolean n() {
        return this.g != null || aw(8, 2);
    }

    @Override // defpackage.nkm
    public final boolean o() {
        return this.i != null || aw(8, 16);
    }

    @Override // defpackage.nkm
    public final boolean p() {
        return this.j != null || aw(8, 32);
    }

    @Override // defpackage.nkm
    public final boolean q() {
        return this.h != null || aw(8, 8);
    }

    public nux(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
