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
/* loaded from: classes3.dex */
public final class xrz {
    private static final Logger a = Logger.getLogger(xrz.class.getName());
    private static xrz b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("yac"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("yfj"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized xrz b() {
        if (b == null) {
            List<xry> listD = ykn.D(xry.class, c, xry.class.getClassLoader(), new xsz(1));
            b = new xrz();
            for (xry xryVar : listD) {
                a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(xryVar))));
                b.c(xryVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(xry xryVar) {
        xryVar.e();
        sij.o(true, "isAvailable() returned false");
        this.d.add(xryVar);
    }

    private final synchronized void d() {
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            xry xryVar = (xry) it.next();
            String strC = xryVar.c();
            if (((xry) linkedHashMap.get(strC)) != null) {
                xryVar.d();
            } else {
                linkedHashMap.put(strC, xryVar);
            }
        }
    }

    public final synchronized xry a(String str) {
        return (xry) this.e.get(str);
    }
}
