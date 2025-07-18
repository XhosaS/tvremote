package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nst extends mip implements nhw {
    public static final UpbMiniTable e;
    volatile noj f;
    volatile noj g;
    volatile nrh h;
    volatile nrh i;
    volatile nrh j;
    volatile nrh k;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$33333a/4(434)///4(");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = noj.d;
        UpbMiniTable upbMiniTable2 = nrh.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, upbMiniTable2, upbMiniTable2, upbMiniTable2, nhx.a, nhz.a, nrh.d, nhr.a, nib.a);
    }

    public nst() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nhw
    public final boolean A() {
        return aw(9, 128);
    }

    @Override // defpackage.nhw
    public final boolean B() {
        return this.f != null || aw(8, 1);
    }

    @Override // defpackage.nhw
    public final int C() {
        long j = true != a ? 36L : 16L;
        boolean z = UpbUnsafe.a;
        int iA = nhy.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nhw
    public final int D() {
        long j = true != a ? 52L : 28L;
        boolean z = UpbUnsafe.a;
        int iA = nhs.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nhw
    public final int E() {
        long j = true != a ? 44L : 24L;
        boolean z = UpbUnsafe.a;
        int iA = nia.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nhw
    public final int F() {
        long j = true != a ? 60L : 36L;
        boolean z = UpbUnsafe.a;
        int iA = nic.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nhw
    public final int g() {
        long j = true != a ? 56L : 32L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nhw
    public final int h() {
        long j = true != a ? 64L : 40L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nhw
    public final int i() {
        long j = true != a ? 40L : 20L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ndo j() {
        if (!z()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        noj nojVar = new noj(ap(true != a ? 20 : 56, noj.d));
        this.g = nojVar;
        return nojVar;
    }

    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ndo k() {
        if (!B()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        noj nojVar = new noj(ap(true != a ? 16 : 48, noj.d));
        this.f = nojVar;
        return nojVar;
    }

    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ngp l() {
        if (!v()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nrh nrhVar = new nrh(ap(true != a ? 28 : 72, nrh.d));
        this.i = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ngp m() {
        if (!w()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nrh nrhVar = new nrh(ap(true != a ? 32 : 80, nrh.d));
        this.j = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ngp n() {
        if (!x()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nrh nrhVar = new nrh(ap(true != a ? 24 : 64, nrh.d));
        this.h = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ngp o() {
        if (!y()) {
            return null;
        }
        if (this.k != null) {
            return this.k;
        }
        nrh nrhVar = new nrh(ap(true != a ? 48 : 88, nrh.d));
        this.k = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nhw
    public final boolean p() {
        return av(this.c, 14);
    }

    @Override // defpackage.nhw
    public final boolean q() {
        return av(this.c, 12);
    }

    @Override // defpackage.nhw
    public final boolean r() {
        return av(this.c, 11);
    }

    @Override // defpackage.nhw
    public final boolean s() {
        return av(this.c, 13);
    }

    @Override // defpackage.nhw
    public final boolean t() {
        return aw(9, 8);
    }

    @Override // defpackage.nhw
    public final boolean u() {
        return aw(8, 32);
    }

    @Override // defpackage.nhw
    public final boolean v() {
        return this.i != null || aw(8, 8);
    }

    @Override // defpackage.nhw
    public final boolean w() {
        return this.j != null || aw(8, 16);
    }

    @Override // defpackage.nhw
    public final boolean x() {
        return this.h != null || aw(8, 4);
    }

    @Override // defpackage.nhw
    public final boolean y() {
        return this.k != null || aw(9, 2);
    }

    @Override // defpackage.nhw
    public final boolean z() {
        return this.g != null || aw(8, 2);
    }

    public nst(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
