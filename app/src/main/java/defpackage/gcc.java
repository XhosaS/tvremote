package defpackage;

import android.content.Intent;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcc implements gcd {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/led/controller/KatnissLedController");
    public final fjr b;
    public final jcy c;
    public boolean d;
    private final agow e;
    private final ewc f;
    private final boolean g;
    private final gdb h;
    private final ahbt i;
    private boolean j;
    private gcj k;
    private final ewb l;

    public gcc(agow agowVar, ewc ewcVar, boolean z, fjr fjrVar, jcy jcyVar, gdb gdbVar, ahbt ahbtVar, PowerManager powerManager) {
        agowVar.getClass();
        ewcVar.getClass();
        fjrVar.getClass();
        jcyVar.getClass();
        ahbtVar.getClass();
        powerManager.getClass();
        this.e = agowVar;
        this.f = ewcVar;
        this.g = z;
        this.b = fjrVar;
        this.c = jcyVar;
        this.h = gdbVar;
        this.i = ahbtVar;
        this.d = powerManager.isInteractive();
        ewb ewbVar = new ewb() { // from class: gca
            @Override // defpackage.ewb
            public final void a(Intent intent) {
                String action;
                gcc gccVar = this.a;
                if (gccVar.c.c() || (action = intent.getAction()) == null) {
                    return;
                }
                int iHashCode = action.hashCode();
                if (iHashCode == -2128145023) {
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        ((zdv) gcc.a.b().q("com/google/android/apps/tvsearch/led/controller/KatnissLedController", "displayStatusListener$lambda$0", 74, "KatnissLedController.kt")).u("Turning off LEDs for energy mode");
                        gccVar.d = false;
                        gccVar.b(gcj.h);
                        return;
                    }
                    return;
                }
                if (iHashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                    ((zdv) gcc.a.b().q("com/google/android/apps/tvsearch/led/controller/KatnissLedController", "displayStatusListener$lambda$0", 67, "KatnissLedController.kt")).u("Device becoming active, refreshing LEDs");
                    gccVar.d = true;
                    gccVar.j();
                }
            }
        };
        this.l = ewbVar;
        ewcVar.b(ewbVar);
    }

    @Override // defpackage.gcd
    public final void a() {
        b(gcj.i);
    }

    public final void b(gcj gcjVar) {
        if (gce.a(this.g, this.j, gcjVar)) {
            this.k = gcjVar;
            ((zdv) a.b().q("com/google/android/apps/tvsearch/led/controller/KatnissLedController", "executeLedAction", 147, "KatnissLedController.kt")).x("Executing state[%s]", gcjVar);
            gcj gcjVar2 = gcj.a;
            switch (gcjVar.ordinal()) {
                case 0:
                    ((gdf) this.h).a(13);
                    return;
                case 1:
                    ((gdf) this.h).a(9);
                    return;
                case 2:
                    ((gdf) this.h).a(10);
                    return;
                case 3:
                    ((gdf) this.h).a(12);
                    return;
                case 4:
                    ((gdf) this.h).a(31);
                    return;
                case 5:
                    ((gdf) this.h).a(33);
                    return;
                case 6:
                    ((gdf) this.h).a(11);
                    return;
                case 7:
                    gdf gdfVar = (gdf) this.h;
                    gdu gduVar = gdfVar.d;
                    gduVar.e = false;
                    gduVar.f = 0L;
                    gduVar.c = null;
                    gduVar.d.clear();
                    gduVar.a.removeCallbacksAndMessages(gduVar);
                    gduVar.b();
                    if (gdfVar.c.isEmpty()) {
                        return;
                    }
                    gdfVar.a(((Integer) gdfVar.c.get()).intValue());
                    return;
                case 8:
                    return;
                default:
                    throw new agpg();
            }
        }
    }

    @Override // defpackage.gcd
    public final void c() {
        b(gcj.a);
    }

    @Override // defpackage.gcd
    public final void d() {
        if (!this.c.c() && !this.d) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/led/controller/KatnissLedController", "mute", 107, "KatnissLedController.kt")).u("Not showing mute because energy mode and screen off forbid it");
        } else if (((Boolean) this.e.a()).booleanValue()) {
            b(gcj.f);
        } else {
            b(gcj.e);
        }
    }

    @Override // defpackage.gcd
    public final void e() {
        gcj gcjVar;
        gcj gcjVar2 = this.k;
        gcj gcjVar3 = gcj.g;
        if (gcjVar2 == gcjVar3 || (gcjVar = this.k) == gcj.d || gcjVar == gcj.h) {
            return;
        }
        b(gcjVar3);
    }

    @Override // defpackage.gcd
    public final void f() {
        b(gcj.h);
    }

    @Override // defpackage.gcd
    public final void g() {
        b(gcj.c);
    }

    @Override // defpackage.gcd
    public final void h(boolean z) {
        if (!z) {
            j();
        }
        this.j = z;
    }

    @Override // defpackage.gcd
    public final void i() {
        b(gcj.b);
    }

    @Override // defpackage.gcd
    public final void j() {
        jcy jcyVar = this.c;
        if (!jcyVar.b()) {
            ahal.e(this.i, null, 0, new gcb(this, null), 3);
        } else if (jcyVar.d()) {
            e();
        } else {
            d();
        }
    }
}
