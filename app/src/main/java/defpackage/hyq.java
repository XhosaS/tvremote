package defpackage;

import android.os.Handler;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hyq {
    private static final Duration d = Duration.ofSeconds(2);
    final Duration a;
    final Handler b;
    hyn c;

    public hyq(Handler handler, Duration duration) {
        this.b = handler;
        this.a = duration;
    }

    public final void a(hyo hyoVar) {
        hyn hynVar = this.c;
        if (hynVar != null) {
            hynVar.a(hyoVar);
            return;
        }
        hyn hynVar2 = new hyn(this.b);
        this.c = hynVar2;
        hynVar2.a(hyoVar);
        this.c.a(new hyp(this));
        hyn hynVar3 = this.c;
        Duration duration = this.a;
        Duration duration2 = d;
        if (duration.compareTo(duration2) <= 0) {
            ((zdv) ((zdv) hyn.a.d()).q("com/google/android/apps/tvsearch/searchbar/speechhesitation/HesitationDetector", "startWithLimitForPreparation", 66, "HesitationDetector.java")).u("#startWithLimitForPreparation maxHesitation <= minHesitation");
            hynVar3.b = feq.e(hynVar3.f, duration2, hynVar3.g);
        } else {
            Handler handler = hynVar3.f;
            hynVar3.b = feq.e(handler, duration, hynVar3.g);
            hynVar3.c = feq.e(handler, duration2, hynVar3.h);
            hynVar3.d = true;
        }
    }

    public final void b() {
        hyn hynVar = this.c;
        if (hynVar != null) {
            hynVar.d = false;
            if (hynVar.c) {
                return;
            }
            hynVar.c();
        }
    }

    public final void c() {
        hyn hynVar = this.c;
        if (hynVar != null) {
            hynVar.e = null;
            if (hynVar.b) {
                hynVar.f.removeCallbacks(hynVar.g);
                hynVar.b = false;
            }
            if (hynVar.c) {
                hynVar.f.removeCallbacks(hynVar.h);
                hynVar.c = false;
            }
            hynVar.d = false;
            this.c = null;
        }
    }
}
