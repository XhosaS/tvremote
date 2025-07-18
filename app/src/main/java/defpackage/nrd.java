package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nrd extends mip implements ngd {
    public static final UpbMiniTable e;
    final AtomicReference f;
    volatile nsl g;
    volatile nrh h;
    volatile nrh i;
    volatile nrh j;
    volatile nqy k;
    volatile nqt l;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$G4!b3////344334334///");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nrh.d;
        upbMiniTableB.e(nre.d, nge.a, nsl.d, nrh.d, ngl.a, ngj.a, upbMiniTable, upbMiniTable, ngg.a, nqy.d, nqt.d, ngn.a);
    }

    public nrd() {
        super(UpbMessage.a(e));
        this.f = new AtomicReference();
    }

    @Override // defpackage.ngd
    public final int A() {
        long j = true != a ? 24L : 20L;
        boolean z = UpbUnsafe.a;
        int iA = ngf.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.ngd
    public final int B() {
        long j = true != a ? 56L : 36L;
        boolean z = UpbUnsafe.a;
        int iA = ngh.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.ngd
    public final int C() {
        long j = true != a ? 40L : 28L;
        boolean z = UpbUnsafe.a;
        int iA = ngm.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.ngd
    public final int D() {
        long j = true != a ? 68L : 40L;
        boolean z = UpbUnsafe.a;
        int iA = ngo.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final void E() {
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null) {
            ArrayList arrayListAt = at(true != a ? 20 : 48, nre.d, new miq() { // from class: nrc
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new nre(upbMessage);
                }
            });
            while (!atomicReference.compareAndSet(null, arrayListAt) && atomicReference.get() == null) {
            }
        }
    }

    @Override // defpackage.ngd
    @Deprecated
    public final int g() {
        E();
        return ((ArrayList) this.f.get()).size();
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ nfs h() {
        if (!r()) {
            return null;
        }
        if (this.l != null) {
            return this.l;
        }
        nqt nqtVar = new nqt(ap(true != a ? 64 : 96, nqt.d));
        this.l = nqtVar;
        return nqtVar;
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ nfz i() {
        if (!s()) {
            return null;
        }
        if (this.k != null) {
            return this.k;
        }
        nqy nqyVar = new nqy(ap(true != a ? 60 : 88, nqy.d));
        this.k = nqyVar;
        return nqyVar;
    }

    @Override // defpackage.ngd
    @Deprecated
    public final /* bridge */ /* synthetic */ ngi j(int i) {
        E();
        return (nre) ((ArrayList) this.f.get()).get(i);
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ ngp k() {
        if (!w()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nrh nrhVar = new nrh(ap(true != a ? 36 : 64, nrh.d));
        this.h = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ ngp l() {
        if (!x()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nrh nrhVar = new nrh(ap(true != a ? 48 : 72, nrh.d));
        this.i = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ ngp m() {
        if (!y()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nrh nrhVar = new nrh(ap(true != a ? 52 : 80, nrh.d));
        this.j = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ nhm n() {
        if (!t()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nsl nslVar = new nsl(ap(true != a ? 32 : 56, nsl.d));
        this.g = nslVar;
        return nslVar;
    }

    @Override // defpackage.ngd
    public final boolean o() {
        return av(this.c, 15);
    }

    @Override // defpackage.ngd
    public final boolean p() {
        return av(this.c, 16);
    }

    @Override // defpackage.ngd
    public final boolean q() {
        return av(this.c, 17);
    }

    @Override // defpackage.ngd
    public final boolean r() {
        return this.l != null || aw(9, 64);
    }

    @Override // defpackage.ngd
    public final boolean s() {
        return this.k != null || aw(9, 32);
    }

    @Override // defpackage.ngd
    public final boolean t() {
        return this.g != null || aw(8, 4);
    }

    @Override // defpackage.ngd
    public final boolean u() {
        return aw(10, 2);
    }

    @Override // defpackage.ngd
    public final boolean v() {
        return aw(10, 4);
    }

    @Override // defpackage.ngd
    public final boolean w() {
        return this.h != null || aw(8, 128);
    }

    @Override // defpackage.ngd
    public final boolean x() {
        return this.i != null || aw(9, 4);
    }

    @Override // defpackage.ngd
    public final boolean y() {
        return this.j != null || aw(9, 8);
    }

    @Override // defpackage.ngd
    public final int z() {
        long j = true != a ? 44L : 32L;
        boolean z = UpbUnsafe.a;
        int iA = ngk.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nrd(UpbMessage upbMessage) {
        super(upbMessage);
        this.f = new AtomicReference();
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
