package defpackage;

import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlp extends fv {
    final /* synthetic */ DetailsActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlp(DetailsActivity detailsActivity) {
        super(true);
        this.a = detailsActivity;
    }

    @Override // defpackage.fv
    public final void b() {
        DetailsActivity detailsActivity = this.a;
        detailsActivity.setResult(-1);
        g(false);
        detailsActivity.getOnBackPressedDispatcher().c();
    }
}
