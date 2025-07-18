package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yak implements xxy {
    public static final RuntimeException a;
    private static final Logger b = Logger.getLogger(yak.class.getName());
    private static final Constructor c;
    private static final Method d;
    private static final Object[] e;
    private final Object f;

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    static {
        /*
            java.lang.Class<yak> r0 = defpackage.yak.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.yak.b = r0
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r0 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "add"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L42
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L42
            r5[r1] = r6     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "sum"
            r0.getMethod(r5, r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()     // Catch: java.lang.Throwable -> L3e
            int r5 = r0.length     // Catch: java.lang.Throwable -> L3e
            r6 = r1
        L2c:
            if (r6 >= r5) goto L3b
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L3e
            int r8 = r8.length     // Catch: java.lang.Throwable -> L3e
            if (r8 != 0) goto L38
            goto L3c
        L38:
            int r6 = r6 + 1
            goto L2c
        L3b:
            r7 = r3
        L3c:
            r9 = r3
            goto L54
        L3e:
            r0 = move-exception
            r9 = r0
            r0 = r4
            goto L45
        L42:
            r0 = move-exception
            r9 = r0
            r0 = r3
        L45:
            java.util.logging.Logger r4 = defpackage.yak.b
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            java.lang.String r7 = "<clinit>"
            java.lang.String r8 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            java.lang.String r6 = "io.grpc.internal.ReflectionLongAdderCounter"
            r4.logp(r5, r6, r7, r8, r9)
            r4 = r0
            r7 = r3
        L54:
            if (r9 != 0) goto L5f
            if (r7 == 0) goto L5f
            defpackage.yak.c = r7
            defpackage.yak.d = r4
            defpackage.yak.a = r3
            goto L6a
        L5f:
            defpackage.yak.c = r3
            defpackage.yak.d = r3
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r9)
            defpackage.yak.a = r0
        L6a:
            r3 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            defpackage.yak.e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yak.<clinit>():void");
    }

    public yak() {
        RuntimeException runtimeException = a;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f = c.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // defpackage.xxy
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            d.invoke(this.f, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
