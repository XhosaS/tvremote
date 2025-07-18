package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyz extends xww {
    private static final ReferenceQueue b = new ReferenceQueue();
    private static final ConcurrentMap c = new ConcurrentHashMap();
    public static final Logger a = Logger.getLogger(xyz.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyz(xsa xsaVar) {
        super(xsaVar);
        ReferenceQueue referenceQueue = b;
        ConcurrentMap concurrentMap = c;
        new xyy(this, xsaVar, referenceQueue, concurrentMap);
    }
}
