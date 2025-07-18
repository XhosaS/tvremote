package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class miu implements lis {
    private final ieh a;
    private final String b;
    private final Intent c;
    private final idb d;
    private final lxm e;

    public miu(ieh iehVar, String str, Intent intent, idb idbVar, lxm lxmVar) {
        this.a = iehVar;
        this.b = str;
        this.c = intent;
        this.d = idbVar;
        this.e = lxmVar;
    }

    @Override // defpackage.lis
    public final /* synthetic */ void a(Object obj, View view, lid lidVar) {
        muj mujVar = (muj) obj;
        Activity activity = (Activity) this.a.a();
        ieg iegVarB = this.e.b(mujVar.c);
        if (iegVarB.m()) {
            kst kstVar = (kst) iegVarB.g();
            if (kstVar instanceof kvf) {
                activity.startActivity(DetailsActivity.createMovieDetailsIntent(activity, (kvf) kstVar, this.b, lidVar, this.c, (ieg<lao>) mujVar.j));
                return;
            }
            if (kstVar instanceof kwn) {
                activity.startActivity(DetailsActivity.createShowIntent(activity, (kwn) kstVar, this.b, lidVar, this.c, (ieg<lao>) mujVar.j));
                return;
            }
            if (kstVar instanceof kwl) {
                activity.startActivity(DetailsActivity.createSeasonIntent(activity, (kwl) kstVar, this.b, lidVar, this.c));
                return;
            }
            if (kstVar instanceof kuo) {
                activity.startActivity(DetailsActivity.createEpisodeIntent(activity, (kuo) kstVar, this.b, lidVar, this.c));
            } else if ((kstVar instanceof kvj) && this.d.a()) {
                activity.startActivity(DetailsActivity.createMoviesBundleDetailsIntent(activity, (kvj) kstVar, this.b, lidVar, this.c));
            }
        }
    }
}
