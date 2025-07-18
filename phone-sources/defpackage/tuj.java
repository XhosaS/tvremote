package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tuj extends tuy {
    public tuj(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.tuy
    public final void a(Iterator it, tux tuxVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                tuxVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            tuxVar.a(str, sb.toString());
        }
    }
}
