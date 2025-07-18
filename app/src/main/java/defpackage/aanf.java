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
public class aanf implements aang {
    public static final Object a = new Object();
    private static final ThreadFactory g = new aane();
    public final aahf b;
    public final aaoa c;
    public final aant d;
    public final aano e;
    public final aans f;
    private final aanm h;
    private final Object i;
    private final ExecutorService j;
    private final ExecutorService k;
    private String l;
    private final Set m;
    private final List n;

    public aanf(aahf aahfVar, aamy aamyVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        aahfVar.d();
        aaoa aaoaVar = new aaoa(aahfVar.c, aamyVar);
        aant aantVar = new aant(aahfVar);
        long j = aano.a;
        aaog.a();
        aano aanoVarC = aano.c();
        aans aansVar = new aans(aahfVar);
        aanm aanmVar = new aanm();
        this.i = new Object();
        this.m = new HashSet();
        this.n = new ArrayList();
        this.b = aahfVar;
        this.c = aaoaVar;
        this.d = aantVar;
        this.e = aanoVarC;
        this.f = aansVar;
        this.h = aanmVar;
        this.j = threadPoolExecutor;
        this.k = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    public static aanf b(aahf aahfVar) {
        return (aanf) aahfVar.b(aang.class);
    }

    private final synchronized String l() {
        return this.l;
    }

    private final void m(aann aannVar) {
        synchronized (this.i) {
            this.n.add(aannVar);
        }
    }

    private final void n() {
        kkk.i(d(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kkk.i(e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kkk.i(c(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String strD = d();
        long j = aano.a;
        kkk.b(strD.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kkk.b(aano.b.matcher(c()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.aang
    public final lvf a() {
        n();
        String strL = l();
        if (strL != null) {
            return lvq.c(strL);
        }
        lvj lvjVar = new lvj();
        m(new aank(lvjVar));
        lvn lvnVar = lvjVar.a;
        this.j.execute(new Runnable() { // from class: aanc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j();
            }
        });
        return lvnVar;
    }

    final String c() {
        aahf aahfVar = this.b;
        aahfVar.d();
        return aahfVar.e.a;
    }

    final String d() {
        aahf aahfVar = this.b;
        aahfVar.d();
        return aahfVar.e.b;
    }

    final String e() {
        aahf aahfVar = this.b;
        aahfVar.d();
        return aahfVar.e.d;
    }

    public final void f(Exception exc) {
        synchronized (this.i) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                if (((aann) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void g(aanv aanvVar) {
        synchronized (this.i) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                if (((aann) it.next()).b(aanvVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void h(String str) {
        this.l = str;
    }

    public final synchronized void i(aanv aanvVar, aanv aanvVar2) {
        Set set = this.m;
        if (set.size() != 0 && !((aanr) aanvVar).a.equals(((aanr) aanvVar2).a)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((aanp) it.next()).a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0069 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #3 {all -> 0x00a7, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x0027, B:48:0x0079, B:49:0x007f, B:11:0x002d, B:13:0x0035, B:14:0x0039, B:35:0x0063, B:37:0x0069, B:47:0x0078, B:15:0x003a, B:19:0x0045, B:21:0x0047, B:22:0x0049, B:33:0x0061, B:41:0x0072, B:44:0x0075, B:23:0x004a, B:25:0x0052, B:27:0x0054, B:29:0x005a, B:31:0x005c, B:32:0x0060, B:16:0x003b, B:17:0x0042), top: B:66:0x000e, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r8 = this;
            java.lang.Object r0 = defpackage.aanf.a
            monitor-enter(r0)
            aahf r1 = r8.b     // Catch: java.lang.Throwable -> Lae
            r1.d()     // Catch: java.lang.Throwable -> Lae
            android.content.Context r2 = r1.c     // Catch: java.lang.Throwable -> Lae
            aana r2 = defpackage.aana.b(r2)     // Catch: java.lang.Throwable -> Lae
            aant r3 = r8.d     // Catch: java.lang.Throwable -> La7
            aanv r3 = r3.a()     // Catch: java.lang.Throwable -> La7
            boolean r4 = r3.k()     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L93
            r1.d()     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r1.d     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "CHIME_ANDROID_SDK"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La7
            if (r4 != 0) goto L2d
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L79
        L2d:
            r1 = r3
            aanr r1 = (defpackage.aanr) r1     // Catch: java.lang.Throwable -> La7
            int r1 = r1.g     // Catch: java.lang.Throwable -> La7
            r4 = 1
            if (r1 != r4) goto L79
            aans r1 = r8.f     // Catch: java.lang.Throwable -> La7
            android.content.SharedPreferences r4 = r1.b     // Catch: java.lang.Throwable -> La7
            monitor-enter(r4)     // Catch: java.lang.Throwable -> La7
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "|S|id"
            r6 = 0
            java.lang.String r5 = r4.getString(r5, r6)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L47
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L76
            goto L63
        L47:
            android.content.SharedPreferences r5 = r1.b     // Catch: java.lang.Throwable -> L76
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "|S||P|"
            java.lang.String r7 = r5.getString(r7, r6)     // Catch: java.lang.Throwable -> L70
            if (r7 != 0) goto L54
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            goto L61
        L54:
            java.security.PublicKey r1 = r1.b(r7)     // Catch: java.lang.Throwable -> L70
            if (r1 != 0) goto L5c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            goto L61
        L5c:
            java.lang.String r6 = defpackage.aans.a(r1)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
        L61:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L76
            r5 = r6
        L63:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7f
            aanm r1 = r8.h     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = r1.a()     // Catch: java.lang.Throwable -> La7
            goto L7f
        L70:
            r1 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            throw r1     // Catch: java.lang.Throwable -> L76
        L73:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            throw r1     // Catch: java.lang.Throwable -> L76
        L76:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L76
            throw r1     // Catch: java.lang.Throwable -> La7
        L79:
            aanm r1 = r8.h     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = r1.a()     // Catch: java.lang.Throwable -> La7
        L7f:
            aant r1 = r8.d     // Catch: java.lang.Throwable -> La7
            aanq r4 = new aanq     // Catch: java.lang.Throwable -> La7
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La7
            r4.a = r5     // Catch: java.lang.Throwable -> La7
            r3 = 3
            r4.c(r3)     // Catch: java.lang.Throwable -> La7
            aanv r3 = r4.a()     // Catch: java.lang.Throwable -> La7
            r1.b(r3)     // Catch: java.lang.Throwable -> La7
        L93:
            if (r2 == 0) goto L98
            r2.a()     // Catch: java.lang.Throwable -> Lae
        L98:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            r8.g(r3)
            java.util.concurrent.ExecutorService r0 = r8.k
            aanb r1 = new aanb
            r1.<init>()
            r0.execute(r1)
            return
        La7:
            r1 = move-exception
            if (r2 == 0) goto Lad
            r2.a()     // Catch: java.lang.Throwable -> Lae
        Lad:
            throw r1     // Catch: java.lang.Throwable -> Lae
        Lae:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aanf.j():void");
    }

    @Override // defpackage.aang
    public final lvf k() {
        n();
        lvj lvjVar = new lvj();
        m(new aanj(this.e, lvjVar));
        lvn lvnVar = lvjVar.a;
        this.j.execute(new Runnable() { // from class: aand
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j();
            }
        });
        return lvnVar;
    }
}
