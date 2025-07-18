package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unm implements unn {
    public static final Object a = new Object();
    private static final ThreadFactory g = new unl(0);
    public final uiz b;
    public final uoa c;
    public final unx d;
    public final unu e;
    public final unw f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;

    public unm(uiz uizVar, unj unjVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        uoa uoaVar = new uoa(uizVar.a(), unjVar);
        unx unxVar = new unx(uizVar);
        unu unuVarB = unu.b();
        unw unwVar = new unw(uizVar);
        int i = uns.a;
        this.h = new Object();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.b = uizVar;
        this.c = uoaVar;
        this.d = unxVar;
        this.e = unuVarB;
        this.f = unwVar;
        this.i = threadPoolExecutor;
        this.j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    private final synchronized String k() {
        return this.k;
    }

    private final void l(unt untVar) {
        synchronized (this.h) {
            this.m.add(untVar);
        }
    }

    private final void m() {
        ocv.aE(c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ocv.aE(d(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ocv.aE(b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String strC = c();
        long j = unu.a;
        ocv.au(strC.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ocv.au(unu.b.matcher(b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.unn
    public final onz a() {
        m();
        String strK = k();
        if (strK != null) {
            return osk.r(strK);
        }
        kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
        l(new unq(kwyVar));
        Object obj = kwyVar.a;
        this.i.execute(new ufx(this, 5));
        return (onz) obj;
    }

    final String b() {
        return this.b.d().a;
    }

    final String c() {
        return this.b.d().b;
    }

    final String d() {
        return this.b.d().d;
    }

    public final void e(Exception exc) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((unt) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void f(unz unzVar) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((unt) it.next()).b(unzVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void g(String str) {
        this.k = str;
    }

    public final synchronized void h(unz unzVar, unz unzVar2) {
        Set set = this.l;
        if (set.size() != 0 && !unzVar.a.equals(unzVar2.a)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((unv) it.next()).a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0064 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #3 {all -> 0x009e, blocks: (B:5:0x000d, B:7:0x0019, B:9:0x0025, B:48:0x0072, B:49:0x0076, B:11:0x002b, B:13:0x0030, B:14:0x0034, B:35:0x005e, B:37:0x0064, B:47:0x0071, B:15:0x0035, B:19:0x0040, B:21:0x0042, B:22:0x0044, B:33:0x005c, B:41:0x006b, B:44:0x006e), top: B:66:0x000d, outer: #0, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r7 = this;
            java.lang.Object r0 = defpackage.unm.a
            monitor-enter(r0)
            uiz r1 = r7.b     // Catch: java.lang.Throwable -> La5
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> La5
            ulo r2 = defpackage.ulo.e(r2)     // Catch: java.lang.Throwable -> La5
            unx r3 = r7.d     // Catch: java.lang.Throwable -> L9e
            unz r3 = r3.a()     // Catch: java.lang.Throwable -> L9e
            boolean r4 = r3.c()     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto L8a
            java.lang.String r4 = r1.f()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = "CHIME_ANDROID_SDK"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L9e
            if (r4 != 0) goto L2b
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L72
        L2b:
            int r1 = r3.g     // Catch: java.lang.Throwable -> L9e
            r4 = 1
            if (r1 != r4) goto L72
            unw r1 = r7.f     // Catch: java.lang.Throwable -> L9e
            android.content.SharedPreferences r4 = r1.b     // Catch: java.lang.Throwable -> L9e
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L9e
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "|S|id"
            r6 = 0
            java.lang.String r5 = r4.getString(r5, r6)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L42
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            goto L5e
        L42:
            android.content.SharedPreferences r1 = r1.b     // Catch: java.lang.Throwable -> L6f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "|S||P|"
            java.lang.String r5 = r1.getString(r5, r6)     // Catch: java.lang.Throwable -> L69
            if (r5 != 0) goto L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
            goto L5c
        L4f:
            java.security.PublicKey r5 = defpackage.unw.b(r5)     // Catch: java.lang.Throwable -> L69
            if (r5 != 0) goto L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
            goto L5c
        L57:
            java.lang.String r6 = defpackage.unw.a(r5)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
        L5c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            r5 = r6
        L5e:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L76
            java.lang.String r5 = defpackage.uns.a()     // Catch: java.lang.Throwable -> L9e
            goto L76
        L69:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L6f
        L6c:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6c
            throw r1     // Catch: java.lang.Throwable -> L6f
        L6f:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            throw r1     // Catch: java.lang.Throwable -> L9e
        L72:
            java.lang.String r5 = defpackage.uns.a()     // Catch: java.lang.Throwable -> L9e
        L76:
            unx r1 = r7.d     // Catch: java.lang.Throwable -> L9e
            uny r4 = new uny     // Catch: java.lang.Throwable -> L9e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L9e
            r4.a = r5     // Catch: java.lang.Throwable -> L9e
            r3 = 3
            r4.c(r3)     // Catch: java.lang.Throwable -> L9e
            unz r3 = r4.a()     // Catch: java.lang.Throwable -> L9e
            r1.b(r3)     // Catch: java.lang.Throwable -> L9e
        L8a:
            if (r2 == 0) goto L8f
            r2.c()     // Catch: java.lang.Throwable -> La5
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
            r7.f(r3)
            java.util.concurrent.ExecutorService r0 = r7.j
            unk r1 = new unk
            r1.<init>()
            r0.execute(r1)
            return
        L9e:
            r1 = move-exception
            if (r2 == 0) goto La4
            r2.c()     // Catch: java.lang.Throwable -> La5
        La4:
            throw r1     // Catch: java.lang.Throwable -> La5
        La5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unm.i():void");
    }

    @Override // defpackage.unn
    public final onz j() {
        m();
        kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
        l(new unp(this.e, kwyVar));
        Object obj = kwyVar.a;
        this.i.execute(new ufx(this, 6));
        return (onz) obj;
    }
}
