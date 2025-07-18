package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.play.movies.mobile.presenter.activity.HomeLauncherActivity;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.NotificationSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mpz implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mpz(PlayHeaderListLayout playHeaderListLayout, int i) {
        this.b = i;
        this.a = playHeaderListLayout;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                Activity activity = (Activity) obj;
                activity.finishAffinity();
                activity.startActivity(new Intent((Context) obj, (Class<?>) HomeLauncherActivity.class));
                System.exit(0);
                return;
            case 1:
                ((DetailsActivity) this.a).G.sendAccessibilityEvent(8);
                return;
            case 2:
                ((InternalSettingsActivity) this.a).d.c();
                return;
            case 3:
                ((InternalSettingsActivity) this.a).f.a();
                return;
            case 4:
                NotificationSettingsActivity.m131$r8$lambda$ImF4zPejCeh96x5fboquoQFJA((NotificationSettingsActivity) this.a);
                return;
            case 5:
                SettingsActivity.$r8$lambda$mTc08jOlsb6DT86j3UkxYtxZdi8((SettingsActivity) this.a);
                return;
            case 6:
                ((InlineLocalWatchFragment) this.a).lambda$launchFullScreenActivity$0();
                return;
            case 7:
                ((msz) this.a).f();
                return;
            case 8:
                ((mtd) this.a).f();
                return;
            case 9:
                ((PlayHeaderListLayout) this.a).v(false, true);
                return;
            case 10:
                ((PlayHeaderListLayout) this.a).v(true, true);
                return;
            case 11:
                ((PlayHeaderListLayout) this.a).t(null, true);
                return;
            case 12:
                nnu nnuVar = (nnu) this.a;
                nnv nnvVar = nnuVar.f;
                if (nnvVar != null) {
                    nnuVar.b.a(nnuVar.d.a(nnvVar), 223);
                }
                nnuVar.g();
                return;
            case 13:
                nnx nnxVar = (nnx) this.a;
                Set set = nnxVar.g;
                if (set.isEmpty()) {
                    return;
                }
                Set set2 = nnxVar.h;
                long j = true != set2.equals(set) ? 86400000L : 172800000L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = nnxVar.i;
                if (j2 == 0 || jCurrentTimeMillis - j2 >= j) {
                    nsf.e();
                    vtw vtwVarM = ucm.a.m();
                    String str = nnx.a;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    vuc vucVar = vtwVarM.b;
                    ucm ucmVar = (ucm) vucVar;
                    str.getClass();
                    ucmVar.b |= 2;
                    ucmVar.d = str;
                    String str2 = nnxVar.d;
                    if (!vucVar.A()) {
                        vtwVarM.u();
                    }
                    ucm ucmVar2 = (ucm) vtwVarM.b;
                    str2.getClass();
                    ucmVar2.b |= 1;
                    ucmVar2.c = str2;
                    ucm ucmVar3 = (ucm) vtwVarM.r();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(set);
                    vtw vtwVarM2 = ucl.a.m();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    ucl uclVar = (ucl) vtwVarM2.b;
                    vuj vujVar = uclVar.d;
                    if (!vujVar.c()) {
                        uclVar.d = vuc.q(vujVar);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        uclVar.d.g(((uck) it.next()).ag);
                    }
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    ucl uclVar2 = (ucl) vtwVarM2.b;
                    ucmVar3.getClass();
                    uclVar2.c = ucmVar3;
                    uclVar2.b = 1 | uclVar2.b;
                    ucl uclVar3 = (ucl) vtwVarM2.r();
                    vtw vtwVarM3 = uco.a.m();
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    uco ucoVar = (uco) vtwVarM3.b;
                    uclVar3.getClass();
                    ucoVar.n = uclVar3;
                    ucoVar.c |= 8192;
                    nnxVar.b.a((uco) vtwVarM3.r(), 243);
                    SharedPreferences sharedPreferences = nnxVar.c;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!set2.equals(set)) {
                        set2.clear();
                        set2.addAll(set);
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            String strH = nnx.h((uck) it2.next());
                            String strD = nnxVar.d(strH);
                            String strC = nnx.c("feature_usage_timestamp_reported_feature_", strH);
                            if (!TextUtils.equals(strD, strC)) {
                                long j3 = sharedPreferences.getLong(strD, 0L);
                                editorEdit.remove(strD);
                                if (j3 != 0) {
                                    editorEdit.putLong(strC, j3);
                                }
                            }
                        }
                    }
                    nnxVar.i = jCurrentTimeMillis;
                    editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
                    return;
                }
                return;
            case 14:
                ((nom) this.a).V();
                return;
            case 15:
                ((nom) this.a).U();
                return;
            case 16:
                noq.a.a("transfer with type = %d has timed out", 0);
                nsf.e();
                noq noqVar = (noq) this.a;
                Iterator it3 = new HashSet(noqVar.b).iterator();
                while (it3.hasNext()) {
                    ((jys) it3.next()).z();
                }
                noqVar.a();
                return;
            case 17:
                noq noqVar2 = (noq) this.a;
                nop nopVar = new nop(noqVar2);
                nnm nnmVar = noqVar2.e;
                ocv.aF(nnmVar);
                nnmVar.c(nopVar, nmq.class);
                return;
            case 18:
                int i = nor.a;
                nsf.e();
                ((kwy) this.a).w(false);
                return;
            case 19:
                ((nqv) this.a).b(false);
                return;
            default:
                Object obj2 = this.a;
                synchronized (nsn.a) {
                    if (((nsn) obj2).c()) {
                        ((nsn) obj2).d(15);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ mpz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
