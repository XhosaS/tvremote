package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpo {
    private static final cbt e = cbt.k("com/google/android/tv/remote/service/RotatingIdentifier");
    private static final SecureRandom f = new SecureRandom();
    public final Handler a;
    public final List b = new ArrayList();
    public final Runnable c;
    public boolean d;
    private long g;
    private long h;
    private long i;

    public bpo() {
        SecureRandom secureRandom = f;
        this.g = secureRandom.nextLong();
        this.h = secureRandom.nextLong();
        this.i = secureRandom.nextLong();
        this.c = new bid(this, 15);
        this.d = false;
        this.a = new Handler(Looper.getMainLooper());
    }

    public final void a(bpn bpnVar) {
        List list = this.b;
        list.add(bpnVar);
        if (this.d) {
            if (list.size() == 1) {
                b();
            } else {
                bpnVar.a(this.g, this.h, this.i);
            }
        }
    }

    public final void b() {
        long jNextLong;
        ((cbs) ((cbs) e.e().g(btt.a)).j("com/google/android/tv/remote/service/RotatingIdentifier", "rotate", 39, "RotatingIdentifier.java")).p("Rotating identifiers");
        this.g = this.h;
        this.h = this.i;
        do {
            jNextLong = f.nextLong();
            this.i = jNextLong;
        } while (this.h == jNextLong);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bpn) it.next()).a(this.g, this.h, this.i);
        }
        this.a.postDelayed(this.c, r0.nextInt(300000) + 600000);
    }

    public final void c(bpn bpnVar) {
        List list = this.b;
        list.remove(bpnVar);
        if (list.isEmpty()) {
            this.a.removeCallbacks(this.c);
        }
    }
}
