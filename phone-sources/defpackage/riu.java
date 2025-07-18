package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import com.google.common.collect.ImmutableList;
import j$.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class riu implements ttm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ riu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, xbw] */
    @Override // defpackage.ttm
    public final Object get() {
        switch (this.b) {
            case 0:
                snf snfVarE = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/safety_exp_account_menu_refresh", new sne[0]);
                snfVarE.d();
                return snfVarE;
            case 1:
                snf snfVarE2 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/visual_elements_usage", new sne("app_package", String.class), new sne("ve_enabled", Boolean.class), new sne("ve_provided", Boolean.class));
                snfVarE2.d();
                return snfVarE2;
            case 2:
                snf snfVarE3 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/safety_exp_default_entry_point", new sne[0]);
                snfVarE3.d();
                return snfVarE3;
            case 3:
                snf snfVarE4 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/safety_exp_color_resolve_crash", new sne("app_package", String.class), new sne("has_material", Boolean.class), new sne("is_material3", Boolean.class), new sne("is_light_theme", Boolean.class), new sne("failing_attribute_index", Integer.class), new sne("is_next_attribute_failing", Boolean.class));
                snfVarE4.d();
                return snfVarE4;
            case 4:
                snf snfVarE5 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/anchor_view_is_shown_on_screen_data", new sne("part_of_the_view_is_visible", Boolean.class), new sne("is_laid_out", Boolean.class), new sne("is_shown", Boolean.class));
                snfVarE5.d();
                return snfVarE5;
            case 5:
                snf snfVarE6 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/switch_profile", new sne("result", String.class), new sne("has_category_launcher", Boolean.class), new sne("has_category_info", Boolean.class), new sne("user_in_target_user_profiles", Boolean.class), new sne("api_version", Integer.class), new sne("app_package", String.class));
                snfVarE6.d();
                return snfVarE6;
            case 6:
                snf snfVarE7 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/load_owners_count", new sne("implementation", String.class), new sne("result", String.class), new sne("number_of_owners", Integer.class), new sne("app_package", String.class), new sne("load_cached", Boolean.class));
                snfVarE7.d();
                return snfVarE7;
            case 7:
                snf snfVarE8 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/load_owner_count", new sne("implementation", String.class), new sne("result", String.class), new sne("app_package", String.class));
                snfVarE8.d();
                return snfVarE8;
            case 8:
                snf snfVarE9 = ((snj) ((riv) this.a).a).e("/client_streamz/og_android/legacy/load_owners", new sne("app_package", String.class));
                snfVarE9.d();
                return snfVarE9;
            case 9:
                Object obj = this.a;
                rjr rjrVar = (rjr) obj;
                rzy rzyVar = new rzy(rjrVar.a, rjrVar.c);
                evk evkVar = new evk(obj, rzyVar, 16);
                if (rjrVar.e.h(rjrVar.a, 19621000) != 0) {
                    return evkVar.get();
                }
                rla rlaVar = new rla(rjrVar.b, evkVar, 1);
                if (rjrVar.g == null) {
                    ogx ogxVar = new ogx(rjrVar.a);
                    upc upcVar = new upc(rjrVar.a);
                    upcVar.c = ogxVar;
                    aafi aafiVar = new aafi(ImmutableList.of(new sjr(upcVar)));
                    smf smfVar = smf.a;
                    HashMap map = new HashMap();
                    ExecutorService executorService = rjrVar.b;
                    sik.b(slu.a, map);
                    unc uncVar = new unc(executorService, aafiVar, smfVar, map);
                    sjo sjoVar = new sjo();
                    sjoVar.c(rjrVar.a);
                    sjoVar.e(rjrVar.b);
                    sjoVar.a = aafiVar;
                    sjoVar.b = uncVar;
                    sjoVar.d();
                    Handler handler = rjrVar.d;
                    if (handler != null) {
                        sjoVar.e = handler;
                    }
                    rjrVar.g = sjoVar.f();
                }
                return new rkl(new rla(new rkc(rjrVar.a, rjrVar.g, new rjl(rjrVar.a, rjrVar.b), tst.i(rzyVar), rrx.S()), 1, rzyVar, rjrVar.a.getPackageName(), 0), rlaVar);
            case 10:
                return ((Context) this.a).getSharedPreferences("primes", 0);
            case 11:
                return (uht) this.a.b();
            case 12:
                return this.a.b();
            case 13:
                return Long.valueOf(Double.valueOf((String) ((roj) this.a).a.get()).longValue());
            case 14:
                return (Boolean) this.a.b();
            case 15:
                return this.a;
            case 16:
                if (Build.VERSION.SDK_INT < 30) {
                    return trk.a;
                }
                Context context = (Context) this.a;
                try {
                    return tst.h(context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName());
                } catch (PackageManager.NameNotFoundException unused) {
                    return trk.a;
                }
            case 17:
                return ImmutableList.sortedCopyOf(Comparator.CC.comparing(new nrc(10), Comparator.CC.reverseOrder()), (Iterable) this.a.b());
            case 18:
                return Long.valueOf(((rqg) this.a).l.d().getTotalSpace() / 1024);
            case 19:
                return ((rqo) this.a).b();
            default:
                Object obj2 = this.a;
                int i = rrz.a;
                long jCeil = rrx.l;
                if (jCeil == 0) {
                    synchronized (rrx.class) {
                        jCeil = rrx.l;
                        if (jCeil == 0) {
                            float f = 60.0f;
                            float fFloatValue = ((Float) rrx.l((Context) obj2).e(Float.valueOf(60.0f))).floatValue();
                            if (fFloatValue >= 1.0f) {
                                f = fFloatValue;
                            }
                            jCeil = (long) Math.ceil(1.0E9d / f);
                            rrx.l = jCeil;
                        }
                    }
                }
                return Long.valueOf(jCeil);
        }
    }
}
