package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyy {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/lifecycle/KatnissLifeCycleControllerImpl");
    private ezb b;

    public final void a(ezb ezbVar) {
        if (this.b != null) {
            ((zdv) ((zdv) a.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/app/lifecycle/KatnissLifeCycleControllerImpl", "bindToKatnissActivity", 20, "KatnissLifeCycleControllerImpl.kt")).u("#bindToKatnissActivity called when already bound.");
        }
        this.b = ezbVar;
    }

    public final void b() {
        ezb ezbVar = this.b;
        if (ezbVar != null) {
            ezbVar.a();
        }
    }

    public final void c() {
        ezb ezbVar = this.b;
        if (ezbVar != null) {
            ezbVar.b();
        }
    }

    public final void d() {
        if (this.b == null) {
            ((zdv) ((zdv) a.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/app/lifecycle/KatnissLifeCycleControllerImpl", "unbindKatnissActivity", 39, "KatnissLifeCycleControllerImpl.kt")).u("#unbindKatnissActivity called when nothing bound.");
        } else {
            this.b = null;
        }
    }
}
