package defpackage;

import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class chg extends cjt implements cja {
    static final Object d = new Object();
    static final ciz e = new ciz(cgx.class);
    static final boolean f;
    public static final cgy g;
    volatile cgu listenersField;
    volatile Object valueField;
    volatile chf waitersField;

    static {
        boolean z;
        cgy chbVar;
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
                chbVar = new che();
            } catch (Error | Exception e2) {
                try {
                    chbVar = new cha();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    chbVar = new chb();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                chbVar = new cha();
            } catch (NoClassDefFoundError unused2) {
                chbVar = new chb();
            }
        }
        th = null;
        th2 = null;
        g = chbVar;
        if (th != null) {
            ciz cizVar = e;
            cizVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            cizVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public static void t(chf chfVar, chf chfVar2) {
        g.c(chfVar, chfVar2);
    }

    static boolean v(chg chgVar, Object obj, Object obj2) {
        return g.f(chgVar, obj, obj2);
    }

    public final Object s() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && cgx.q(obj2)) {
            return cgx.j(obj2);
        }
        chf chfVar = this.waitersField;
        if (chfVar != chf.a) {
            chf chfVar2 = new chf();
            do {
                t(chfVar2, chfVar);
                if (w(chfVar, chfVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            u(chfVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & cgx.q(obj)));
                    return cgx.j(obj);
                }
                chfVar = this.waitersField;
            } while (chfVar != chf.a);
        }
        Object obj3 = this.valueField;
        obj3.getClass();
        return cgx.j(obj3);
    }

    public final void u(chf chfVar) {
        chfVar.thread = null;
        while (true) {
            chf chfVar2 = this.waitersField;
            if (chfVar2 != chf.a) {
                chf chfVar3 = null;
                while (chfVar2 != null) {
                    chf chfVar4 = chfVar2.next;
                    if (chfVar2.thread != null) {
                        chfVar3 = chfVar2;
                    } else if (chfVar3 != null) {
                        chfVar3.next = chfVar4;
                        if (chfVar3.thread == null) {
                            break;
                        }
                    } else if (!w(chfVar2, chfVar4)) {
                        break;
                    }
                    chfVar2 = chfVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean w(chf chfVar, chf chfVar2) {
        return g.g(this, chfVar, chfVar2);
    }
}
