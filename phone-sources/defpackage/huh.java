package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import com.bumptech.glide.manager.LifecycleLifecycle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huh implements Handler.Callback {
    private static final hur d = new hur((byte[]) null);
    public final hub a;
    public final hfw b;
    private volatile hkg c;

    public huh() {
        new ir();
        this.b = new hfw((char[]) null, (byte[]) null);
        this.a = (hsg.b && hsg.a) ? new hua() : new hty();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final hkg b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (hwp.j() && !(context instanceof Application)) {
            if (context instanceof by) {
                return c((by) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = new hkg(hjr.b(context.getApplicationContext()), new htu(), new huf(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final hkg c(by byVar) {
        if (hwp.i()) {
            return b(byVar.getApplicationContext());
        }
        if (byVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.a.a(byVar);
        Activity activityA = a(byVar);
        boolean z = true;
        if (activityA != null && activityA.isFinishing()) {
            z = false;
        }
        hjr hjrVarB = hjr.b(byVar.getApplicationContext());
        hfw hfwVar = this.b;
        dve lifecycle = byVar.getLifecycle();
        byVar.getSupportFragmentManager();
        hwp.g();
        hwp.g();
        ?? r4 = hfwVar.a;
        hkg hkgVar = (hkg) r4.get(lifecycle);
        if (hkgVar != null) {
            return hkgVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        hkg hkgVar2 = new hkg(hjrVarB, lifecycleLifecycle, new huf(), byVar);
        r4.put(lifecycle, hkgVar2);
        lifecycleLifecycle.a(new hue(hfwVar, lifecycle));
        if (z) {
            hkgVar2.l();
        }
        return hkgVar2;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
