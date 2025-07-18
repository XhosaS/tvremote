package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hyn {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/searchbar/speechhesitation/HesitationDetector");
    boolean b;
    boolean c;
    boolean d;
    List e;
    final Handler f;
    final Runnable g = new hyl(this);
    final Runnable h = new Runnable() { // from class: hym
        @Override // java.lang.Runnable
        public final void run() {
            hyn hynVar = this.a;
            hynVar.c = false;
            if (hynVar.d) {
                return;
            }
            hynVar.c();
        }
    };

    public hyn(Handler handler) {
        this.f = handler;
    }

    final void a(hyo hyoVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (this.e.contains(hyoVar)) {
            return;
        }
        this.e.add(hyoVar);
    }

    final void b() {
        this.b = false;
        List<hyo> list = this.e;
        if (list != null) {
            for (hyo hyoVar : list) {
                if (this.d) {
                    hyoVar.b();
                } else {
                    hyoVar.a();
                }
            }
            this.e = null;
        }
    }

    public final void c() {
        Handler handler = this.f;
        Runnable runnable = this.g;
        handler.removeCallbacks(runnable);
        ((hyl) runnable).a.b();
    }
}
