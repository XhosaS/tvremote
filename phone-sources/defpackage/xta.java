package defpackage;

import com.google.common.collect.ImmutableMap;
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
/* loaded from: classes3.dex */
public final class xta {
    private static final Logger a = Logger.getLogger(xta.class.getName());
    private static xta b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private ImmutableMap e = ImmutableMap.of();

    public static synchronized xta b() {
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(Class.forName("xwp"));
            } catch (ClassNotFoundException e) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
            }
            List<xsy> listD = ykn.D(xsy.class, DesugarCollections.unmodifiableList(arrayList), xsy.class.getClassLoader(), new xsz(0));
            if (listD.isEmpty()) {
                a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = new xta();
            for (xsy xsyVar : listD) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(xsyVar))));
                b.f(xsyVar);
            }
            b.g();
        }
        return b;
    }

    private final synchronized void f(xsy xsyVar) {
        xsyVar.d();
        sij.o(true, "isAvailable() returned false");
        this.d.add(xsyVar);
    }

    private final synchronized void g() {
        HashMap map = new HashMap();
        Iterator it = this.d.iterator();
        String strB = "unknown";
        char c = 0;
        while (it.hasNext()) {
            xsy xsyVar = (xsy) it.next();
            String strB2 = xsyVar.b();
            if (((xsy) map.get(strB2)) != null) {
                xsyVar.e();
            } else {
                map.put(strB2, xsyVar);
            }
            xsyVar.e();
            if (c < 5) {
                xsyVar.e();
                strB = xsyVar.b();
            }
            c = 5;
        }
        this.e = ImmutableMap.copyOf((Map) map);
        this.c = strB;
    }

    public final xsy a(String str) {
        if (str == null) {
            return null;
        }
        return (xsy) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(xsy xsyVar) {
        f(xsyVar);
        g();
    }
}
