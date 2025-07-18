package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agez extends afhk {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public agez(List list, AtomicInteger atomicInteger) {
        yqw.B(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((afhk) it.next()).hashCode();
        }
        this.c = iHashCode;
    }

    @Override // defpackage.afhk
    public final afhg a(afhh afhhVar) {
        int andIncrement = this.b.getAndIncrement() & Integer.MAX_VALUE;
        List list = this.a;
        return ((afhk) list.get(andIncrement % list.size())).a(afhhVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agez)) {
            return false;
        }
        agez agezVar = (agez) obj;
        if (agezVar == this) {
            return true;
        }
        if (this.c == agezVar.c && this.b == agezVar.b) {
            List list = this.a;
            int size = list.size();
            List list2 = agezVar.a;
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
        yqq yqqVarA = yqr.a(agez.class);
        yqqVarA.b("subchannelPickers", this.a);
        return yqqVarA.toString();
    }
}
