package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nwg extends mip implements nmd {
    public static final UpbMiniTable e;
    volatile nvq f;
    volatile nwh g;
    volatile nrh h;
    volatile nrh i;
    volatile nrh j;
    volatile nwa k;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$433//33343");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nrh.d;
        upbMiniTableB.e(nme.a, nvq.d, nwh.d, upbMiniTable, upbMiniTable, upbMiniTable, nmg.a, nwa.d);
    }

    public nwg() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ ngp g() {
        if (!r()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nrh nrhVar = new nrh(ap(true != a ? 24 : 40, nrh.d));
        this.h = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!s()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nrh nrhVar = new nrh(ap(true != a ? 28 : 48, nrh.d));
        this.i = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ ngp i() {
        if (!t()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nrh nrhVar = new nrh(ap(true != a ? 32 : 56, nrh.d));
        this.j = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ nlp j() {
        if (!o()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nvq nvqVar = new nvq(ap(true != a ? 16 : 24, nvq.d));
        this.f = nvqVar;
        return nvqVar;
    }

    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ nlu k() {
        if (!q()) {
            return null;
        }
        if (this.k != null) {
            return this.k;
        }
        nwa nwaVar = new nwa(ap(true != a ? 40 : 64, nwa.d));
        this.k = nwaVar;
        return nwaVar;
    }

    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ nmi l() {
        if (!p()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nwh nwhVar = new nwh(ap(true != a ? 20 : 32, nwh.d));
        this.g = nwhVar;
        return nwhVar;
    }

    @Override // defpackage.nmd
    public final boolean m() {
        return av(this.c, 10);
    }

    @Override // defpackage.nmd
    public final boolean n() {
        return av(this.c, 11);
    }

    @Override // defpackage.nmd
    public final boolean o() {
        return this.f != null || aw(8, 2);
    }

    @Override // defpackage.nmd
    public final boolean p() {
        return this.g != null || aw(8, 4);
    }

    @Override // defpackage.nmd
    public final boolean q() {
        return this.k != null || aw(9, 2);
    }

    @Override // defpackage.nmd
    public final boolean r() {
        return this.h != null || aw(8, 32);
    }

    @Override // defpackage.nmd
    public final boolean s() {
        return this.i != null || aw(8, 64);
    }

    @Override // defpackage.nmd
    public final boolean t() {
        return this.j != null || aw(8, 128);
    }

    @Override // defpackage.nmd
    public final int u() {
        boolean z = UpbUnsafe.a;
        int iA = nmf.a(Memory.peekInt(this.c + 12, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nmd
    public final int v() {
        long j = true != a ? 36L : 16L;
        boolean z = UpbUnsafe.a;
        int iA = nmh.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nwg(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
