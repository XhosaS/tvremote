package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afiy {
    private static final Logger a = Logger.getLogger(afiy.class.getName());
    private static afiy b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private yyr e = zcl.a;

    public static synchronized afiy b() {
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(Class.forName("afqw"));
            } catch (ClassNotFoundException e) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
            }
            List<afiw> listA = afjt.a(afiw.class, DesugarCollections.unmodifiableList(arrayList), afiw.class.getClassLoader(), new afix());
            if (listA.isEmpty()) {
                a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = new afiy();
            for (afiw afiwVar : listA) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(afiwVar))));
                b.f(afiwVar);
            }
            b.g();
        }
        return b;
    }

    private final synchronized void f(afiw afiwVar) {
        afiwVar.d();
        this.d.add(afiwVar);
    }

    private final synchronized void g() {
        HashMap map = new HashMap();
        Iterator it = this.d.iterator();
        String strB = "unknown";
        char c = 0;
        while (it.hasNext()) {
            afiw afiwVar = (afiw) it.next();
            String strB2 = afiwVar.b();
            if (((afiw) map.get(strB2)) != null) {
                afiwVar.e();
            } else {
                map.put(strB2, afiwVar);
            }
            afiwVar.e();
            if (c < 5) {
                afiwVar.e();
                strB = afiwVar.b();
            }
            c = 5;
        }
        this.e = yyr.j(map);
        this.c = strB;
    }

    public final afiw a(String str) {
        if (str == null) {
            return null;
        }
        return (afiw) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(afiw afiwVar) {
        f(afiwVar);
        g();
    }
}
