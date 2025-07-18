package defpackage;

import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlt implements idy {
    final /* synthetic */ DetailsActivity a;
    private final ieh b;
    private final mta c;

    public mlt(DetailsActivity detailsActivity, mta mtaVar, ieh iehVar) {
        this.a = detailsActivity;
        this.c = mtaVar;
        this.b = iehVar;
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        DetailsActivity detailsActivity = this.a;
        ieg iegVar = (ieg) obj;
        if (detailsActivity.c || !iegVar.m()) {
            return;
        }
        detailsActivity.c = true;
        ieg iegVarA = ((ldy) this.b).a();
        if (iegVarA.m()) {
            this.c.c(detailsActivity, detailsActivity.getSupportFragmentManager(), (ksn) iegVarA.g(), ((kvf) iegVar.g()).o());
        }
    }
}
