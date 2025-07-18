package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wum {
    public static boolean a;
    public static final WeakHashMap b;
    public static final Deque c;
    public static final Deque d;
    public static final Object e;
    public static final Runnable f;
    public static int g;
    public static int h;
    public static wwq i;
    private static final yzq j;
    private static yzq k;
    private static final AtomicReference l;
    private static final wul m;

    static {
        yzq yzqVarT = yzq.t("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        j = yzqVarT;
        k = yzqVarT;
        a = true;
        l = new AtomicReference(zcp.b);
        b = new WeakHashMap();
        m = new wul();
        c = new ArrayDeque();
        d = new ArrayDeque();
        e = new Object();
        f = new Runnable() { // from class: wuc
            @Override // java.lang.Runnable
            public final void run() {
                Object objRemove = wum.c.remove();
                if (objRemove == wum.e) {
                    wum.d.pop();
                } else {
                    wum.d.push((wwq) objRemove);
                }
            }
        };
        h = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static wvl a(wvl wvlVar) {
        return g(c(), wvlVar);
    }

    public static wvy b(wwq wwqVar, wvz wvzVar) {
        wvy wvyVarD = wvy.d(2);
        while (wwqVar != null) {
            wvyVarD = wwqVar.j(wvzVar);
            if (wvyVarD.c() - 1 == 0) {
                break;
            }
            wwqVar = wwqVar.a();
        }
        return wvyVarD;
    }

    public static wwl c() {
        return (wwl) m.get();
    }

    static wwq d() {
        return (wwq) d.peek();
    }

    public static wwq e() {
        wwl wwlVarC = c();
        wwq wwqVar = wwlVarC.c;
        return wwqVar != null ? wwqVar : wva.m(wwlVarC);
    }

    public static wwq f() {
        wwq wwqVar = i;
        if (wwqVar == null) {
            return null;
        }
        i = null;
        return wwqVar;
    }

    public static wwq g(wwl wwlVar, wwq wwqVar) {
        return wwlVar.e != null ? v(wwlVar, wwqVar, 2) : v(wwlVar, wwqVar, 4);
    }

    public static wwt h() {
        p(false);
        return new wwt() { // from class: wuf
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wum.n();
            }
        };
    }

    public static wwt i() {
        wwl wwlVarC = c();
        if (!wwlVarC.a) {
            return new wwt() { // from class: wug
                @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    boolean z = wum.a;
                }
            };
        }
        wwt wwtVarM = wwlVarC.c;
        if (wwtVarM == null) {
            wwtVarM = wva.m(wwlVarC);
        }
        c.add(wwtVarM);
        uea.a().post(f);
        return new wwt() { // from class: wuh
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                wum.c.add(wum.e);
                uea.a().post(wum.f);
            }
        };
    }

    static yzq j() {
        return (yzq) l.get();
    }

    static String k(String str) {
        return str.length() > 127 ? str.substring(0, 127) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x00a1, code lost:
    
        r10 = r1.c.d;
        r16 = r7;
        r7 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00af, code lost:
    
        if (r10.containsKey(r7) != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00b1, code lost:
    
        r1.c.d.put(r7, new defpackage.wwg(r8, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00bd, code lost:
    
        if (r15 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x00bf, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00cf, code lost:
    
        if (r15 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x00d1, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00d5, code lost:
    
        r1.d = r8;
        r1.e++;
        r1.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String l(defpackage.wwq r20) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wum.l(wwq):java.lang.String");
    }

    static void m(wwq wwqVar) {
        wwl wwlVarC = c();
        wwq wwqVar2 = wwlVarC.c;
        if (wwqVar2 == null) {
            throw new wuj("Tried to end [" + wwqVar.d() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (wwqVar == wwqVar2) {
            g(wwlVarC, wwqVar2.a());
            return;
        }
        throw new wuk("Tried to end span " + wwqVar.d() + ", but that span is not the current span. The current span is " + wwqVar2.d() + ".");
    }

    public static void n() {
        int i2 = g;
        int i3 = i2 - 1;
        g = i3;
        if (i3 < 0) {
            throw new IllegalStateException("More calls to pause than to resume");
        }
        if (h == i2) {
            yqw.M(!d.isEmpty(), "current async trace should not be null");
            g(c(), null);
            h = 0;
        }
    }

    public static void o() {
        i = c().c;
        uea.a().post(new Runnable() { // from class: wud
            @Override // java.lang.Runnable
            public final void run() {
                wum.i = null;
            }
        });
    }

    static void p(boolean z) {
        IllegalStateException illegalStateExceptionX;
        wwr wwrVar = wws.a;
        wwr wwrVar2 = wwr.THROW_ON_FAILURE;
        g++;
        if (h == 0) {
            boolean z2 = z & (wwrVar == wwrVar2);
            wwl wwlVarC = c();
            wwq wwqVar = wwlVarC.c;
            if (wwqVar != null) {
                if (z2 && (wwqVar instanceof wtx) && !((wtx) wwqVar).h()) {
                    IllegalStateException illegalStateExceptionX2 = x(wwqVar);
                    illegalStateExceptionX2.printStackTrace();
                    g--;
                    throw illegalStateExceptionX2;
                }
                return;
            }
            wwq wwqVarD = d();
            if (!z2 || (illegalStateExceptionX = x(wwqVarD)) == null) {
                if (wwqVarD != null) {
                    g(wwlVarC, wwqVarD);
                    h = g;
                    return;
                }
                return;
            }
            if (!y(wwqVarD, illegalStateExceptionX)) {
                illegalStateExceptionX.printStackTrace();
                g--;
                throw illegalStateExceptionX;
            }
            if (wwqVarD == null) {
                int i2 = wva.b;
                UUID uuidB = wun.a.b();
                String strFc = wsn.fc(uuidB);
                wva.s();
                wva wvaVar = new wva(uuidB, strFc, illegalStateExceptionX, true, wwlVarC);
                d.push(wvaVar);
                g(wwlVarC, wvaVar);
            } else {
                g(wwlVarC, wwqVarD);
            }
            h = g;
        }
    }

    public static void q() {
        wwq wwqVarD;
        g++;
        if (h == 0) {
            wwl wwlVarC = c();
            if (wwlVarC.c != null || (wwqVarD = d()) == null) {
                return;
            }
            g(wwlVarC, wwqVarD);
            h = g;
        }
    }

    static void r(yzq yzqVar) {
        yzo yzoVar = new yzo();
        yzoVar.i(yzqVar);
        yzoVar.i(j);
        k = yzoVar.f();
    }

    static boolean s(Throwable th) {
        if (k.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            zdl it = k.iterator();
            while (it.hasNext()) {
                if (stackTraceElement.toString().startsWith((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean t() {
        wwq wwqVar = c().c;
        return (wwqVar == null || wwqVar == wvs.a) ? false : true;
    }

    public static boolean u() {
        wwq wwqVarD = d();
        if (wwqVarD == null) {
            return false;
        }
        if ((wwqVarD instanceof wtx) && !((wtx) wwqVarD).h()) {
            return false;
        }
        q();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.wwq v(defpackage.wwl r7, defpackage.wwq r8, int r9) {
        /*
            wwq r0 = r7.c
            r1 = 2
            if (r0 != r8) goto Lc
            if (r9 == r1) goto L93
            r2 = 4
            if (r9 == r2) goto L93
            if (r0 == 0) goto L93
        Lc:
            if (r0 != 0) goto L1c
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L19
            boolean r2 = defpackage.wui.a()
            goto L1a
        L19:
            r2 = 0
        L1a:
            r7.b = r2
        L1c:
            wza r2 = r7.e
            boolean r3 = r7.b
            r4 = 0
            if (r3 == 0) goto L91
            if (r2 == 0) goto L60
            int r3 = r9 + (-1)
            if (r3 == 0) goto L31
            if (r3 == r1) goto L2e
            r5 = r8
            r3 = r0
            goto L33
        L2e:
            r3 = r0
            r5 = r4
            goto L33
        L31:
            r5 = r8
            r3 = r4
        L33:
            if (r3 == 0) goto L5a
            if (r5 == 0) goto L57
            wwq r6 = r3.a()
            if (r6 != r5) goto L47
            boolean r6 = r2.d(r3)
            if (r6 != 0) goto L47
            android.os.Trace.endSection()
            goto L91
        L47:
            wwq r6 = r5.a()
            if (r3 != r6) goto L57
            boolean r6 = r2.d(r5)
            if (r6 != 0) goto L57
            defpackage.wza.a(r5)
            goto L91
        L57:
            r2.c(r3)
        L5a:
            if (r5 == 0) goto L91
            r2.b(r5)
            goto L91
        L60:
            if (r0 == 0) goto L8b
            if (r8 == 0) goto L86
            wwq r3 = r0.a()
            if (r3 != r8) goto L74
            boolean r3 = defpackage.wwm.d(r0)
            if (r3 != 0) goto L74
            android.os.Trace.endSection()
            goto L91
        L74:
            wwq r3 = r8.a()
            if (r0 != r3) goto L84
            boolean r3 = defpackage.wwm.d(r8)
            if (r3 != 0) goto L84
            defpackage.wwm.a(r8)
            goto L91
        L84:
            r3 = r8
            goto L87
        L86:
            r3 = r4
        L87:
            defpackage.wwm.c(r0)
            goto L8c
        L8b:
            r3 = r8
        L8c:
            if (r3 == 0) goto L91
            defpackage.wwm.b(r3)
        L91:
            if (r0 != r8) goto L94
        L93:
            return r8
        L94:
            if (r8 == 0) goto L9a
            r8.r()
            goto L9b
        L9a:
            r8 = r4
        L9b:
            if (r0 == 0) goto La0
            r0.r()
        La0:
            r7.c = r8
            if (r9 != r1) goto La9
            r2.getClass()
            r2.a = r8
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wum.v(wwl, wwq, int):wwq");
    }

    public static void w(boolean z) {
        if (wws.a()) {
            wwq wwqVar = c().c;
            IllegalStateException illegalStateException = (wwqVar == null || (wwqVar instanceof wvs)) ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.") : wwqVar instanceof wtx ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((wtx) wwqVar).c()) : null;
            if (illegalStateException == null || y(wwqVar, illegalStateException)) {
                return;
            }
            if (!z && wws.a != wwr.LOG_ON_FAILURE) {
                throw illegalStateException;
            }
            Log.e("Tracer", "Missing trace", illegalStateException);
        }
    }

    private static IllegalStateException x(wwq wwqVar) {
        if (wwqVar == null || (wwqVar instanceof wvs)) {
            return new IllegalStateException("Was supposed to have a trace - did you commit a FragmentManager transaction without one? Most fragment transactions should use commitNow(), as trace can be lost in async operations like commit(). If you have to use commit(), refer to http://go/tiktok-tracing/handling_missing_traces.md#fragment-transactions for more details.");
        }
        if (wwqVar instanceof wtx) {
            return new IllegalStateException("Was supposed to have a trace - did you commit a FragmentManager transaction without one? See this exception's cause for the last place a trace was missing. Note most fragment transactions should use commitNow(), as trace can be lost in async operations like commit(). If you have to use commit(), refer to http://go/tiktok-tracing/handling_missing_traces.md#fragment-transactions for more details.", ((wtx) wwqVar).c());
        }
        return null;
    }

    private static boolean y(wwq wwqVar, IllegalStateException illegalStateException) {
        return wwqVar instanceof wtx ? ((wtx) wwqVar).h() : s(illegalStateException);
    }
}
