package defpackage;

import android.content.res.Resources;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhc implements exm {
    final /* synthetic */ hhd a;

    public hhc(hhd hhdVar) {
        this.a = hhdVar;
    }

    @Override // defpackage.exm
    public final void a() throws Resources.NotFoundException {
        ((zdv) hhd.b.c().q("com/google/android/apps/tvsearch/results/activity/keyboard/KeyboardSearchActivityPeer$onDisplayOverlay$1", "onStartActivityFailure", 533, "KeyboardSearchActivityPeer.kt")).u("#onDisplayOverlay: Katniss intent failed to start.");
        hhd hhdVar = this.a;
        String string = hhdVar.f.getResources().getString(R.string.assistant_internal_error);
        string.getClass();
        hhdVar.m(string);
    }

    @Override // defpackage.exm
    public final void b() {
    }
}
