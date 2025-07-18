package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixk extends icu implements iej {
    public List g;
    private List h;
    private boolean i;

    public ixk() {
        yhb yhbVar = yhb.a;
        this.h = yhbVar;
        this.g = yhbVar;
    }

    public final void a(List list) {
        boolean z = this.i;
        if (z) {
            ed();
        }
        this.h = list;
        if (z) {
            ec();
        }
    }

    @Override // defpackage.iej
    public final void dM() {
        eb();
    }

    @Override // defpackage.icu
    protected final void ec() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ids) it.next()).ea(this);
        }
        this.i = true;
    }

    @Override // defpackage.icu
    protected final void ed() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ids) it.next()).ee(this);
        }
        this.i = false;
    }
}
