package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrb {
    public static final Logger a = Logger.getLogger(xrb.class.getName());
    public static final xrb b = new xrb();
    public final ConcurrentNavigableMap c;
    public final ConcurrentMap d;
    public final ConcurrentMap e;

    public xrb() {
        new ConcurrentSkipListMap();
        this.c = new ConcurrentSkipListMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(Map map, xrd xrdVar) {
    }

    public static void b(Map map, xrd xrdVar) {
    }
}
