package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbv extends cck {
    public cbv(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.cck
    public final void a(Iterator it, ccj ccjVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                ccjVar.a(this.a, next);
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
            ccjVar.a(str, sb.toString());
        }
    }
}
