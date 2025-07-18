package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tex {
    protected final Set a;
    private final IntentFilter b;
    private final Context c;
    private tew d;
    private volatile boolean e;

    public tex(Context context) {
        new ulp("AppUpdateListenerRegistry", (byte[]) null);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.a = new HashSet();
        this.d = null;
        this.e = false;
        this.b = intentFilter;
        this.c = sio.e(context);
    }

    public final synchronized void a(Object obj) {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            igv igvVar = (igv) it.next();
            int i = ((tet) obj).a;
            krd.b(a.cf(i, "App install state: "));
            igvVar.d(i, ((tet) obj).b, ((tet) obj).c, ((tet) obj).d);
        }
    }

    public final synchronized void b(igv igvVar) {
        tew tewVar;
        Set set = this.a;
        set.add(igvVar);
        if (!set.isEmpty() && this.d == null) {
            this.d = new tew(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.c.registerReceiver(this.d, this.b, 2);
            } else {
                this.c.registerReceiver(this.d, this.b);
            }
        }
        if (!set.isEmpty() || (tewVar = this.d) == null) {
            return;
        }
        this.c.unregisterReceiver(tewVar);
        this.d = null;
    }
}
