package defpackage;

import com.google.android.apps.tvsearch.searchbar.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxi implements eyn {
    final /* synthetic */ hxr a;

    public hxi(hxr hxrVar) {
        this.a = hxrVar;
    }

    @Override // defpackage.eyn
    public final void a() {
        glg glgVar = this.a.G;
        glgVar.c(yea.UI_DISPLAYED);
        glgVar.c(yea.IDLE_AFTER_UI_DISMISSED);
    }

    @Override // defpackage.eyn
    public final void b() throws InterruptedException {
        zdy zdyVar = hxr.f;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$setupActivityLifeCycleListener$1", "onSearchActivityDestroy", 1927, "VoicePlateActivity.kt")).u("#onSearchActivityDestroy");
        hxr hxrVar = this.a;
        if (hxrVar.ad) {
            feq.e(hxrVar.E(), hxr.i, hxrVar.W);
        } else if (hxrVar.ae) {
            feq.e(hxrVar.E(), hxr.j, hxrVar.W);
        } else if (((Boolean) hxrVar.t.a()).booleanValue() && hxrVar.N) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$setupActivityLifeCycleListener$1", "onSearchActivityDestroy", 1946, "VoicePlateActivity.kt")).u("Search Activity is destroyed while conversation is ongoing, don't finish VoicePlateActivity.");
        } else {
            hxrVar.a();
        }
        ((hvv) hxrVar.I().getSuggestionsDistributor()).c = null;
    }

    @Override // defpackage.eyn
    public final void d() {
        zdy zdyVar = hxr.f;
        final hxr hxrVar = this.a;
        gph gphVar = hxrVar.w;
        gph gphVar2 = gph.b;
        if (gphVar == gphVar2 && hxrVar.as == 3) {
            hxrVar.z();
            if (!hxrVar.m.i) {
                hxrVar.O();
            }
        }
        if (gphVar == gphVar2) {
            hxrVar.y();
            feq.e(hxrVar.E(), hxr.h, new Runnable() { // from class: hxh
                @Override // java.lang.Runnable
                public final void run() {
                    hvu hvuVar = hxrVar.ab;
                    if (hvuVar == null) {
                        agvy.b("searchBarViewManager");
                        hvuVar = null;
                    }
                    ((SearchBar) hvuVar).setBackground(null);
                }
            });
        }
        hxrVar.ad = false;
        if (gphVar == gphVar2) {
            ((hvv) hxrVar.I().getSuggestionsDistributor()).c = hxrVar.L;
        }
        hxrVar.ae = false;
    }

    @Override // defpackage.eyn
    public final void f() {
        zdy zdyVar = hxr.f;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$setupActivityLifeCycleListener$1", "onSearchActivityStop", 1914, "VoicePlateActivity.kt")).u("#onSearchActivityStop");
        hxr hxrVar = this.a;
        if (hxrVar.ad) {
            return;
        }
        int i = hxrVar.as;
        if ((i == 2 || i == 1) && !hxrVar.ae) {
            if (agvy.c(hxrVar.P, "com.google.android.youtube.tv") && ((Boolean) hxrVar.J.a()).booleanValue()) {
                return;
            }
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$setupActivityLifeCycleListener$1", "onSearchActivityStop", 1921, "VoicePlateActivity.kt")).u("Hiding the VoicePlate.");
            hxrVar.e();
        }
    }

    @Override // defpackage.eyn
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.eyn
    public final /* synthetic */ void e() {
    }
}
