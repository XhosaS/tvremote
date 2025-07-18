package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgl extends abww implements abyr {
    public abgl() {
        super(abgm.b);
    }

    public final void a(Iterable iterable) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        abgm abgmVar = (abgm) this.b;
        abxk abxkVar = abgm.a;
        abxj abxjVar = abgmVar.l;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            abgmVar.l = abxjVar.g(size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abgmVar.l.h(((abez) it.next()).a());
        }
    }
}
