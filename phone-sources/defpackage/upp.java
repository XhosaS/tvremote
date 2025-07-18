package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upp implements upt {
    private final String a;
    private final upq b;

    public upp(Set set, upq upqVar) {
        this.a = b(set);
        this.b = upqVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            upr uprVar = (upr) it.next();
            sb.append(uprVar.a);
            sb.append('/');
            sb.append(uprVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.upt
    public final String a() {
        upq upqVar = this.b;
        if (upqVar.a().isEmpty()) {
            return this.a;
        }
        return this.a + " " + b(upqVar.a());
    }
}
