package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nuk extends mip implements njs {
    public static final UpbMiniTable d;
    final AtomicReference e;
    volatile nul f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$G43/430");
        d = upbMiniTableB;
        upbMiniTableB.e(nun.d, njp.a, nul.d, njt.a, nuc.d);
        upbMiniTableB.d(7);
    }

    public nuk() {
        super(UpbMessage.a(d));
        this.e = new AtomicReference();
    }

    @Override // defpackage.njs
    public final int g() {
        r();
        return ((ArrayList) this.e.get()).size();
    }

    @Override // defpackage.njs
    public final /* bridge */ /* synthetic */ njv h() {
        if (!k()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nul nulVar = new nul(ap(true != a ? 20 : 48, nul.d));
        this.f = nulVar;
        return nulVar;
    }

    @Override // defpackage.njs
    public final /* bridge */ /* synthetic */ njw i(int i) {
        r();
        return (nun) ((ArrayList) this.e.get()).get(i);
    }

    @Override // defpackage.njs
    public final boolean j() {
        return av(this.c, 9);
    }

    @Override // defpackage.njs
    public final boolean k() {
        return this.f != null || aw(8, 2);
    }

    @Override // defpackage.njs
    public final int l() {
        long j = true != a ? 24L : 16L;
        boolean z = UpbUnsafe.a;
        int iA = nju.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.njs
    public final int m() {
        long j = true != a ? 16L : 12L;
        boolean z = UpbUnsafe.a;
        int iA = njq.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final void r() {
        AtomicReference atomicReference = this.e;
        if (atomicReference.get() == null) {
            ArrayList arrayListAt = at(true != a ? 12 : 40, nun.d, new miq() { // from class: nuj
                @Override // defpackage.miq
                public final mil a(UpbMessage upbMessage) {
                    return new nun(upbMessage);
                }
            });
            while (!atomicReference.compareAndSet(null, arrayListAt) && atomicReference.get() == null) {
            }
        }
    }

    public nuk(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = new AtomicReference();
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
