package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhp {
    private static final Logger a = Logger.getLogger(afhp.class.getName());
    private static afhp b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("afwi"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("agfb"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized afhp b() {
        if (b == null) {
            List<afhn> listA = afjt.a(afhn.class, c, afhn.class.getClassLoader(), new afho());
            b = new afhp();
            for (afhn afhnVar : listA) {
                a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(afhnVar))));
                b.c(afhnVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(afhn afhnVar) {
        afhnVar.e();
        this.d.add(afhnVar);
    }

    private final synchronized void d() {
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            afhn afhnVar = (afhn) it.next();
            String strC = afhnVar.c();
            if (((afhn) linkedHashMap.get(strC)) != null) {
                afhnVar.d();
            } else {
                linkedHashMap.put(strC, afhnVar);
            }
        }
    }

    public final synchronized afhn a(String str) {
        return (afhn) this.e.get(str);
    }
}
