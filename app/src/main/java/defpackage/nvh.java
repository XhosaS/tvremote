package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nvh extends mip implements nku {
    public static final UpbMiniTable e;
    final AtomicReference f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$G");
        e = upbMiniTableB;
        upbMiniTableB.e(nva.d);
    }

    public nvh() {
        super(UpbMessage.a(e));
        this.f = new AtomicReference();
    }

    @Override // defpackage.nku
    public final int g() {
        r();
        return ((ArrayList) this.f.get()).size();
    }

    @Override // defpackage.nku
    public final /* bridge */ /* synthetic */ nkq h(int i) {
        r();
        return (nva) ((ArrayList) this.f.get()).get(i);
    }

    final void r() {
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null) {
            ArrayList arrayListAt = at(8, nva.d, new miq() { // from class: nvg
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new nva(upbMessage);
                }
            });
            while (!atomicReference.compareAndSet(null, arrayListAt) && atomicReference.get() == null) {
            }
        }
    }

    public nvh(UpbMessage upbMessage) {
        super(upbMessage);
        this.f = new AtomicReference();
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
