package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class ntg extends mip implements nir {
    public static final UpbMiniTable e;
    volatile noj f;
    volatile noj g;
    volatile noj h;
    volatile noj i;
    volatile noj j;
    volatile nsl k;
    volatile nsl l;
    volatile nrh m;
    volatile nrh n;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$3)33/33/!43333/");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = noj.d;
        UpbMiniTable upbMiniTable2 = nsl.d;
        UpbMiniTable upbMiniTable3 = nrh.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, nim.a, upbMiniTable2, upbMiniTable2, upbMiniTable3, upbMiniTable3);
    }

    public ntg() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nir
    public final int A() {
        long j = true != a ? 44L : 24L;
        boolean z = UpbUnsafe.a;
        int iA = nin.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nir
    public final int g() {
        long j = true != a ? 20L : 16L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo h() {
        if (!q()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        noj nojVar = new noj(ap(true != a ? 28 : 48, noj.d));
        this.h = nojVar;
        return nojVar;
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo i() {
        if (!r()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        noj nojVar = new noj(ap(true != a ? 36 : 64, noj.d));
        this.j = nojVar;
        return nojVar;
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo j() {
        if (!s()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        noj nojVar = new noj(ap(true != a ? 32 : 56, noj.d));
        this.i = nojVar;
        return nojVar;
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo k() {
        if (!y()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        noj nojVar = new noj(ap(true != a ? 16 : 32, noj.d));
        this.f = nojVar;
        return nojVar;
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo l() {
        if (!z()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        noj nojVar = new noj(ap(true != a ? 24 : 40, noj.d));
        this.g = nojVar;
        return nojVar;
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ngp m() {
        if (!w()) {
            return null;
        }
        if (this.n != null) {
            return this.n;
        }
        nrh nrhVar = new nrh(ap(true != a ? 60 : 96, nrh.d));
        this.n = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ngp n() {
        if (!x()) {
            return null;
        }
        if (this.m != null) {
            return this.m;
        }
        nrh nrhVar = new nrh(ap(true != a ? 56 : 88, nrh.d));
        this.m = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ nhm o() {
        if (!u()) {
            return null;
        }
        if (this.l != null) {
            return this.l;
        }
        nsl nslVar = new nsl(ap(true != a ? 52 : 80, nsl.d));
        this.l = nslVar;
        return nslVar;
    }

    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ nhm p() {
        if (!v()) {
            return null;
        }
        if (this.k != null) {
            return this.k;
        }
        nsl nslVar = new nsl(ap(true != a ? 48 : 72, nsl.d));
        this.k = nslVar;
        return nslVar;
    }

    @Override // defpackage.nir
    public final boolean q() {
        return this.h != null || aw(8, 8);
    }

    @Override // defpackage.nir
    public final boolean r() {
        return this.j != null || aw(8, 64);
    }

    @Override // defpackage.nir
    public final boolean s() {
        return this.i != null || aw(8, 32);
    }

    @Override // defpackage.nir
    public final boolean t() {
        return aw(8, 128);
    }

    @Override // defpackage.nir
    public final boolean u() {
        return this.l != null || aw(9, 8);
    }

    @Override // defpackage.nir
    public final boolean v() {
        return this.k != null || aw(9, 4);
    }

    @Override // defpackage.nir
    public final boolean w() {
        return this.n != null || aw(9, 32);
    }

    @Override // defpackage.nir
    public final boolean x() {
        return this.m != null || aw(9, 16);
    }

    @Override // defpackage.nir
    public final boolean y() {
        return this.f != null || aw(8, 1);
    }

    @Override // defpackage.nir
    public final boolean z() {
        return this.g != null || aw(8, 4);
    }

    public ntg(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
