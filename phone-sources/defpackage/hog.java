package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hog {
    private final hof a = new hof(null);
    private final Map b = new HashMap();

    private static void d(hof hofVar) {
        hof hofVar2 = hofVar.d;
        hofVar2.c = hofVar.c;
        hofVar.c.d = hofVar2;
    }

    private static void e(hof hofVar) {
        hofVar.c.d = hofVar;
        hofVar.d.c = hofVar;
    }

    public final Object a(hon honVar) {
        Map map = this.b;
        hof hofVar = (hof) map.get(honVar);
        if (hofVar == null) {
            hofVar = new hof(honVar);
            map.put(honVar, hofVar);
        } else {
            honVar.a();
        }
        d(hofVar);
        hof hofVar2 = this.a;
        hofVar.d = hofVar2;
        hofVar.c = hofVar2.c;
        e(hofVar);
        return hofVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hon, java.lang.Object] */
    public final Object b() {
        hof hofVar = this.a;
        for (hof hofVar2 = hofVar.d; !hofVar2.equals(hofVar); hofVar2 = hofVar2.d) {
            Object objB = hofVar2.b();
            if (objB != null) {
                return objB;
            }
            d(hofVar2);
            Map map = this.b;
            ?? r3 = hofVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(hon honVar, Object obj) {
        Map map = this.b;
        hof hofVar = (hof) map.get(honVar);
        if (hofVar == null) {
            hofVar = new hof(honVar);
            d(hofVar);
            hof hofVar2 = this.a;
            hofVar.d = hofVar2.d;
            hofVar.c = hofVar2;
            e(hofVar);
            map.put(honVar, hofVar);
        } else {
            honVar.a();
        }
        if (hofVar.b == null) {
            hofVar.b = new ArrayList();
        }
        hofVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        hof hofVar = this.a;
        hof hofVar2 = hofVar.c;
        boolean z = false;
        while (!hofVar2.equals(hofVar)) {
            sb.append('{');
            sb.append(hofVar2.a);
            sb.append(':');
            sb.append(hofVar2.a());
            sb.append("}, ");
            hofVar2 = hofVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
