package defpackage;

import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrf implements mjm {
    final /* synthetic */ InlineLocalWatchFragment a;

    public mrf(InlineLocalWatchFragment inlineLocalWatchFragment) {
        this.a = inlineLocalWatchFragment;
    }

    @Override // defpackage.mjm
    public final void a(mjw mjwVar) {
        if (mjwVar != null) {
            this.a.launchFullScreenActivity();
        }
    }
}
