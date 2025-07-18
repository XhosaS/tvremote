package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mie implements kpz {
    public static final void l(Context context, Intent intent) {
        context.startActivity(jbr.T(context, intent));
    }

    private static final Intent m(Activity activity, ksy ksyVar, String str, String str2) {
        Intent intentPutExtra = new Intent().setClassName(activity, "com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity").putExtra("asset_id", ksyVar);
        if (!str2.isEmpty()) {
            wni wniVar = wni.a;
            vtw vtwVarM = wniVar.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            ((wni) vtwVarM.b).c = a.aJ(6);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wni wniVar2 = (wni) vtwVarM.b;
            str2.getClass();
            wniVar2.b = str2;
            wni wniVar3 = (wni) vtwVarM.r();
            vtw vtwVarM2 = wpd.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wpd wpdVar = (wpd) vtwVarM2.b;
            wniVar3.getClass();
            wpdVar.e = wniVar3;
            wpdVar.d = 5;
            if (!str.isEmpty()) {
                vtw vtwVarM3 = wniVar.m();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                ((wni) vtwVarM3.b).c = a.aJ(5);
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                wni wniVar4 = (wni) vtwVarM3.b;
                str.getClass();
                wniVar4.b = str;
                wni wniVar5 = (wni) vtwVarM3.r();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wpd wpdVar2 = (wpd) vtwVarM2.b;
                wniVar5.getClass();
                wpdVar2.c = wniVar5;
                wpdVar2.b = 4;
            }
            vuc vucVarR = vtwVarM2.r();
            if (vucVarR != null) {
                vxr.l(intentPutExtra, "entity_page_parameters", vucVarR);
            }
        }
        return intentPutExtra;
    }

    @Override // defpackage.kpz
    public final void a(Activity activity, boolean z, lfn lfnVar, lid lidVar) {
        if (lfnVar.cH() && lfnVar.dt()) {
            if (lfnVar.cI()) {
                activity.startActivity(jbr.T(activity, new Intent()));
            }
            activity.startActivity(ManageServicesActivity.manageServicesActivityIntent(activity, z, lidVar));
        }
    }

    @Override // defpackage.kpz
    public final void b(Activity activity, String str, String str2, String str3) {
        activity.startActivities(new Intent[]{jbr.T(activity, new Intent()), m(activity, ksy.l(str3), str2, str)});
    }

    @Override // defpackage.kpz
    public final void c(Activity activity, String str, String str2, String str3, String str4, lid lidVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            k(activity, "shows");
        } else {
            activity.startActivities(new Intent[]{jbr.V(activity), m(activity, ksy.l(str3), str2, str), BootstrapWatchActivity.createEpisodeIntent(activity, kuo.d(str, str2, str3), kgu.C(str4, "launcher"), null).putExtra("parent_event_id", lidVar)});
        }
    }

    @Override // defpackage.kpz
    public final void d(Activity activity, String str, String str2, String str3, String str4) {
        activity.startActivity(BootstrapWatchActivity.createEpisodeIntent(activity, kuo.d(str, str2, str3), str4, null));
    }

    @Override // defpackage.kpz
    public final void e(Activity activity, String str) {
        activity.startActivities(new Intent[]{jbr.T(activity, new Intent()), m(activity, ksy.i(str), "", "")});
    }

    @Override // defpackage.kpz
    public final void f(Activity activity, String str, String str2, lid lidVar, boolean z, boolean z2, boolean z3) {
        if (z2) {
            activity.startActivities(new Intent[]{jbr.V(activity), m(activity, ksy.i(str), "", ""), BootstrapWatchActivity.createMovieIntent(activity, kvf.U(ksy.i(str)), kgu.C(str2, "launcher"), null).putExtra("parent_event_id", lidVar).putExtra("direct_playback", z).putExtra("fallback_to_legacy_player", z3)});
        } else {
            activity.startActivities(new Intent[]{BootstrapWatchActivity.createMovieIntent(activity, kvf.U(ksy.i(str)), kgu.C(str2, "launcher"), null).putExtra("parent_event_id", lidVar).putExtra("direct_playback", z).putExtra("fallback_to_legacy_player", z3)});
        }
    }

    @Override // defpackage.kpz
    public final void g(Activity activity, String str, String str2) {
        f(activity, str, str2, lid.a(), false, false, false);
    }

    @Override // defpackage.kpz
    public final void h(Activity activity, String str, String str2) {
        activity.startActivities(new Intent[]{jbr.T(activity, new Intent()), m(activity, ksy.l(str), str2, "")});
    }

    @Override // defpackage.kpz
    public final void i(Activity activity, String str) {
        activity.startActivities(new Intent[]{jbr.T(activity, new Intent()), m(activity, ksy.l(str), "", "")});
    }

    @Override // defpackage.kpz
    public final void j(Activity activity, String str, String str2, String str3, boolean z, lid lidVar) {
        Uri uriB;
        ieg iegVar;
        Uri uri;
        if (TextUtils.isEmpty(str2)) {
            iegVar = ieg.a;
            uri = Uri.EMPTY;
            uriB = Uri.EMPTY;
        } else {
            ieg iegVarF = ieg.f(ksy.i(str2));
            Uri uriD = kxd.d(str2);
            uriB = kxd.b(str2);
            iegVar = iegVarF;
            uri = uriD;
        }
        kxb kxbVarB = kxb.b(str, uri, uriB);
        if (z) {
            activity.startActivities(new Intent[]{jbr.V(activity), BootstrapWatchActivity.createTrailerIntent(activity, kxbVarB, iegVar, ieg.a, kgu.C(str3, "launcher")).putExtra("parent_event_id", lidVar)});
        } else {
            activity.startActivities(new Intent[]{BootstrapWatchActivity.createTrailerIntent(activity, kxbVarB, iegVar, ieg.a, kgu.C(str3, "launcher")).putExtra("parent_event_id", lidVar)});
        }
    }

    @Override // defpackage.kpz
    public final void k(Activity activity, String str) {
        Intent intentV = jbr.V(activity);
        if (str != null) {
            intentV.putExtra("destination_id", str);
        }
        activity.startActivity(intentV);
    }
}
