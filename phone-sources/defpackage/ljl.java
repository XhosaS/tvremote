package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import com.google.android.apps.play.movies.common.view.tagging.TagsView;
import com.google.android.apps.play.movies.mobile.presenter.activity.HomeLauncherActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.NotificationSettingsActivity;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljl implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ljl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, lgr] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, lmz] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, lfn] */
    @Override // java.lang.Runnable
    public final void run() {
        char c = 2;
        int i = 0;
        switch (this.b) {
            case 0:
                ljn ljnVar = (ljn) this.a;
                ljnVar.g.obtainMessage(3, ljnVar.i.a() ? 1 : 0, 0).sendToTarget();
                return;
            case 1:
                ArrayList arrayList = new ArrayList();
                Object obj = this.a;
                ljg ljgVar = (ljg) obj;
                SQLiteDatabase sQLiteDatabaseB = ljgVar.f.b();
                if (sQLiteDatabaseB == null) {
                    krd.c("Could not refresh video data. Failed to open database");
                } else {
                    Cursor cursorQuery = sQLiteDatabaseB.query("purchased_assets", ljf.a, "pinning_notification_active AND pinning_status IS NOT NULL AND pinning_status != 5", null, null, null, null, null);
                    try {
                        Map map = ((ljg) obj).e;
                        synchronized (map) {
                            map.clear();
                            while (cursorQuery.moveToNext()) {
                                arrayList.add(ljg.j(cursorQuery));
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        ImmutableMap immutableMapUniqueIndex = FluentIterable.from(ImmutableSet.copyOf((Collection) ljgVar.d.b(FluentIterable.from(arrayList).transform(new eyt(16)).toList()))).uniqueIndex(new eyt(17));
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            lje ljeVar = (lje) arrayList.get(i2);
                            ksy ksyVar = ljeVar.b;
                            kst kstVar = (kst) immutableMapUniqueIndex.get(ksyVar);
                            if (kstVar == null) {
                                krd.c("RefreshVideoData: failed to get asset metadata for ".concat(ksyVar.toString()));
                            } else {
                                ljgVar.e.put(Pair.create(ljeVar.a, ljeVar.c), ljgVar.a(ljeVar, kstVar, trk.a));
                            }
                        }
                    } finally {
                    }
                }
                isy isyVarK = ljgVar.k();
                if (Build.VERSION.SDK_INT < 29) {
                    ksk.g(new lik(obj, isyVarK, 2, null));
                    return;
                }
                return;
            case 2:
                ((lkm) this.a).i();
                return;
            case 3:
                lkp lkpVar = (lkp) this.a;
                if (lkpVar.V == null) {
                    return;
                }
                lkpVar.U.A();
                lkpVar.c(1000);
                return;
            case 4:
                this.a.a();
                return;
            case 5:
                ((lli) this.a).h.y(new llt(17, -1, null, false, false, trk.a));
                return;
            case 6:
                ((lli) this.a).i();
                return;
            case 7:
                ((llm) this.a).i();
                return;
            case 8:
                Object obj2 = this.a;
                if (((kuw) obj2).a.a()) {
                    return;
                }
                try {
                    gos gosVar = new gos();
                    gosVar.c(2);
                    gou gouVarA = gosVar.a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    gli.D("worker_name_key", "UpdateLastPlaybackWorker", linkedHashMap);
                    gox goxVarY = gli.y(linkedHashMap);
                    gpo gpoVar = new gpo(MoviesWorkerWrapper.class);
                    gpoVar.b("upload_last_playback_v2");
                    gpoVar.d(300L, TimeUnit.SECONDS);
                    gpoVar.c(gouVarA);
                    gpoVar.e(goxVarY);
                    cvi cviVarF = gpoVar.f();
                    ((ufb) ufn.i(((gpt) ((gpz) ((kuw) obj2).b).g("upload_last_playback_v2", 1, cviVarF)).c, new ldl(cviVarF, 7), ugk.a)).s();
                    return;
                } catch (Exception unused) {
                    krd.f("Unable to upload last playbacks");
                    return;
                }
            case 9:
                Iterator it = ((lkt) this.a).c.iterator();
                while (it.hasNext()) {
                    ((NotificationSettingsActivity) it.next()).e();
                }
                return;
            case 10:
                Object obj3 = this.a;
                tha thaVar = (tha) obj3;
                SQLiteDatabase sQLiteDatabaseA = ((lyz) thaVar.c).a();
                try {
                    ContentValues contentValues = new ContentValues(1);
                    if (((tha) obj3).b) {
                        contentValues.put("cache_persistent", (Boolean) false);
                        sQLiteDatabaseA.update("cached_items", contentValues, "cache_account = ?", new String[]{((ksn) ((tha) obj3).f).a});
                    }
                    contentValues.put("cache_persistent", (Boolean) true);
                    Object obj4 = ((tha) obj3).e;
                    UnmodifiableIterator it2 = ((ImmutableList) obj4).iterator();
                    int i3 = 0;
                    while (i3 < ((ImmutableList) obj4).size()) {
                        int iMin = Math.min(200, ((ImmutableList) obj4).size() - i3);
                        String strConcat = "cache_account = ? AND cache_play_country = ? AND cache_locale = ? AND cache_type IN (6,5000,20,19,18) AND ".concat(mei.d("cache_key", iMin));
                        Object obj5 = ((tha) obj3).f;
                        String str = ((tha) obj3).a;
                        Object obj6 = ((tha) obj3).d;
                        char c2 = c;
                        String[] strArr = new String[iMin + 3];
                        strArr[i] = ((ksn) obj5).a;
                        strArr[1] = str;
                        strArr[c2] = ksg.b((Locale) obj6);
                        int i4 = i;
                        int i5 = 3;
                        while (i4 < iMin) {
                            strArr[i5] = ((ksy) it2.next()).b;
                            i4++;
                            i5++;
                        }
                        sQLiteDatabaseA.update("cached_items", contentValues, strConcat, strArr);
                        i3 += 200;
                        c = c2;
                        i = 0;
                    }
                    ((lyz) thaVar.c).e(sQLiteDatabaseA, true);
                    return;
                } catch (Throwable th) {
                    ((lyz) thaVar.c).e(sQLiteDatabaseA, false);
                    throw th;
                }
            case 11:
                ((kuw) this.a).d(64);
                return;
            case 12:
                Object obj7 = this.a;
                try {
                    gos gosVar2 = new gos();
                    gosVar2.c(2);
                    gou gouVarA2 = gosVar2.a();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    gli.D("worker_name_key", "UpdateUserSentimentsWorker", linkedHashMap2);
                    gox goxVarY2 = gli.y(linkedHashMap2);
                    gpo gpoVar2 = new gpo(MoviesWorkerWrapper.class);
                    gpoVar2.b("upload_user_sentiments");
                    gpoVar2.d(((kuw) obj7).a.aT(), TimeUnit.SECONDS);
                    gpoVar2.c(gouVarA2);
                    gpoVar2.e(goxVarY2);
                    cvi cviVarF2 = gpoVar2.f();
                    ((ufb) ufn.i(((gpt) ((gpz) ((kuw) obj7).b).g("upload_user_sentiments", 1, cviVarF2)).c, new ldl(cviVarF2, 20), ugk.a)).s();
                    return;
                } catch (Exception unused2) {
                    krd.f("Unable to upload user sentiments");
                    return;
                }
            case 13:
                ((kuw) this.a).p();
                return;
            case 14:
                ((mde) this.a).a.p();
                return;
            case 15:
                ((View) this.a).sendAccessibilityEvent(8);
                return;
            case 16:
                ((mfx) this.a).b.setVisibility(8);
                return;
            case 17:
                msg msgVar = ((mfx) this.a).j;
                if (msgVar != null) {
                    msgVar.a();
                    return;
                }
                return;
            case 18:
                ((TagsView) this.a).b();
                return;
            case 19:
                Context context = (Context) this.a;
                Intent intent = new Intent(context, (Class<?>) HomeLauncherActivity.class);
                intent.setFlags(268435456);
                context.startActivity(intent);
                System.exit(0);
                return;
            default:
                krd.f("Timeout trying to push video to remote device");
                ((mje) ((uka) this.a).b).f.l(-1002, true);
                return;
        }
    }

    public /* synthetic */ ljl(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
