package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.googletv.app.presentation.views.contentrating.ContentRatingView;
import com.google.android.apps.googletv.app.presentation.views.rottentomatoesrating.RottenTomatoesRatingView;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jwq {
    public jwq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A(defpackage.wqo r17, long r18, defpackage.sj r20, defpackage.irc r21, defpackage.bkp r22, defpackage.bao r23, int r24) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwq.A(wqo, long, sj, irc, bkp, bao, int):void");
    }

    public static void B(wqo wqoVar, irc ircVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-238954302);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(ircVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            int i4 = wqoVar.c;
            if (i4 == 5) {
                int i5 = ((i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384;
                baoVarD.x(-2001810578);
                jxf jxfVar = jxf.a;
                String str = (wqoVar.c == 5 ? (wtm) wqoVar.d : wtm.a).b;
                str.getClass();
                jxfVar.d(str, bkpVar, baoVarD, i5);
                ((bas) baoVarD).aa();
            } else if (i4 == 6) {
                int i6 = ((i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384;
                baoVarD.x(-2001804677);
                jxf jxfVar2 = jxf.a;
                String str2 = (wqoVar.c == 6 ? (wrw) wqoVar.d : wrw.a).b;
                str2.getClass();
                jxfVar2.d(str2, bkpVar, baoVarD, i6);
                ((bas) baoVarD).aa();
            } else if (i4 == 7) {
                int i7 = ((i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384;
                baoVarD.x(-2001798736);
                jxf jxfVar3 = jxf.a;
                String str3 = (wqoVar.c == 7 ? (wtw) wqoVar.d : wtw.a).b;
                str3.getClass();
                jxfVar3.d(str3, bkpVar, baoVarD, i7);
                ((bas) baoVarD).aa();
            } else if (i4 == 8) {
                int i8 = (i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                baoVarD.x(-2001794204);
                wtu wtuVar = wqoVar.c == 8 ? (wtu) wqoVar.d : wtu.a;
                wtuVar.getClass();
                m(wtuVar, bkpVar, baoVarD, i8);
                ((bas) baoVarD).aa();
            } else if (i4 == 11) {
                int i9 = (i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                baoVarD.x(-2001790770);
                wqz wqzVar = wqoVar.c == 11 ? (wqz) wqoVar.d : wqz.a;
                wqzVar.getClass();
                p(wqzVar, bkpVar, baoVarD, i9);
                ((bas) baoVarD).aa();
            } else if (i4 == 12) {
                baoVarD.x(-2001787129);
                wug wugVar = wqoVar.c == 12 ? (wug) wqoVar.d : wug.a;
                wugVar.getClass();
                jxl.l(wugVar, ircVar, bkpVar, baoVarD, i2 & 1008);
                ((bas) baoVarD).aa();
            } else if (i4 == 9) {
                int i10 = (i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                baoVarD.x(-2001781886);
                wrb wrbVar = wqoVar.c == 9 ? (wrb) wqoVar.d : wrb.a;
                wrbVar.getClass();
                n(wrbVar, bkpVar, baoVarD, i10);
                ((bas) baoVarD).aa();
            } else if (i4 == 10) {
                int i11 = (i2 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                baoVarD.x(-2001778450);
                wqk wqkVar = wqoVar.c == 10 ? (wqk) wqoVar.d : wqk.a;
                wqkVar.getClass();
                w(wqkVar, bkpVar, baoVarD, i11);
                ((bas) baoVarD).aa();
            } else {
                baoVarD.x(-1925503810);
                ((bas) baoVarD).aa();
            }
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv((vuc) wqoVar, ircVar, bkpVar, i, 18);
        }
    }

    public static int C(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        theme.resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        try {
            return context.getResources().getColor(i2, theme);
        } catch (Resources.NotFoundException unused) {
            krd.c(a.cf(i2, "Failed to find color resource for #"));
            return -1;
        }
    }

    public static String D(Resources resources, List list) {
        return E(resources, com.google.android.videos.R.string.space_item_joiner, list);
    }

    public static String E(Resources resources, int i, List list) {
        String string = null;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                if (!TextUtils.isEmpty(str)) {
                    string = string == null ? str : resources.getString(i, string, str);
                }
            }
        }
        return string;
    }

    public static String F(Resources resources, boolean z, List list) {
        return E(resources, true != z ? com.google.android.videos.R.string.item_joiner : com.google.android.videos.R.string.heterogeneous_item_joiner, list);
    }

    public static String G(Resources resources, boolean z, String... strArr) {
        if (strArr.length == 0) {
            return null;
        }
        return F(resources, z, Arrays.asList(strArr));
    }

    public static String H(Context context, int i) {
        int i2 = i / 1000;
        return context.getString(com.google.android.videos.R.string.accessibility_time, Integer.valueOf(i2 / 3600), Integer.valueOf((i2 / 60) % 60), Integer.valueOf(i2 % 60));
    }

    public static String I(long j, Resources resources) {
        return J(j, resources, false);
    }

    public static String J(long j, Resources resources, boolean z) {
        if (j == Long.MAX_VALUE) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = j - jCurrentTimeMillis;
        long j3 = j2 / 86400000;
        if ((j3 < 0 ? -1 : j3 > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) j3) > 60) {
            return null;
        }
        if (jCurrentTimeMillis >= j) {
            return resources.getString(com.google.android.videos.R.string.expired);
        }
        int i = (int) ((j2 / 1000) / 60);
        int i2 = i / 60;
        int i3 = i2 + ((i2 <= 0 || i % 60 <= 0) ? 0 : 1);
        int i4 = i3 / 24;
        int i5 = i4 + ((i4 <= 0 || i3 % 24 <= 0) ? 0 : 1);
        return i5 > 2 ? z ? resources.getString(com.google.android.videos.R.string.short_days_remaining, Integer.valueOf(i5)) : hjs.e(resources.getString(com.google.android.videos.R.string.days_remaining), "days", Integer.valueOf(i5)) : i3 > 0 ? z ? resources.getString(com.google.android.videos.R.string.short_hours_remaining, Integer.valueOf(i3)) : hjs.e(resources.getString(com.google.android.videos.R.string.hours_remaining), "hours", Integer.valueOf(i3)) : i > 10 ? z ? resources.getString(com.google.android.videos.R.string.short_less_then_one_hour_remaining) : resources.getString(com.google.android.videos.R.string.less_then_one_hour_remaining) : z ? resources.getString(com.google.android.videos.R.string.short_about_to_expire) : resources.getString(com.google.android.videos.R.string.about_to_expire);
    }

    public static wni K(ksy ksyVar) {
        int i = ksyVar.a;
        int i2 = 3;
        if (i != 6) {
            if (i == 18) {
                i2 = 4;
            } else if (i == 20) {
                i2 = 6;
            } else if (i == 19) {
                i2 = 5;
            } else if (i != 5000) {
                i2 = 2;
            }
        }
        vtw vtwVarM = wni.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((wni) vtwVarM.b).c = a.aJ(i2);
        String str = ksyVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((wni) vtwVarM.b).b = str;
        return (wni) vtwVarM.r();
    }

    public static /* synthetic */ String L(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "NOT_METERED" : "TEMPORARILY_NOT_METERED" : "METERED" : "UNKNOWN";
    }

    public static boolean M(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).isInLockTaskMode();
    }

    public static boolean N(Activity activity) {
        if (!M(activity)) {
            return false;
        }
        if (ksk.b >= 23) {
            activity.showLockTaskEscapeMessage();
            return true;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        activity.startActivity(intent);
        return true;
    }

    public static ieg O(ieg iegVar, idf idfVar, Context context) {
        if (iegVar.m()) {
            if (kuf.b((kuf) iegVar.g())) {
                return ieg.f(context.getString(com.google.android.videos.R.string.google_play_distributor_name));
            }
            ieg iegVar2 = (ieg) idfVar.b(ksy.g((kuf) iegVar.g()));
            if (iegVar2.m()) {
                return ieg.f(((kue) iegVar2.g()).b);
            }
        }
        return ieg.a;
    }

    public static boolean P(String str) {
        return str != null && str.length() == 27;
    }

    public static Configuration Q(Context context) {
        return context.getApplicationContext().getResources().getConfiguration();
    }

    public static void R(Activity activity) {
        activity.setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, activity.getColor(com.google.android.videos.R.color.play_movies_card_background)));
    }

    public static boolean S(Context context) {
        return Q(context).smallestScreenWidthDp >= 540;
    }

    public static void T(Context context, int i, int i2) {
        Toast.makeText(context.getApplicationContext(), i, i2).show();
    }

    public static void U(Context context, CharSequence charSequence, int i) {
        Toast.makeText(context.getApplicationContext(), charSequence, i).show();
    }

    public static void V(PrintWriter printWriter) {
        printWriter.println();
        printWriter.printf("PLAY MOVIES DEVICE INFO: make='%s', model='%s', device='%s', product='%s'\n", Build.MANUFACTURER, Build.MODEL, Build.DEVICE, Build.PRODUCT);
        printWriter.println("PLAY MOVIES LOG:\n");
        try {
            kre kreVar = krd.c;
            if (kreVar != null) {
                kreVar.b(printWriter);
            }
        } catch (IOException e) {
            printWriter.println("Could not dump logs:");
            printWriter.println(e);
        }
    }

    public static void W(View view) {
        ksk.h(new ljl(view, 15, null), 1000L);
    }

    public static boolean X(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }

    public static ksy Y(loq loqVar) {
        loqVar.getClass();
        Integer num = loqVar.b;
        num.getClass();
        int iIntValue = num.intValue();
        String str = loqVar.a;
        str.getClass();
        return ksy.c(iIntValue, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(final defpackage.wqo r18, final defpackage.bkp r19, final boolean r20, long r21, defpackage.bao r23, final int r24) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwq.a(wqo, bkp, boolean, long, bao, int):void");
    }

    @Deprecated
    public static lzy ad(ksn ksnVar, String[] strArr, String str) {
        return new lzy("purchased_assets", strArr, null, "account = ? AND asset_id = ? AND asset_type IN (6,20)", new String[]{ksnVar.a, str}, null, "purchase_status <> 2", -1);
    }

    public static void af(sca scaVar, wla wlaVar) {
        ContentRatingView contentRatingView = (ContentRatingView) scaVar.p(com.google.android.videos.R.id.content_rating);
        contentRatingView.setVisibility((wlaVar == null || yks.e(wlaVar, wla.a)) ? 8 : 0);
        if (wlaVar == null) {
            return;
        }
        int i = wlaVar.b;
        if (i == 2) {
            String str = (String) wlaVar.c;
            str.getClass();
            contentRatingView.b.setText(str);
            contentRatingView.a.setVisibility(8);
            contentRatingView.requestLayout();
            return;
        }
        if (i == 1) {
            wlx wlxVar = (wlx) wlaVar.c;
            wlxVar.getClass();
            ImageView imageView = contentRatingView.a;
            hjr.c(imageView.getContext()).b().f(wlxVar).k(imageView);
            imageView.setContentDescription(wlxVar.d);
            contentRatingView.b.setVisibility(8);
            contentRatingView.requestLayout();
        }
    }

    public static kky ag(wor worVar, String str, String str2) {
        seu seuVarA = kky.a();
        seuVarA.u(worVar.b);
        seuVarA.q(str);
        seuVarA.w(worVar.c);
        seuVarA.x(str2);
        seuVarA.p(worVar.d);
        wov wovVar = worVar.e;
        if (wovVar == null) {
            wovVar = wov.a;
        }
        vun<wor> vunVar = wovVar.c;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
        for (wor worVar2 : vunVar) {
            worVar2.getClass();
            String str3 = worVar.b;
            str3.getClass();
            arrayList.add(ag(worVar2, str, str3));
        }
        seuVarA.o(arrayList);
        return seuVarA.n();
    }

    public static sev ah(wor worVar, String str, String str2) {
        seu seuVarA = sev.a();
        seuVarA.h(worVar.b);
        seuVarA.d(str);
        seuVarA.j(worVar.c);
        seuVarA.k(str2);
        seuVarA.c(worVar.d);
        wov wovVar = worVar.e;
        if (wovVar == null) {
            wovVar = wov.a;
        }
        vun<wor> vunVar = wovVar.c;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
        for (wor worVar2 : vunVar) {
            worVar2.getClass();
            String str3 = worVar.b;
            str3.getClass();
            arrayList.add(ah(worVar2, str, str3));
        }
        seuVarA.b(arrayList);
        return seuVarA.a();
    }

    public static void ai(bao baoVar, int i) {
        bao baoVarD = baoVar.d(-815351006);
        int i2 = 0;
        if (i != 0) {
            asg.a(ccf.y(com.google.android.videos.R.drawable.gs_check_vd_theme_24, baoVarD, 0), null, null, 0L, baoVarD, 48, 12);
        } else if (baoVarD.K()) {
            baoVarD.t();
            i = 0;
        } else {
            i = 0;
            asg.a(ccf.y(com.google.android.videos.R.drawable.gs_check_vd_theme_24, baoVarD, 0), null, null, 0L, baoVarD, 48, 12);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jtq(i, i2);
        }
    }

    public static void aj(final boolean z, bao baoVar, final int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1675470505);
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else if (z) {
            baoVarD.x(-2126785208);
            asg.a(ccf.y(com.google.android.videos.R.drawable.gs_arrow_drop_up_vd_theme_24, baoVarD, 0), null, null, 0L, baoVarD, 48, 12);
            ((bas) baoVarD).aa();
        } else {
            baoVarD.x(-2126680986);
            asg.a(ccf.y(com.google.android.videos.R.drawable.gs_arrow_drop_down_vd_theme_24, baoVarD, 0), null, null, 0L, baoVarD, 48, 12);
            ((bas) baoVarD).aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: jtp
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    jwq.aj(z, (bao) obj, bdi.n(i4 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static void ak(jtr jtrVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1137690767);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.H(jtrVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkm bkmVar = bkp.g;
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkmVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(1849434622);
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(false, bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar.aa();
            baoVarD.x(5004770);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new izc(bcbVar, 16);
                basVar.ae(objT2);
            }
            yjk yjkVar2 = (yjk) objT2;
            basVar.aa();
            aeh aehVar = wv.M(baoVarD).b;
            wfo wfoVar = jtrVar.a;
            yy yyVar = arc.a;
            og.M(yjkVar2, null, false, aehVar, arc.b(bny.i(wfoVar.q()), bny.i(wfoVar.e()), 0L, 0L, baoVarD, 12), null, null, null, null, bga.k(-1424923431, new azi(jtrVar, bcbVar, 2, null), baoVarD), baoVarD, 805306374, 486);
            boolean zBooleanValue = ((Boolean) bcbVar.a()).booleanValue();
            baoVarD.x(5004770);
            Object objT3 = basVar.T();
            if (objT3 == obj) {
                objT3 = new izc(bcbVar, 17);
                basVar.ae(objT3);
            }
            basVar.aa();
            aqs.b(zBooleanValue, (yjk) objT3, null, 0L, null, null, null, bny.i(wfoVar.o()), 0.0f, bga.k(-1034332732, new azi(jtrVar, bcbVar, 3, null), baoVarD), baoVarD, 48, 48, 1916);
            baoVarD = baoVarD;
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(jtrVar, i, 12);
        }
    }

    private static Configuration al(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        return configuration;
    }

    private final synchronized iea am(iea ieaVar, lyz lyzVar, ExecutorService executorService, mct mctVar) {
        iea ieaVarA;
        krz krzVar = new krz(kxi.a);
        krzVar.a = new ids[]{ieaVar, lyzVar.c(1)};
        krzVar.b = executorService;
        krzVar.d(new ldj(ieaVar, mctVar, 13, null));
        ieaVarA = krzVar.a();
        ieaVarA.ea(new krt());
        return ieaVarA;
    }

    private final synchronized iea an(iea ieaVar, kuw kuwVar) {
        iea ieaVarA;
        krq krqVar = new krq(new dvv());
        krz krzVar = new krz(null);
        krzVar.a = new ids[]{ieaVar};
        krzVar.d(new lxg((Object) ieaVar, (iea) krqVar, (Object) kuwVar, 4));
        iea ieaVarA2 = krzVar.a();
        ieaVarA2.ea(new krt());
        krz krzVar2 = new krz(kxi.a);
        krzVar2.a = new ids[]{(ids) ieaVarA2.a()};
        krzVar2.d(new kqd(ieaVarA2, 10));
        ieaVarA = krzVar2.a();
        ieaVarA.ea(new krt());
        return ieaVarA;
    }

    public static void b(wqq wqqVar, boolean z, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        wqqVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-888053436);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            jyv.v(wqqVar, z, yjkVar, bkpVar, baoVarD, i2 & 8190);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(wqqVar, z, yjkVar, bkpVar, i, 0);
        }
    }

    public static Integer c(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static void d(wvg wvgVar, yjk yjkVar, boolean z, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjkVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-17990012);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wvgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            kov kovVar = kov.a;
            baoVarD.x(5004770);
            int i4 = i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i4 == 32 || objT == ban.a) {
                objT = new izc(yjkVar, 19);
                basVar.ae(objT);
            }
            yjk yjkVar2 = (yjk) objT;
            basVar.aa();
            String str = z ? wvgVar.e : wvgVar.d;
            str.getClass();
            kovVar.a(yjkVar2, str, bkpVar, z ? com.google.android.videos.R.drawable.gs_bookmark_fill1_vd_theme_24 : com.google.android.videos.R.drawable.gs_bookmark_vd_theme_24, baoVarD, (i2 >> 3) & 896);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(wvgVar, yjkVar, z, bkpVar, i, 1);
        }
    }

    public static boolean e(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean f(Context context) {
        return al(context).orientation == 1;
    }

    public static boolean g(Context context) {
        context.getClass();
        return al(context).smallestScreenWidthDp >= 540;
    }

    public static void h(sca scaVar, String str, int i) {
        scaVar.p(i).setTag(str);
    }

    public static void i(sca scaVar, woc wocVar, int i) {
        int i2;
        int i3;
        RottenTomatoesRatingView rottenTomatoesRatingView = (RottenTomatoesRatingView) scaVar.p(i);
        rottenTomatoesRatingView.b("");
        Context context = rottenTomatoesRatingView.getContext();
        int i4 = 8;
        if (wocVar != null) {
            int iAQ = a.aQ(wocVar.c);
            if (iAQ == 0) {
                iAQ = 1;
            }
            int i5 = iAQ - 2;
            if (i5 == 1) {
                i2 = com.google.android.videos.R.string.accessibility_rotten_tomatoes_fresh;
                i3 = com.google.android.videos.R.drawable.ic_fresh;
            } else if (i5 != 3) {
                i2 = com.google.android.videos.R.string.accessibility_rotten_tomatoes_rotten;
                i3 = com.google.android.videos.R.drawable.ic_rotten;
            } else {
                i2 = com.google.android.videos.R.string.accessibility_rotten_tomatoes_certified_fresh;
                i3 = com.google.android.videos.R.drawable.ic_certified_fresh;
            }
            String string = context.getString(com.google.android.videos.R.string.rotten_tomatoes_rating_with_percent, Integer.valueOf((int) wocVar.b));
            string.getClass();
            Object objA = rottenTomatoesRatingView.a.a();
            objA.getClass();
            ((ImageView) objA).setImageResource(i3);
            rottenTomatoesRatingView.requestLayout();
            rottenTomatoesRatingView.b(string);
            String str = wocVar.d;
            str.getClass();
            TextView textView = (TextView) rottenTomatoesRatingView.b.a();
            if (textView != null) {
                textView.setText(new SpannableString(ksk.b(rottenTomatoesRatingView.getContext().getString(com.google.android.videos.R.string.read_more_link, Uri.parse(str)))));
                textView.setVisibility(str.length() == 0 ? 8 : 0);
            }
            rottenTomatoesRatingView.requestLayout();
            rottenTomatoesRatingView.setContentDescription(context.getString(com.google.android.videos.R.string.accessibility_rotten_tomatoes_rating_status, Integer.valueOf((int) wocVar.b), context.getString(i2)));
        }
        CharSequence text = rottenTomatoesRatingView.a().getText();
        if (text != null && text.length() != 0 && !yks.e(wocVar, woc.a)) {
            i4 = 0;
        }
        rottenTomatoesRatingView.setVisibility(i4);
    }

    public static void j(sca scaVar, wls wlsVar, int i, int i2) {
        CharSequence charSequenceFromHtml;
        TextView textView = (TextView) scaVar.p(i);
        textView.setText("");
        if (wlsVar != null) {
            if (wlsVar.c) {
                charSequenceFromHtml = Html.fromHtml(wlsVar.b, 0);
                charSequenceFromHtml.getClass();
            } else {
                charSequenceFromHtml = wlsVar.b;
                charSequenceFromHtml.getClass();
            }
            textView.setText(charSequenceFromHtml);
            if (wlsVar.d) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            String str = wlsVar.e;
            if (str != null && str.length() != 0) {
                textView.setContentDescription(wlsVar.e);
            }
        }
        if (i2 != -1) {
            CharSequence text = textView.getText();
            if (text != null && text.length() != 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
    }

    public static void k(wqn wqnVar, irc ircVar, bcb bcbVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        bkp bkpVar2;
        ircVar.getClass();
        bcbVar.getClass();
        yjkVar.getClass();
        int i2 = i & 6;
        bao baoVarD = baoVar.d(-2031334908);
        int i3 = i2 == 0 ? (true != baoVarD.F(wqnVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(ircVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(bcbVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.H(yjkVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            bkpVar2 = bkpVar;
            i3 |= true != baoVarD.F(bkpVar2) ? 8192 : 16384;
        } else {
            bkpVar2 = bkpVar;
        }
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarX = bdi.x(zi.a(bkpVar2, 1.0f), 1.0f);
            bvt bvtVarA = zf.a(xk.e(12.0f), bkb.n, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarX);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(-1402021104);
            for (wkx wkxVar : wqnVar.b) {
                wkw wkwVarB = wkw.b(wkxVar.d);
                if (wkwVarB == null) {
                    wkwVarB = wkw.TYPE_UNSPECIFIED;
                }
                int iOrdinal = wkwVarB.ordinal();
                if (iOrdinal == 20) {
                    baoVarD.x(-512878993);
                    kdj kdjVar = (kdj) baoVarD.f(jab.a);
                    wmc wmcVar = wkxVar.e;
                    if (wmcVar == null) {
                        wmcVar = wmc.a;
                    }
                    Integer numC = c(wmcVar.c);
                    kdjVar.d(numC != null ? numC.intValue() : 139332, bga.k(-362764745, new jwy(wkxVar, bcbVar, yjkVar, 1), baoVarD), baoVarD, 48);
                    basVar.aa();
                } else if (iOrdinal != 70) {
                    baoVarD.x(-511720864);
                    basVar.aa();
                } else {
                    baoVarD.x(-512219251);
                    kdj kdjVar2 = (kdj) baoVarD.f(jab.a);
                    wmc wmcVar2 = wkxVar.e;
                    if (wmcVar2 == null) {
                        wmcVar2 = wmc.a;
                    }
                    Integer numC2 = c(wmcVar2.c);
                    kdjVar2.d(numC2 != null ? numC2.intValue() : 141948, bga.k(951377774, new azi(wkxVar, ircVar, 4, null), baoVarD), baoVarD, 48);
                    basVar.aa();
                }
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(wqnVar, ircVar, bcbVar, yjkVar, bkpVar2, i, 4);
        }
    }

    public static void l(wqr wqrVar, irc ircVar, bkp bkpVar, yjk yjkVar, bao baoVar, int i) {
        int i2;
        Object obj;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(74991258);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(ircVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            obj = yjkVar;
            i2 |= true != baoVarD.H(obj) ? 1024 : 2048;
        } else {
            obj = yjkVar;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            kov kovVar = kov.a;
            baoVarD.x(-1224400529);
            boolean zH = ((i4 & 14) == 4) | baoVarD.H(ircVar) | baoVarD.H(context);
            boolean z = (i4 & 7168) == 2048;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if ((zH | z) || objT == ban.a) {
                nz nzVar = new nz(ircVar, wqrVar, context, obj, 11, null);
                basVar.ae(nzVar);
                objT = nzVar;
            }
            basVar.aa();
            String str = wqrVar.b;
            str.getClass();
            kovVar.a((yjk) objT, str, bkpVar, com.google.android.videos.R.drawable.gs_share_vd_theme_24, baoVarD, i4 & 896);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(wqrVar, ircVar, bkpVar, yjkVar, i, 5);
        }
    }

    public static void m(wtu wtuVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1064344198);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wtuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.x(-241919480);
            kpc kpcVar = new kpc(wtuVar.c, wtuVar.d, wv.K(baoVarD).q);
            ((bas) baoVarD).aa();
            jyv.t(kpcVar, bkpVar, baoVarD, i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(wtuVar, bkpVar, i, 16, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(wrb wrbVar, bkp bkpVar, bao baoVar, int i) {
        int i2 = i & 6;
        bao baoVarD = baoVar.d(-446468259);
        int i3 = i2 == 0 ? (true != baoVarD.F(wrbVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = xu.a(xk.e(24.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(1650445351);
            int size = wrbVar.b.size();
            for (int i4 = 0; i4 < size; i4++) {
                E e = wrbVar.b.get(i4);
                e.getClass();
                o((wra) e, null, baoVarD, 0);
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(wrbVar, bkpVar, i, 14, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(defpackage.wra r27, defpackage.bkp r28, defpackage.bao r29, int r30) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwq.o(wra, bkp, bao, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(wqz wqzVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1226272950);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.F(wqzVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = xu.a(xk.e(24.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(2001571903);
            int size = wqzVar.b.size();
            boolean z = false;
            int i4 = 0;
            while (i4 < size) {
                wqy wqyVar = (wqy) wqzVar.b.get(i4);
                baoVarD.x(1849434622);
                Object objT = basVar.T();
                Object obj = ban.a;
                if (objT == obj) {
                    bci bciVar = new bci(Boolean.valueOf(z), bcz.c);
                    basVar.ae(bciVar);
                    objT = bciVar;
                }
                bcb bcbVar = (bcb) objT;
                basVar.aa();
                wqyVar.getClass();
                baoVarD.x(1410075509);
                String str = wqyVar.d;
                str.getClass();
                String str2 = wqyVar.b;
                str2.getClass();
                String str3 = wqyVar.c;
                str3.getClass();
                kox koxVar = new kox(str, str2, str3, wv.K(baoVarD).q);
                basVar.aa();
                baoVarD.x(5004770);
                Object objT2 = basVar.T();
                if (objT2 == obj) {
                    objT2 = new jwz(bcbVar, 9);
                    basVar.ae(objT2);
                }
                basVar.aa();
                jys.i(koxVar, (yjk) objT2, null, baoVarD, 48);
                baoVarD.x(2001583460);
                if (((Boolean) bcbVar.a()).booleanValue()) {
                    baoVarD.x(1912960441);
                    String str4 = wqyVar.d;
                    str4.getClass();
                    String str5 = wqyVar.b;
                    str5.getClass();
                    String str6 = wqyVar.c;
                    str6.getClass();
                    kow kowVar = new kow(str4, str5, str6);
                    basVar.aa();
                    baoVarD.x(5004770);
                    Object objT3 = basVar.T();
                    if (objT3 == obj) {
                        objT3 = new jwz(bcbVar, 10);
                        basVar.ae(objT3);
                    }
                    basVar.aa();
                    jyv.y(kowVar, (yjk) objT3, ccf.d(bkp.g, "audience_review_bottom_sheet"), 0L, baoVarD, 432);
                }
                basVar.aa();
                i4++;
                z = false;
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(wqzVar, bkpVar, i, 13, null);
        }
    }

    public static List q(wqo wqoVar) {
        vun vunVar = wqoVar.g;
        vunVar.getClass();
        ArrayList<wlx> arrayList = new ArrayList();
        for (Object obj : vunVar) {
            wlx wlxVar = (wlx) obj;
            int i = wlxVar.b;
            int iP = wbb.p(i);
            if (iP == 0) {
                throw null;
            }
            if (iP - 1 == 2) {
                if ((i == 3 ? (wlw) wlxVar.c : wlw.a).b.size() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (wlx wlxVar2 : arrayList) {
            arrayList2.add(wlxVar2.b == 3 ? (wlw) wlxVar2.c : wlw.a);
        }
        return arrayList2;
    }

    public static void r(bkp bkpVar, String str, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(459669099);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            jxf.a.a(str, bkpVar, baoVarD, ((i2 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i2 >> 3) & 14) | 384);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(bkpVar, str, i, 8);
        }
    }

    public static void s(wqo wqoVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1650965100);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = zf.a(xk.f, bkb.m, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            bkm bkmVar = bkp.g;
            u(wqoVar, zh.a(bkmVar, 1.0f, true), baoVarD, i2 & 14);
            baoVarD.x(655072735);
            if (wqoVar.c == 11) {
                String str = ((wqz) wqoVar.d).c;
                str.getClass();
                if (str.length() > 0) {
                    String str2 = (wqoVar.c == 11 ? (wqz) wqoVar.d : wqz.a).c;
                    str2.getClass();
                    t(str2, zh.a(bkmVar, 1.0f, true), baoVarD, 0);
                }
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(wqoVar, bkpVar, i, 11, null);
        }
    }

    public static void t(String str, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(346290882);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            jxf jxfVar = jxf.a;
            bvt bvtVarA = zf.a(xk.f(6.0f, bkb.l), bkb.m, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            jxf jxfVar2 = jxf.a;
            bkm bkmVar = bkp.g;
            baoVarD.x(5004770);
            boolean zH = baoVarD.H(context);
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new ill(context, 19);
                basVar.ae(objT);
            }
            basVar.aa();
            jxfVar2.b(com.google.android.videos.R.drawable.gs_star_fill1_vd_theme_24, cfd.b(bkmVar, false, (yjv) objT), baoVarD, 384, 0);
            jxfVar2.c(str, null, baoVarD, (i4 & 14) | 384, 2);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(str, bkpVar, i, 12, null);
        }
    }

    public static void u(wqo wqoVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(2086090891);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            int i5 = wqoVar.c;
            int i6 = com.google.android.videos.R.drawable.gs_movie_vd_theme_24;
            if (i5 != 5) {
                if (i5 == 6) {
                    i6 = com.google.android.videos.R.drawable.gs_language_spark_vd_theme_24;
                } else if (i5 == 7) {
                    i6 = com.google.android.videos.R.drawable.gs_insights_auto_vd_theme_24;
                } else if (i5 == 8) {
                    i6 = com.google.android.videos.R.drawable.gs_google_vd_theme_24;
                } else if (i5 == 9) {
                    i6 = com.google.android.videos.R.drawable.gs_trophy_vd_theme_24;
                } else if (i5 == 10) {
                    i6 = com.google.android.videos.R.drawable.gs_info_spark_vd_theme_24;
                } else if (i5 == 11) {
                    i6 = com.google.android.videos.R.drawable.gs_campaign_vd_theme_24;
                } else if (i5 == 12) {
                    i6 = com.google.android.videos.R.drawable.gs_reviews_vd_theme_24;
                }
            }
            jxf jxfVar = jxf.a;
            bvt bvtVarA = zf.a(xk.e(6.0f), bkb.m, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            jxf jxfVar2 = jxf.a;
            jxfVar2.b(i6, null, baoVarD, 384, 2);
            String str = wqoVar.e;
            str.getClass();
            jxfVar2.c(str, null, baoVarD, 384, 2);
            baoVarD.x(1534356119);
            if ((wqoVar.b & 4) != 0) {
                bkm bkmVar = bkp.g;
                baoVarD.x(1849434622);
                Object objT = basVar.T();
                if (objT == ban.a) {
                    objT = new jxd(i4);
                    basVar.ae(objT);
                }
                basVar.aa();
                jxfVar2.c("•", cfd.b(bkmVar, false, (yjv) objT), baoVarD, 390, 0);
                String str2 = wqoVar.f;
                str2.getClass();
                jxfVar2.c(str2, null, baoVarD, 384, 2);
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(wqoVar, bkpVar, i, 9, null);
        }
    }

    public static void v(String str, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1189256803);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            kir.h(str, wv.N(baoVarD).a, wv.N(baoVarD).b, bkpVar, wv.K(baoVarD).s, 0, 0.0f, baoVarD, (i2 & 14) | 3072 | ((i2 << 9) & 57344));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(str, bkpVar, i, 10, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w(wqk wqkVar, bkp bkpVar, bao baoVar, int i) {
        int i2 = i & 6;
        bao baoVarD = baoVar.d(56811324);
        int i3 = i2 == 0 ? (true != baoVarD.F(wqkVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = xu.a(xk.e(24.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(402521961);
            int size = wqkVar.b.size();
            for (int i4 = 0; i4 < size; i4++) {
                E e = wqkVar.b.get(i4);
                e.getClass();
                x((wqj) e, null, baoVarD, 0);
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(wqkVar, bkpVar, i, 6, null);
        }
    }

    public static void x(wqj wqjVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(2038655070);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.F(wqjVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new jxd(0);
                basVar.ae(objT);
            }
            basVar.aa();
            bkp bkpVarB = cfd.b(bkmVar, true, (yjv) objT);
            bvt bvtVarA = xu.a(xk.e(4.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarB);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            String str = wqjVar.b;
            str.getClass();
            baoVar2 = baoVarD;
            axa.b(str, null, wv.K(baoVarD).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).m, baoVar2, 0, 0, 131066);
            String str2 = wqjVar.c;
            str2.getClass();
            axa.b(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar2).j, baoVar2, 0, 0, 131070);
            baoVar2.o();
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(wqjVar, bkpVar2, i, 7, null);
        }
    }

    public static void z(jxa jxaVar, final yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3;
        bhi bhiVar;
        yy yyVar;
        bas basVar;
        bao baoVar2;
        jxaVar.getClass();
        yjkVar.getClass();
        int i4 = i & 6;
        bao baoVarD = baoVar.d(-1261535408);
        boolean z = true;
        if (i4 == 0) {
            i2 = (true != baoVarD.H(jxaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            final int size = jxaVar.h().size();
            baoVarD.x(1849434622);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new bcf(0);
                basVar2.ae(objT);
            }
            final bdn bdnVar = (bdn) objT;
            basVar2.aa();
            baoVarD.x(-1154739012);
            ArrayList arrayList = new ArrayList(size);
            int i5 = 0;
            while (i5 < size) {
                arrayList.add(hw.i(baoVarD));
                i5++;
                z = z;
            }
            basVar2.aa();
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(1849434622);
            Object objT2 = basVar2.T();
            if (objT2 == obj) {
                objT2 = new bhi((char[]) null);
                basVar2.ae(objT2);
            }
            bhi bhiVar2 = (bhi) objT2;
            basVar2.aa();
            Object objT3 = basVar2.T();
            if (objT3 == obj) {
                objT3 = bbn.a(yim.a, baoVarD);
                basVar2.ae(objT3);
            }
            yow yowVar = (yow) objT3;
            baoVarD.x(1849434622);
            Object objT4 = basVar2.T();
            if (objT4 == obj) {
                Object systemService = context.getSystemService("accessibility");
                systemService.getClass();
                objT4 = (AccessibilityManager) systemService;
                basVar2.ae(objT4);
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) objT4;
            basVar2.aa();
            jwq jwqVar = new jwq();
            accessibilityManager.getClass();
            baoVarD.x(185711688);
            baoVarD.x(1849434622);
            Object objT5 = basVar2.T();
            if (objT5 == obj) {
                objT5 = new jxc(accessibilityManager);
                basVar2.ae(objT5);
            }
            jxc jxcVar = (jxc) objT5;
            basVar2.aa();
            dve lifecycle = ((dvk) baoVarD.f(dxf.a)).getLifecycle();
            baoVarD.x(5004770);
            Object objT6 = basVar2.T();
            if (objT6 == obj) {
                i3 = i2;
                objT6 = new ill(jxcVar, 18);
                basVar2.ae(objT6);
            } else {
                i3 = i2;
            }
            yjv yjvVar = (yjv) objT6;
            basVar2.aa();
            baoVarD.x(5004770);
            Object objT7 = basVar2.T();
            if (objT7 == obj) {
                bhiVar = bhiVar2;
                objT7 = new jwz(jxcVar, 8);
                basVar2.ae(objT7);
            } else {
                bhiVar = bhiVar2;
            }
            basVar2.aa();
            jwqVar.y(lifecycle, yjvVar, (yjk) objT7, baoVarD, 432);
            basVar2.aa();
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar2.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar2.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            xs xsVar = xs.a;
            bkm bkmVar = bkp.g;
            baoVarD.x(-1746271574);
            boolean zD = baoVarD.D(size) | baoVarD.H(context);
            Object objT8 = basVar2.T();
            int i6 = 10;
            if (zD || objT8 == obj) {
                objT8 = new aiy(bdnVar, size, context, i6);
                basVar2.ae(objT8);
            }
            basVar2.aa();
            bkp bkpVarV = hu.v(cfd.b(bkmVar, false, (yjv) objT8), true, null);
            boolean z2 = !((Boolean) jxcVar.a()).booleanValue();
            if (((wqo) jxaVar.h().get(bdnVar.e())).c == 12) {
                yy yyVar2 = jww.a;
                yyVar = jww.d;
            } else {
                yy yyVar3 = kof.a;
                yyVar = kof.a;
            }
            yy yyVar4 = yyVar;
            bhq bhqVarK = bga.k(-1313970124, new ano(jxaVar, bdnVar, arrayList, 10), baoVarD);
            bhq bhqVarK2 = bga.k(-95690507, new ano(jxaVar, bdnVar, yjkVar, 11), baoVarD);
            bhi bhiVar3 = bhiVar;
            bhq bhqVarK3 = bga.k(1122589110, new asl(jxaVar, bdnVar, context, yowVar, bhiVar3, 3), baoVarD);
            baoVarD.x(-1746271574);
            boolean zD2 = baoVarD.D(size) | ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objT9 = basVar2.T();
            if (zD2 || objT9 == obj) {
                objT9 = new yjk() { // from class: jwx
                    @Override // defpackage.yjk
                    public final Object a() {
                        int i7 = size;
                        bdn bdnVar2 = bdnVar;
                        if (bdnVar2.e() < i7 - 1) {
                            bdnVar2.h(bdnVar2.e() + 1);
                        } else {
                            yjkVar.a();
                        }
                        return ygi.a;
                    }
                };
                basVar = basVar2;
                basVar.ae(objT9);
            } else {
                basVar = basVar2;
            }
            yjk yjkVar3 = (yjk) objT9;
            basVar.aa();
            baoVarD.x(5004770);
            Object objT10 = basVar.T();
            if (objT10 == obj) {
                objT10 = new jwz(bdnVar, 1);
                basVar.ae(objT10);
            }
            basVar.aa();
            baoVar2 = baoVarD;
            jys.v(bhiVar3, bdnVar, size, bhqVarK, bhqVarK2, bhqVarK3, yjkVar3, (yjk) objT10, bkpVarV, z2, yyVar4, bga.k(518029385, new ano(bdnVar, jxaVar, arrayList, 12, (char[]) null), baoVarD), baoVar2, 12807222, 48);
            int iE = bdnVar.e();
            yy yyVar5 = jww.a;
            jys.r(size, iE, bdi.x(xsVar.a(wv.o(bkmVar, jww.a), bkb.b), 1000.0f), 0, 0L, 0L, 0.0f, 0.0f, null, null, baoVar2, 0, 0);
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(jxaVar, yjkVar, bkpVar, i, 15, (char[]) null);
        }
    }

    public final synchronized iea ae(xkt xktVar, iea ieaVar, kuw kuwVar, lyz lyzVar, ExecutorService executorService, mct mctVar) {
        if (xktVar.a()) {
            return an(ieaVar, kuwVar);
        }
        return am(ieaVar, lyzVar, executorService, mctVar);
    }

    public final void y(dve dveVar, yjv yjvVar, yjk yjkVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-25109718);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(dveVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.x(-1746271574);
            boolean zH = ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | baoVarD.H(dveVar);
            boolean z = (i2 & 896) == 256;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if ((z | zH) || objT == ban.a) {
                objT = new ikc(dveVar, yjvVar, yjkVar, 8);
                basVar.ae(objT);
            }
            basVar.aa();
            bbn.c(dveVar, (yjv) objT, baoVarD);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(this, dveVar, yjvVar, yjkVar, i, 6);
        }
    }

    public jwq(char[] cArr, byte[] bArr) {
    }

    public void Z() {
    }

    public void aa() {
    }

    public void ab() {
    }

    public void ac() {
    }
}
