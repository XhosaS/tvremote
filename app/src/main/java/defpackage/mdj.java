package defpackage;

import android.os.Binder;
import android.os.Build;
import android.os.StrictMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mdj {
    public static ThreadFactory a(String str, ThreadFactory threadFactory) {
        zyw zywVar = new zyw();
        zywVar.a = true;
        zywVar.b(str.concat(" Thread #%d"));
        zywVar.b = threadFactory;
        return zyw.a(zywVar);
    }

    public static zyh b(ThreadFactory threadFactory, zyh zyhVar, mgn mgnVar, mgt mgtVar) {
        Boolean bool = false;
        bool.getClass();
        mgh mghVar = new mgh("BG", 4, false, mgnVar);
        mgr mgrVarE = e(mgtVar, mghVar);
        String str = mghVar.a;
        StrictMode.ThreadPolicy.Builder builderPenaltyLog = new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyLog();
        builderPenaltyLog.detectResourceMismatches();
        builderPenaltyLog.detectUnbufferedIo();
        return new mdu(zyn.a(f(mghVar, a(str, new mcy(new meb(threadFactory), builderPenaltyLog.build())), mgrVarE)), zyhVar);
    }

    public static zyh c(ThreadFactory threadFactory, zyh zyhVar) {
        final meb mebVar = new meb(threadFactory);
        ThreadFactory threadFactoryA = a("Blocking", new ThreadFactory() { // from class: mcz
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return mec.a(((meb) mebVar).a, new Runnable() { // from class: mdd
                    @Override // java.lang.Runnable
                    public final void run() {
                        men.c();
                        runnable.run();
                    }
                });
            }
        });
        return new mdu(zyn.a(new mdi(TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryA)), zyhVar);
    }

    public static zyh d(ThreadFactory threadFactory, zyh zyhVar, int i, mef mefVar, mgt mgtVar) {
        Boolean bool = false;
        bool.getClass();
        mgh mghVar = new mgh("Lite", i, false, mgn.a);
        return new mdu(zyn.a(f(mghVar, a(mghVar.a, new mcy(new meb(threadFactory), mefVar.a())), e(mgtVar, mghVar))), zyhVar);
    }

    private static mgr e(mgt mgtVar, mgl mglVar) {
        return ((mgh) mglVar).c ? mgtVar.a(mglVar) : mgr.a;
    }

    private static ExecutorService f(mgl mglVar, ThreadFactory threadFactory, final mgr mgrVar) {
        mgh mghVar = (mgh) mglVar;
        if (mghVar.c) {
            threadFactory = new mgv(threadFactory, mgrVar);
        }
        if (mghVar.d != mgn.a) {
            threadFactory = new mgp(threadFactory);
        }
        return new zkx(mghVar.b, threadFactory, new Runnable() { // from class: mda
            @Override // java.lang.Runnable
            public final void run() {
                mgrVar.b();
            }
        }, new Runnable() { // from class: mdb
            @Override // java.lang.Runnable
            public final void run() {
                if (Build.VERSION.SDK_INT < 31) {
                    Binder.flushPendingCommands();
                }
                mgrVar.a();
            }
        });
    }
}
