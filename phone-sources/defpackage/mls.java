package defpackage;

import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mls implements idy {
    final /* synthetic */ DetailsActivity a;
    private final ieh b;
    private final ieh c;
    private final ieh d;

    public mls(DetailsActivity detailsActivity, ieh iehVar, ieh iehVar2, ieh iehVar3) {
        this.a = detailsActivity;
        this.b = iehVar;
        this.c = iehVar2;
        this.d = iehVar3;
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        DetailsActivity detailsActivity = this.a;
        ieg iegVar = (ieg) obj;
        if (detailsActivity.d || !iegVar.m()) {
            return;
        }
        detailsActivity.d = true;
        kvf kvfVar = (kvf) iegVar.g();
        kvc kvcVarA = ((kva) this.b.a()).a(kvfVar);
        kuj kujVarA = ((kuk) this.c.a()).a(kvfVar.o());
        ieg iegVarA = ((ldy) this.d).a();
        if (kujVarA.i() && iegVarA.m()) {
            cr supportFragmentManager = detailsActivity.getSupportFragmentManager();
            mta.f(detailsActivity, supportFragmentManager, kvfVar.o(), kujVarA, kvcVarA.e);
        }
    }
}
