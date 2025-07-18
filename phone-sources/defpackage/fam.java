package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fam implements fad {
    private final LinkedHashMap a;
    private final fac b;
    private final float c;
    private boolean d;

    public fam() {
        this(10, 0.5f);
    }

    @Override // defpackage.fad
    public final long a() {
        if (this.d) {
            return -9223372036854775807L;
        }
        return (long) this.b.a(this.c);
    }

    @Override // defpackage.fad
    public final void b(eey eeyVar) {
        LinkedHashMap linkedHashMap = this.a;
        linkedHashMap.remove(eeyVar);
        linkedHashMap.put(eeyVar, Long.valueOf(edt.y(SystemClock.elapsedRealtime())));
    }

    @Override // defpackage.fad
    public final void c(eey eeyVar) {
        if (((Long) this.a.remove(eeyVar)) == null) {
            return;
        }
        this.b.b(1, edt.y(SystemClock.elapsedRealtime()) - r6.longValue());
        this.d = false;
    }

    @Override // defpackage.fad
    public final void d() {
        this.b.c();
        this.d = true;
    }

    public fam(int i, float f) {
        boolean z = false;
        if (f > 0.0f && f <= 1.0f) {
            z = true;
        }
        a.H(z);
        this.c = f;
        this.a = new fal();
        this.b = new fac(i);
        this.d = true;
    }
}
