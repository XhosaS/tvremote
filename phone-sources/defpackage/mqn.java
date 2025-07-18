package defpackage;

import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqn extends fv {
    final /* synthetic */ BootstrapWatchActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqn(BootstrapWatchActivity bootstrapWatchActivity) {
        super(true);
        this.a = bootstrapWatchActivity;
    }

    @Override // defpackage.fv
    public final void b() {
        BootstrapWatchActivity bootstrapWatchActivity = this.a;
        bootstrapWatchActivity.getOnBackPressedDispatcher().c();
        bootstrapWatchActivity.finish();
    }
}
