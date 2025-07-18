package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ufj<V> extends uim implements uhp<V> {
    static final Object d = new Object();
    static final uho e = new uho(ufb.class);
    static final boolean f;
    public static final ufc g;
    volatile uey listenersField;
    volatile Object valueField;
    volatile ufi waitersField;

    static {
        boolean z;
        ufc ufeVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                ufeVar = new ufh();
            } catch (Error | Exception e2) {
                try {
                    ufeVar = new ufd();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    ufeVar = new ufe();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                ufeVar = new ufd();
            } catch (NoClassDefFoundError unused2) {
                ufeVar = new ufe();
            }
        }
        th = null;
        th2 = null;
        g = ufeVar;
        if (th != null) {
            uho uhoVar = e;
            uhoVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            uhoVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private static void a(ufi ufiVar, ufi ufiVar2) {
        g.c(ufiVar, ufiVar2);
    }

    private final void b(ufi ufiVar) {
        ufiVar.thread = null;
        while (true) {
            ufi ufiVar2 = this.waitersField;
            if (ufiVar2 != ufi.a) {
                ufi ufiVar3 = null;
                while (ufiVar2 != null) {
                    ufi ufiVar4 = ufiVar2.next;
                    if (ufiVar2.thread != null) {
                        ufiVar3 = ufiVar2;
                    } else if (ufiVar3 != null) {
                        ufiVar3.next = ufiVar4;
                        if (ufiVar3.thread == null) {
                            break;
                        }
                    } else if (!d(ufiVar2, ufiVar4)) {
                        break;
                    }
                    ufiVar2 = ufiVar4;
                }
                return;
            }
            return;
        }
    }

    private final boolean d(ufi ufiVar, ufi ufiVar2) {
        return g.g(this, ufiVar, ufiVar2);
    }

    static boolean u(ufj ufjVar, Object obj, Object obj2) {
        return g.f(ufjVar, obj, obj2);
    }

    public final Object s() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && ufb.q(obj2)) {
            return ufb.k(obj2);
        }
        ufi ufiVar = this.waitersField;
        if (ufiVar != ufi.a) {
            ufi ufiVar2 = new ufi();
            do {
                a(ufiVar2, ufiVar);
                if (d(ufiVar, ufiVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(ufiVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & ufb.q(obj)));
                    return ufb.k(obj);
                }
                ufiVar = this.waitersField;
            } while (ufiVar != ufi.a);
        }
        Object obj3 = this.valueField;
        obj3.getClass();
        return ufb.k(obj3);
    }

    public final Object t(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && ufb.q(obj)) {
            return ufb.k(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ufi ufiVar = this.waitersField;
            if (ufiVar != ufi.a) {
                ufi ufiVar2 = new ufi();
                while (true) {
                    a(ufiVar2, ufiVar);
                    if (d(ufiVar, ufiVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(ufiVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && ufb.q(obj2)) {
                                return ufb.k(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(ufiVar2);
                    } else {
                        ufi ufiVar3 = this.waitersField;
                        if (ufiVar3 == ufi.a) {
                            break;
                        }
                        ufiVar = ufiVar3;
                    }
                }
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return ufb.k(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && ufb.q(obj4)) {
                return ufb.k(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(a.cq(string, strConcat, " for "));
    }
}
