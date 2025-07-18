package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zeb extends zer {
    public zeb(Class cls) {
        super("group_by", cls, true, true);
    }

    @Override // defpackage.zer
    public final void a(Iterator it, zeq zeqVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                zeqVar.a(this.a, next);
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
            zeqVar.a(str, sb.toString());
        }
    }
}
