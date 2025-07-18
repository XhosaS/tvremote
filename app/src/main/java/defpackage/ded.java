package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class ded {
    private final dec a = new dec(null);
    private final Map b = new HashMap();

    private static void d(dec decVar) {
        dec decVar2 = decVar.d;
        decVar2.c = decVar.c;
        decVar.c.d = decVar2;
    }

    private static void e(dec decVar) {
        decVar.c.d = decVar;
        decVar.d.c = decVar;
    }

    public final Object a(dek dekVar) {
        Map map = this.b;
        dec decVar = (dec) map.get(dekVar);
        if (decVar == null) {
            decVar = new dec(dekVar);
            map.put(dekVar, decVar);
        } else {
            dekVar.a();
        }
        d(decVar);
        dec decVar2 = this.a;
        decVar.d = decVar2;
        decVar.c = decVar2.c;
        e(decVar);
        return decVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [dek, java.lang.Object] */
    public final Object b() {
        dec decVar = this.a;
        for (dec decVar2 = decVar.d; !decVar2.equals(decVar); decVar2 = decVar2.d) {
            Object objB = decVar2.b();
            if (objB != null) {
                return objB;
            }
            d(decVar2);
            Map map = this.b;
            ?? r3 = decVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(dek dekVar, Object obj) {
        Map map = this.b;
        dec decVar = (dec) map.get(dekVar);
        if (decVar == null) {
            decVar = new dec(dekVar);
            d(decVar);
            dec decVar2 = this.a;
            decVar.d = decVar2.d;
            decVar.c = decVar2;
            e(decVar);
            map.put(dekVar, decVar);
        } else {
            dekVar.a();
        }
        if (decVar.b == null) {
            decVar.b = new ArrayList();
        }
        decVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        dec decVar = this.a;
        dec decVar2 = decVar.c;
        boolean z = false;
        while (!decVar2.equals(decVar)) {
            sb.append('{');
            sb.append(decVar2.a);
            sb.append(':');
            sb.append(decVar2.a());
            sb.append("}, ");
            decVar2 = decVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
