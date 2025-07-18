package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfl implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ wfr a;

    public wfl(wfr wfrVar) {
        this.a = wfrVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        this.a.a.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        this.a.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        this.a.b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        final wfr wfrVar = this.a;
        Set set = wfrVar.b;
        set.remove(activity);
        uea.c();
        if (!wfrVar.d && set.isEmpty() && wfrVar.a()) {
            MessageQueue messageQueueMyQueue = Looper.myQueue();
            final MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: wfi
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    final wfr wfrVar2 = wfrVar;
                    if (wfrVar2.d || !wfrVar2.b.isEmpty()) {
                        return false;
                    }
                    wvx wvxVarA = wzg.a("Recreating all activities");
                    try {
                        if (wfrVar2.a()) {
                            wfrVar2.d = true;
                            uea.a().post(wyo.h(new Runnable() { // from class: wfj
                                /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, wap] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    for (wbm wbmVar : wfrVar2.c.values()) {
                                        if (wbmVar.c()) {
                                            uea.c();
                                            for (wea weaVar : wbmVar.b.values()) {
                                                if (weaVar.e()) {
                                                    try {
                                                        wcp wcpVar = (wcp) zxn.o(weaVar.v.b());
                                                        wcpVar.c();
                                                        wdw wdwVarB = wcpVar.b();
                                                        wea.a.a(weaVar.s.a().b(wdwVarB.c, wdwVarB.e), "Failed to commit to config");
                                                    } catch (ExecutionException e) {
                                                        throw new RuntimeException(e.getCause());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }));
                            Iterator it = wfrVar2.a.iterator();
                            while (it.hasNext()) {
                                ((Activity) it.next()).recreate();
                            }
                            uea.a().post(new Runnable() { // from class: wfk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    wfrVar2.d = false;
                                }
                            });
                        }
                        aguc.a(wvxVarA, null);
                        return false;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            aguc.a(wvxVarA, th);
                            throw th2;
                        }
                    }
                }
            };
            wyo wyoVar = wyo.a;
            final wwq wwqVarE = wum.e();
            messageQueueMyQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: wxx
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    wyo wyoVar2 = wyo.a;
                    wwq wwqVarG = wum.g(wum.c(), wwqVarE);
                    try {
                        return idleHandler.queueIdle();
                    } finally {
                    }
                }
            });
        }
    }
}
