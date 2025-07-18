package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.play.movies.mobile.service.restart.GtvExperienceInitializer;
import com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lke implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lke(AccountParticleDisc accountParticleDisc, Object obj, AvatarView avatarView, int i) {
        this.d = i;
        this.c = accountParticleDisc;
        this.b = obj;
        this.a = avatarView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v115, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [dvs, dvv] */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v23, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v87, types: [dvw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [dvs] */
    /* JADX WARN: Type inference failed for: r3v47, types: [dvk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [lje] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        lje ljeVar;
        lje ljeVar2;
        nkl nklVar;
        nkl nklVar2;
        onz onzVarB;
        int i = 4;
        int i2 = 2;
        boolean z = false;
        ?? A = 0;
        qyn qynVar = null;
        Bitmap bitmap = null;
        switch (this.d) {
            case 0:
                this.c.c(((ieg) ((lkm) this.a).C.b(this.b)).e(new kro(12)));
                return;
            case 1:
                String str = ((ksn) this.c).a;
                Object obj = this.b;
                Object obj2 = this.a;
                Pair pairCreate = Pair.create(str, obj);
                ljg ljgVar = (ljg) obj2;
                Cursor cursorQuery = ljgVar.f.b().query("purchased_assets", ljf.a, "pinning_notification_active AND pinning_status IS NOT NULL AND pinning_status != 5 AND account = ? AND asset_id = ?", new String[]{str, (String) obj}, null, null, null, null);
                try {
                    lje ljeVarJ = cursorQuery.moveToFirst() ? ljg.j(cursorQuery) : null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (ljeVarJ == null) {
                        ljeVar = A;
                    } else {
                        idf idfVar = ljgVar.c;
                        ksy ksyVar = ljeVarJ.b;
                        ieg iegVar = (ieg) idfVar.b(ksyVar);
                        if (iegVar.k()) {
                            ((tug) ((tug) ljg.a.g()).j("com/google/android/apps/play/movies/common/service/pinning/DownloadNotificationManagerImpl", "computeVideoData", 622, "DownloadNotificationManagerImpl.java")).v("ComputeVideoData: failed to get asset metadata for %s", ksyVar);
                            ljeVar = ljeVarJ;
                        } else {
                            Map map = ljgVar.e;
                            synchronized (map) {
                                for (lje ljeVar3 : map.values()) {
                                    if (!TextUtils.equals(ljeVarJ.c, ljeVar3.c)) {
                                        String str2 = ljeVar3.e;
                                        if (TextUtils.isEmpty(str2) || !TextUtils.equals(ljeVarJ.e, str2)) {
                                        }
                                    }
                                    bitmap = ljeVar3.h;
                                }
                            }
                            A = ljgVar.a(ljeVarJ, (kst) iegVar.g(), tst.h(bitmap));
                            ljeVar = A;
                        }
                    }
                    Map map2 = ljgVar.e;
                    synchronized (map2) {
                        ljeVar2 = ljeVar == null ? (lje) map2.remove(pairCreate) : (lje) map2.put(pairCreate, ljeVar);
                    }
                    if (ljeVar == null && ljeVar2 == null) {
                        return;
                    }
                    ksk.g(new ejr(ljgVar, ljgVar.k(), ljeVar, ljeVar2, 13));
                    return;
                } finally {
                }
            case 2:
                this.c.c(((ieg) ((lsc) this.b).b(this.a)).e(new kro(13)));
                return;
            case 3:
                this.c.c(((ieg) ((llm) this.a).u.b(this.b)).e(new kro(14)));
                return;
            case 4:
                this.c.c(((llm) this.a).w.b(this.b));
                return;
            case 5:
                nwo nwoVar = new nwo();
                nwoVar.o((String) this.b);
                nwoVar.p(((Uri) this.c).toString());
                mad madVar = new mad(nwoVar.n(), 0, 0L, System.currentTimeMillis());
                lnk lnkVar = (lnk) this.a;
                lnkVar.l.r(madVar);
                lnkVar.k.a();
                return;
            case 6:
                Iterator it = ((lyz) this.a).b.iterator();
                while (it.hasNext()) {
                    Object obj3 = this.b;
                    Object obj4 = this.c;
                    pku pkuVar = (pku) it.next();
                    ksn ksnVar = (ksn) ((ieg) obj4).g();
                    Object obj5 = pkuVar.a;
                    ((ljg) obj5).b.execute(new lke(obj5, (Object) ksnVar, obj3, 1, (byte[]) null));
                }
                return;
            case 7:
                ksn ksnVar2 = (ksn) ((ieg) this.c).g();
                Object obj6 = this.a;
                jzs jzsVar = ((mce) this.b).a;
                ieg iegVar2 = (ieg) ((ltp) jzsVar.c).b(new lue(ksnVar2, ImmutableList.of(obj6), jzsVar.a.getString(krh.USER_SENTIMENTS_UPDATE_TOKEN, "")));
                if (!iegVar2.m()) {
                    krd.f("Failed to get user sentiment for asset ".concat(String.valueOf(String.valueOf(obj6))));
                    return;
                }
                ImmutableList immutableList = ((luf) iegVar2.g()).a;
                if (immutableList.size() == 1) {
                    ((mru) jzsVar.b).h(ksnVar2, (ksy) obj6, ((kxe) immutableList.get(0)).d, true, "", false);
                    return;
                }
                if (immutableList.size() > 1) {
                    krd.f("Expected to get one user sentiment for asset " + String.valueOf(obj6) + " but got " + immutableList.size());
                    return;
                }
                return;
            case 8:
                GtvExperienceInitializer gtvExperienceInitializer = (GtvExperienceInitializer) this.a;
                lys lysVar = gtvExperienceInitializer.h;
                if (lysVar == null) {
                    yks.c("configurationStore");
                    lysVar = null;
                }
                ksn ksnVar3 = (ksn) this.c;
                lysVar.e(ksnVar3);
                lge lgeVar = gtvExperienceInitializer.d;
                if (lgeVar == null) {
                    yks.c("purchasedAssets");
                    lgeVar = null;
                }
                String str3 = ksnVar3.a;
                if (((lgf) lgeVar).d("account = ? ", new String[]{str3}).isEmpty()) {
                    kwy kwyVar = gtvExperienceInitializer.i;
                    if (kwyVar == null) {
                        yks.c("watchlist");
                        kwyVar = null;
                    }
                    Cursor cursorQuery2 = ((lyz) kwyVar.a).b().query(true, "wishlist", new String[]{"wishlist_item_type", "wishlist_item_id"}, "wishlist_account = ? AND wishlist_item_state != 3", new String[]{str3}, null, null, null, null);
                    try {
                        ImmutableList.Builder builder = ImmutableList.builder();
                        while (cursorQuery2.moveToNext()) {
                            builder.add((ImmutableList.Builder) ksy.c(cursorQuery2.getInt(0), cursorQuery2.getString(1)));
                        }
                        ImmutableList immutableListBuild = builder.build();
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        if (immutableListBuild.isEmpty()) {
                            z = true;
                        }
                    } finally {
                    }
                }
                ksk.g(new hum(this.b, z, i2, A));
                return;
            case 9:
                Map map3 = ((nkz) this.c).a.q;
                Object obj7 = this.a;
                synchronized (map3) {
                    nklVar = (nkl) map3.get(obj7);
                }
                if (nklVar != null) {
                    nklVar.f((String) this.b);
                    return;
                } else {
                    nsf.e();
                    return;
                }
            case 10:
                Map map4 = ((nrs) this.c).e;
                synchronized (map4) {
                    nklVar2 = (nkl) map4.get(this.a);
                }
                if (nklVar2 != null) {
                    nklVar2.f((String) this.b);
                    return;
                } else {
                    nsf.e();
                    return;
                }
            case 11:
                num numVar = (num) this.a;
                if (TextUtils.isEmpty(numVar.b())) {
                    onzVarB = osk.r(null);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("google.message_id", numVar.b());
                    Integer numA = numVar.a();
                    if (numA != null) {
                        bundle.putInt("google.product_id", numA.intValue());
                    }
                    Object obj8 = this.c;
                    bundle.putBoolean("supports_message_handled", true);
                    onzVarB = nux.a((Context) obj8).b(2, bundle);
                }
                onzVarB.l(new fba(4), new nmn(this.b, i));
                return;
            case 12:
                ybo yboVar = (ybo) this.a;
                if (yboVar.b > 0) {
                    Object obj9 = this.c;
                    Object obj10 = yboVar.c;
                    ((nzo) obj9).d(obj10 != null ? ((Bundle) obj10).getBundle((String) this.b) : null);
                }
                if (yboVar.b >= 2) {
                    ((nzo) this.c).i();
                }
                if (yboVar.b >= 3) {
                    ((nzo) this.c).h();
                }
                if (yboVar.b >= 4) {
                    ((nzo) this.c).j();
                    return;
                }
                return;
            case 13:
                SystemTrayActivity.m140$r8$lambda$O3tsmccU_Ja7_sdQ2a4y2a6Cew((SystemTrayActivity) this.b, (Context) this.c, (Intent) this.a);
                return;
            case 14:
                ?? r0 = this.b;
                Object obj11 = this.c;
                Object obj12 = this.a;
                int i3 = 10;
                try {
                    ((PowerManager.WakeLock) obj11).acquire(300000L);
                    r0.run();
                    try {
                        ((PowerManager.WakeLock) obj11).release();
                    } catch (RuntimeException e) {
                        ((tvk) ((tvk) ((tvk) GnpExecutorApiService.a.g()).i(e)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiService", "processNextTask", 'e', "GnpExecutorApiService.java")).s("WakeLock releasing failed, probably due to timeout passing.");
                    }
                    sjl.e(new pqi(obj12, i3));
                    return;
                } catch (Throwable th) {
                    try {
                        ((PowerManager.WakeLock) obj11).release();
                    } catch (RuntimeException e2) {
                        ((tvk) ((tvk) ((tvk) GnpExecutorApiService.a.g()).i(e2)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiService", "processNextTask", 'e', "GnpExecutorApiService.java")).s("WakeLock releasing failed, probably due to timeout passing.");
                    }
                    sjl.e(new pqi(obj12, i3));
                    throw th;
                }
            case 15:
                ((AccountParticleDisc) this.c).h.a(this.b, (ImageView) this.a);
                return;
            case 16:
                Object obj13 = this.c;
                qtx qtxVar = (qtx) this.a;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(qtxVar.a((Bitmap) obj13));
                Map map5 = qty.a;
                Object obj14 = this.b;
                map5.put(obj14, bitmapDrawable);
                qty.b.remove(obj14);
                qtxVar.e(bitmapDrawable, true);
                return;
            case 17:
                ?? r02 = this.b;
                qxr qxrVar = (qxr) r02;
                xzg xzgVar = qxrVar.b().b.d;
                View view = (View) this.c;
                Context context = view.getContext();
                context.getClass();
                xzgVar.d(context);
                ykr.q(dvb.d(r02), null, 0, new qxg(qxrVar, (FrameLayout) this.a, view, (yih) null, 3, (byte[]) null), 3);
                qyn qynVar2 = qxrVar.i;
                if (qynVar2 == null) {
                    yks.c("appStateDataInterface");
                } else {
                    qynVar = qynVar2;
                }
                tst tstVar = qynVar.i;
                return;
            case 18:
                sjl.c();
                ((dvs) ((rdh) this.b).a.b).d(this.c, this.a);
                return;
            case 19:
                ((rdu) this.a).f.d(this.c, new hs(this.b, 8));
                return;
            default:
                ((snf) ((riv) ((rzy) this.c).a.get()).h.get()).b(this.a, this.b);
                return;
        }
    }

    public /* synthetic */ lke(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ lke(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ lke(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ lke(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ lke(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public lke(nrs nrsVar, String str, String str2, int i) {
        this.d = i;
        this.c = nrsVar;
        this.a = str;
        this.b = str2;
    }

    public lke(ybo yboVar, nzo nzoVar, String str, int i) {
        this.d = i;
        this.c = nzoVar;
        this.b = str;
        this.a = yboVar;
    }
}
