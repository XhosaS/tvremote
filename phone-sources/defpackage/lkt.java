package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public lkt(Context context, idr idrVar, idr idrVar2, idr idrVar3, lie lieVar, yfo yfoVar) {
        this.b = context;
        this.c = idrVar;
        this.e = idrVar2;
        this.d = idrVar3;
        this.f = lieVar;
        this.a = yfoVar;
    }

    public static String c(ksn ksnVar, int i) {
        String str;
        String str2 = ksnVar.a;
        switch (i) {
            case 0:
                return null;
            case 1:
                str = krh.MY_TV_SHOWS_TIMESTAMP_PREFIX;
                break;
            case 2:
                str = krh.MY_WISHLIST_TIMESTAMP_PREFIX;
                break;
            case 3:
                str = krh.RECOMMENDATIONS_AND_OFFERS_TIMESTAMP_PREFIX;
                break;
            case 4:
                str = krh.DISCOUNTS_AND_PROMOTIONS_TIMESTAMP_PREFIX;
                break;
            case 5:
                str = krh.GENERAL_ANNOUNCEMENTS_TIMESTAMP_PREFIX;
                break;
            case 6:
                str = krh.WATCH_REMINDERS_TIMESTAMP_PREFIX;
                break;
            case 7:
                str = krh.NEWLY_AVAILABLE_CONTENT_ON_SERVICE_TIMESTAMP_PREFIX;
                break;
            case 8:
                str = krh.WATCHLIST_PRICE_DROP_TIMESTAMP_PREFIX;
                break;
            case 9:
                str = krh.WATCHLIST_FREE_CONTENT_TIMESTAMP_PREFIX;
                break;
            default:
                str = krh.WATCHLIST_CONTENT_AVAILABLE_TIMESTAMP_PREFIX;
                break;
        }
        return str.concat(str2);
    }

    public static final String h(ksn ksnVar, int i) {
        String str;
        String str2 = ksnVar.a;
        switch (i) {
            case 1:
                str = krh.MY_TV_SHOWS_PREFIX;
                break;
            case 2:
                str = krh.MY_WISHLIST_PREFIX;
                break;
            case 3:
                str = krh.RECOMMENDATIONS_AND_OFFERS_PREFIX;
                break;
            case 4:
                str = krh.DISCOUNTS_AND_PROMOTIONS_PREFIX;
                break;
            case 5:
                str = krh.GENERAL_ANNOUNCEMENTS_PREFIX;
                break;
            case 6:
                str = krh.WATCH_REMINDERS_PREFIX;
                break;
            case 7:
                str = krh.NEWLY_AVAILABLE_CONTENT_ON_SERVICE_PREFIX;
                break;
            case 8:
                str = krh.WATCHLIST_PRICE_DROP_PREFIX;
                break;
            case 9:
                str = krh.WATCHLIST_FREE_CONTENT_PREFIX;
                break;
            case 10:
                str = krh.WATCHLIST_CONTENT_AVAILABLE_PREFIX;
                break;
            default:
                return null;
        }
        return str.concat(str2);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.lang.Runnable] */
    public final lks a(lkr lkrVar, llw llwVar, ksy ksyVar, String str, String str2, boolean z, ieg iegVar, lnu lnuVar, idy idyVar, boolean z2, idr idrVar, kwx kwxVar, tst tstVar, boolean z3) {
        ?? r2 = this.a;
        String str3 = ksyVar.b;
        lva lvaVar = new lva(iegVar, str3, str2, r2);
        jzs jzsVar = new jzs(iegVar, str3, str2, (SharedPreferences) r2);
        kdh kdhVar = new kdh(jzsVar);
        kdj kdjVar = (kdj) this.e;
        Object objB = kdjVar.b.b();
        Object objB2 = kdjVar.a.b();
        Object objB3 = kdjVar.c.b();
        lnuVar.getClass();
        ksyVar.getClass();
        iegVar.getClass();
        llwVar.getClass();
        lkv lkvVar = new lkv((lkt) objB, (lkn) objB2, (moz) objB3, lnuVar, ksyVar, str3, str2 != null, z, iegVar, llwVar, lvaVar, z3);
        krl krlVar = new krl(false);
        isy isyVar = (isy) this.f;
        isy isyVar2 = (isy) isyVar.d.b();
        isyVar2.getClass();
        ldv ldvVar = (ldv) isyVar.b.b();
        ldvVar.getClass();
        Object objB4 = isyVar.c.b();
        Object objB5 = isyVar.a.b();
        llwVar.getClass();
        iegVar.getClass();
        lnuVar.getClass();
        idyVar.getClass();
        idrVar.getClass();
        return new lku(lkrVar, this.b, llwVar, (lld) this.c, ksyVar, str, str2, z, lnuVar, kwxVar, jzsVar, krlVar, lkvVar, new lla(isyVar2, ldvVar, (lkq) objB4, (lhr) objB5, llwVar, str3, str2, str, z, iegVar, lnuVar, idyVar, z2, idrVar, krlVar, this.d, lvaVar, jzsVar, kdhVar, tstVar, z3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, lie] */
    public final lid b(String str, ieg iegVar, ieg iegVar2) {
        this.c.c(str);
        this.e.c(iegVar);
        this.d.c(iegVar2);
        return this.f.a((Context) this.b, ((Integer) ((kqp) this.a).b().a()).intValue(), str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void d(ksn ksnVar, int i, long j) {
        String strC = c(ksnVar, i);
        if (strC != null) {
            this.e.edit().putLong(strC, j).apply();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void e(ksn ksnVar, int i, boolean z) {
        String strH = h(ksnVar, i);
        if (strH != null) {
            this.e.edit().putBoolean(strH, z).apply();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void f(ksn ksnVar) {
        this.e.edit().putLong(krh.NOTIFICATION_SETTINGS_TIMESTAMP_PREFIX.concat(ksnVar.a), System.currentTimeMillis()).apply();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean g(ksn ksnVar, int i) {
        String strH = h(ksnVar, i);
        if (strH != null) {
            if (this.e.getBoolean(strH, i != 4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yfo] */
    public final lnr i(lnn... lnnVarArr) {
        lfn lfnVar = (lfn) this.d.b();
        lfnVar.getClass();
        Context contextA = ((rgq) this.e).a();
        mem memVar = (mem) this.c.b();
        memVar.getClass();
        mes mesVarA = ((kpw) this.b).b();
        lnk lnkVar = (lnk) this.f.b();
        lnkVar.getClass();
        lny lnyVar = (lny) this.a.b();
        lnyVar.getClass();
        lnnVarArr.getClass();
        return new lnr(lfnVar, contextA, memVar, mesVarA, lnkVar, lnyVar, lnnVarArr);
    }

    public lkt(View view, String str, gju gjuVar, WindowId windowId, gke gkeVar, Animator animator) {
        this.b = view;
        this.a = str;
        this.c = gkeVar;
        this.d = windowId;
        this.f = gjuVar;
        this.e = animator;
    }

    public lkt(lqs lqsVar, lfz lfzVar, idf idfVar, Executor executor, kwy kwyVar, mem memVar) {
        this.d = lqsVar;
        this.b = lfzVar;
        this.e = idfVar;
        this.a = executor;
        this.f = kwyVar;
        this.c = memVar;
    }

    public lkt(SharedPreferences sharedPreferences, lie lieVar, lld lldVar, lgr lgrVar, kdj kdjVar, isy isyVar) {
        this.a = sharedPreferences;
        this.b = lieVar;
        this.c = lldVar;
        lgrVar.getClass();
        this.d = new ljl(lgrVar, 4, null);
        this.e = kdjVar;
        this.f = isyVar;
    }

    public lkt(hpd hpdVar, hpd hpdVar2, hpd hpdVar3, moz mozVar, moz mozVar2) {
        this.e = hww.a(150, new hnh(this, 0));
        this.c = hpdVar;
        this.a = hpdVar2;
        this.f = hpdVar3;
        this.b = mozVar;
        this.d = mozVar2;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6) {
        yfoVar.getClass();
        this.f = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.d = yfoVar3;
        yfoVar4.getClass();
        this.e = yfoVar4;
        yfoVar5.getClass();
        this.a = yfoVar5;
        yfoVar6.getClass();
        this.c = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, byte[] bArr, char[] cArr, byte[] bArr2) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
        yfoVar5.getClass();
        this.f = yfoVar5;
        yfoVar6.getClass();
        this.c = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.f = yfoVar5;
        yfoVar6.getClass();
        this.c = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, short[] sArr, byte[] bArr) {
        yfoVar.getClass();
        this.e = yfoVar;
        yfoVar2.getClass();
        this.f = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.b = yfoVar5;
        yfoVar6.getClass();
        this.a = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.e = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.b = yfoVar4;
        yfoVar5.getClass();
        this.f = yfoVar5;
        yfoVar6.getClass();
        this.a = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, byte[] bArr, byte[] bArr2, char[] cArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.f = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.c = yfoVar4;
        yfoVar5.getClass();
        this.d = yfoVar5;
        yfoVar6.getClass();
        this.a = yfoVar6;
    }

    public lkt(SharedPreferences sharedPreferences, ltp ltpVar, ltp ltpVar2, Executor executor) {
        this.c = new ArrayList();
        this.f = new ljl(this, 9, null);
        this.e = sharedPreferences;
        this.b = ltpVar;
        this.d = ltpVar2;
        this.a = executor;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.f = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
        yfoVar5.getClass();
        this.c = yfoVar5;
        yfoVar6.getClass();
        this.e = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, char[] cArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.f = yfoVar4;
        yfoVar5.getClass();
        this.d = yfoVar5;
        yfoVar6.getClass();
        this.a = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.f = yfoVar4;
        yfoVar5.getClass();
        this.b = yfoVar5;
        yfoVar6.getClass();
        this.e = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, short[] sArr) {
        this.d = yfoVar;
        yfoVar2.getClass();
        this.f = yfoVar2;
        yfoVar3.getClass();
        this.a = yfoVar3;
        yfoVar4.getClass();
        this.e = yfoVar4;
        yfoVar5.getClass();
        this.b = yfoVar5;
        yfoVar6.getClass();
        this.c = yfoVar6;
    }

    public lkt(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, byte[] bArr) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.e = yfoVar2;
        yfoVar3.getClass();
        this.a = yfoVar3;
        yfoVar4.getClass();
        this.c = yfoVar4;
        yfoVar5.getClass();
        this.b = yfoVar5;
        yfoVar6.getClass();
        this.f = yfoVar6;
    }
}
