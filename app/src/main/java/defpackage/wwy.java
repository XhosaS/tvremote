package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wwy implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Application.ActivityLifecycleCallbacks a;
    final /* synthetic */ wxc b;

    public wwy(wxc wxcVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a = activityLifecycleCallbacks;
        this.b = wxcVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (wum.t()) {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityCreated", 1841);
        try {
            this.a.onActivityCreated(activity, bundle);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (wum.t()) {
            this.a.onActivityDestroyed(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityDestroyed", 2069);
        try {
            this.a.onActivityDestroyed(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPaused(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPaused", 1955);
        try {
            this.a.onActivityPaused(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (wum.t()) {
            this.a.onActivityPostCreated(activity, bundle);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostCreated", 1854);
        try {
            this.a.onActivityPostCreated(activity, bundle);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPostDestroyed(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostDestroyed", 2082);
        try {
            this.a.onActivityPostDestroyed(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPostPaused(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostPaused", 1968);
        try {
            this.a.onActivityPostPaused(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPostResumed(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostResumed", 1930);
        try {
            this.a.onActivityPostResumed(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        if (wum.t()) {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostSaveInstanceState", 2044);
        try {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPostStarted(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostStarted", 1892);
        try {
            this.a.onActivityPostStarted(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPostStopped(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostStopped", 2006);
        try {
            this.a.onActivityPostStopped(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (wum.t()) {
            this.a.onActivityPreCreated(activity, bundle);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreCreated", 1829);
        try {
            this.a.onActivityPreCreated(activity, bundle);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPreDestroyed(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreDestroyed", 2057);
        try {
            this.a.onActivityPreDestroyed(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPrePaused(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPrePaused", 1943);
        try {
            this.a.onActivityPrePaused(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPreResumed(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreResumed", 1905);
        try {
            this.a.onActivityPreResumed(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        if (wum.t()) {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreSaveInstanceState", 2019);
        try {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPreStarted(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreStarted", 1867);
        try {
            this.a.onActivityPreStarted(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        if (wum.t()) {
            this.a.onActivityPreStopped(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreStopped", 1981);
        try {
            this.a.onActivityPreStopped(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (wum.t()) {
            this.a.onActivityResumed(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityResumed", 1917);
        try {
            this.a.onActivityResumed(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (wum.t()) {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivitySaveInstanceState", 2031);
        try {
            this.a.onActivitySaveInstanceState(activity, bundle);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (wum.t()) {
            this.a.onActivityStarted(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityStarted", 1879);
        try {
            this.a.onActivityStarted(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (wum.t()) {
            this.a.onActivityStopped(activity);
            return;
        }
        wvl wvlVarB = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityStopped", 1993);
        try {
            this.a.onActivityStopped(activity);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
