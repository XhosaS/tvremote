package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npu extends mip implements nep {
    public static final UpbMiniTable d;
    static final miv e;
    static final miv f;
    volatile String g;
    volatile String h;
    volatile nps i;
    volatile nov j;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$))1!)4)4/3!441)!433^)|*");
        d = upbMiniTableB;
        upbMiniTableB.e(neh.a, nec.a, nps.d, neh.a, ndp.a, nea.a, nph.d, nov.d);
        e = upbMiniTableB.d(3);
        f = upbMiniTableB.d(14);
    }

    public npu() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nep
    public final boolean A() {
        return ay(true != a ? 68 : 56, 7);
    }

    @Override // defpackage.nep
    public final boolean B() {
        return ay(true != a ? 68 : 56, 8);
    }

    @Override // defpackage.nep
    public final int C() {
        long j = true != a ? 56L : 52L;
        boolean z = UpbUnsafe.a;
        int iA = neb.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nep
    public final int D() {
        long j = true != a ? 44L : 40L;
        boolean z = UpbUnsafe.a;
        int iA = ndq.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nep
    public final int E() {
        long j = true != a ? 72L : 60L;
        boolean z = UpbUnsafe.a;
        int iA = ned.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nep
    public final int F() {
        long j = true != a ? 40L : 36L;
        boolean z = UpbUnsafe.a;
        int iA = nei.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nep
    public final int G() {
        boolean z = UpbUnsafe.a;
        int iA = nei.a(Memory.peekInt(this.c + 28, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nep
    @Deprecated
    public final float g() {
        long j = true != a ? 52L : 48L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nep
    public final float h() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 20, false));
    }

    @Override // defpackage.nep
    public final float i() {
        long j = true != a ? 36L : 32L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nep
    @Deprecated
    public final int j() {
        long j = true != a ? 48L : 44L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nep
    public final int k() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 24, false);
    }

    @Override // defpackage.nep
    public final int l() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.nep
    public final int m() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.nep
    public final int n() {
        if (!A()) {
            return 0;
        }
        long j = this.c;
        long j2 = true != a ? 72L : 60L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(j + j2, false);
    }

    @Override // defpackage.nep
    public final /* bridge */ /* synthetic */ ndt o() {
        if (!t()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nov novVar = new nov(ap(true != a ? 64 : 112, nov.d));
        this.j = novVar;
        return novVar;
    }

    @Override // defpackage.nep
    public final /* bridge */ /* synthetic */ neq p() {
        if (!z()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nps npsVar = new nps(ap(true != a ? 32 : 96, nps.d));
        this.i = npsVar;
        return npsVar;
    }

    @Override // defpackage.nep
    public final String q() {
        if (!v()) {
            return null;
        }
        if (this.h == null) {
            this.h = aq(f.b);
        }
        return this.h;
    }

    @Override // defpackage.nep
    public final String r() {
        if (!w()) {
            return null;
        }
        if (this.g == null) {
            this.g = aq(e.b);
        }
        return this.g;
    }

    @Override // defpackage.nep
    public final boolean s() {
        return av(this.c, 11);
    }

    @Override // defpackage.nep
    public final boolean t() {
        return this.j != null || aw(10, 1);
    }

    @Override // defpackage.nep
    public final boolean u() {
        return aw(8, 16);
    }

    @Override // defpackage.nep
    public final boolean v() {
        return aw(9, 8);
    }

    @Override // defpackage.nep
    public final boolean w() {
        return aw(8, 4);
    }

    @Override // defpackage.nep
    public final boolean x() {
        return aw(8, 2);
    }

    @Override // defpackage.nep
    public final boolean y() {
        return aw(9, 1);
    }

    @Override // defpackage.nep
    public final boolean z() {
        return this.i != null || aw(8, 128);
    }

    public npu(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
