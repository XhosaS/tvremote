package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Debug;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkg implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private final Context b;
    private final Deque c = new ArrayDeque();
    private final Set d = new HashSet();
    public final Map a = new HashMap();

    public wkg(Context context) {
        this.b = context;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        context.registerComponentCallbacks(this);
    }

    final void a(int i) {
        Deque deque = this.c;
        deque.size();
        int size = deque.size() - i;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.d.contains((Activity) deque.peekFirst())) {
                break;
            }
            Set set = (Set) this.a.get((Activity) deque.removeFirst());
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((wke) it.next()).a.o();
                }
            }
        }
        if (size > 0) {
            if (Debug.getNativeHeapAllocatedSize() > Runtime.getRuntime().totalMemory() * 0.8d) {
                cyg.a(this.b).e(15);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.c.remove(activity);
        this.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Deque deque = this.c;
        deque.remove(activity);
        deque.add(activity);
        this.d.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.d.remove(activity);
        if (activity.isChangingConfigurations() || activity.isFinishing()) {
            return;
        }
        double nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / Runtime.getRuntime().maxMemory();
        if (nativeHeapAllocatedSize >= 0.8d) {
            a(1);
        } else if (nativeHeapAllocatedSize >= 0.7d) {
            a(2);
        } else if (nativeHeapAllocatedSize >= 0.6d) {
            a(3);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i < 20) {
            a(i >= 15 ? 1 : i >= 10 ? 2 : 3);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
