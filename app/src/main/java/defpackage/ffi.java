package defpackage;

import android.content.res.Resources;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffi implements exm {
    final /* synthetic */ ffj a;

    public ffi(ffj ffjVar) {
        this.a = ffjVar;
    }

    @Override // defpackage.exm
    public final void a() throws Resources.NotFoundException {
        ((zdv) ffj.b.c().q("com/google/android/apps/tvsearch/controller/SearchController$shouldLaunchAmatiEntity$1", "onStartActivityFailure", 1120, "SearchController.kt")).u("cannot start launcher for entity intent.");
        ffj ffjVar = this.a;
        String string = ffjVar.e.getResources().getString(R.string.assistant_internal_error);
        string.getClass();
        ffjVar.f.m(string);
    }

    @Override // defpackage.exm
    public final void b() {
        ffa ffaVar = ffj.a;
    }
}
