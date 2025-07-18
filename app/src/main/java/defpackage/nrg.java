package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nrg extends mip implements ngi {
    public static final UpbMiniTable d;
    final AtomicReference e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$G");
        d = upbMiniTableB;
        upbMiniTableB.e(nsu.d);
    }

    public nrg() {
        super(UpbMessage.a(d));
        this.e = new AtomicReference();
    }

    @Override // defpackage.ngi
    public final int g() {
        r();
        return ((ArrayList) this.e.get()).size();
    }

    @Override // defpackage.ngi
    public final /* bridge */ /* synthetic */ nid h(int i) {
        r();
        return (nsu) ((ArrayList) this.e.get()).get(i);
    }

    final void r() {
        AtomicReference atomicReference = this.e;
        if (atomicReference.get() == null) {
            ArrayList arrayListAt = at(8, nsu.d, new miq() { // from class: nrf
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new nsu(upbMessage);
                }
            });
            while (!atomicReference.compareAndSet(null, arrayListAt) && atomicReference.get() == null) {
            }
        }
    }

    public nrg(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = new AtomicReference();
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
