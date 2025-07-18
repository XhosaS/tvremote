package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asz {
    public Handler e;
    public aqe h;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final Set g = new HashSet();
    public final Runnable f = new ama(this, 4, null);

    public asz(Context context) {
        this.e = null;
        this.e = new Handler(context.getMainLooper());
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new asx(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (ask askVar : this.g) {
            }
            this.d = true;
        }
    }
}
