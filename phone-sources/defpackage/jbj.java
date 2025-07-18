package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.android.apps.play.movies.common.presenter.activity.TrailerLauncherActivity;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jbj implements idy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jbj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r0v8, types: [idy, java.lang.Object] */
    @Override // defpackage.idy
    public final void c(Object obj) {
        kvx kvxVar = null;
        switch (this.b) {
            case 0:
                obj.getClass();
                this.a.a(obj);
                return;
            case 1:
                obj.getClass();
                this.a.a(obj);
                return;
            case 2:
                obj.getClass();
                this.a.a(obj);
                return;
            case 3:
                GtvHomePageActivity.$r8$lambda$BjySdHRcJT9lHQd3gpOUHW2P3ys(this.a, obj);
                return;
            case 4:
                this.a.p((ksn) obj);
                return;
            case 5:
                ((Handler) this.a).obtainMessage(0, obj).sendToTarget();
                return;
            case 6:
                ((ieg) obj).o(this.a);
                return;
            case 7:
                ieg iegVarF = ieg.f(obj);
                krx krxVar = (krx) this.a;
                krxVar.b = iegVarF;
                krxVar.a();
                return;
            case 8:
                ieg iegVarF2 = ieg.f(obj);
                krx krxVar2 = (krx) this.a;
                krxVar2.c = iegVarF2;
                krxVar2.a();
                return;
            case 9:
                ieg iegVarF3 = ieg.f(obj);
                krx krxVar3 = (krx) this.a;
                krxVar3.a = iegVarF3;
                krxVar3.a();
                return;
            case 10:
                ((TrailerLauncherActivity) this.a).a.p((ksn) obj);
                return;
            case 11:
                UnmodifiableIterator it = ((lts) obj).a.entrySet().iterator();
                while (true) {
                    Object obj2 = this.a;
                    if (!it.hasNext()) {
                        if (kvxVar == null) {
                            ((tug) ((tug) ljw.a.g()).j("com/google/android/apps/play/movies/common/service/pinning/PinningTask", "accept", 282, "PinningTask.java")).v("Failed to get watch event for: %s", ((ljw) obj2).b.b);
                            return;
                        }
                        ljw ljwVar = (ljw) obj2;
                        kuh kuhVar = ljwVar.b;
                        String[] strArr = {kuhVar.a.a, kuhVar.b, Long.toString(kvxVar.b())};
                        SQLiteDatabase sQLiteDatabaseA = ljwVar.h.a();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("last_playback_start_timestamp", Long.valueOf(vxf.b((vwe) kvxVar.b.e(vxf.b))));
                            contentValues.put("last_watched_timestamp", Long.valueOf(kvxVar.b()));
                            contentValues.put("resume_timestamp", Long.valueOf(kvxVar.a()));
                            contentValues.put("last_playback_is_dirty", (Boolean) false);
                            boolean z = sQLiteDatabaseA.update("purchased_assets", contentValues, "account = ? AND asset_type IN (6,20) AND asset_id = ? AND ? > last_watched_timestamp", strArr) > 0;
                            return;
                        } finally {
                            ljwVar.h.f(sQLiteDatabaseA, false, 11);
                        }
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((ksy) entry.getKey()).b.equals(((ljw) obj2).b.b)) {
                        kvxVar = (kvx) entry.getValue();
                    }
                }
            case 12:
                lki lkiVar = (lki) obj;
                ieg iegVar = lkiVar.a;
                boolean zK = iegVar.k();
                Object obj3 = this.a;
                if (zK) {
                    ((lkm) obj3).E.e(2, lkiVar.a.i());
                    return;
                }
                ieg iegVar2 = lkiVar.b;
                if (iegVar2.k()) {
                    ((lkm) obj3).E.e(2, lkiVar.b.i());
                    return;
                }
                Cursor cursor = (Cursor) iegVar.g();
                kst kstVar = (kst) iegVar2.g();
                try {
                    if (!cursor.moveToFirst()) {
                        ((lkm) obj3).E.d(2, new llt(1, -1, null, false, false, trk.a));
                        return;
                    }
                    if (((lkm) obj3).h(kstVar)) {
                        ((lkm) obj3).e(cursor, kstVar);
                        int i = cursor.getInt(0);
                        if (i != 2) {
                            if (i == 6) {
                                ((lkm) obj3).E.d(2, new llt(4, -1, null, false, false, trk.a));
                            } else {
                                ((lkm) obj3).E.d(2, new llt(5, -1, null, false, false, trk.a));
                            }
                        }
                        return;
                    }
                    return;
                } finally {
                    cursor.close();
                }
            case 13:
                ieg iegVar3 = (ieg) obj;
                boolean zM = iegVar3.m();
                Object obj4 = this.a;
                if (!zM) {
                    ((lkm) obj4).f.d(2, false);
                    return;
                }
                lkm lkmVar = (lkm) obj4;
                lkmVar.f.c(2);
                ImmutableMap immutableMap = ((lts) iegVar3.g()).a;
                ksy ksyVar = lkmVar.h;
                if (immutableMap.containsKey(ksyVar)) {
                    lkmVar.b((kvx) ((lts) iegVar3.g()).a.get(ksyVar));
                    return;
                }
                return;
            case 14:
                ((lli) this.a).b((ImmutableList) obj);
                return;
            case 15:
                ieg iegVar4 = (ieg) obj;
                boolean zM2 = iegVar4.m();
                Object obj5 = this.a;
                if (!zM2) {
                    ((llm) obj5).e.d(2, false);
                    return;
                }
                llm llmVar = (llm) obj5;
                llmVar.e.c(2);
                ImmutableMap immutableMap2 = ((lts) iegVar4.g()).a;
                ksy ksyVar2 = llmVar.h;
                if (immutableMap2.containsKey(ksyVar2)) {
                    llmVar.c((kvx) ((lts) iegVar4.g()).a.get(ksyVar2));
                    return;
                }
                return;
            case 16:
                ieg iegVar5 = (ieg) obj;
                if (iegVar5.m()) {
                    ((llm) this.a).s = ((lrw) iegVar5.g()).a;
                    return;
                }
                return;
            case 17:
                ieg iegVar6 = (ieg) obj;
                boolean zK2 = iegVar6.k();
                Object obj6 = this.a;
                if (zK2) {
                    ((llm) obj6).y.e(2, iegVar6.i());
                    return;
                }
                kst kstVar2 = (kst) iegVar6.g();
                if (!(kstVar2 instanceof kwf)) {
                    krd.c("Unexpected unrated asset type: ".concat(kstVar2.toString()));
                    ((llm) obj6).y.d(2, new llt(0, -1, null, false, false, trk.a));
                    return;
                }
                llm llmVar2 = (llm) obj6;
                if (llmVar2.g) {
                    llmVar2.v.p();
                } else {
                    llmVar2.v.o();
                }
                llmVar2.b((kst) iegVar6.g());
                return;
            case 18:
                ieg iegVar7 = (ieg) obj;
                boolean zK3 = iegVar7.k();
                Object obj7 = this.a;
                if (zK3) {
                    ((llm) obj7).y.e(2, iegVar7.i());
                    return;
                }
                llm llmVar3 = (llm) obj7;
                krd.b("Getting mpd of ".concat(llmVar3.c));
                String strC = llmVar3.f.c();
                Locale localeForLanguageTag = TextUtils.isEmpty(strC) ? null : Locale.forLanguageTag(strC);
                nag nagVar = new nag(null, null, null, null);
                nagVar.n(llmVar3.b);
                nagVar.o(llmVar3.h);
                nagVar.a = tst.h(localeForLanguageTag);
                nagVar.p(lgm.a());
                lry lryVarM = nagVar.m();
                synchronized (obj7) {
                    if (((llm) obj7).j) {
                        return;
                    }
                    if (!((llm) obj7).f.j()) {
                        String str = ((llm) obj7).c;
                        krd.b(a.cr(str, "Getting video userdata for "));
                        ((llm) obj7).e.e(2);
                        mjo.e(((llm) obj7).i.a(new jbj(obj7, 15)), new iei(((llm) obj7).x, ltr.a((ksn) ((llm) obj7).b.g(), str)), ((llm) obj7).d);
                    }
                    mfe mfeVar = ((llm) obj7).i;
                    ((llm) obj7).a.execute(new lik(obj7, mfeVar.b(new jbj(obj7, 17)), 9, 0 == true ? 1 : 0));
                    int i2 = 3;
                    ((llm) obj7).e.e(3);
                    idy idyVarA = mfeVar.a(new krn(obj7, lryVarM.a.b, i2));
                    idy idyVarA2 = mfeVar.a(new jbj(obj7, 16));
                    Executor executor = ((llm) obj7).d;
                    executor.execute(new lke(obj7, lryVarM, idyVarA, i2));
                    executor.execute(new lke(obj7, lryVarM, idyVarA2, 4));
                    return;
                }
            case 19:
                vtw vtwVar = (vtw) obj;
                wja wjaVar = ((wjm) vtwVar.b).d;
                if (wjaVar == null) {
                    wjaVar = wja.a;
                }
                Object obj8 = this.a;
                vtw vtwVar2 = (vtw) wjaVar.a(5, null);
                vtwVar2.x(wjaVar);
                lnp lnpVar = (lnp) obj8;
                wja wjaVarI = lnu.i(vtwVar2, lnpVar.a, lnpVar.b, lnpVar.c, lnpVar.d);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                wjm wjmVar = (wjm) vtwVar.b;
                wjaVarI.getClass();
                wjmVar.d = wjaVarI;
                wjmVar.b |= 2;
                return;
            default:
                vtw vtwVar3 = (vtw) obj;
                wja wjaVar2 = ((wjm) vtwVar3.b).d;
                if (wjaVar2 == null) {
                    wjaVar2 = wja.a;
                }
                Object obj9 = this.a;
                vtw vtwVar4 = (vtw) wjaVar2.a(5, null);
                vtwVar4.x(wjaVar2);
                lnp lnpVar2 = (lnp) obj9;
                wja wjaVarI2 = lnu.i(vtwVar4, lnpVar2.a, lnpVar2.b, lnpVar2.c, lnpVar2.d);
                if (!vtwVar3.b.A()) {
                    vtwVar3.u();
                }
                wjm wjmVar2 = (wjm) vtwVar3.b;
                wjaVarI2.getClass();
                wjmVar2.d = wjaVarI2;
                wjmVar2.b |= 2;
                return;
        }
    }
}
