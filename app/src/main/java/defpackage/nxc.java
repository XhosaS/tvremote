package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nxc extends mip implements nnb {
    public static final UpbMiniTable e;
    final AtomicReference f;
    volatile nrh g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$Ga3");
        e = upbMiniTableB;
        upbMiniTableB.e(nxd.d, nrh.d);
    }

    public nxc() {
        super(UpbMessage.a(e));
        this.f = new AtomicReference();
    }

    @Override // defpackage.nnb
    public final int g() {
        r();
        return ((ArrayList) this.f.get()).size();
    }

    @Override // defpackage.nnb
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!j()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nrh nrhVar = new nrh(ap(true != a ? 16 : 24, nrh.d));
        this.g = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nnb
    public final /* bridge */ /* synthetic */ nnc i(int i) {
        r();
        return (nxd) ((ArrayList) this.f.get()).get(i);
    }

    @Override // defpackage.nnb
    public final boolean j() {
        return this.g != null || aw(8, 1);
    }

    final void r() {
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null) {
            ArrayList arrayListAt = at(true != a ? 12 : 16, nxd.d, new miq() { // from class: nxb
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new nxd(upbMessage);
                }
            });
            while (!atomicReference.compareAndSet(null, arrayListAt) && atomicReference.get() == null) {
            }
        }
    }

    public nxc(UpbMessage upbMessage) {
        super(upbMessage);
        this.f = new AtomicReference();
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
