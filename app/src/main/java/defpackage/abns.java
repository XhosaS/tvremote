package defpackage;

import android.os.ConditionVariable;
import android.os.Trace;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abns {
    public static volatile abnp d;
    private static volatile boolean f;
    private static volatile abnr g;
    private static volatile Thread h;
    private static final ConditionVariable e = new ConditionVariable();
    static final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public static final Collection b = new ConcurrentLinkedQueue();
    public static final Collection c = new ConcurrentLinkedQueue();

    static {
        new AtomicInteger();
        f = false;
        d = new abnp() { // from class: abnq
            @Override // defpackage.abnp
            public final void a(String str) {
                System.loadLibrary(str);
            }
        };
        g = null;
        h = null;
    }

    public static void a(String str, String... strArr) {
        b(d, str);
    }

    private static void b(abnp abnpVar, String str) {
        boolean z;
        Trace.beginSection("CSI:NativeLibChecking");
        Map map = a;
        synchronized (map) {
            ConditionVariable conditionVariable = (ConditionVariable) map.get(str);
            ConditionVariable conditionVariable2 = e;
            if (conditionVariable != conditionVariable2) {
                if (conditionVariable != null) {
                    z = true;
                } else {
                    conditionVariable = new ConditionVariable();
                    map.put(str, conditionVariable);
                    z = false;
                }
                if (!z) {
                    synchronized (conditionVariable) {
                        try {
                            Trace.beginSection("CSI:NativeLibLoading");
                            System.nanoTime();
                            abnpVar.a(str);
                            map.put(str, conditionVariable2);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                if (!Thread.holdsLock(conditionVariable)) {
                    conditionVariable.block();
                }
            }
        }
        Trace.endSection();
    }
}
