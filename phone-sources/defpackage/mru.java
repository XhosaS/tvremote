package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.play.movies.common.service.playstore.WatchActionBootstrapActivity;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;
import com.google.android.apps.play.movies.mobile.usecase.downloads.ManageDownloadsActivity;
import com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.TimeBar;
import com.google.android.videos.R;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mru {
    public final Object a;
    public final Object b;
    public final Object c;

    public mru(Context context, cr crVar, nqq nqqVar) {
        this.c = context;
        this.b = crVar;
        this.a = nqqVar;
    }

    public static final mru b(Context context, iea ieaVar, idf idfVar, idb idbVar, ids idsVar, pkg pkgVar) {
        krz krzVar = new krz(Collections.EMPTY_LIST);
        krzVar.a = new ids[]{ieaVar, idsVar};
        krzVar.d(new lxf(idbVar, ieaVar, idfVar, context, 8));
        iea ieaVarA = krzVar.a();
        iff iffVar = new iff();
        iffVar.b = new mcm(20);
        iffVar.c = new mnn(pkgVar, 4);
        iffVar.d = new mmg(5);
        iffVar.e = new mzs(1);
        iffVar.e(new mzs(0), false);
        return new mru(ieaVarA, iffVar.b());
    }

    private static ieg i(tst tstVar) {
        return tstVar.g() ? ieg.f((lao) tstVar.c()) : ieg.a;
    }

    private static void j(Context context, Intent intent) {
        context.startActivity(intent.setFlags(268435456));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v1, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [idf, java.lang.Object] */
    public final mrt a(String str, Context context, View view, TimeBar timeBar, ImageView imageView, TextView textView, boolean z) {
        Executor executor = (Executor) this.a.b();
        executor.getClass();
        ?? r0 = this.c;
        ?? B = this.b.b();
        ?? B2 = r0.b();
        context.getClass();
        view.getClass();
        timeBar.getClass();
        imageView.getClass();
        return new mrt(executor, B, B2, str, context, view, timeBar, imageView, textView, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final int c(String str) {
        Integer num = (Integer) this.a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void d(String str, String str2, int i) {
        this.c.put(str, str2);
        this.b.put(str2, str);
        this.a.put(str, Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection] */
    public final String e() {
        StringBuilder sb = new StringBuilder((String) this.b);
        Locale locale = Locale.ROOT;
        String str = (String) this.c;
        String upperCase = str.toUpperCase(locale);
        if (!upperCase.matches("[A-F0-9]+")) {
            throw new IllegalArgumentException("Invalid application ID: ".concat(str));
        }
        sb.append("/");
        sb.append(upperCase);
        ?? r0 = this.a;
        if (r0 != 0) {
            if (r0.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            sb.append("/");
            boolean z = true;
            for (String string : r0) {
                nrv.h(string);
                if (!z) {
                    sb.append(",");
                }
                if (!nrv.a.matcher(string).matches()) {
                    StringBuilder sb2 = new StringBuilder(string.length());
                    for (int i = 0; i < string.length(); i++) {
                        char cCharAt = string.charAt(i);
                        if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || cCharAt == '.' || cCharAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                z = false;
            }
        }
        if (r0 == 0) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [iea, java.lang.Object] */
    public final void f(ntp ntpVar) {
        iff iffVar = new iff();
        iffVar.f(R.layout.details_similarassets_section_vertical_padding);
        ifc ifcVarC = iffVar.c();
        ?? r1 = this.c;
        ntpVar.c(r1, ifcVarC);
        ntpVar.c(this.b, (ifc) this.a);
        ntpVar.c(r1, ifcVarC);
    }

    public final void g(kxj kxjVar, kqz kqzVar) {
        switch (kxjVar.i() - 1) {
            case 0:
                Uri uriA = kxjVar.a();
                Intent intent = new Intent();
                ldy ldyVar = (ldy) this.c;
                if (ldyVar.a().m()) {
                    intent.putExtra("authAccount", ((ksn) ldyVar.a().g()).a);
                } else {
                    krd.f("ActionHandler: no account available in account repository.");
                }
                intent.setAction("android.intent.action.VIEW").setData(uriA).setFlags(268435456);
                Context context = (Context) this.b;
                intent.setPackage(context.getPackageName());
                context.startActivity(intent);
                return;
            case 1:
                return;
            case 2:
                kyi kyiVarD = kxjVar.d();
                int iB = kyiVarD.b() - 1;
                if (iB == 0) {
                    Object obj = this.b;
                    Context context2 = (Context) obj;
                    j(context2, DetailsActivity.createMovieDetailsIntent(context2, kvf.U(kyiVarD.a().a), kqzVar.a, lid.a, (Intent) null, (ieg<lao>) i(kyiVarD.a().b)));
                    return;
                }
                if (iB != 2) {
                    Object obj2 = this.b;
                    Context context3 = (Context) obj2;
                    j(context3, DetailsActivity.createShowIntent(context3, kwn.d(kyiVarD.d().a), kqzVar.a, lid.a, (Intent) null, (ieg<lao>) i(kyiVarD.d().b)));
                    return;
                }
                Object obj3 = this.b;
                Context context4 = (Context) obj3;
                j(context4, DetailsActivity.createMoviesBundleDetailsIntent(context4, kvj.d(kyiVarD.c().a.b), kqzVar.a, lid.a, (Intent) null, (ieg<lao>) i(kyiVarD.c().b)));
                return;
            case 3:
                Context context5 = (Context) this.b;
                j(context5, jbr.T(context5, new Intent()));
                return;
            case 4:
                Context context6 = (Context) this.b;
                j(context6, jbr.T(context6, new Intent()));
                return;
            case 5:
                Context context7 = (Context) this.b;
                Intent flags = jbr.T(context7, new Intent()).setFlags(268435456);
                flags.putExtra("selected_vertical", "wishlist");
                context7.startActivity(flags);
                return;
            case 6:
                int i = kxjVar.e().a;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0 || i2 == 1) {
                    Context context8 = (Context) this.b;
                    context8.startActivity(jbr.T(context8, new Intent()));
                    return;
                } else {
                    Intent intent2 = new Intent();
                    Context context9 = (Context) this.b;
                    j(context9, jbr.T(context9, intent2));
                    return;
                }
            case 7:
                kyp kypVarH = kxjVar.h();
                tst tstVar = kqzVar.b;
                int iB2 = kypVarH.b() - 1;
                if (iB2 == 0) {
                    if (!tstVar.g()) {
                        Object obj4 = this.b;
                        Context context10 = (Context) obj4;
                        j(context10, BootstrapWatchActivity.createMovieIntent(context10, kvf.U(kypVarH.c().a), kqzVar.a, null));
                        return;
                    }
                    Object obj5 = this.a;
                    Object objC = tstVar.c();
                    wll wllVar = wll.a;
                    String str = kuf.a.b;
                    wpm wpmVarAo = a.ao(kypVarH.c().a.b);
                    lid.a();
                    ((jan) obj5).q((Context) objC, wllVar, str, wpmVarAo, "details", false);
                    return;
                }
                if (iB2 == 1) {
                    Object obj6 = this.b;
                    kxb kxbVarB = kxb.b(kypVarH.d().a.b, Uri.EMPTY, Uri.EMPTY);
                    String str2 = kqzVar.a;
                    ieg iegVar = ieg.a;
                    Context context11 = (Context) obj6;
                    j(context11, BootstrapWatchActivity.createTrailerIntent(context11, kxbVarB, iegVar, iegVar, str2));
                    return;
                }
                kym kymVarA = kypVarH.a();
                ksy ksyVar = kymVarA.a;
                ksy ksyVar2 = kymVarA.b;
                ksy ksyVar3 = kymVarA.c;
                Context context12 = (Context) this.b;
                j(context12, BootstrapWatchActivity.createEpisodeIntent(context12, kuo.d(ksyVar.b, ksyVar2.b, ksyVar3.b), kqzVar.a, null));
                return;
            case 8:
                int i3 = kxjVar.f().a - 1;
                if (i3 == 1) {
                    Context context13 = (Context) this.b;
                    context13.startActivity(ManageDownloadsActivity.createIntent(context13, lid.a));
                    return;
                } else if (i3 != 2) {
                    Context context14 = (Context) this.b;
                    j(context14, SettingsActivity.createIntent(context14).putExtra("parent_event_id", lid.a));
                    return;
                } else {
                    Context context15 = (Context) this.b;
                    j(context15, SettingsActivity.settingsActivityScrollToNotificationsIntent(context15).putExtra("parent_event_id", lid.a));
                    return;
                }
            case 9:
                kyl kylVarG = kxjVar.g();
                Context context16 = (Context) this.b;
                j(context16, ManageServicesActivity.manageServicesActivityIntent(context16, kylVarG.a(), lid.a));
                return;
            default:
                kxk kxkVarB = kxjVar.b();
                mdz mdzVar = new mdz(kqzVar.b.c(), 1);
                ksy ksyVar4 = kxkVarB.a;
                ksr ksrVar = ksr.a;
                WatchActionBootstrapActivity.startInstallAppActivity((Context) this.b, mdzVar, (ksn) ((ldy) this.c).a().g(), new ktg(ksyVar4.b), lid.a());
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void h(final ksn ksnVar, final ksy ksyVar, final int i, final boolean z, final String str, final boolean z2) {
        this.a.execute(new Runnable() { // from class: mcf
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Runnable] */
            /* JADX WARN: Type inference failed for: r1v18 */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                boolean z3;
                ContentValues contentValues;
                boolean z4;
                boolean z5 = this;
                long jCurrentTimeMillis = System.currentTimeMillis();
                mru mruVar = z5.g;
                SQLiteDatabase sQLiteDatabaseA = ((lyz) mruVar.b).a();
                ksn ksnVar2 = ksnVar;
                ksy ksyVar2 = ksyVar;
                String str2 = str;
                boolean z6 = z2;
                try {
                    ContentValues contentValues2 = new ContentValues();
                    String str3 = ksnVar2.a;
                    contentValues2.put("user_sentiment_account", str3);
                    contentValues2.put("user_sentiment_type", Integer.valueOf(ksyVar2.n().s));
                    String str4 = ksyVar2.b;
                    contentValues2.put("user_sentiment_id", str4);
                    contentValues2.put("user_sentiment_timestamp", Long.valueOf(jCurrentTimeMillis));
                    contentValues2.put("user_sentiment_uploading", Boolean.valueOf(z6));
                    vtw vtwVarM = xbj.a.m();
                    int i2 = ktc.a;
                    vtw vtwVarM2 = xaz.a.m();
                    try {
                        xay xayVarN = ksyVar2.n();
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        vuc vucVar = vtwVarM2.b;
                        xaz xazVar = (xaz) vucVar;
                        xazVar.f = xayVarN.s;
                        xazVar.b |= 8;
                        if (!vucVar.A()) {
                            vtwVarM2.u();
                        }
                        xaz xazVar2 = (xaz) vtwVarM2.b;
                        xazVar2.b |= 1;
                        xazVar2.c = str4;
                        xaz xazVar3 = (xaz) vtwVarM2.r();
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar2 = vtwVarM.b;
                        xbj xbjVar = (xbj) vucVar2;
                        xazVar3.getClass();
                        xbjVar.c = xazVar3;
                        xbjVar.b |= 1;
                        if (!vucVar2.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar3 = vtwVarM.b;
                        xbj xbjVar2 = (xbj) vucVar3;
                        xbjVar2.b |= 16;
                        xbjVar2.g = str2;
                        int i3 = i - 1;
                        int i4 = i3 != 0 ? i3 != 1 ? 1 : 3 : 2;
                        if (!vucVar3.A()) {
                            vtwVarM.u();
                        }
                        xbj xbjVar3 = (xbj) vtwVarM.b;
                        xbjVar3.d = i4 - 1;
                        xbjVar3.b |= 2;
                        try {
                            int iBm = a.bm(true == z ? 1 : 2);
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            vuc vucVar4 = vtwVarM.b;
                            xbj xbjVar4 = (xbj) vucVar4;
                            int i5 = iBm - 1;
                            try {
                                if (iBm == 0) {
                                    throw null;
                                }
                                xbjVar4.e = i5;
                                xbjVar4.b |= 4;
                                long j = jCurrentTimeMillis * 1000000;
                                if (!vucVar4.A()) {
                                    vtwVarM.u();
                                }
                                xbj xbjVar5 = (xbj) vtwVarM.b;
                                xbjVar5.b |= 8;
                                xbjVar5.f = j;
                                contentValues2.put("user_sentiment_value", ((xbj) vtwVarM.r()).h());
                                if (z6) {
                                    z3 = true;
                                    contentValues = contentValues2;
                                } else {
                                    contentValues = contentValues2;
                                    z5 = 1;
                                    Cursor cursorQuery = sQLiteDatabaseA.query("user_sentiments", new String[]{"user_sentiment_type", "user_sentiment_id"}, "user_sentiment_account = ? AND user_sentiment_type = ? AND user_sentiment_id = ? AND user_sentiment_uploading = 1", new String[]{str3, Integer.toString(ksyVar2.n().s), str4}, null, null, null);
                                    try {
                                        z4 = z5;
                                        z3 = z5;
                                        if (cursorQuery.getCount() > 0) {
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                                z4 = z5;
                                            }
                                            ((lyz) mruVar.b).f(sQLiteDatabaseA, z4, 16);
                                            mruVar.c.run();
                                        }
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                            z3 = z5;
                                        }
                                    } finally {
                                    }
                                }
                                sQLiteDatabaseA.replace("user_sentiments", null, contentValues);
                                z4 = z3;
                                ((lyz) mruVar.b).f(sQLiteDatabaseA, z4, 16);
                                mruVar.c.run();
                            } catch (Throwable th) {
                                th = th;
                                ((lyz) mruVar.b).f(sQLiteDatabaseA, z5, 16);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z5 = 1;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z5 = 1;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z5 = 1;
                }
            }
        });
    }

    public mru(Context context, iea ieaVar, jan janVar) {
        this.b = context;
        this.c = ieaVar;
        this.a = janVar;
    }

    public mru(String str, Collection collection) {
        this.b = "com.google.android.gms.cast.CATEGORY_CAST";
        this.c = str;
        this.a = collection;
    }

    public mru(lyz lyzVar, ExecutorService executorService, kuw kuwVar) {
        this.a = executorService;
        this.b = lyzVar;
        this.c = new ljl(kuwVar, 12, null);
    }

    public mru() {
        this.c = new HashMap();
        this.b = new HashMap();
        this.a = new HashMap();
    }

    public mru(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, byte[] bArr) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
    }

    public mru(yfo yfoVar, yfo yfoVar2, yfo yfoVar3) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
    }

    private mru(iea ieaVar, ifc ifcVar) {
        this.b = ieaVar;
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{ieaVar};
        krzVar.d(new mmo(ieaVar, 11));
        this.c = krzVar.a();
        this.a = ifcVar;
    }
}
