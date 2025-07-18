package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhx {
    private static final Logger a = Logger.getLogger(afhx.class.getName());
    private static afhx b;
    private final LinkedHashSet c = new LinkedHashSet();
    private List d = Collections.EMPTY_LIST;

    public static synchronized afhx a() {
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(Class.forName("agbp"));
            } catch (ClassNotFoundException e) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find OkHttpChannelProvider", (Throwable) e);
            }
            try {
                arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find NettyChannelProvider", (Throwable) e2);
            }
            try {
                arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
            } catch (ClassNotFoundException e3) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find UdsNettyChannelProvider", (Throwable) e3);
            }
            List<afhu> listA = afjt.a(afhu.class, DesugarCollections.unmodifiableList(arrayList), afhu.class.getClassLoader(), new afhw());
            b = new afhx();
            for (afhu afhuVar : listA) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(afhuVar))));
                b.c(afhuVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(afhu afhuVar) {
        afhuVar.d();
        this.c.add(afhuVar);
    }

    private final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.c);
        Collections.sort(arrayList, Collections.reverseOrder(new afhv()));
        this.d = DesugarCollections.unmodifiableList(arrayList);
    }

    final synchronized List b() {
        return this.d;
    }
}
