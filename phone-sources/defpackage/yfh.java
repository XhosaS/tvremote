package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yfh extends xrv {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public yfh(List list, AtomicInteger atomicInteger) {
        sij.o(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((xrv) it.next()).hashCode();
        }
        this.c = iHashCode;
    }

    @Override // defpackage.xrv
    public final xrr a(xrs xrsVar) {
        int andIncrement = this.b.getAndIncrement() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        List list = this.a;
        return ((xrv) list.get(andIncrement % list.size())).a(xrsVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yfh)) {
            return false;
        }
        yfh yfhVar = (yfh) obj;
        if (yfhVar == this) {
            return true;
        }
        if (this.c == yfhVar.c && this.b == yfhVar.b) {
            List list = this.a;
            int size = list.size();
            List list2 = yfhVar.a;
            if (size == list2.size() && new HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        tss tssVarG = sij.G(yfh.class);
        tssVarG.b("subchannelPickers", this.a);
        return tssVarG.toString();
    }
}
