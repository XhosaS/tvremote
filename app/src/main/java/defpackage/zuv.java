package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zuv extends zzf implements zyd {
    static final Object g = new Object();
    static final zyc h = new zyc(zum.class);
    static final boolean i;
    public static final zun j;
    volatile zuj listenersField;
    public volatile Object valueField;
    volatile zuu waitersField;

    static {
        boolean z;
        zun zuqVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        i = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                zuqVar = new zut();
            } catch (Error | Exception e) {
                try {
                    zuqVar = new zup();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    zuqVar = new zuq();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                zuqVar = new zup();
            } catch (NoClassDefFoundError unused2) {
                zuqVar = new zuq();
            }
        }
        th = null;
        th2 = null;
        j = zuqVar;
        if (th != null) {
            zyc zycVar = h;
            zycVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zycVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private final void a(zuu zuuVar) {
        zuuVar.thread = null;
        while (true) {
            zuu zuuVar2 = this.waitersField;
            if (zuuVar2 != zuu.a) {
                zuu zuuVar3 = null;
                while (zuuVar2 != null) {
                    zuu zuuVar4 = zuuVar2.next;
                    if (zuuVar2.thread != null) {
                        zuuVar3 = zuuVar2;
                    } else if (zuuVar3 != null) {
                        zuuVar3.next = zuuVar4;
                        if (zuuVar3.thread == null) {
                            break;
                        }
                    } else if (!j.g(this, zuuVar2, zuuVar4)) {
                        break;
                    }
                    zuuVar2 = zuuVar4;
                }
                return;
            }
            return;
        }
    }

    public final Object s() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zum.o(obj2)) {
            return zum.i(obj2);
        }
        zuu zuuVar = this.waitersField;
        if (zuuVar != zuu.a) {
            zuu zuuVar2 = new zuu();
            do {
                zun zunVar = j;
                zunVar.c(zuuVar2, zuuVar);
                if (zunVar.g(this, zuuVar, zuuVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            a(zuuVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zum.o(obj)));
                    return zum.i(obj);
                }
                zuuVar = this.waitersField;
            } while (zuuVar != zuu.a);
        }
        Object obj3 = this.valueField;
        obj3.getClass();
        return zum.i(obj3);
    }

    public final Object t(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        boolean z = true;
        if ((obj != null) && zum.o(obj)) {
            return zum.i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zuu zuuVar = this.waitersField;
            if (zuuVar != zuu.a) {
                zuu zuuVar2 = new zuu();
                do {
                    zun zunVar = j;
                    zunVar.c(zuuVar2, zuuVar);
                    if (zunVar.g(this, zuuVar, zuuVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(zuuVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zum.o(obj2)) {
                                return zum.i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        a(zuuVar2);
                    } else {
                        zuuVar = this.waitersField;
                    }
                } while (zuuVar != zuu.a);
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return zum.i(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zum.o(obj4)) {
                return zum.i(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
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
        throw new TimeoutException(a.i(string, strConcat, " for "));
    }
}
