package defpackage;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqi {
    public boolean b;
    final /* synthetic */ nqj c;
    public final Set a = new HashSet();
    private final Runnable d = new nqh(this);

    public nqi(nqj nqjVar) {
        this.c = nqjVar;
    }

    public final void a() {
        Handler handler = this.c.c;
        Runnable runnable = this.d;
        handler.removeCallbacks(runnable);
        this.b = true;
        handler.postDelayed(runnable, 1000L);
    }

    public final void b() {
        this.c.c.removeCallbacks(this.d);
        this.b = false;
    }
}
