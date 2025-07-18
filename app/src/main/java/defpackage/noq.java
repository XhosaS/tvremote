package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class noq extends mip implements ndo {
    public static final UpbMiniTable d;
    static final miv e;
    volatile String f;
    final AtomicReference g;
    final AtomicReference h;
    final AtomicReference i;
    final AtomicReference j;
    volatile npd k;
    final AtomicReference l;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$1!44GG/G4G33GG4");
        d = upbMiniTableB;
        upbMiniTableB.e(ner.a, nef.a, nor.d, npr.d, noh.d, neu.a, not.d, npd.d, nph.d, npp.d, npn.d, nem.a);
        e = upbMiniTableB.d(1);
    }

    public noq() {
        super(UpbMessage.a(d));
        this.g = new AtomicReference();
        this.h = new AtomicReference();
        this.i = new AtomicReference();
        this.j = new AtomicReference();
        this.l = new AtomicReference();
        new AtomicReference();
    }

    @Override // defpackage.ndo
    public final boolean A() {
        return aw(9, 1);
    }

    @Override // defpackage.ndo
    public final boolean B() {
        return aw(8, 32);
    }

    @Override // defpackage.ndo
    public final int C() {
        boolean z = UpbUnsafe.a;
        int iA = neg.a(Memory.peekInt(this.c + 20, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.ndo
    public final int D() {
        long j = true != a ? 60L : 28L;
        boolean z = UpbUnsafe.a;
        int iA = nen.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.ndo
    public final int E() {
        boolean z = UpbUnsafe.a;
        int iA = nes.a(Memory.peekInt(this.c + 16, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.ndo
    public final int F() {
        long j = true != a ? 36L : 24L;
        boolean z = UpbUnsafe.a;
        int iA = nev.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final void H() {
        AtomicReference atomicReference = this.i;
        if (atomicReference.get() == null) {
            nok.a(atomicReference, at(true != a ? 32 : 64, noh.d, new miq() { // from class: nol
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new noh(upbMessage);
                }
            }));
        }
    }

    final void I() {
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() == null) {
            nok.a(atomicReference, at(true != a ? 24 : 48, nor.d, new miq() { // from class: non
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new nor(upbMessage);
                }
            }));
        }
    }

    final void J() {
        AtomicReference atomicReference = this.j;
        if (atomicReference.get() == null) {
            nok.a(atomicReference, at(true != a ? 40 : 72, not.d, new miq() { // from class: nop
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new not(upbMessage);
                }
            }));
        }
    }

    final void K() {
        AtomicReference atomicReference = this.l;
        if (atomicReference.get() == null) {
            nok.a(atomicReference, at(true != a ? 52 : 96, npp.d, new miq() { // from class: nom
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new npp(upbMessage);
                }
            }));
        }
    }

    final void L() {
        AtomicReference atomicReference = this.h;
        if (atomicReference.get() == null) {
            nok.a(atomicReference, at(true != a ? 28 : 56, npr.d, new miq() { // from class: noo
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new npr(upbMessage);
                }
            }));
        }
    }

    @Override // defpackage.ndo
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.ndo
    public final int h() {
        H();
        return ((ArrayList) this.i.get()).size();
    }

    @Override // defpackage.ndo
    public final int i() {
        I();
        return ((ArrayList) this.g.get()).size();
    }

    @Override // defpackage.ndo
    public final int j() {
        J();
        return ((ArrayList) this.j.get()).size();
    }

    @Override // defpackage.ndo
    public final int k() {
        K();
        return ((ArrayList) this.l.get()).size();
    }

    @Override // defpackage.ndo
    public final int l() {
        L();
        return ((ArrayList) this.h.get()).size();
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ ndn m(int i) {
        H();
        return (noh) ((ArrayList) this.i.get()).get(i);
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ ndr n(int i) {
        I();
        return (nor) ((ArrayList) this.g.get()).get(i);
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ nds o(int i) {
        J();
        return (not) ((ArrayList) this.j.get()).get(i);
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ ndx p() {
        if (!y()) {
            return null;
        }
        if (this.k != null) {
            return this.k;
        }
        npd npdVar = new npd(ap(true != a ? 44 : 80, npd.d));
        this.k = npdVar;
        return npdVar;
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ neo q(int i) {
        K();
        return (npp) ((ArrayList) this.l.get()).get(i);
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ nep r(int i) {
        L();
        return (npr) ((ArrayList) this.h.get()).get(i);
    }

    @Override // defpackage.ndo
    public final String s() {
        if (!w()) {
            return null;
        }
        if (this.f == null) {
            this.f = aq(e.b);
        }
        return this.f;
    }

    @Override // defpackage.ndo
    public final boolean t() {
        if (v()) {
            return av(this.c, 10);
        }
        return true;
    }

    @Override // defpackage.ndo
    public final boolean u() {
        return aw(8, 4);
    }

    @Override // defpackage.ndo
    public final boolean v() {
        return aw(8, 16);
    }

    @Override // defpackage.ndo
    public final boolean w() {
        return aw(8, 1);
    }

    @Override // defpackage.ndo
    public final boolean x() {
        return aw(8, 8);
    }

    @Override // defpackage.ndo
    public final boolean y() {
        return this.k != null || aw(8, 64);
    }

    @Override // defpackage.ndo
    public final boolean z() {
        return aw(8, 2);
    }

    public noq(UpbMessage upbMessage) {
        super(upbMessage);
        this.g = new AtomicReference();
        this.h = new AtomicReference();
        this.i = new AtomicReference();
        this.j = new AtomicReference();
        this.l = new AtomicReference();
        new AtomicReference();
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
