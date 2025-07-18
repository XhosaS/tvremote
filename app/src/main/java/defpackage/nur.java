package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nur extends mip implements nke {
    public static final UpbMiniTable e;
    volatile nui f;
    volatile nui g;
    volatile nui h;
    volatile nrh i;
    volatile nrh j;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$3334!a43333");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nui.d;
        UpbMiniTable upbMiniTable2 = nrh.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, upbMiniTable, njz.a, njx.a, upbMiniTable2, upbMiniTable2, upbMiniTable2, upbMiniTable2);
    }

    public nur() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ ngp g() {
        if (!o()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nrh nrhVar = new nrh(ap(true != a ? 40 : 56, nrh.d));
        this.j = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!p()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nrh nrhVar = new nrh(ap(true != a ? 36 : 48, nrh.d));
        this.i = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ njs i() {
        if (!l()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nui nuiVar = new nui(ap(true != a ? 16 : 32, nui.d));
        this.g = nuiVar;
        return nuiVar;
    }

    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ njs j() {
        if (!m()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nui nuiVar = new nui(ap(true != a ? 20 : 40, nui.d));
        this.h = nuiVar;
        return nuiVar;
    }

    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ njs k() {
        if (!n()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nui nuiVar = new nui(ap(true != a ? 12 : 24, nui.d));
        this.f = nuiVar;
        return nuiVar;
    }

    @Override // defpackage.nke
    public final boolean l() {
        return this.g != null || aw(8, 2);
    }

    @Override // defpackage.nke
    public final boolean m() {
        return this.h != null || aw(8, 4);
    }

    @Override // defpackage.nke
    public final boolean n() {
        return this.f != null || aw(8, 1);
    }

    @Override // defpackage.nke
    public final boolean o() {
        return this.j != null || aw(8, 128);
    }

    @Override // defpackage.nke
    public final boolean p() {
        return this.i != null || aw(8, 64);
    }

    @Override // defpackage.nke
    public final int q() {
        long j = true != a ? 32L : 20L;
        boolean z = UpbUnsafe.a;
        int iA = njy.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nke
    public final int r() {
        long j = true != a ? 24L : 12L;
        boolean z = UpbUnsafe.a;
        int iA = nka.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nur(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
