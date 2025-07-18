package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nvn extends mip implements nlk {
    public static final UpbMiniTable e;
    volatile nsl f;
    volatile nsn g;
    volatile nsn h;
    volatile nsn i;
    volatile nsn j;
    volatile nsn k;
    volatile nsn l;
    volatile nsl m;
    volatile nsl n;
    volatile nsn o;
    volatile ntm p;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$333333333444!!344!444b3");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nsn.d;
        UpbMiniTable upbMiniTable2 = nsl.d;
        UpbMiniTable upbMiniTable3 = nkz.a;
        upbMiniTableB.e(nsl.d, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable2, upbMiniTable2, nlb.a, nlf.a, upbMiniTable3, nsn.d, upbMiniTable3, nll.a, nln.a, nld.a, nkz.a, ntm.d);
    }

    public nvn() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nlk
    public final boolean A() {
        return this.l != null || aw(8, 64);
    }

    @Override // defpackage.nlk
    public final boolean B() {
        return this.k != null || aw(8, 32);
    }

    @Override // defpackage.nlk
    public final boolean C() {
        return this.j != null || aw(8, 16);
    }

    @Override // defpackage.nlk
    public final boolean D() {
        return this.i != null || aw(8, 8);
    }

    @Override // defpackage.nlk
    public final boolean E() {
        return this.n != null || aw(9, 1);
    }

    @Override // defpackage.nlk
    public final boolean F() {
        return this.f != null || aw(8, 1);
    }

    @Override // defpackage.nlk
    public final boolean G() {
        return this.h != null || aw(8, 4);
    }

    @Override // defpackage.nlk
    public final int H() {
        if (aw(10, 16)) {
            long j = this.c;
            long j2 = true != a ? 92L : 52L;
            boolean z = UpbUnsafe.a;
            int iA = nla.a(Memory.peekInt(j + j2, false));
            if (iA != 0) {
                return iA;
            }
        }
        return 1;
    }

    @Override // defpackage.nlk
    public final int I() {
        long j = true != a ? 56L : 20L;
        boolean z = UpbUnsafe.a;
        int iA = nla.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nlk
    public final int J() {
        long j = true != a ? 72L : 32L;
        boolean z = UpbUnsafe.a;
        int iA = nla.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nlk
    public final int K() {
        long j = true != a ? 48L : 12L;
        boolean z = UpbUnsafe.a;
        int iA = nlc.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nlk
    public final int L() {
        long j = true != a ? 88L : 48L;
        boolean z = UpbUnsafe.a;
        int iA = nle.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nlk
    public final int M() {
        long j = true != a ? 52L : 16L;
        boolean z = UpbUnsafe.a;
        int iA = nlg.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nlk
    public final int N() {
        long j = true != a ? 76L : 36L;
        boolean z = UpbUnsafe.a;
        int iA = nlm.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nlk
    public final int O() {
        long j = true != a ? 84L : 44L;
        boolean z = UpbUnsafe.a;
        int iA = nlo.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.nlk
    public final float g() {
        long j = true != a ? 80L : 40L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nlk
    public final float h() {
        long j = true != a ? 60L : 24L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nlk
    public final float i() {
        if (!x()) {
            return 1.0f;
        }
        long j = this.c + (true != a ? 64L : 28L);
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j, false));
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhm j() {
        if (!z()) {
            return null;
        }
        if (this.m != null) {
            return this.m;
        }
        nsl nslVar = new nsl(ap(true != a ? 40 : 112, nsl.d));
        this.m = nslVar;
        return nslVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhm k() {
        if (!E()) {
            return null;
        }
        if (this.n != null) {
            return this.n;
        }
        nsl nslVar = new nsl(ap(true != a ? 44 : 120, nsl.d));
        this.n = nslVar;
        return nslVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhm l() {
        if (!F()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nsl nslVar = new nsl(ap(true != a ? 12 : 56, nsl.d));
        this.f = nslVar;
        return nslVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn m() {
        if (!u()) {
            return null;
        }
        if (this.o != null) {
            return this.o;
        }
        nsn nsnVar = new nsn(ap(true != a ? 68 : 128, nsn.d));
        this.o = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn n() {
        if (!y()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nsn nsnVar = new nsn(ap(true != a ? 16 : 64, nsn.d));
        this.g = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn o() {
        if (!A()) {
            return null;
        }
        if (this.l != null) {
            return this.l;
        }
        nsn nsnVar = new nsn(ap(true != a ? 36 : 104, nsn.d));
        this.l = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn p() {
        if (!B()) {
            return null;
        }
        if (this.k != null) {
            return this.k;
        }
        nsn nsnVar = new nsn(ap(true != a ? 32 : 96, nsn.d));
        this.k = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn q() {
        if (!C()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nsn nsnVar = new nsn(ap(true != a ? 28 : 88, nsn.d));
        this.j = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn r() {
        if (!D()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nsn nsnVar = new nsn(ap(true != a ? 24 : 80, nsn.d));
        this.i = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn s() {
        if (!G()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nsn nsnVar = new nsn(ap(true != a ? 20 : 72, nsn.d));
        this.h = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nix t() {
        if (!v()) {
            return null;
        }
        if (this.p != null) {
            return this.p;
        }
        ntm ntmVar = new ntm(ap(true != a ? 96 : 136, ntm.d));
        this.p = ntmVar;
        return ntmVar;
    }

    @Override // defpackage.nlk
    public final boolean u() {
        return this.o != null || aw(9, 64);
    }

    @Override // defpackage.nlk
    public final boolean v() {
        return this.p != null || aw(10, 32);
    }

    @Override // defpackage.nlk
    public final boolean w() {
        return aw(9, 16);
    }

    @Override // defpackage.nlk
    public final boolean x() {
        return aw(9, 32);
    }

    @Override // defpackage.nlk
    public final boolean y() {
        return this.g != null || aw(8, 2);
    }

    @Override // defpackage.nlk
    public final boolean z() {
        return this.m != null || aw(8, 128);
    }

    public nvn(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
