package defpackage;

import android.R;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Pair;
import com.google.android.apps.play.movies.common.service.pinning.NotificationsCallbackBroadcastReceiver;
import com.google.android.apps.play.movies.common.service.pinning.TransferService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljg {
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/service/pinning/DownloadNotificationManagerImpl");
    public final Executor b;
    public final idf c;
    public final idf d;
    public final Map e;
    public final lyz f;
    private final Context g;
    private final idf h;
    private final crv i;
    private final lfn j;
    private Set k;
    private final krb l;
    private TransferService m;

    public ljg(Context context, lyz lyzVar, lxp lxpVar, lfn lfnVar, krb krbVar) {
        this.g = context;
        lyzVar.getClass();
        this.f = lyzVar;
        this.c = lxpVar.c(kst.class);
        this.d = lxpVar.e(kst.class);
        this.j = lfnVar;
        this.b = Executors.newSingleThreadExecutor();
        this.i = new crv(context);
        this.e = new HashMap();
        this.k = new HashSet();
        Resources resources = context.getResources();
        this.h = new leo(context, resources.getDimensionPixelSize(R.dimen.notification_large_icon_width), resources.getDimensionPixelSize(R.dimen.notification_large_icon_height));
        lyzVar.b.add(new pku(this, null));
        this.l = krbVar;
    }

    public static final lje j(Cursor cursor) {
        String string = cursor.getString(0);
        int i = cursor.getInt(1);
        String string2 = cursor.getString(2);
        return new lje(string, i == 20 ? ksy.h(string2) : ksy.i(string2), string2, "", "", "", "", null, cursor.getLong(4), mei.b(cursor, 3, -1L), cursor.getInt(5), cursor.getInt(6), cursor.isNull(7) ? null : Integer.valueOf(cursor.getInt(7)), mei.a(cursor, 8, -1) == kvm.TYPE_RENTAL.f);
    }

    private final lga m(String str, String str2, Bitmap bitmap, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str3) {
        lfn lfnVar = this.j;
        Context context = this.g;
        int i = Build.VERSION.SDK_INT;
        lga lgaVarC = lga.c(context, kyt.TEMPORARY, bitmap, str3, lfnVar.cH());
        lgaVarC.f(pendingIntent);
        lgaVarC.i(pendingIntent2);
        lgaVarC.h(str);
        lgaVarC.g(str2);
        lgaVarC.e(i >= 29);
        crk crkVar = new crk();
        crkVar.c(str);
        crkVar.b(str2);
        ((crm) lgaVarC.c).p(crkVar);
        return lgaVarC;
    }

    private static final String n(String str, String str2, String str3) {
        if (true != TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        return "completed_" + str + "_" + (true != TextUtils.isEmpty(str3) ? "show_" : "video_") + str2;
    }

    private static final String o(String str, String str2) {
        return a.cz(str2, str, "error_", "_");
    }

    public final lje a(lje ljeVar, kst kstVar, tst tstVar) {
        String strE;
        Uri uriG;
        String str;
        String str2;
        String str3;
        if (kstVar instanceof kvf) {
            kvf kvfVar = (kvf) kstVar;
            strE = kvfVar.E();
            uriG = kvfVar.g();
            str2 = "";
            str3 = str2;
            str = str3;
        } else {
            if (!(kstVar instanceof kuo)) {
                return ljeVar;
            }
            kuo kuoVar = (kuo) kstVar;
            strE = kuoVar.e;
            String str4 = kuoVar.s;
            String str5 = kuoVar.j;
            String str6 = kuoVar.k;
            uriG = kuoVar.f;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        return new lje(ljeVar.a, ljeVar.b, ljeVar.c, str2, str3, strE, str, (Bitmap) (tstVar.g() ? tstVar.c() : ((ieg) this.h.b(uriG)).c), ljeVar.i, ljeVar.j, ljeVar.k, ljeVar.l, ljeVar.m, ljeVar.n);
    }

    public final void b(lje ljeVar) {
        if (ljeVar == null) {
            return;
        }
        int i = ljeVar.k;
        if (i == 1) {
            this.i.a(n(ljeVar.a, ljeVar.c, ljeVar.e), com.google.android.videos.R.id.video_download_pending_notification);
        } else if (i == 3) {
            this.i.a(n(ljeVar.a, ljeVar.c, ljeVar.e), com.google.android.videos.R.id.video_download_completed_notification);
        } else {
            if (i != 4) {
                return;
            }
            this.i.a(o(ljeVar.a, ljeVar.c), com.google.android.videos.R.id.video_download_error_notification);
        }
    }

    public final void c(ksn ksnVar, String... strArr) {
        if (strArr.length != 0) {
            for (String str : strArr) {
                lyz lyzVar = this.f;
                SQLiteDatabase sQLiteDatabaseA = lyzVar.a();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("pinning_notification_active", (Boolean) false);
                    lyzVar.g(sQLiteDatabaseA, sQLiteDatabaseA.update("purchased_assets", contentValues, "(account = ? AND asset_type IN (6,20) AND asset_id = ?) AND pinning_notification_active", new String[]{ksnVar.a, str}) > 0, ksnVar, str);
                } catch (Throwable th) {
                    this.f.g(sQLiteDatabaseA, false, ksnVar, str);
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            Map map = this.e;
            synchronized (map) {
                for (String str2 : strArr) {
                    lje ljeVar = (lje) map.remove(Pair.create(ksnVar.a, str2));
                    if (ljeVar != null) {
                        arrayList.add(ljeVar);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ksk.g(new lik(this, arrayList, 3));
        }
    }

    public final void d() {
        this.b.execute(new ljl(this, 1, null));
    }

    public final void e(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            liz lizVar = (liz) it.next();
            String str = lizVar.e;
            List list = lizVar.a;
            String str2 = (String) list.get(0);
            String str3 = lizVar.h;
            String strN = n(str, str2, str3);
            crv crvVar = this.i;
            Context context = this.g;
            String str4 = lizVar.g;
            PendingIntent pendingIntentF = NotificationsCallbackBroadcastReceiver.f(context, str, list, str4, str3);
            PendingIntent pendingIntentB = NotificationsCallbackBroadcastReceiver.b(context, str, list, str4, str3);
            boolean z = !TextUtils.isEmpty(str3) && list.size() > 1;
            lga lgaVarM = m(z ? lizVar.j : lizVar.i, z ? context.getString(com.google.android.videos.R.string.download_episodes_finished_notification_text, Integer.valueOf(list.size())) : context.getString(com.google.android.videos.R.string.download_finished_notification_text), lizVar.k, pendingIntentF, pendingIntentB, "Download completed");
            lgaVarM.m(context.getString(com.google.android.videos.R.string.download_finished_notification_ticker));
            crvVar.b(strN, com.google.android.videos.R.id.video_download_completed_notification, lgaVarM.a());
        }
    }

    public final void f(Collection collection) {
        ljg ljgVar = this;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            lja ljaVar = (lja) it.next();
            String str = ljaVar.e;
            String str2 = ljaVar.f;
            String strO = o(str, str2);
            crv crvVar = ljgVar.i;
            Context context = ljgVar.g;
            String str3 = ljaVar.g;
            String str4 = ljaVar.h;
            PendingIntent activity = Build.VERSION.SDK_INT >= 29 ? PendingIntent.getActivity(context, 0, NotificationsCallbackBroadcastReceiver.e(context, ksn.b(str), str2, str3, str4), 201326592) : NotificationsCallbackBroadcastReceiver.a(context, NotificationsCallbackBroadcastReceiver.c(context, "com.google.android.videos.DOWNLOAD_ERROR", str).setData(NotificationsCallbackBroadcastReceiver.d(str, str2, false)).putExtra("video_id", str2).putExtra("season_id", str3).putExtra("show_id", str4));
            lga lgaVarM = ljgVar.m(ljaVar.i, ktw.q(context, ljaVar.a, Long.valueOf(ljaVar.b), ljaVar.c, ljaVar.d), ljaVar.k, activity, NotificationsCallbackBroadcastReceiver.a(context, NotificationsCallbackBroadcastReceiver.c(context, "com.google.android.videos.DOWNLOAD_ERROR_DELETED", str).setData(NotificationsCallbackBroadcastReceiver.d(str, str2, false)).putExtra("video_id", str2).putExtra("season_id", str3).putExtra("show_id", str4)), "Download error");
            lgaVarM.m(context.getString(com.google.android.videos.R.string.download_error_notification_ticker));
            crvVar.b(strO, com.google.android.videos.R.id.video_download_error_notification, lgaVarM.a());
            ljgVar = this;
        }
    }

    public final void g(ljd ljdVar) {
        int i;
        TransferService transferService = this.m;
        if (transferService != null) {
            if (ljdVar == null || (i = ljdVar.a) <= 0) {
                transferService.stopForeground(true);
                return;
            }
            Context context = this.g;
            String str = ljdVar.b;
            String str2 = ljdVar.c;
            String str3 = ljdVar.d;
            String str4 = ljdVar.e;
            PendingIntent activity = Build.VERSION.SDK_INT >= 29 ? PendingIntent.getActivity(context, 0, NotificationsCallbackBroadcastReceiver.e(context, ksn.b(str), str2, str3, str4), 201326592) : NotificationsCallbackBroadcastReceiver.a(context, NotificationsCallbackBroadcastReceiver.c(context, "com.google.android.videos.DOWNLOAD_ONGOING", str).setData(NotificationsCallbackBroadcastReceiver.d(str, str2, false)).putExtra("video_id", str2).putExtra("season_id", str3).putExtra("show_id", str4));
            TransferService transferService2 = this.m;
            long j = ljdVar.h;
            String string = j == 0 ? context.getString(com.google.android.videos.R.string.prepare_to_download) : i != 1 ? context.getString(com.google.android.videos.R.string.download_in_progress_notification_title) : context.getString(com.google.android.videos.R.string.download_in_progress_notification_single_video, ljdVar.f);
            Bitmap bitmap = ljdVar.g;
            String string2 = context.getString(com.google.android.videos.R.string.download_started_notification_ticker);
            lga lgaVarC = lga.c(context, kyt.TEMPORARY, bitmap, "Ongoing download", false);
            lgaVarC.k();
            lgaVarC.l();
            lgaVarC.m(string2);
            lgaVarC.h(string);
            lgaVarC.f(activity);
            String string3 = ljdVar.j ? context.getString(com.google.android.videos.R.string.download_in_progress_notification_text, Integer.valueOf(ljdVar.k), Formatter.formatShortFileSize(context, j), Formatter.formatShortFileSize(context, ljdVar.i)) : context.getString(com.google.android.videos.R.string.download_in_progress_indeterminate_notification_text, Integer.valueOf(ljdVar.k));
            if (ksk.b <= 23) {
                lgaVarC.g(string3);
            } else {
                ((crm) lgaVarC.c).q(string3);
            }
            if (i >= 2) {
                ((crm) lgaVarC.c).i = i;
            }
            ((crm) lgaVarC.c).n(100, ljdVar.k, ljdVar.i == 0);
            transferService2.b(com.google.android.videos.R.id.video_download_notification, lgaVarC.a());
        }
    }

    public final void h(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ljb ljbVar = (ljb) it.next();
            int i = ljbVar.a;
            if (i != 32) {
                String str = ljbVar.e;
                List list = ljbVar.b;
                String str2 = (String) list.get(0);
                String str3 = ljbVar.h;
                String strN = n(str, str2, str3);
                crv crvVar = this.i;
                Context context = this.g;
                String str4 = ljbVar.g;
                PendingIntent pendingIntentF = NotificationsCallbackBroadcastReceiver.f(context, str, list, str4, str3);
                PendingIntent pendingIntentB = NotificationsCallbackBroadcastReceiver.b(context, str, list, str4, str3);
                crvVar.b(strN, com.google.android.videos.R.id.video_download_pending_notification, m((TextUtils.isEmpty(str3) || list.size() <= 1) ? ljbVar.i : ljbVar.j, context.getString(ktw.p(i)), ljbVar.k, pendingIntentF, pendingIntentB, "Pending download").a());
                hashSet.add(strN);
            }
        }
        this.k.removeAll(hashSet);
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            this.i.a((String) it2.next(), com.google.android.videos.R.id.video_download_pending_notification);
        }
        this.k = hashSet;
    }

    public final void i(TransferService transferService) {
        this.m = transferService;
        if (transferService != null) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.isy k() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljg.k():isy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Collection] */
    public final void l(isy isyVar, int i) {
        if (i == 1) {
            h(isyVar.d);
            return;
        }
        if (i == 2) {
            g((ljd) isyVar.a);
        } else if (i == 3) {
            e(isyVar.b);
        } else {
            if (i != 4) {
                return;
            }
            f(isyVar.c);
        }
    }
}
