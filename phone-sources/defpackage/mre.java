package defpackage;

import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mre extends fus {
    final /* synthetic */ InlineLocalWatchFragment a;

    public mre(InlineLocalWatchFragment inlineLocalWatchFragment) {
        this.a = inlineLocalWatchFragment;
    }

    @Override // defpackage.fus
    public final void onRouteSelected(fuy fuyVar, fux fuxVar) {
        this.a.mediaRouteProvider.a();
    }
}
