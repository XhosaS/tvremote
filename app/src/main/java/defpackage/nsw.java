package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nsw extends mip implements nid {
    public static final UpbMiniTable d;
    static final miv e;
    volatile nxf f;
    volatile nvu g;
    final AtomicReference h;
    volatile String i;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$P33G1");
        d = upbMiniTableB;
        upbMiniTableB.e(nxf.d, nvu.d, nsu.d);
        e = upbMiniTableB.d(4);
    }

    public nsw() {
        super(UpbMessage.a(d));
        this.h = new AtomicReference();
    }

    @Override // defpackage.nid
    public final int g() {
        r();
        return ((ArrayList) this.h.get()).size();
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ nid h(int i) {
        r();
        return (nsu) ((ArrayList) this.h.get()).get(i);
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ nlr i() {
        if (!m()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nvu nvuVar = new nvu(ap(true != a ? 16 : 40, nvu.d));
        this.g = nvuVar;
        return nvuVar;
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ nnf j() {
        if (!n()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nxf nxfVar = new nxf(ap(true != a ? 12 : 32, nxf.d));
        this.f = nxfVar;
        return nxfVar;
    }

    @Override // defpackage.nid
    public final String k() {
        if (!l()) {
            return null;
        }
        if (this.i == null) {
            this.i = aq(e.b);
        }
        return this.i;
    }

    @Override // defpackage.nid
    public final boolean l() {
        return aw(8, 4);
    }

    @Override // defpackage.nid
    public final boolean m() {
        return this.g != null || aw(8, 2);
    }

    @Override // defpackage.nid
    public final boolean n() {
        return this.f != null || aw(8, 1);
    }

    final void r() {
        AtomicReference atomicReference = this.h;
        if (atomicReference.get() == null) {
            ArrayList arrayListAt = at(true != a ? 20 : 48, nsu.d, new miq() { // from class: nsv
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new nsu(upbMessage);
                }
            });
            while (!atomicReference.compareAndSet(null, arrayListAt) && atomicReference.get() == null) {
            }
        }
    }

    public nsw(UpbMessage upbMessage) {
        super(upbMessage);
        this.h = new AtomicReference();
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
