package defpackage;

import android.content.Intent;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eze implements wlk {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/app/localechanged/LocaleChangedReceiver");
    public final fjr a;
    public final idl b;
    private final ahbt d;
    private final boolean e;
    private final Supplier f;
    private final jcy g;
    private final ffp h;
    private final jdg i;
    private final icx j;

    public eze(ahbt ahbtVar, boolean z, fjr fjrVar, Supplier supplier, jcy jcyVar, ffp ffpVar, jdg jdgVar, icx icxVar, idl idlVar) {
        ahbtVar.getClass();
        fjrVar.getClass();
        jcyVar.getClass();
        ffpVar.getClass();
        jdgVar.getClass();
        idlVar.getClass();
        this.d = ahbtVar;
        this.e = z;
        this.a = fjrVar;
        this.f = supplier;
        this.g = jcyVar;
        this.h = ffpVar;
        this.i = jdgVar;
        this.j = icxVar;
        this.b = idlVar;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        ((zdv) c.b().q("com/google/android/apps/tvsearch/app/localechanged/LocaleChangedReceiver", "onReceive", 43, "LocaleChangedReceiver.kt")).u("Handling LOCALE_CHANGED intent");
        boolean z = this.e && ((Boolean) this.f.get()).booleanValue() && !this.g.b();
        if (((Boolean) this.f.get()).booleanValue()) {
            ahal.e(this.d, null, 0, new ezd(this, null), 3);
            this.h.c("led_to_idle_state");
        } else {
            this.j.b(false);
            this.h.c("led_to_idle_state");
        }
        this.i.a(z);
        return zxy.a;
    }
}
