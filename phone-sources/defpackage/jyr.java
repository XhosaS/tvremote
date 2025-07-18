package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;
import com.google.android.apps.googletv.app.presentation.pages.qs.QSActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchResultsPageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jyr implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jyr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, lhf] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                DeviceNotificationActivity.m112$r8$lambda$INMpN0yM4kkGUEooYWXrFqqdT4((DeviceNotificationActivity) this.a, view);
                break;
            case 1:
                ((jvw) this.a).j(!r6.k());
                break;
            case 2:
                ((EntityPageActivity) this.a).finish();
                break;
            case 3:
                EntityPageActivity.$r8$lambda$hbbjfCdHj5gJnrn9folkmbX6CUA((EntityPageActivity) this.a, view);
                break;
            case 4:
                Object obj = this.a;
                ((jzk) obj).b.a();
                ((bl) obj).dismiss();
                break;
            case 5:
                Object obj2 = this.a;
                ((jzl) obj2).b.a();
                ((bl) obj2).dismiss();
                break;
            case 6:
                ((tbb) this.a).e();
                break;
            case 7:
                GtvHomePageActivity.$r8$lambda$FGdta_y9b1mhFuCy0RfOtU0_kAY((GtvHomePageActivity) this.a, view);
                break;
            case 8:
                GtvHomePageActivity gtvHomePageActivity = (GtvHomePageActivity) this.a;
                gtvHomePageActivity.D().h(gtvHomePageActivity);
                break;
            case 9:
                GtvHomePageActivity gtvHomePageActivity2 = (GtvHomePageActivity) this.a;
                gtvHomePageActivity2.D().h(gtvHomePageActivity2);
                break;
            case 10:
                Object obj3 = this.a;
                ((Activity) obj3).startActivity(jbr.aa((Context) obj3));
                break;
            case 11:
                Intent intentPutExtra = new Intent().putExtra("re_setup_flag", true);
                intentPutExtra.getClass();
                Intent intent = new Intent(intentPutExtra);
                Context context = (Context) this.a;
                Intent className = intent.setClassName(context, "com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity");
                className.getClass();
                jbr.Q(className, context);
                context.startActivity(className);
                break;
            case 12:
                Intent intent2 = new Intent();
                Context context2 = (Context) this.a;
                Intent className2 = intent2.setClassName(context2, "com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity");
                className2.getClass();
                jbr.Q(className2, context2);
                context2.startActivity(className2);
                break;
            case 13:
                kcl kclVar = (kcl) this.a;
                if (!kclVar.g) {
                    kclVar.g = true;
                    ykr.q(yoz.m(), null, 0, new kbl(kclVar, view, (yih) null, 2), 3);
                    break;
                }
                break;
            case 14:
                MyEpisodesActivity.$r8$lambda$d25ru1fni1N08dR7Om9_ZmTDoHg((MyEpisodesActivity) this.a, view);
                break;
            case 15:
                QSActivity qSActivity = (QSActivity) this.a;
                qSActivity.startActivity(jbr.T(qSActivity, new Intent()));
                break;
            case 16:
                QSActivity qSActivity2 = (QSActivity) this.a;
                qSActivity2.startActivity(jbr.U(qSActivity2, new Intent()));
                break;
            case 17:
                ((QSActivity) this.a).finishAndRemoveTask();
                break;
            case 18:
                SearchResultsPageActivity searchResultsPageActivity = (SearchResultsPageActivity) this.a;
                searchResultsPageActivity.D().i(searchResultsPageActivity, searchResultsPageActivity.i().a);
                break;
            case 19:
                view.getClass();
                klb klbVar = klc.a;
                ViewParent parent = view.getParent();
                parent.getClass();
                ((kku) this.a).b.d(klbVar, (RecyclerView) parent);
                break;
            default:
                kff.s(view, this.a);
                break;
        }
    }
}
