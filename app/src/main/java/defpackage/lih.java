package defpackage;

import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import j$.nio.channels.DesugarChannels;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lih implements lco {
    private static volatile lih x;
    private boolean A;
    private FileLock B;
    private FileChannel C;
    private final Map E;
    private final Map F;
    private final Map G;
    private lez H;
    private String I;
    private kuj J;
    public final lbb a;
    public final lag b;
    public kug c;
    public lai d;
    public lho e;
    public ktr f;
    public final lik g;
    public leu h;
    public lgr i;
    public lar k;
    public final lbk l;
    long n;
    public List o;
    public int q;
    public int r;
    public boolean s;
    public List t;
    public List u;
    public long w;
    private boolean y;
    private boolean z;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final Deque p = new LinkedList();
    public final Map v = new HashMap();
    private final lin K = new lid(this);
    private long D = -1;
    public final lhv j = new lhv(this);

    public lih(lii liiVar) {
        this.l = lbk.i(liiVar.a, null, null);
        lik likVar = new lik(this);
        likVar.ah();
        this.g = likVar;
        lag lagVar = new lag(this);
        lagVar.ah();
        this.b = lagVar;
        lbb lbbVar = new lbb(this);
        lbbVar.ah();
        this.a = lbbVar;
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new HashMap();
        aC().h(new lhx(this));
    }

    public static void P(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private final int aj(String str, ktz ktzVar) {
        lcs lcsVar;
        lcq lcqVarC;
        lbb lbbVar = this.a;
        if (lbbVar.d(str) == null) {
            ktzVar.a.put((EnumMap) lcs.AD_PERSONALIZATION, (lcs) kty.FAILSAFE);
            return 1;
        }
        kug kugVar = this.c;
        ai(kugVar);
        ksx ksxVarH = kugVar.h(str);
        if (ksxVarH != null && ksu.a(ksxVarH.A()).a == lcq.POLICY && (lcqVarC = lbbVar.c(str, (lcsVar = lcs.AD_PERSONALIZATION))) != lcq.UNINITIALIZED) {
            ktzVar.a.put((EnumMap) lcsVar, (lcs) kty.REMOTE_ENFORCED_DEFAULT);
            return lcqVarC == lcq.GRANTED ? 0 : 1;
        }
        EnumMap enumMap = ktzVar.a;
        lcs lcsVar2 = lcs.AD_PERSONALIZATION;
        enumMap.put((EnumMap) lcsVar2, (lcs) kty.REMOTE_DEFAULT);
        return lbbVar.l(str, lcsVar2) ? 0 : 1;
    }

    private final kuj ak() {
        if (this.J == null) {
            this.J = new lia(this, this.l);
        }
        return this.J;
    }

    private final Boolean al(ksx ksxVar) {
        try {
            if (ksxVar.c() != -2147483648L) {
                if (ksxVar.c() == kmb.a.a(this.l.a).b(ksxVar.t(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = kmb.a.a(this.l.a).b(ksxVar.t(), 0).versionName;
                String strW = ksxVar.w();
                if (strW != null && strW.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final Boolean am(AppMetadata appMetadata) {
        Boolean bool = appMetadata.p;
        String str = appMetadata.C;
        if (!TextUtils.isEmpty(str)) {
            lcq lcqVar = ksu.a(str).a;
            lcq lcqVar2 = lcq.UNINITIALIZED;
            int iOrdinal = lcqVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal == 3) {
                return false;
            }
        }
        return bool;
    }

    private static String an(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final Map ao(lkw lkwVar) {
        Object objR;
        HashMap map = new HashMap();
        lik likVar = this.g;
        ai(likVar);
        HashMap map2 = new HashMap();
        for (lla llaVar : lkwVar.c) {
            if (llaVar.c.startsWith("gad_") && (objR = likVar.r(llaVar)) != null) {
                map2.put(llaVar.c, objR);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final void ap(lld lldVar) {
        if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lldVar.y();
        }
        lle lleVar = (lle) lldVar.b;
        lle lleVar2 = lle.a;
        lleVar.b |= 4;
        lleVar.h = Long.MAX_VALUE;
        if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lldVar.y();
        }
        lle lleVar3 = (lle) lldVar.b;
        lleVar3.b |= 8;
        lleVar3.i = Long.MIN_VALUE;
        for (int i = 0; i < ((lle) lldVar.b).e.size(); i++) {
            lkw lkwVarA = lldVar.a(i);
            long j = lkwVarA.e;
            if (j < ((lle) lldVar.b).h) {
                if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lldVar.y();
                }
                lle lleVar4 = (lle) lldVar.b;
                lleVar4.b |= 4;
                lleVar4.h = j;
            }
            long j2 = lkwVarA.e;
            if (j2 > ((lle) lldVar.b).i) {
                if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    lldVar.y();
                }
                lle lleVar5 = (lle) lldVar.b;
                lleVar5.b |= 8;
                lleVar5.i = j2;
            }
        }
    }

    private final void aq(lld lldVar, long j, boolean z) {
        lim limVar;
        kug kugVar = this.c;
        ai(kugVar);
        String str = ((lle) lldVar.b).r;
        String str2 = true != z ? "_lte" : "_se";
        lim limVarO = kugVar.o(str, str2);
        if (limVarO != null) {
            String str3 = ((lle) lldVar.b).r;
            kkk.k(this.l);
            limVar = new lim(str3, "auto", str2, System.currentTimeMillis(), Long.valueOf(((Long) limVarO.e).longValue() + j));
        } else {
            String str4 = ((lle) lldVar.b).r;
            kkk.k(this.l);
            limVar = new lim(str4, "auto", str2, System.currentTimeMillis(), Long.valueOf(j));
        }
        llu lluVar = llu.a;
        llt lltVar = new llt();
        if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lltVar.y();
        }
        llu lluVar2 = (llu) lltVar.b;
        lluVar2.b |= 2;
        lluVar2.d = str2;
        kkk.k(this.l);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lltVar.y();
        }
        llu lluVar3 = (llu) lltVar.b;
        lluVar3.b |= 1;
        lluVar3.c = jCurrentTimeMillis;
        Object obj = limVar.e;
        long jLongValue = ((Long) obj).longValue();
        if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lltVar.y();
        }
        llu lluVar4 = (llu) lltVar.b;
        lluVar4.b |= 8;
        lluVar4.f = jLongValue;
        llu lluVar5 = (llu) lltVar.v();
        int iA = lik.a(lldVar, str2);
        if (iA >= 0) {
            if ((Integer.MIN_VALUE & lldVar.b.memoizedSerializedSize) == 0) {
                lldVar.y();
            }
            lle lleVar = (lle) lldVar.b;
            lluVar5.getClass();
            abxs abxsVar = lleVar.f;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                lleVar.f = abxsVar.d(size + size);
            }
            lleVar.f.set(iA, lluVar5);
        } else {
            lldVar.e(lluVar5);
        }
        if (j > 0) {
            kug kugVar2 = this.c;
            ai(kugVar2);
            kugVar2.R(limVar);
            aB().k.c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ar(defpackage.lld r42, defpackage.lie r43) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.ar(lld, lie):void");
    }

    private final boolean as(AppMetadata appMetadata) {
        return !TextUtils.isEmpty(appMetadata.b);
    }

    private final boolean at() {
        aC().g();
        v();
        kug kugVar = this.c;
        ai(kugVar);
        if (kugVar.c("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        kug kugVar2 = this.c;
        ai(kugVar2);
        return !TextUtils.isEmpty(kugVar2.q());
    }

    private final boolean au(String str, String str2) {
        kug kugVar = this.c;
        ai(kugVar);
        kun kunVarL = kugVar.l("events", str, str2);
        return kunVarL == null || kunVarL.c < 1;
    }

    private final boolean av(lkv lkvVar, lkv lkvVar2) {
        kkk.a("_e".equals(((lkw) lkvVar.b).d));
        lik likVar = this.g;
        ai(likVar);
        lla llaVarN = likVar.n((lkw) lkvVar.v(), "_sc");
        String str = llaVarN == null ? null : llaVarN.d;
        ai(likVar);
        lla llaVarN2 = likVar.n((lkw) lkvVar2.v(), "_pc");
        String str2 = llaVarN2 != null ? llaVarN2.d : null;
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        kkk.a("_e".equals(((lkw) lkvVar.b).d));
        ai(likVar);
        lla llaVarN3 = likVar.n((lkw) lkvVar.v(), "_et");
        if (llaVarN3 == null || (llaVarN3.b & 4) == 0) {
            return true;
        }
        long j = llaVarN3.e;
        if (j <= 0) {
            return true;
        }
        ai(likVar);
        lla llaVarN4 = likVar.n((lkw) lkvVar2.v(), "_et");
        if (llaVarN4 != null) {
            long j2 = llaVarN4.e;
            if (j2 > 0) {
                j += j2;
            }
        }
        ai(likVar);
        likVar.y(lkvVar2, "_et", Long.valueOf(j));
        ai(likVar);
        likVar.y(lkvVar, "_fr", 1L);
        return true;
    }

    public static lih o(Context context) {
        kkk.k(context.getApplicationContext());
        if (x == null) {
            synchronized (lih.class) {
                if (x == null) {
                    x = new lih(new lii(context));
                }
            }
        }
        return x;
    }

    final void A(AppMetadata appMetadata, long j) {
        kug kugVar = this.c;
        ai(kugVar);
        String str = appMetadata.a;
        kkk.k(str);
        ksx ksxVarH = kugVar.h(str);
        if (ksxVarH != null && p().ap(appMetadata.b, ksxVarH.y())) {
            aB().f.b("New GMP App Id passed in. Removing cached database data. appId", lab.b(ksxVarH.t()));
            kug kugVar2 = this.c;
            ai(kugVar2);
            String strT = ksxVarH.t();
            kugVar2.ag();
            kugVar2.g();
            kkk.h(strT);
            try {
                SQLiteDatabase sQLiteDatabaseE = kugVar2.e();
                String[] strArr = {strT};
                int iDelete = sQLiteDatabaseE.delete("events", "app_id=?", strArr) + sQLiteDatabaseE.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseE.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseE.delete("apps", "app_id=?", strArr) + sQLiteDatabaseE.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseE.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseE.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseE.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseE.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseE.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseE.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseE.delete("trigger_uris", "app_id=?", strArr);
                aetv.a.eV();
                lbk lbkVar = kugVar2.y;
                if (lbkVar.d.t(null, kzg.bi)) {
                    iDelete += sQLiteDatabaseE.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.k.c("Deleted application data. app, records", strT, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e) {
                lbk lbkVar2 = kugVar2.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.c("Error deleting application data. appId, error", lab.b(strT), e);
            }
            ksxVarH = null;
        }
        if (ksxVarH != null) {
            boolean z = (ksxVarH.c() == -2147483648L || ksxVarH.c() == appMetadata.j) ? false : true;
            String strW = ksxVarH.w();
            if (z || ((ksxVarH.c() != -2147483648L || strW == null || strW.equals(appMetadata.c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strW);
                EventParcel eventParcel = new EventParcel("_au", new EventParams(bundle), "auto", j);
                if (j().t(null, kzg.bd)) {
                    G(eventParcel, appMetadata);
                } else {
                    E(eventParcel, appMetadata);
                }
            }
        }
    }

    final void B(ksx ksxVar, lld lldVar) {
        ktz ktzVar;
        llu lluVar;
        int i;
        kty ktyVar;
        aC().g();
        v();
        String str = ((lle) lldVar.b).U;
        EnumMap enumMap = new EnumMap(lcs.class);
        int i2 = 0;
        if (str.length() < lcs.values().length || str.charAt(0) != '1') {
            ktzVar = new ktz();
        } else {
            lcs[] lcsVarArrValues = lcs.values();
            int length = lcsVarArrValues.length;
            int i3 = 0;
            int i4 = 1;
            while (i3 < length) {
                lcs lcsVar = lcsVarArrValues[i3];
                int i5 = i4 + 1;
                char cCharAt = str.charAt(i4);
                kty[] ktyVarArrValues = kty.values();
                int length2 = ktyVarArrValues.length;
                int i6 = i2;
                while (true) {
                    if (i6 >= length2) {
                        ktyVar = kty.UNSET;
                        break;
                    }
                    ktyVar = ktyVarArrValues[i6];
                    if (ktyVar.k == cCharAt) {
                        break;
                    } else {
                        i6++;
                    }
                }
                enumMap.put((EnumMap) lcsVar, (lcs) ktyVar);
                i3++;
                i4 = i5;
                i2 = 0;
            }
            ktzVar = new ktz(enumMap);
        }
        String strT = ksxVar.t();
        aC().g();
        v();
        lct lctVarN = n(strT);
        lcq lcqVar = lcq.UNINITIALIZED;
        int iOrdinal = lctVarN.c().ordinal();
        if (iOrdinal == 1) {
            ktzVar.a.put((EnumMap) lcs.AD_STORAGE, (lcs) kty.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            ktzVar.a(lcs.AD_STORAGE, lctVarN.c);
        } else {
            ktzVar.a.put((EnumMap) lcs.AD_STORAGE, (lcs) kty.FAILSAFE);
        }
        int iOrdinal2 = lctVarN.d().ordinal();
        if (iOrdinal2 == 1) {
            ktzVar.a.put((EnumMap) lcs.ANALYTICS_STORAGE, (lcs) kty.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            ktzVar.a(lcs.ANALYTICS_STORAGE, lctVarN.c);
        } else {
            ktzVar.a.put((EnumMap) lcs.ANALYTICS_STORAGE, (lcs) kty.FAILSAFE);
        }
        String strT2 = ksxVar.t();
        aC().g();
        v();
        kuk kukVarK = k(strT2, l(strT2), n(strT2), ktzVar);
        Boolean bool = kukVarK.d;
        kkk.k(bool);
        boolean zBooleanValue = bool.booleanValue();
        if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lldVar.y();
        }
        lle lleVar = (lle) lldVar.b;
        lleVar.c |= 262144;
        lleVar.V = zBooleanValue;
        String str2 = kukVarK.e;
        if (!TextUtils.isEmpty(str2)) {
            if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lldVar.y();
            }
            lle lleVar2 = (lle) lldVar.b;
            str2.getClass();
            lleVar2.c |= 524288;
            lleVar2.W = str2;
        }
        aC().g();
        v();
        Iterator it = DesugarCollections.unmodifiableList(((lle) lldVar.b).f).iterator();
        while (true) {
            if (it.hasNext()) {
                lluVar = (llu) it.next();
                if ("_npa".equals(lluVar.d)) {
                    break;
                }
            } else {
                lluVar = null;
                break;
            }
        }
        if (lluVar != null) {
            EnumMap enumMap2 = ktzVar.a;
            lcs lcsVar2 = lcs.AD_PERSONALIZATION;
            kty ktyVar2 = (kty) enumMap2.get(lcsVar2);
            if (ktyVar2 == null) {
                ktyVar2 = kty.UNSET;
            }
            if (ktyVar2 == kty.UNSET) {
                kug kugVar = this.c;
                ai(kugVar);
                lim limVarO = kugVar.o(ksxVar.t(), "_npa");
                if (limVarO != null) {
                    String str3 = limVarO.b;
                    if ("tcf".equals(str3)) {
                        enumMap2.put((EnumMap) lcsVar2, (lcs) kty.TCF);
                    } else if ("app".equals(str3)) {
                        enumMap2.put((EnumMap) lcsVar2, (lcs) kty.API);
                    } else {
                        enumMap2.put((EnumMap) lcsVar2, (lcs) kty.MANIFEST);
                    }
                } else {
                    Boolean boolP = ksxVar.p();
                    if (boolP == null || ((boolP.booleanValue() && lluVar.f != 1) || !(boolP.booleanValue() || lluVar.f == 0))) {
                        enumMap2.put((EnumMap) lcsVar2, (lcs) kty.API);
                    } else {
                        enumMap2.put((EnumMap) lcsVar2, (lcs) kty.MANIFEST);
                    }
                }
            }
        } else {
            int iAj = aj(ksxVar.t(), ktzVar);
            llu lluVar2 = llu.a;
            llt lltVar = new llt();
            if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lltVar.y();
            }
            llu lluVar3 = (llu) lltVar.b;
            lluVar3.b |= 2;
            lluVar3.d = "_npa";
            kkk.k(this.l);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lltVar.y();
            }
            llu lluVar4 = (llu) lltVar.b;
            lluVar4.b |= 1;
            lluVar4.c = jCurrentTimeMillis;
            long j = iAj;
            if ((lltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lltVar.y();
            }
            llu lluVar5 = (llu) lltVar.b;
            lluVar5.b |= 8;
            lluVar5.f = j;
            lldVar.e((llu) lltVar.v());
            aB().k.c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iAj));
        }
        String string = ktzVar.toString();
        if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lldVar.y();
        }
        lle lleVar3 = (lle) lldVar.b;
        lleVar3.c |= 131072;
        lleVar3.U = string;
        boolean zM = this.a.m(ksxVar.t());
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lle) lldVar.b).e);
        for (int i7 = 0; i7 < listUnmodifiableList.size(); i7++) {
            if ("_tcf".equals(((lkw) listUnmodifiableList.get(i7)).d)) {
                lkw lkwVar = (lkw) listUnmodifiableList.get(i7);
                lkv lkvVar = new lkv();
                lkvVar.B(lkwVar);
                List listUnmodifiableList2 = DesugarCollections.unmodifiableList(((lkw) lkvVar.b).c);
                int i8 = 0;
                while (true) {
                    if (i8 >= listUnmodifiableList2.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((lla) listUnmodifiableList2.get(i8)).c)) {
                        String strValueOf = ((lla) listUnmodifiableList2.get(i8)).d;
                        if (zM && strValueOf.length() > 4) {
                            char[] charArray = strValueOf.toCharArray();
                            int i9 = 1;
                            while (true) {
                                if (i9 >= 64) {
                                    i = 0;
                                    break;
                                } else {
                                    if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9)) {
                                        i = i9;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
                            strValueOf = String.valueOf(charArray);
                        }
                        lkz lkzVar = new lkz();
                        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            lkzVar.y();
                        }
                        lla llaVar = (lla) lkzVar.b;
                        llaVar.b = 1 | llaVar.b;
                        llaVar.c = "_tcfd";
                        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            lkzVar.y();
                        }
                        lla llaVar2 = (lla) lkzVar.b;
                        strValueOf.getClass();
                        llaVar2.b = 2 | llaVar2.b;
                        llaVar2.d = strValueOf;
                        lkvVar.e(i8, lkzVar);
                    } else {
                        i8++;
                    }
                }
                lldVar.g(i7, lkvVar);
                return;
            }
        }
    }

    final void C(lkv lkvVar, int i, String str) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lkw) lkvVar.b).c);
        for (int i2 = 0; i2 < listUnmodifiableList.size(); i2++) {
            if ("_err".equals(((lla) listUnmodifiableList.get(i2)).c)) {
                return;
            }
        }
        lla llaVar = lla.a;
        lkz lkzVar = new lkz();
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        lla llaVar2 = (lla) lkzVar.b;
        llaVar2.b |= 1;
        llaVar2.c = "_err";
        long j = i;
        Long.valueOf(j).getClass();
        if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar.y();
        }
        lla llaVar3 = (lla) lkzVar.b;
        llaVar3.b |= 4;
        llaVar3.e = j;
        lla llaVar4 = (lla) lkzVar.v();
        lkz lkzVar2 = new lkz();
        if ((lkzVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar2.y();
        }
        lla llaVar5 = (lla) lkzVar2.b;
        llaVar5.b |= 1;
        llaVar5.c = "_ev";
        if ((lkzVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lkzVar2.y();
        }
        lla llaVar6 = (lla) lkzVar2.b;
        llaVar6.b |= 2;
        llaVar6.d = str;
        lla llaVar7 = (lla) lkzVar2.v();
        lkvVar.c(llaVar4);
        lkvVar.c(llaVar7);
    }

    final void D(lld lldVar, lie lieVar) {
        int i;
        String strC;
        String strC2;
        for (int i2 = 0; i2 < ((lle) lldVar.b).e.size(); i2++) {
            lkw lkwVarA = lldVar.a(i2);
            lkv lkvVar = new lkv();
            lkvVar.B(lkwVarA);
            Iterator it = DesugarCollections.unmodifiableList(((lkw) lkvVar.b).c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((lla) it.next()).c)) {
                    if (lieVar.a.X >= j().h(lieVar.a.r, kzg.al)) {
                        int iH = j().h(lieVar.a.r, kzg.ay);
                        if (iH > 0) {
                            kug kugVar = this.c;
                            ai(kugVar);
                            i = Integer.MIN_VALUE;
                            if (kugVar.T(a(), lieVar.a.r, false, false, false, true).g > iH) {
                                lkz lkzVar = new lkz();
                                if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkzVar.y();
                                }
                                lla llaVar = (lla) lkzVar.b;
                                llaVar.b |= 1;
                                llaVar.c = "_tnr";
                                if ((lkzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkzVar.y();
                                }
                                lla llaVar2 = (lla) lkzVar.b;
                                llaVar2.b |= 4;
                                llaVar2.e = 1L;
                                lkvVar.c((lla) lkzVar.v());
                            } else {
                                if (j().t(lieVar.a.r, kzg.aR)) {
                                    strC2 = p().C();
                                    lkz lkzVar2 = new lkz();
                                    if ((lkzVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        lkzVar2.y();
                                    }
                                    lla llaVar3 = (lla) lkzVar2.b;
                                    llaVar3.b |= 1;
                                    llaVar3.c = "_tu";
                                    if ((lkzVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        lkzVar2.y();
                                    }
                                    lla llaVar4 = (lla) lkzVar2.b;
                                    strC2.getClass();
                                    llaVar4.b |= 2;
                                    llaVar4.d = strC2;
                                    lkvVar.c((lla) lkzVar2.v());
                                } else {
                                    strC2 = null;
                                }
                                lkz lkzVar3 = new lkz();
                                if ((lkzVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkzVar3.y();
                                }
                                lla llaVar5 = (lla) lkzVar3.b;
                                llaVar5.b |= 1;
                                llaVar5.c = "_tr";
                                if ((lkzVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkzVar3.y();
                                }
                                lla llaVar6 = (lla) lkzVar3.b;
                                llaVar6.b |= 4;
                                llaVar6.e = 1L;
                                lkvVar.c((lla) lkzVar3.v());
                                lik likVar = this.g;
                                ai(likVar);
                                TriggerUriParcel triggerUriParcelL = likVar.l(lieVar.a.r, lldVar, lkvVar, strC2);
                                if (triggerUriParcelL != null) {
                                    aB().k.c("Generated trigger URI. appId, uri", lieVar.a.r, triggerUriParcelL.a);
                                    kug kugVar2 = this.c;
                                    ai(kugVar2);
                                    kugVar2.V(lieVar.a.r, triggerUriParcelL);
                                    Deque deque = this.p;
                                    if (!deque.contains(lieVar.a.r)) {
                                        deque.add(lieVar.a.r);
                                    }
                                }
                            }
                        } else {
                            i = Integer.MIN_VALUE;
                            if (j().t(lieVar.a.r, kzg.aR)) {
                                strC = p().C();
                                lkz lkzVar4 = new lkz();
                                if ((lkzVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkzVar4.y();
                                }
                                lla llaVar7 = (lla) lkzVar4.b;
                                llaVar7.b |= 1;
                                llaVar7.c = "_tu";
                                if ((lkzVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkzVar4.y();
                                }
                                lla llaVar8 = (lla) lkzVar4.b;
                                strC.getClass();
                                llaVar8.b |= 2;
                                llaVar8.d = strC;
                                lkvVar.c((lla) lkzVar4.v());
                            } else {
                                strC = null;
                            }
                            lkz lkzVar5 = new lkz();
                            if ((lkzVar5.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkzVar5.y();
                            }
                            lla llaVar9 = (lla) lkzVar5.b;
                            llaVar9.b |= 1;
                            llaVar9.c = "_tr";
                            if ((lkzVar5.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkzVar5.y();
                            }
                            lla llaVar10 = (lla) lkzVar5.b;
                            llaVar10.b |= 4;
                            llaVar10.e = 1L;
                            lkvVar.c((lla) lkzVar5.v());
                            lik likVar2 = this.g;
                            ai(likVar2);
                            TriggerUriParcel triggerUriParcelL2 = likVar2.l(lieVar.a.r, lldVar, lkvVar, strC);
                            if (triggerUriParcelL2 != null) {
                                aB().k.c("Generated trigger URI. appId, uri", lieVar.a.r, triggerUriParcelL2.a);
                                kug kugVar3 = this.c;
                                ai(kugVar3);
                                kugVar3.V(lieVar.a.r, triggerUriParcelL2);
                                Deque deque2 = this.p;
                                if (!deque2.contains(lieVar.a.r)) {
                                    deque2.add(lieVar.a.r);
                                }
                            }
                        }
                    } else {
                        i = Integer.MIN_VALUE;
                    }
                    lkw lkwVar = (lkw) lkvVar.v();
                    if ((lldVar.b.memoizedSerializedSize & i) == 0) {
                        lldVar.y();
                    }
                    lle lleVar = (lle) lldVar.b;
                    lkwVar.getClass();
                    abxs abxsVar = lleVar.e;
                    if (!abxsVar.c()) {
                        int size = abxsVar.size();
                        lleVar.e = abxsVar.d(size + size);
                    }
                    lleVar.e.set(i2, lkwVar);
                }
            }
        }
    }

    final void E(EventParcel eventParcel, AppMetadata appMetadata) {
        EventParcel eventParcel2;
        List<ConditionalUserPropertyParcel> listT;
        List<ConditionalUserPropertyParcel> listT2;
        List<ConditionalUserPropertyParcel> listT3;
        String str;
        kkk.k(appMetadata);
        String str2 = appMetadata.a;
        kkk.h(str2);
        aC().g();
        v();
        long j = eventParcel.d;
        lac lacVarB = lac.b(eventParcel);
        aC().g();
        lio.J((this.H == null || (str = this.I) == null || !str.equals(str2)) ? null : this.H, lacVarB.d, false);
        EventParcel eventParcelA = lacVarB.a();
        lik likVar = this.g;
        ai(likVar);
        if (likVar.K(appMetadata)) {
            if (!appMetadata.h) {
                f(appMetadata);
                return;
            }
            List list = appMetadata.r;
            if (list != null) {
                String str3 = eventParcelA.a;
                if (!list.contains(str3)) {
                    aB().j.d("Dropping non-safelisted event. appId, event name, origin", str2, eventParcelA.a, eventParcelA.c);
                    return;
                } else {
                    Bundle bundleA = eventParcelA.b.a();
                    bundleA.putLong("ga_safelisted", 1L);
                    eventParcel2 = new EventParcel(str3, new EventParams(bundleA), eventParcelA.c, eventParcelA.d);
                }
            } else {
                eventParcel2 = eventParcelA;
            }
            kug kugVar = this.c;
            ai(kugVar);
            kugVar.y();
            try {
                String str4 = eventParcel2.a;
                if ("_s".equals(str4)) {
                    kug kugVar2 = this.c;
                    ai(kugVar2);
                    if (!kugVar2.O(str2, "_s") && eventParcel2.b.b("_sid").longValue() != 0) {
                        kug kugVar3 = this.c;
                        ai(kugVar3);
                        if (kugVar3.O(str2, "_f")) {
                            kug kugVar4 = this.c;
                            ai(kugVar4);
                            kugVar4.x(str2, null, "_sid", e(str2, eventParcel2));
                        } else {
                            kug kugVar5 = this.c;
                            ai(kugVar5);
                            if (kugVar5.O(str2, "_v")) {
                                kug kugVar42 = this.c;
                                ai(kugVar42);
                                kugVar42.x(str2, null, "_sid", e(str2, eventParcel2));
                            } else {
                                kug kugVar6 = this.c;
                                ai(kugVar6);
                                kkk.k(this.l);
                                kugVar6.x(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", e(str2, eventParcel2));
                            }
                        }
                    }
                }
                kug kugVar7 = this.c;
                ai(kugVar7);
                kkk.h(str2);
                kugVar7.g();
                kugVar7.ag();
                if (j < 0) {
                    lbk lbkVar = kugVar7.y;
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.f.c("Invalid time querying timed out conditional properties", lab.b(str2), Long.valueOf(j));
                    listT = Collections.EMPTY_LIST;
                } else {
                    listT = kugVar7.t("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (ConditionalUserPropertyParcel conditionalUserPropertyParcel : listT) {
                    if (conditionalUserPropertyParcel != null) {
                        aB().k.d("User property timed out", conditionalUserPropertyParcel.a, this.l.j.e(conditionalUserPropertyParcel.c.b), conditionalUserPropertyParcel.c.a());
                        EventParcel eventParcel3 = conditionalUserPropertyParcel.g;
                        if (eventParcel3 != null) {
                            ad(new EventParcel(eventParcel3, j), appMetadata);
                        }
                        kug kugVar8 = this.c;
                        ai(kugVar8);
                        kugVar8.W(str2, conditionalUserPropertyParcel.c.b);
                    }
                }
                kug kugVar9 = this.c;
                ai(kugVar9);
                kkk.h(str2);
                kugVar9.g();
                kugVar9.ag();
                if (j < 0) {
                    lbk lbkVar2 = kugVar9.y;
                    lab labVar2 = lbkVar2.f;
                    lbkVar2.o(labVar2);
                    labVar2.f.c("Invalid time querying expired conditional properties", lab.b(str2), Long.valueOf(j));
                    listT2 = Collections.EMPTY_LIST;
                } else {
                    listT2 = kugVar9.t("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listT2.size());
                for (ConditionalUserPropertyParcel conditionalUserPropertyParcel2 : listT2) {
                    if (conditionalUserPropertyParcel2 != null) {
                        aB().k.d("User property expired", conditionalUserPropertyParcel2.a, this.l.j.e(conditionalUserPropertyParcel2.c.b), conditionalUserPropertyParcel2.c.a());
                        kug kugVar10 = this.c;
                        ai(kugVar10);
                        kugVar10.H(str2, conditionalUserPropertyParcel2.c.b);
                        EventParcel eventParcel4 = conditionalUserPropertyParcel2.k;
                        if (eventParcel4 != null) {
                            arrayList.add(eventParcel4);
                        }
                        kug kugVar11 = this.c;
                        ai(kugVar11);
                        kugVar11.W(str2, conditionalUserPropertyParcel2.c.b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ad(new EventParcel((EventParcel) it.next(), j), appMetadata);
                }
                kug kugVar12 = this.c;
                ai(kugVar12);
                kkk.h(str2);
                kkk.h(str4);
                kugVar12.g();
                kugVar12.ag();
                if (j < 0) {
                    lbk lbkVar3 = kugVar12.y;
                    lab labVar3 = lbkVar3.f;
                    lbkVar3.o(labVar3);
                    labVar3.f.d("Invalid time querying triggered conditional properties", lab.b(str2), lbkVar3.j.c(str4), Long.valueOf(j));
                    listT3 = Collections.EMPTY_LIST;
                } else {
                    listT3 = kugVar12.t("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listT3.size());
                for (ConditionalUserPropertyParcel conditionalUserPropertyParcel3 : listT3) {
                    if (conditionalUserPropertyParcel3 != null) {
                        UserAttributeParcel userAttributeParcel = conditionalUserPropertyParcel3.c;
                        String str5 = conditionalUserPropertyParcel3.a;
                        kkk.k(str5);
                        String str6 = conditionalUserPropertyParcel3.b;
                        String str7 = userAttributeParcel.b;
                        Object objA = userAttributeParcel.a();
                        kkk.k(objA);
                        lim limVar = new lim(str5, str6, str7, j, objA);
                        kug kugVar13 = this.c;
                        ai(kugVar13);
                        if (kugVar13.R(limVar)) {
                            aB().k.d("User property triggered", conditionalUserPropertyParcel3.a, this.l.j.e(limVar.c), limVar.e);
                        } else {
                            aB().c.d("Too many active user properties, ignoring", lab.b(conditionalUserPropertyParcel3.a), this.l.j.e(limVar.c), limVar.e);
                        }
                        EventParcel eventParcel5 = conditionalUserPropertyParcel3.i;
                        if (eventParcel5 != null) {
                            arrayList2.add(eventParcel5);
                        }
                        conditionalUserPropertyParcel3.c = new UserAttributeParcel(limVar);
                        conditionalUserPropertyParcel3.e = true;
                        kug kugVar14 = this.c;
                        ai(kugVar14);
                        kugVar14.Q(conditionalUserPropertyParcel3);
                    }
                }
                ad(eventParcel2, appMetadata);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ad(new EventParcel((EventParcel) it2.next(), j), appMetadata);
                }
                kug kugVar15 = this.c;
                ai(kugVar15);
                kugVar15.J();
            } finally {
                kug kugVar16 = this.c;
                ai(kugVar16);
                kugVar16.E();
            }
        }
    }

    final void F(EventParcel eventParcel, String str) {
        kug kugVar = this.c;
        ai(kugVar);
        ksx ksxVarH = kugVar.h(str);
        if (ksxVarH == null || TextUtils.isEmpty(ksxVarH.w())) {
            aB().j.b("No app data available; dropping event", str);
            return;
        }
        Boolean boolAl = al(ksxVarH);
        if (boolAl == null) {
            if (!"_ui".equals(eventParcel.a)) {
                aB().f.b("Could not find package. appId", lab.b(str));
            }
        } else if (!boolAl.booleanValue()) {
            aB().c.b("App version does not match; dropping event. appId", lab.b(str));
            return;
        }
        G(eventParcel, new AppMetadata(str, ksxVarH.y(), ksxVarH.w(), ksxVarH.c(), ksxVarH.v(), ksxVarH.i(), ksxVarH.f(), (String) null, ksxVarH.am(), false, ksxVarH.x(), 0L, 0, ksxVarH.al(), false, ksxVarH.p(), ksxVarH.g(), ksxVarH.D(), n(str).m(), "", (String) null, ksxVarH.ao(), ksxVarH.o(), n(str).c, l(str).c, ksxVarH.a(), ksxVarH.d(), ksxVarH.C(), ksxVarH.A(), 0L, ksxVarH.b()));
    }

    final void G(EventParcel eventParcel, AppMetadata appMetadata) {
        String str = appMetadata.a;
        kkk.h(str);
        lac lacVarB = lac.b(eventParcel);
        Bundle bundle = lacVarB.d;
        lio lioVarP = p();
        kug kugVar = this.c;
        ai(kugVar);
        lioVarP.K(bundle, kugVar.f(str));
        p().L(lacVarB, j().f(str));
        EventParcel eventParcelA = lacVarB.a();
        if (!j().t(null, kzg.bg) && "_cmp".equals(eventParcelA.a)) {
            Bundle bundle2 = eventParcelA.b.a;
            if ("referrer API v2".equals(bundle2.getString("_cis"))) {
                String string = bundle2.getString("gclid");
                if (!TextUtils.isEmpty(string)) {
                    Y(new UserAttributeParcel("_lgclid", eventParcelA.d, string, "auto"), appMetadata);
                }
            }
        }
        E(eventParcelA, appMetadata);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4 A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002a, B:16:0x0047, B:50:0x014e, B:21:0x0061, B:26:0x00b5, B:25:0x00a7, B:27:0x00ba, B:31:0x00cb, B:35:0x00e5, B:37:0x00fb, B:39:0x0116, B:41:0x0121, B:43:0x0127, B:44:0x012b, B:46:0x0134, B:48:0x0143, B:49:0x014b, B:38:0x0107, B:32:0x00d4, B:34:0x00df), top: B:60:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002a, B:16:0x0047, B:50:0x014e, B:21:0x0061, B:26:0x00b5, B:25:0x00a7, B:27:0x00ba, B:31:0x00cb, B:35:0x00e5, B:37:0x00fb, B:39:0x0116, B:41:0x0121, B:43:0x0127, B:44:0x012b, B:46:0x0134, B:48:0x0143, B:49:0x014b, B:38:0x0107, B:32:0x00d4, B:34:0x00df), top: B:60:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002a, B:16:0x0047, B:50:0x014e, B:21:0x0061, B:26:0x00b5, B:25:0x00a7, B:27:0x00ba, B:31:0x00cb, B:35:0x00e5, B:37:0x00fb, B:39:0x0116, B:41:0x0121, B:43:0x0127, B:44:0x012b, B:46:0x0134, B:48:0x0143, B:49:0x014b, B:38:0x0107, B:32:0x00d4, B:34:0x00df), top: B:60:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107 A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002a, B:16:0x0047, B:50:0x014e, B:21:0x0061, B:26:0x00b5, B:25:0x00a7, B:27:0x00ba, B:31:0x00cb, B:35:0x00e5, B:37:0x00fb, B:39:0x0116, B:41:0x0121, B:43:0x0127, B:44:0x012b, B:46:0x0134, B:48:0x0143, B:49:0x014b, B:38:0x0107, B:32:0x00d4, B:34:0x00df), top: B:60:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002a, B:16:0x0047, B:50:0x014e, B:21:0x0061, B:26:0x00b5, B:25:0x00a7, B:27:0x00ba, B:31:0x00cb, B:35:0x00e5, B:37:0x00fb, B:39:0x0116, B:41:0x0121, B:43:0x0127, B:44:0x012b, B:46:0x0134, B:48:0x0143, B:49:0x014b, B:38:0x0107, B:32:0x00d4, B:34:0x00df), top: B:60:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134 A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002a, B:16:0x0047, B:50:0x014e, B:21:0x0061, B:26:0x00b5, B:25:0x00a7, B:27:0x00ba, B:31:0x00cb, B:35:0x00e5, B:37:0x00fb, B:39:0x0116, B:41:0x0121, B:43:0x0127, B:44:0x012b, B:46:0x0134, B:48:0x0143, B:49:0x014b, B:38:0x0107, B:32:0x00d4, B:34:0x00df), top: B:60:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:6:0x002a, B:16:0x0047, B:50:0x014e, B:21:0x0061, B:26:0x00b5, B:25:0x00a7, B:27:0x00ba, B:31:0x00cb, B:35:0x00e5, B:37:0x00fb, B:39:0x0116, B:41:0x0121, B:43:0x0127, B:44:0x012b, B:46:0x0134, B:48:0x0143, B:49:0x014b, B:38:0x0107, B:32:0x00d4, B:34:0x00df), top: B:60:0x002a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void H(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.H(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[Catch: all -> 0x02da, TryCatch #2 {all -> 0x02da, blocks: (B:4:0x0015, B:6:0x001a, B:14:0x0031, B:19:0x007b, B:21:0x008c, B:31:0x00e7, B:24:0x0093, B:26:0x00ba, B:27:0x00c8, B:30:0x00d9, B:32:0x00ec, B:33:0x00f3, B:18:0x006d, B:34:0x00f4, B:36:0x0109, B:37:0x0119, B:39:0x0125, B:41:0x0141, B:81:0x0260, B:83:0x0275, B:85:0x0280, B:93:0x029f, B:87:0x0286, B:89:0x028f, B:91:0x0295, B:92:0x0299, B:95:0x02a3, B:96:0x02ab, B:40:0x0136, B:98:0x02ad), top: B:107:0x0015, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[Catch: all -> 0x02da, TryCatch #2 {all -> 0x02da, blocks: (B:4:0x0015, B:6:0x001a, B:14:0x0031, B:19:0x007b, B:21:0x008c, B:31:0x00e7, B:24:0x0093, B:26:0x00ba, B:27:0x00c8, B:30:0x00d9, B:32:0x00ec, B:33:0x00f3, B:18:0x006d, B:34:0x00f4, B:36:0x0109, B:37:0x0119, B:39:0x0125, B:41:0x0141, B:81:0x0260, B:83:0x0275, B:85:0x0280, B:93:0x029f, B:87:0x0286, B:89:0x028f, B:91:0x0295, B:92:0x0299, B:95:0x02a3, B:96:0x02ab, B:40:0x0136, B:98:0x02ad), top: B:107:0x0015, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec A[Catch: all -> 0x02da, TryCatch #2 {all -> 0x02da, blocks: (B:4:0x0015, B:6:0x001a, B:14:0x0031, B:19:0x007b, B:21:0x008c, B:31:0x00e7, B:24:0x0093, B:26:0x00ba, B:27:0x00c8, B:30:0x00d9, B:32:0x00ec, B:33:0x00f3, B:18:0x006d, B:34:0x00f4, B:36:0x0109, B:37:0x0119, B:39:0x0125, B:41:0x0141, B:81:0x0260, B:83:0x0275, B:85:0x0280, B:93:0x029f, B:87:0x0286, B:89:0x028f, B:91:0x0295, B:92:0x0299, B:95:0x02a3, B:96:0x02ab, B:40:0x0136, B:98:0x02ad), top: B:107:0x0015, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[Catch: all -> 0x02da, PHI: r0
  0x00f4: PHI (r0v2 int) = (r0v0 int), (r0v33 int) binds: [B:7:0x0024, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x02da, blocks: (B:4:0x0015, B:6:0x001a, B:14:0x0031, B:19:0x007b, B:21:0x008c, B:31:0x00e7, B:24:0x0093, B:26:0x00ba, B:27:0x00c8, B:30:0x00d9, B:32:0x00ec, B:33:0x00f3, B:18:0x006d, B:34:0x00f4, B:36:0x0109, B:37:0x0119, B:39:0x0125, B:41:0x0141, B:81:0x0260, B:83:0x0275, B:85:0x0280, B:93:0x029f, B:87:0x0286, B:89:0x028f, B:91:0x0295, B:92:0x0299, B:95:0x02a3, B:96:0x02ab, B:40:0x0136, B:98:0x02ad), top: B:107:0x0015, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125 A[Catch: SQLiteException -> 0x02ac, all -> 0x02da, TryCatch #3 {SQLiteException -> 0x02ac, blocks: (B:36:0x0109, B:37:0x0119, B:39:0x0125, B:41:0x0141, B:81:0x0260, B:83:0x0275, B:85:0x0280, B:93:0x029f, B:87:0x0286, B:89:0x028f, B:91:0x0295, B:92:0x0299, B:95:0x02a3, B:96:0x02ab, B:40:0x0136), top: B:108:0x0109, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136 A[Catch: SQLiteException -> 0x02ac, all -> 0x02da, TryCatch #3 {SQLiteException -> 0x02ac, blocks: (B:36:0x0109, B:37:0x0119, B:39:0x0125, B:41:0x0141, B:81:0x0260, B:83:0x0275, B:85:0x0280, B:93:0x029f, B:87:0x0286, B:89:0x028f, B:91:0x0295, B:92:0x0299, B:95:0x02a3, B:96:0x02ab, B:40:0x0136), top: B:108:0x0109, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015a A[Catch: all -> 0x02a2, TryCatch #1 {all -> 0x02a2, blocks: (B:42:0x0149, B:43:0x0152, B:45:0x015a, B:47:0x016e, B:51:0x018e, B:53:0x0196, B:55:0x01a2, B:56:0x01a7, B:58:0x01ad, B:60:0x01c2, B:62:0x01e0, B:64:0x01fc, B:66:0x021e, B:67:0x022d, B:68:0x0231, B:70:0x0237, B:71:0x023e, B:74:0x024c, B:76:0x0250, B:79:0x0257, B:80:0x0258), top: B:106:0x0149, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad A[Catch: all -> 0x02a2, TryCatch #1 {all -> 0x02a2, blocks: (B:42:0x0149, B:43:0x0152, B:45:0x015a, B:47:0x016e, B:51:0x018e, B:53:0x0196, B:55:0x01a2, B:56:0x01a7, B:58:0x01ad, B:60:0x01c2, B:62:0x01e0, B:64:0x01fc, B:66:0x021e, B:67:0x022d, B:68:0x0231, B:70:0x0237, B:71:0x023e, B:74:0x024c, B:76:0x0250, B:79:0x0257, B:80:0x0258), top: B:106:0x0149, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fc A[Catch: all -> 0x02a2, TryCatch #1 {all -> 0x02a2, blocks: (B:42:0x0149, B:43:0x0152, B:45:0x015a, B:47:0x016e, B:51:0x018e, B:53:0x0196, B:55:0x01a2, B:56:0x01a7, B:58:0x01ad, B:60:0x01c2, B:62:0x01e0, B:64:0x01fc, B:66:0x021e, B:67:0x022d, B:68:0x0231, B:70:0x0237, B:71:0x023e, B:74:0x024c, B:76:0x0250, B:79:0x0257, B:80:0x0258), top: B:106:0x0149, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0237 A[Catch: all -> 0x02a2, TRY_LEAVE, TryCatch #1 {all -> 0x02a2, blocks: (B:42:0x0149, B:43:0x0152, B:45:0x015a, B:47:0x016e, B:51:0x018e, B:53:0x0196, B:55:0x01a2, B:56:0x01a7, B:58:0x01ad, B:60:0x01c2, B:62:0x01e0, B:64:0x01fc, B:66:0x021e, B:67:0x022d, B:68:0x0231, B:70:0x0237, B:71:0x023e, B:74:0x024c, B:76:0x0250, B:79:0x0257, B:80:0x0258), top: B:106:0x0149, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0275 A[Catch: SQLiteException -> 0x02ac, all -> 0x02da, TryCatch #3 {SQLiteException -> 0x02ac, blocks: (B:36:0x0109, B:37:0x0119, B:39:0x0125, B:41:0x0141, B:81:0x0260, B:83:0x0275, B:85:0x0280, B:93:0x029f, B:87:0x0286, B:89:0x028f, B:91:0x0295, B:92:0x0299, B:95:0x02a3, B:96:0x02ab, B:40:0x0136), top: B:108:0x0109, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0286 A[Catch: SQLiteException -> 0x02ac, all -> 0x02da, TryCatch #3 {SQLiteException -> 0x02ac, blocks: (B:36:0x0109, B:37:0x0119, B:39:0x0125, B:41:0x0141, B:81:0x0260, B:83:0x0275, B:85:0x0280, B:93:0x029f, B:87:0x0286, B:89:0x028f, B:91:0x0295, B:92:0x0299, B:95:0x02a3, B:96:0x02ab, B:40:0x0136), top: B:108:0x0109, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void I(boolean r18, int r19, java.lang.Throwable r20, byte[] r21, java.lang.String r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.I(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    final void J(ksx ksxVar, lld lldVar) {
        int iA;
        Object objR;
        aC().g();
        v();
        lkg lkgVar = lkg.a;
        lkd lkdVar = new lkd();
        byte[] bArrAq = ksxVar.aq();
        if (bArrAq != null) {
            try {
                lkdVar = (lkd) lik.o(lkdVar, bArrAq);
            } catch (abxv unused) {
                aB().f.b("Failed to parse locally stored ad campaign info. appId", lab.b(ksxVar.t()));
            }
        }
        for (lkw lkwVar : DesugarCollections.unmodifiableList(((lle) lldVar.b).e)) {
            if (lkwVar.d.equals("_cmp")) {
                lik likVar = this.g;
                String str = (String) likVar.q(lkwVar, "gclid", "");
                String str2 = (String) likVar.q(lkwVar, "gbraid", "");
                String str3 = (String) likVar.q(lkwVar, "gad_source", "");
                String[] strArrSplit = ((String) kzg.bh.a(null)).split(",");
                ai(likVar);
                HashMap map = new HashMap();
                for (lla llaVar : lkwVar.c) {
                    if (Arrays.asList(strArrSplit).contains(llaVar.c) && (objR = likVar.r(llaVar)) != null) {
                        map.put(llaVar.c, objR);
                    }
                }
                if (!map.isEmpty()) {
                    long jLongValue = ((Long) likVar.q(lkwVar, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = lkwVar.e;
                    }
                    if ("referrer API v2".equals(likVar.p(lkwVar, "_cis"))) {
                        if (jLongValue > ((lkg) lkdVar.b).j) {
                            if (str.isEmpty()) {
                                if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkdVar.y();
                                }
                                lkg lkgVar2 = (lkg) lkdVar.b;
                                lkgVar2.b &= -17;
                                lkgVar2.g = lkg.a.g;
                            } else {
                                if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkdVar.y();
                                }
                                lkg lkgVar3 = (lkg) lkdVar.b;
                                lkgVar3.b |= 16;
                                lkgVar3.g = str;
                            }
                            if (str2.isEmpty()) {
                                if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkdVar.y();
                                }
                                lkg lkgVar4 = (lkg) lkdVar.b;
                                lkgVar4.b &= -33;
                                lkgVar4.h = lkg.a.h;
                            } else {
                                if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkdVar.y();
                                }
                                lkg lkgVar5 = (lkg) lkdVar.b;
                                lkgVar5.b |= 32;
                                lkgVar5.h = str2;
                            }
                            if (str3.isEmpty()) {
                                if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkdVar.y();
                                }
                                lkg lkgVar6 = (lkg) lkdVar.b;
                                lkgVar6.b &= -65;
                                lkgVar6.i = lkg.a.i;
                            } else {
                                if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    lkdVar.y();
                                }
                                lkg lkgVar7 = (lkg) lkdVar.b;
                                lkgVar7.b |= 64;
                                lkgVar7.i = str3;
                            }
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar8 = (lkg) lkdVar.b;
                            lkgVar8.b |= 128;
                            lkgVar8.j = jLongValue;
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar9 = (lkg) lkdVar.b;
                            abyl abylVar = lkgVar9.l;
                            if (!abylVar.b) {
                                lkgVar9.l = abylVar.a();
                            }
                            lkgVar9.l.clear();
                            Map mapAo = ao(lkwVar);
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar10 = (lkg) lkdVar.b;
                            abyl abylVar2 = lkgVar10.l;
                            if (!abylVar2.b) {
                                lkgVar10.l = abylVar2.a();
                            }
                            lkgVar10.l.putAll(mapAo);
                        }
                    } else if (jLongValue > ((lkg) lkdVar.b).f) {
                        if (str.isEmpty()) {
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar11 = (lkg) lkdVar.b;
                            lkgVar11.b &= -2;
                            lkgVar11.c = lkg.a.c;
                        } else {
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar12 = (lkg) lkdVar.b;
                            lkgVar12.b |= 1;
                            lkgVar12.c = str;
                        }
                        if (str2.isEmpty()) {
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar13 = (lkg) lkdVar.b;
                            lkgVar13.b &= -3;
                            lkgVar13.d = lkg.a.d;
                        } else {
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar14 = (lkg) lkdVar.b;
                            lkgVar14.b |= 2;
                            lkgVar14.d = str2;
                        }
                        if (str3.isEmpty()) {
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar15 = (lkg) lkdVar.b;
                            lkgVar15.b &= -5;
                            lkgVar15.e = lkg.a.e;
                        } else {
                            if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                lkdVar.y();
                            }
                            lkg lkgVar16 = (lkg) lkdVar.b;
                            lkgVar16.b |= 4;
                            lkgVar16.e = str3;
                        }
                        if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            lkdVar.y();
                        }
                        lkg lkgVar17 = (lkg) lkdVar.b;
                        lkgVar17.b |= 8;
                        lkgVar17.f = jLongValue;
                        if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            lkdVar.y();
                        }
                        lkg lkgVar18 = (lkg) lkdVar.b;
                        abyl abylVar3 = lkgVar18.k;
                        if (!abylVar3.b) {
                            lkgVar18.k = abylVar3.a();
                        }
                        lkgVar18.k.clear();
                        Map mapAo2 = ao(lkwVar);
                        if ((lkdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            lkdVar.y();
                        }
                        lkg lkgVar19 = (lkg) lkdVar.b;
                        abyl abylVar4 = lkgVar19.k;
                        if (!abylVar4.b) {
                            lkgVar19.k = abylVar4.a();
                        }
                        lkgVar19.k.putAll(mapAo2);
                    }
                }
            }
        }
        lkg lkgVar20 = (lkg) lkdVar.v();
        lkg lkgVar21 = lkg.a;
        if (lkgVar20 != lkgVar21 && (lkgVar21 == null || lkgVar20.getClass() != lkgVar21.getClass() || !abza.a.a(lkgVar20.getClass()).k(lkgVar20, lkgVar21))) {
            lkg lkgVar22 = (lkg) lkdVar.v();
            if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lldVar.y();
            }
            lle lleVar = (lle) lldVar.b;
            lkgVar22.getClass();
            lleVar.aa = lkgVar22;
            lleVar.c |= 16777216;
        }
        lkg lkgVar23 = (lkg) lkdVar.v();
        try {
            int i = lkgVar23.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(lkgVar23.getClass()).a(lkgVar23);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(lkgVar23.getClass()).a(lkgVar23);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    lkgVar23.memoizedSerializedSize = (lkgVar23.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(lkgVar23.getClass()).m(lkgVar23, abwa.a(abvwVar));
            abvwVar.K();
            ksxVar.F(bArr);
            if (ksxVar.an()) {
                kug kugVar = this.c;
                ai(kugVar);
                kugVar.aa(ksxVar, false);
            }
            if (j().t(null, kzg.bg)) {
                kug kugVar2 = this.c;
                ai(kugVar2);
                kugVar2.H(ksxVar.t(), "_lgclid");
            }
        } catch (IOException e) {
            throw new RuntimeException(a.u(lkgVar23, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:198|99|100|101|204|102|103|(2:105|(9:107|108|109|128|(1:130)(6:206|132|(1:155)(5:139|(3:141|(2:143|(1:145))(1:147)|146)(1:148)|149|(1:151)(1:152)|153)|200|156|(4:161|(1:163)(1:164)|165|(1:167)))|131|168|(1:170)|171)(1:110))(1:111)|199|112|(9:114|108|109|128|(0)(0)|131|168|(0)|171)(8:115|127|128|(0)(0)|131|168|(0)|171)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0340, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034c, code lost:
    
        r7 = r10.y;
        r10 = r7.f;
        r7.o(r10);
        r10.c.d("Error inserting column. appId", defpackage.lab.b(r3), r12, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c7 A[Catch: SQLiteException -> 0x0342, all -> 0x0344, TRY_ENTER, TryCatch #2 {all -> 0x0344, blocks: (B:102:0x02af, B:105:0x02c7, B:107:0x02e8, B:112:0x0305, B:114:0x0329, B:115:0x033c, B:126:0x034c), top: B:198:0x0288, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0329 A[Catch: SQLiteException -> 0x0340, all -> 0x0344, TryCatch #2 {all -> 0x0344, blocks: (B:102:0x02af, B:105:0x02c7, B:107:0x02e8, B:112:0x0305, B:114:0x0329, B:115:0x033c, B:126:0x034c), top: B:198:0x0288, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033c A[Catch: SQLiteException -> 0x0340, all -> 0x0344, TRY_LEAVE, TryCatch #2 {all -> 0x0344, blocks: (B:102:0x02af, B:105:0x02c7, B:107:0x02e8, B:112:0x0305, B:114:0x0329, B:115:0x033c, B:126:0x034c), top: B:198:0x0288, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036c A[Catch: all -> 0x04df, TRY_LEAVE, TryCatch #8 {all -> 0x04df, blocks: (B:99:0x0288, B:108:0x02fa, B:128:0x0362, B:130:0x036c, B:170:0x0433, B:171:0x0436, B:183:0x04ce, B:132:0x037f, B:137:0x039e, B:139:0x03a6, B:141:0x03af, B:145:0x03c2, B:149:0x03d5, B:153:0x03e1, B:156:0x03f1, B:161:0x0414, B:163:0x041c, B:165:0x0424, B:167:0x042a, B:159:0x0402, B:147:0x03cd, B:135:0x038c, B:127:0x035e, B:172:0x044f, B:173:0x0452, B:176:0x0458, B:178:0x0490, B:179:0x0493, B:180:0x04ab, B:182:0x04b2, B:102:0x02af, B:105:0x02c7, B:107:0x02e8, B:112:0x0305, B:114:0x0329, B:115:0x033c, B:126:0x034c), top: B:208:0x012b, inners: #2, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0433 A[Catch: all -> 0x04df, TryCatch #8 {all -> 0x04df, blocks: (B:99:0x0288, B:108:0x02fa, B:128:0x0362, B:130:0x036c, B:170:0x0433, B:171:0x0436, B:183:0x04ce, B:132:0x037f, B:137:0x039e, B:139:0x03a6, B:141:0x03af, B:145:0x03c2, B:149:0x03d5, B:153:0x03e1, B:156:0x03f1, B:161:0x0414, B:163:0x041c, B:165:0x0424, B:167:0x042a, B:159:0x0402, B:147:0x03cd, B:135:0x038c, B:127:0x035e, B:172:0x044f, B:173:0x0452, B:176:0x0458, B:178:0x0490, B:179:0x0493, B:180:0x04ab, B:182:0x04b2, B:102:0x02af, B:105:0x02c7, B:107:0x02e8, B:112:0x0305, B:114:0x0329, B:115:0x033c, B:126:0x034c), top: B:208:0x012b, inners: #2, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ab A[Catch: all -> 0x04df, TryCatch #8 {all -> 0x04df, blocks: (B:99:0x0288, B:108:0x02fa, B:128:0x0362, B:130:0x036c, B:170:0x0433, B:171:0x0436, B:183:0x04ce, B:132:0x037f, B:137:0x039e, B:139:0x03a6, B:141:0x03af, B:145:0x03c2, B:149:0x03d5, B:153:0x03e1, B:156:0x03f1, B:161:0x0414, B:163:0x041c, B:165:0x0424, B:167:0x042a, B:159:0x0402, B:147:0x03cd, B:135:0x038c, B:127:0x035e, B:172:0x044f, B:173:0x0452, B:176:0x0458, B:178:0x0490, B:179:0x0493, B:180:0x04ab, B:182:0x04b2, B:102:0x02af, B:105:0x02c7, B:107:0x02e8, B:112:0x0305, B:114:0x0329, B:115:0x033c, B:126:0x034c), top: B:208:0x012b, inners: #2, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x037f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:23:0x009e, B:25:0x00ad, B:31:0x00c1, B:35:0x00d1, B:37:0x00e0, B:43:0x00f5, B:45:0x0102, B:47:0x010b, B:50:0x0112, B:53:0x012d, B:56:0x0140, B:63:0x017a, B:51:0x011f, B:46:0x0108, B:39:0x00ea, B:42:0x00f2), top: B:194:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108 A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:23:0x009e, B:25:0x00ad, B:31:0x00c1, B:35:0x00d1, B:37:0x00e0, B:43:0x00f5, B:45:0x0102, B:47:0x010b, B:50:0x0112, B:53:0x012d, B:56:0x0140, B:63:0x017a, B:51:0x011f, B:46:0x0108, B:39:0x00ea, B:42:0x00f2), top: B:194:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112 A[Catch: all -> 0x04e1, TRY_ENTER, TryCatch #0 {all -> 0x04e1, blocks: (B:23:0x009e, B:25:0x00ad, B:31:0x00c1, B:35:0x00d1, B:37:0x00e0, B:43:0x00f5, B:45:0x0102, B:47:0x010b, B:50:0x0112, B:53:0x012d, B:56:0x0140, B:63:0x017a, B:51:0x011f, B:46:0x0108, B:39:0x00ea, B:42:0x00f2), top: B:194:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:23:0x009e, B:25:0x00ad, B:31:0x00c1, B:35:0x00d1, B:37:0x00e0, B:43:0x00f5, B:45:0x0102, B:47:0x010b, B:50:0x0112, B:53:0x012d, B:56:0x0140, B:63:0x017a, B:51:0x011f, B:46:0x0108, B:39:0x00ea, B:42:0x00f2), top: B:194:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d A[Catch: all -> 0x04e1, TRY_LEAVE, TryCatch #0 {all -> 0x04e1, blocks: (B:23:0x009e, B:25:0x00ad, B:31:0x00c1, B:35:0x00d1, B:37:0x00e0, B:43:0x00f5, B:45:0x0102, B:47:0x010b, B:50:0x0112, B:53:0x012d, B:56:0x0140, B:63:0x017a, B:51:0x011f, B:46:0x0108, B:39:0x00ea, B:42:0x00f2), top: B:194:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027c A[Catch: all -> 0x0453, TryCatch #1 {all -> 0x0453, blocks: (B:58:0x0162, B:61:0x016a, B:94:0x0250, B:96:0x027c, B:97:0x0281, B:67:0x018e, B:69:0x01b2, B:70:0x01bf, B:72:0x01c8, B:74:0x01ce, B:76:0x01d8, B:78:0x01e2, B:80:0x01e8, B:82:0x01ee, B:83:0x01f3, B:87:0x020c, B:90:0x0211, B:91:0x0224, B:92:0x0231, B:93:0x023e), top: B:196:0x0162, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.database.sqlite.SQLiteDatabase, java.lang.Object, lar] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v14, types: [lih] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void K(com.google.android.gms.measurement.internal.AppMetadata r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.K(com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    final void L(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        kkk.h(conditionalUserPropertyParcel.a);
        kkk.k(conditionalUserPropertyParcel.c);
        kkk.h(conditionalUserPropertyParcel.c.b);
        aC().g();
        v();
        if (as(appMetadata)) {
            if (!appMetadata.h) {
                f(appMetadata);
                return;
            }
            kug kugVar = this.c;
            ai(kugVar);
            kugVar.y();
            try {
                f(appMetadata);
                String str = conditionalUserPropertyParcel.a;
                kkk.k(str);
                kug kugVar2 = this.c;
                ai(kugVar2);
                ConditionalUserPropertyParcel conditionalUserPropertyParcelI = kugVar2.i(str, conditionalUserPropertyParcel.c.b);
                if (conditionalUserPropertyParcelI != null) {
                    aB().j.c("Removing conditional user property", conditionalUserPropertyParcel.a, this.l.j.e(conditionalUserPropertyParcel.c.b));
                    kug kugVar3 = this.c;
                    ai(kugVar3);
                    kugVar3.W(str, conditionalUserPropertyParcel.c.b);
                    if (conditionalUserPropertyParcelI.e) {
                        kug kugVar4 = this.c;
                        ai(kugVar4);
                        kugVar4.H(str, conditionalUserPropertyParcel.c.b);
                    }
                    EventParcel eventParcel = conditionalUserPropertyParcel.k;
                    if (eventParcel != null) {
                        EventParams eventParams = eventParcel.b;
                        EventParcel eventParcelAr = p().ar(str, eventParcel.a, eventParams != null ? eventParams.a() : null, conditionalUserPropertyParcelI.b, eventParcel.d, true);
                        kkk.k(eventParcelAr);
                        ad(eventParcelAr, appMetadata);
                    }
                } else {
                    aB().f.c("Conditional user property doesn't exist", lab.b(conditionalUserPropertyParcel.a), this.l.j.e(conditionalUserPropertyParcel.c.b));
                }
                kug kugVar5 = this.c;
                ai(kugVar5);
                kugVar5.J();
            } finally {
                kug kugVar6 = this.c;
                ai(kugVar6);
                kugVar6.E();
            }
        }
    }

    final void M(lkv lkvVar, String str) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lkw) lkvVar.b).c);
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            if (str.equals(((lla) listUnmodifiableList.get(i)).c)) {
                lkvVar.d(i);
                return;
            }
        }
    }

    final void N(String str, AppMetadata appMetadata) {
        aC().g();
        v();
        if (as(appMetadata)) {
            if (!appMetadata.h) {
                f(appMetadata);
                return;
            }
            Boolean boolAm = am(appMetadata);
            if ("_npa".equals(str) && boolAm != null) {
                aB().j.a("Falling back to manifest metadata value for ad personalization");
                kkk.k(this.l);
                Y(new UserAttributeParcel("_npa", System.currentTimeMillis(), Long.valueOf(true != boolAm.booleanValue() ? 0L : 1L), "auto"), appMetadata);
                return;
            }
            kzz kzzVar = aB().j;
            kzu kzuVar = this.l.j;
            kzzVar.b("Removing user property", kzuVar.e(str));
            kug kugVar = this.c;
            ai(kugVar);
            kugVar.y();
            try {
                f(appMetadata);
                if ("_id".equals(str)) {
                    kug kugVar2 = this.c;
                    ai(kugVar2);
                    String str2 = appMetadata.a;
                    kkk.k(str2);
                    kugVar2.H(str2, "_lair");
                }
                kug kugVar3 = this.c;
                ai(kugVar3);
                String str3 = appMetadata.a;
                kkk.k(str3);
                kugVar3.H(str3, str);
                kug kugVar4 = this.c;
                ai(kugVar4);
                kugVar4.J();
                aB().j.b("User property removed", kzuVar.e(str));
            } finally {
                kug kugVar5 = this.c;
                ai(kugVar5);
                kugVar5.E();
            }
        }
    }

    public final void O() {
        aC().g();
        if (this.p.isEmpty() || ak().d()) {
            return;
        }
        kkk.k(this.l);
        long jMax = Math.max(0L, ((Integer) kzg.aB.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.w));
        aB().k.b("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        ak().c(jMax);
    }

    final void Q(AppMetadata appMetadata) {
        aC().g();
        v();
        String str = appMetadata.a;
        kkk.h(str);
        kuk kukVarB = kuk.b(appMetadata.y);
        aB().k.c("Setting DMA consent for package", str, kukVarB);
        aC().g();
        v();
        lcq lcqVarC = kuk.a(d(str), 100).c();
        this.F.put(str, kukVarB);
        kug kugVar = this.c;
        ai(kugVar);
        kkk.k(str);
        kkk.k(kukVarB);
        kugVar.g();
        kugVar.ag();
        lct lctVarM = kugVar.m(str);
        lct lctVar = lct.a;
        if (lctVarM == lctVar) {
            kugVar.M(str, lctVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", kukVarB.c);
        kugVar.ab(contentValues);
        lcq lcqVarC2 = kuk.a(d(str), 100).c();
        aC().g();
        v();
        lcq lcqVar = lcq.DENIED;
        boolean z = lcqVarC == lcqVar && lcqVarC2 == lcq.GRANTED;
        boolean z2 = lcqVarC == lcq.GRANTED && lcqVarC2 == lcqVar;
        if (z || z2) {
            aB().k.b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            kug kugVar2 = this.c;
            ai(kugVar2);
            if (kugVar2.T(a(), str, false, false, false, false).f < j().h(str, kzg.am)) {
                bundle.putLong("_r", 1L);
                kug kugVar3 = this.c;
                ai(kugVar3);
                aB().k.c("_dcu realtime event count", str, Long.valueOf(kugVar3.T(a(), str, false, false, true, false).f));
            }
            this.K.a(str, "_dcu", bundle);
        }
    }

    public final void R(String str, lez lezVar) {
        aC().g();
        String str2 = this.I;
        if (str2 == null || str2.equals(str) || lezVar != null) {
            this.I = str;
            this.H = lezVar;
        }
    }

    final void S(AppMetadata appMetadata) {
        aC().g();
        v();
        String str = appMetadata.a;
        kkk.h(str);
        lct lctVarH = lct.h(appMetadata.s, appMetadata.x);
        n(str);
        aB().k.c("Setting storage consent for package", str, lctVarH);
        W(str, lctVarH);
    }

    final void T(List list) {
        kkk.a(!list.isEmpty());
        if (this.t != null) {
            aB().c.a("Set uploading progress before finishing the previous upload");
        } else {
            this.t = new ArrayList(list);
        }
    }

    final void U(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        EventParcel eventParcel;
        kkk.h(conditionalUserPropertyParcel.a);
        kkk.k(conditionalUserPropertyParcel.b);
        kkk.k(conditionalUserPropertyParcel.c);
        kkk.h(conditionalUserPropertyParcel.c.b);
        aC().g();
        v();
        if (as(appMetadata)) {
            if (!appMetadata.h) {
                f(appMetadata);
                return;
            }
            ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
            boolean z = false;
            conditionalUserPropertyParcel2.e = false;
            kug kugVar = this.c;
            ai(kugVar);
            kugVar.y();
            try {
                kug kugVar2 = this.c;
                ai(kugVar2);
                String str = conditionalUserPropertyParcel2.a;
                kkk.k(str);
                ConditionalUserPropertyParcel conditionalUserPropertyParcelI = kugVar2.i(str, conditionalUserPropertyParcel2.c.b);
                if (conditionalUserPropertyParcelI != null && !conditionalUserPropertyParcelI.b.equals(conditionalUserPropertyParcel2.b)) {
                    aB().f.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.l.j.e(conditionalUserPropertyParcel2.c.b), conditionalUserPropertyParcel2.b, conditionalUserPropertyParcelI.b);
                }
                if (conditionalUserPropertyParcelI != null && conditionalUserPropertyParcelI.e) {
                    conditionalUserPropertyParcel2.b = conditionalUserPropertyParcelI.b;
                    conditionalUserPropertyParcel2.d = conditionalUserPropertyParcelI.d;
                    conditionalUserPropertyParcel2.h = conditionalUserPropertyParcelI.h;
                    conditionalUserPropertyParcel2.f = conditionalUserPropertyParcelI.f;
                    conditionalUserPropertyParcel2.i = conditionalUserPropertyParcelI.i;
                    conditionalUserPropertyParcel2.e = true;
                    UserAttributeParcel userAttributeParcel = conditionalUserPropertyParcel2.c;
                    conditionalUserPropertyParcel2.c = new UserAttributeParcel(userAttributeParcel.b, conditionalUserPropertyParcelI.c.c, userAttributeParcel.a(), conditionalUserPropertyParcelI.c.f);
                } else if (TextUtils.isEmpty(conditionalUserPropertyParcel2.f)) {
                    UserAttributeParcel userAttributeParcel2 = conditionalUserPropertyParcel2.c;
                    conditionalUserPropertyParcel2.c = new UserAttributeParcel(userAttributeParcel2.b, conditionalUserPropertyParcel2.d, userAttributeParcel2.a(), conditionalUserPropertyParcel2.c.f);
                    conditionalUserPropertyParcel2.e = true;
                    z = true;
                }
                if (conditionalUserPropertyParcel2.e) {
                    UserAttributeParcel userAttributeParcel3 = conditionalUserPropertyParcel2.c;
                    String str2 = conditionalUserPropertyParcel2.a;
                    kkk.k(str2);
                    String str3 = conditionalUserPropertyParcel2.b;
                    String str4 = userAttributeParcel3.b;
                    long j = userAttributeParcel3.c;
                    Object objA = userAttributeParcel3.a();
                    kkk.k(objA);
                    lim limVar = new lim(str2, str3, str4, j, objA);
                    kug kugVar3 = this.c;
                    ai(kugVar3);
                    if (kugVar3.R(limVar)) {
                        aB().j.d("User property updated immediately", conditionalUserPropertyParcel2.a, this.l.j.e(limVar.c), limVar.e);
                    } else {
                        aB().c.d("(2)Too many active user properties, ignoring", lab.b(conditionalUserPropertyParcel2.a), this.l.j.e(limVar.c), limVar.e);
                    }
                    if (z && (eventParcel = conditionalUserPropertyParcel2.i) != null) {
                        ad(new EventParcel(eventParcel, conditionalUserPropertyParcel2.d), appMetadata);
                    }
                }
                kug kugVar4 = this.c;
                ai(kugVar4);
                if (kugVar4.Q(conditionalUserPropertyParcel2)) {
                    aB().j.d("Conditional property added", conditionalUserPropertyParcel2.a, this.l.j.e(conditionalUserPropertyParcel2.c.b), conditionalUserPropertyParcel2.c.a());
                } else {
                    aB().c.d("Too many conditional properties, ignoring", lab.b(conditionalUserPropertyParcel2.a), this.l.j.e(conditionalUserPropertyParcel2.c.b), conditionalUserPropertyParcel2.c.a());
                }
                kug kugVar5 = this.c;
                ai(kugVar5);
                kugVar5.J();
            } finally {
                kug kugVar6 = this.c;
                ai(kugVar6);
                kugVar6.E();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V() {
        /*
            Method dump skipped, instructions count: 965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.V():void");
    }

    final void W(String str, lct lctVar) {
        aC().g();
        v();
        this.E.put(str, lctVar);
        kug kugVar = this.c;
        ai(kugVar);
        kugVar.M(str, lctVar);
    }

    final void X(String str, boolean z, Long l, Long l2) {
        kug kugVar = this.c;
        ai(kugVar);
        ksx ksxVarH = kugVar.h(str);
        if (ksxVarH != null) {
            ksxVarH.ai(z);
            ksxVarH.aj(l);
            ksxVarH.ak(l2);
            if (ksxVarH.an()) {
                kug kugVar2 = this.c;
                ai(kugVar2);
                kugVar2.aa(ksxVarH, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void Y(com.google.android.gms.measurement.internal.UserAttributeParcel r22, com.google.android.gms.measurement.internal.AppMetadata r23) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.Y(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101 A[Catch: all -> 0x01b2, DONT_GENERATE, PHI: r5 r7
  0x0101: PHI (r5v4 long) = (r5v0 long), (r5v5 long), (r5v0 long) binds: [B:43:0x011d, B:37:0x0109, B:33:0x00ff] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r7v12 android.database.Cursor) = (r7v10 android.database.Cursor), (r7v13 android.database.Cursor), (r7v13 android.database.Cursor) binds: [B:43:0x011d, B:37:0x0109, B:33:0x00ff] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01b2, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0027, B:8:0x002d, B:9:0x003a, B:11:0x0042, B:12:0x0047, B:14:0x0052, B:15:0x005f, B:17:0x006a, B:18:0x007a, B:20:0x0099, B:22:0x009f, B:23:0x00a2, B:25:0x00be, B:26:0x00d3, B:28:0x00e4, B:30:0x00ea, B:34:0x0101, B:45:0x0120, B:47:0x0125, B:48:0x0128, B:49:0x0129, B:50:0x012e, B:56:0x016c, B:70:0x0190, B:72:0x0196, B:74:0x01a1, B:80:0x01ae, B:81:0x01b1, B:31:0x00ef, B:36:0x0105, B:42:0x010f), top: B:88:0x000e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c A[Catch: all -> 0x01b2, PHI: r1 r3 r7
  0x016c: PHI (r1v14 android.database.Cursor) = (r1v27 android.database.Cursor), (r1v28 android.database.Cursor), (r1v29 android.database.Cursor) binds: [B:68:0x018d, B:59:0x0174, B:55:0x016a] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r3v15 kug) = (r3v18 kug), (r3v19 kug), (r3v20 kug) binds: [B:68:0x018d, B:59:0x0174, B:55:0x016a] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r7v6 java.lang.String) = (r7v3 java.lang.String), (r7v7 java.lang.String), (r7v16 java.lang.String) binds: [B:68:0x018d, B:59:0x0174, B:55:0x016a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01b2, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0027, B:8:0x002d, B:9:0x003a, B:11:0x0042, B:12:0x0047, B:14:0x0052, B:15:0x005f, B:17:0x006a, B:18:0x007a, B:20:0x0099, B:22:0x009f, B:23:0x00a2, B:25:0x00be, B:26:0x00d3, B:28:0x00e4, B:30:0x00ea, B:34:0x0101, B:45:0x0120, B:47:0x0125, B:48:0x0128, B:49:0x0129, B:50:0x012e, B:56:0x016c, B:70:0x0190, B:72:0x0196, B:74:0x01a1, B:80:0x01ae, B:81:0x01b1, B:31:0x00ef, B:36:0x0105, B:42:0x010f), top: B:88:0x000e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196 A[Catch: all -> 0x01b2, TryCatch #1 {all -> 0x01b2, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0027, B:8:0x002d, B:9:0x003a, B:11:0x0042, B:12:0x0047, B:14:0x0052, B:15:0x005f, B:17:0x006a, B:18:0x007a, B:20:0x0099, B:22:0x009f, B:23:0x00a2, B:25:0x00be, B:26:0x00d3, B:28:0x00e4, B:30:0x00ea, B:34:0x0101, B:45:0x0120, B:47:0x0125, B:48:0x0128, B:49:0x0129, B:50:0x012e, B:56:0x016c, B:70:0x0190, B:72:0x0196, B:74:0x01a1, B:80:0x01ae, B:81:0x01b1, B:31:0x00ef, B:36:0x0105, B:42:0x010f), top: B:88:0x000e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae A[Catch: all -> 0x01b2, TRY_ENTER, TryCatch #1 {all -> 0x01b2, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0027, B:8:0x002d, B:9:0x003a, B:11:0x0042, B:12:0x0047, B:14:0x0052, B:15:0x005f, B:17:0x006a, B:18:0x007a, B:20:0x0099, B:22:0x009f, B:23:0x00a2, B:25:0x00be, B:26:0x00d3, B:28:0x00e4, B:30:0x00ea, B:34:0x0101, B:45:0x0120, B:47:0x0125, B:48:0x0128, B:49:0x0129, B:50:0x012e, B:56:0x016c, B:70:0x0190, B:72:0x0196, B:74:0x01a1, B:80:0x01ae, B:81:0x01b1, B:31:0x00ef, B:36:0x0105, B:42:0x010f), top: B:88:0x000e, inners: #5 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x018d -> B:56:0x016c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x018d -> B:70:0x0190). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void Z() {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.Z():void");
    }

    final long a() {
        kkk.k(this.l);
        long jCurrentTimeMillis = System.currentTimeMillis();
        lgr lgrVar = this.i;
        lgrVar.ag();
        lgrVar.g();
        lal lalVar = lgrVar.f;
        lalVar.a();
        long jNextInt = lalVar.a;
        if (jNextInt == 0) {
            lbk lbkVar = lgrVar.y;
            lbkVar.m(lbkVar.i);
            jNextInt = r4.F().nextInt(86400000) + 1;
            lalVar.b(jNextInt);
        }
        return ((((jCurrentTimeMillis + jNextInt) / 1000) / 60) / 60) / 24;
    }

    @Override // defpackage.lco
    public final kts aA() {
        throw null;
    }

    @Override // defpackage.lco
    public final lab aB() {
        lbk lbkVar = this.l;
        kkk.k(lbkVar);
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        return labVar;
    }

    @Override // defpackage.lco
    public final lbh aC() {
        lbk lbkVar = this.l;
        kkk.k(lbkVar);
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        return lbhVar;
    }

    @Override // defpackage.lco
    public final void aD() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02de A[LOOP:11: B:108:0x02de->B:124:0x0343, LOOP_START, PHI: r5 r8
  0x02de: PHI (r5v75 java.util.List) = (r5v37 java.util.List), (r5v82 java.util.List) binds: [B:107:0x02dc, B:124:0x0343] A[DONT_GENERATE, DONT_INLINE]
  0x02de: PHI (r8v31 android.database.Cursor) = (r8v26 android.database.Cursor), (r8v34 android.database.Cursor) binds: [B:107:0x02dc, B:124:0x0343] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0bff A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x090c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void aa(java.lang.String r35, long r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.aa(java.lang.String, long):void");
    }

    final void ab(String str) {
        llc llcVar;
        int iA;
        aC().g();
        v();
        this.A = true;
        try {
            lbk lbkVar = this.l;
            kts ktsVar = lbkVar.c;
            Boolean bool = lbkVar.k().c;
            if (bool == null) {
                aB().f.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                aB().c.a("Upload called in the client side when service should be used");
            } else if (this.n > 0) {
                V();
            } else {
                lag lagVar = this.b;
                ai(lagVar);
                if (lagVar.d()) {
                    kug kugVar = this.c;
                    ai(kugVar);
                    if (kugVar.N(str)) {
                        kug kugVar2 = this.c;
                        ai(kugVar2);
                        kkk.h(str);
                        kugVar2.g();
                        kugVar2.ag();
                        List listU = kugVar2.u(str, UploadBatchesCriteria.a(lex.GOOGLE_SIGNAL), 1);
                        lij lijVar = listU.isEmpty() ? null : (lij) listU.get(0);
                        if (lijVar != null && (llcVar = lijVar.b) != null) {
                            aB().k.d("[sgtm] Uploading data from upload queue. appId, type, url", str, lijVar.e, lijVar.c);
                            try {
                                int i = llcVar.memoizedSerializedSize;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    iA = abza.a.a(llcVar.getClass()).a(llcVar);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA = i & Integer.MAX_VALUE;
                                    if (iA == Integer.MAX_VALUE) {
                                        iA = abza.a.a(llcVar.getClass()).a(llcVar);
                                        if (iA < 0) {
                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                        }
                                        llcVar.memoizedSerializedSize = (Integer.MIN_VALUE & llcVar.memoizedSerializedSize) | iA;
                                    }
                                }
                                boolean z = abvz.e;
                                abvw abvwVar = new abvw(new byte[iA], 0, iA);
                                abza.a.a(llcVar.getClass()).m(llcVar, abwa.a(abvwVar));
                                abvwVar.K();
                                if (Log.isLoggable(aB().f(), 2)) {
                                    lik likVar = this.g;
                                    ai(likVar);
                                    aB().k.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(iA), likVar.s(llcVar));
                                }
                                lhu lhuVar = new lhu(lijVar.c, lijVar.d, lijVar.e, null);
                                this.s = true;
                                lag lagVar2 = this.b;
                                ai(lagVar2);
                                lagVar2.c(str, lhuVar, llcVar, new lhz(this, str, lijVar));
                            } catch (IOException e) {
                                throw new RuntimeException(a.A(llcVar, "byte array"), e);
                            }
                        }
                    } else {
                        aB().k.b("[sgtm] Upload queue has no batches for appId", str);
                    }
                } else {
                    aB().k.a("Network not connected, ignoring upload request");
                    V();
                }
            }
        } finally {
            this.A = false;
            x();
        }
    }

    final void ac(String str, lkz lkzVar, Bundle bundle, String str2) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        long jD = (lio.am(((lla) lkzVar.b).c) || lio.am(str)) ? j().d(str2, true) : j().c(str2, true);
        String str3 = ((lla) lkzVar.b).d;
        long jCodePointCount = str3.codePointCount(0, str3.length());
        lio lioVarP = p();
        String str4 = ((lla) lkzVar.b).c;
        j();
        String strD = lioVarP.D(str4, 40, true);
        if (jCodePointCount <= jD || listUnmodifiableList.contains(((lla) lkzVar.b).c)) {
            return;
        }
        if ("_ev".equals(((lla) lkzVar.b).c)) {
            bundle.putString("_ev", p().D(((lla) lkzVar.b).d, j().d(str2, true), true));
            return;
        }
        aB().h.c("Param value is too long; discarded. Name, value length", strD, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strD);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((lla) lkzVar.b).c);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03cd A[Catch: all -> 0x06d7, TryCatch #2 {all -> 0x06d7, blocks: (B:64:0x023c, B:67:0x024b, B:69:0x0253, B:74:0x025d, B:80:0x026c, B:82:0x0278, B:84:0x0290, B:89:0x02a7, B:94:0x02d8, B:96:0x02de, B:98:0x02ec, B:100:0x0301, B:103:0x0308, B:110:0x0384, B:112:0x038f, B:104:0x032d, B:105:0x0349, B:109:0x036e, B:108:0x035c, B:92:0x02b3, B:93:0x02d0, B:113:0x03b8, B:123:0x03ef, B:125:0x0436, B:127:0x043b, B:128:0x0450, B:130:0x045c, B:132:0x0473, B:134:0x0478, B:135:0x048d, B:138:0x04ac, B:142:0x04cd, B:143:0x04e2, B:145:0x04ed, B:147:0x0508, B:148:0x051e, B:150:0x0526, B:152:0x0535, B:154:0x053b, B:155:0x0542, B:157:0x054e, B:159:0x0556, B:161:0x055e, B:163:0x0568, B:164:0x0574, B:165:0x0582, B:171:0x05c3, B:172:0x05d6, B:174:0x05f7, B:177:0x061a, B:181:0x0654, B:183:0x069b, B:182:0x0670, B:168:0x05ab, B:117:0x03cd, B:118:0x03d4, B:120:0x03da, B:122:0x03e8), top: B:196:0x023c, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0436 A[Catch: all -> 0x06d7, TryCatch #2 {all -> 0x06d7, blocks: (B:64:0x023c, B:67:0x024b, B:69:0x0253, B:74:0x025d, B:80:0x026c, B:82:0x0278, B:84:0x0290, B:89:0x02a7, B:94:0x02d8, B:96:0x02de, B:98:0x02ec, B:100:0x0301, B:103:0x0308, B:110:0x0384, B:112:0x038f, B:104:0x032d, B:105:0x0349, B:109:0x036e, B:108:0x035c, B:92:0x02b3, B:93:0x02d0, B:113:0x03b8, B:123:0x03ef, B:125:0x0436, B:127:0x043b, B:128:0x0450, B:130:0x045c, B:132:0x0473, B:134:0x0478, B:135:0x048d, B:138:0x04ac, B:142:0x04cd, B:143:0x04e2, B:145:0x04ed, B:147:0x0508, B:148:0x051e, B:150:0x0526, B:152:0x0535, B:154:0x053b, B:155:0x0542, B:157:0x054e, B:159:0x0556, B:161:0x055e, B:163:0x0568, B:164:0x0574, B:165:0x0582, B:171:0x05c3, B:172:0x05d6, B:174:0x05f7, B:177:0x061a, B:181:0x0654, B:183:0x069b, B:182:0x0670, B:168:0x05ab, B:117:0x03cd, B:118:0x03d4, B:120:0x03da, B:122:0x03e8), top: B:196:0x023c, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void ad(com.google.android.gms.measurement.internal.EventParcel r42, com.google.android.gms.measurement.internal.AppMetadata r43) {
        /*
            Method dump skipped, instructions count: 1765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.ad(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0517  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.CharSequence, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void ae(defpackage.kum r34, com.google.android.gms.measurement.internal.AppMetadata r35) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.ae(kum, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0479 A[Catch: all -> 0x0c41, TryCatch #0 {all -> 0x0c41, blocks: (B:3:0x0010, B:5:0x0027, B:8:0x002f, B:10:0x0043, B:11:0x0046, B:12:0x005b, B:15:0x006f, B:18:0x009d, B:20:0x00cd, B:23:0x00db, B:25:0x00e7, B:251:0x07cb, B:28:0x0117, B:31:0x012d, B:33:0x0133, B:54:0x01a7, B:56:0x01b7, B:58:0x01bf, B:59:0x01c2, B:62:0x01e9, B:64:0x01f5, B:66:0x0203, B:68:0x020f, B:70:0x021d, B:71:0x0228, B:72:0x022b, B:75:0x0240, B:151:0x04d0, B:152:0x04e2, B:155:0x04ea, B:161:0x050b, B:158:0x04fa, B:183:0x0587, B:185:0x0593, B:188:0x05a6, B:190:0x05bd, B:192:0x05c9, B:209:0x064c, B:211:0x0658, B:212:0x066c, B:214:0x0678, B:216:0x0686, B:218:0x068e, B:219:0x069d, B:221:0x06a3, B:222:0x06ba, B:224:0x06c0, B:225:0x06e6, B:226:0x06f3, B:231:0x0721, B:227:0x06fb, B:229:0x0709, B:232:0x072c, B:234:0x073b, B:235:0x073e, B:236:0x0756, B:238:0x075c, B:240:0x0771, B:241:0x0774, B:243:0x0789, B:245:0x0797, B:246:0x079b, B:248:0x07a1, B:250:0x07b3, B:196:0x05e8, B:198:0x05fa, B:201:0x060f, B:203:0x0628, B:205:0x0634, B:165:0x0513, B:181:0x056d, B:173:0x0547, B:176:0x0557, B:178:0x055d, B:180:0x0567, B:168:0x0521, B:170:0x052d, B:84:0x026a, B:87:0x027e, B:89:0x028a, B:91:0x029f, B:92:0x02a2, B:99:0x02f5, B:93:0x02ba, B:95:0x02c6, B:97:0x02db, B:98:0x02de, B:102:0x0301, B:104:0x032a, B:105:0x032d, B:107:0x0341, B:108:0x0344, B:111:0x035a, B:113:0x0383, B:114:0x0386, B:116:0x039a, B:117:0x039d, B:118:0x03ae, B:120:0x03e0, B:122:0x03e6, B:125:0x03f4, B:127:0x0426, B:128:0x043d, B:130:0x0449, B:132:0x0455, B:136:0x046b, B:133:0x0461, B:139:0x0472, B:142:0x0479, B:144:0x0487, B:145:0x048a, B:147:0x04a0, B:148:0x04a3, B:149:0x04bb, B:37:0x0141, B:39:0x0157, B:40:0x015a, B:42:0x016a, B:44:0x0174, B:46:0x017a, B:50:0x0185, B:52:0x018d, B:53:0x0190, B:254:0x07e6, B:256:0x07f2, B:258:0x07fd, B:260:0x0805, B:261:0x0808, B:263:0x0814, B:264:0x081f, B:275:0x0851, B:265:0x0829, B:267:0x0834, B:269:0x083a, B:272:0x0844, B:274:0x084c, B:276:0x0854, B:277:0x0866, B:280:0x086e, B:282:0x087e, B:283:0x088c, B:285:0x0894, B:289:0x08b6, B:291:0x08cf, B:293:0x08e2, B:295:0x08fb, B:297:0x090e, B:299:0x0919, B:300:0x091c, B:302:0x097a, B:304:0x0980, B:310:0x09a5, B:312:0x09bd, B:314:0x09cb, B:316:0x09db, B:318:0x09e1, B:319:0x09e4, B:321:0x09ec, B:322:0x09ef, B:324:0x0a41, B:325:0x0a44, B:327:0x0a53, B:371:0x0b82, B:373:0x0b8e, B:375:0x0ba1, B:377:0x0ba9, B:379:0x0bb3, B:380:0x0bb6, B:389:0x0bfe, B:391:0x0c11, B:382:0x0bc6, B:384:0x0bd0, B:386:0x0bd8, B:387:0x0bdb, B:388:0x0beb, B:328:0x0a68, B:330:0x0a74, B:332:0x0a7c, B:334:0x0a84, B:335:0x0a87, B:340:0x0aac, B:346:0x0aba, B:348:0x0ac2, B:349:0x0ac5, B:354:0x0ae9, B:356:0x0b04, B:357:0x0b07, B:359:0x0b21, B:360:0x0b24, B:362:0x0b45, B:364:0x0b4d, B:365:0x0b50, B:370:0x0b79, B:366:0x0b5e, B:368:0x0b66, B:369:0x0b69, B:350:0x0ad2, B:352:0x0ada, B:353:0x0add, B:336:0x0a94, B:338:0x0a9c, B:339:0x0a9f, B:305:0x098d, B:307:0x0993, B:309:0x0999, B:296:0x090b, B:292:0x08df, B:286:0x089a, B:288:0x08a0, B:392:0x0c2e), top: B:399:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04bb A[Catch: all -> 0x0c41, TryCatch #0 {all -> 0x0c41, blocks: (B:3:0x0010, B:5:0x0027, B:8:0x002f, B:10:0x0043, B:11:0x0046, B:12:0x005b, B:15:0x006f, B:18:0x009d, B:20:0x00cd, B:23:0x00db, B:25:0x00e7, B:251:0x07cb, B:28:0x0117, B:31:0x012d, B:33:0x0133, B:54:0x01a7, B:56:0x01b7, B:58:0x01bf, B:59:0x01c2, B:62:0x01e9, B:64:0x01f5, B:66:0x0203, B:68:0x020f, B:70:0x021d, B:71:0x0228, B:72:0x022b, B:75:0x0240, B:151:0x04d0, B:152:0x04e2, B:155:0x04ea, B:161:0x050b, B:158:0x04fa, B:183:0x0587, B:185:0x0593, B:188:0x05a6, B:190:0x05bd, B:192:0x05c9, B:209:0x064c, B:211:0x0658, B:212:0x066c, B:214:0x0678, B:216:0x0686, B:218:0x068e, B:219:0x069d, B:221:0x06a3, B:222:0x06ba, B:224:0x06c0, B:225:0x06e6, B:226:0x06f3, B:231:0x0721, B:227:0x06fb, B:229:0x0709, B:232:0x072c, B:234:0x073b, B:235:0x073e, B:236:0x0756, B:238:0x075c, B:240:0x0771, B:241:0x0774, B:243:0x0789, B:245:0x0797, B:246:0x079b, B:248:0x07a1, B:250:0x07b3, B:196:0x05e8, B:198:0x05fa, B:201:0x060f, B:203:0x0628, B:205:0x0634, B:165:0x0513, B:181:0x056d, B:173:0x0547, B:176:0x0557, B:178:0x055d, B:180:0x0567, B:168:0x0521, B:170:0x052d, B:84:0x026a, B:87:0x027e, B:89:0x028a, B:91:0x029f, B:92:0x02a2, B:99:0x02f5, B:93:0x02ba, B:95:0x02c6, B:97:0x02db, B:98:0x02de, B:102:0x0301, B:104:0x032a, B:105:0x032d, B:107:0x0341, B:108:0x0344, B:111:0x035a, B:113:0x0383, B:114:0x0386, B:116:0x039a, B:117:0x039d, B:118:0x03ae, B:120:0x03e0, B:122:0x03e6, B:125:0x03f4, B:127:0x0426, B:128:0x043d, B:130:0x0449, B:132:0x0455, B:136:0x046b, B:133:0x0461, B:139:0x0472, B:142:0x0479, B:144:0x0487, B:145:0x048a, B:147:0x04a0, B:148:0x04a3, B:149:0x04bb, B:37:0x0141, B:39:0x0157, B:40:0x015a, B:42:0x016a, B:44:0x0174, B:46:0x017a, B:50:0x0185, B:52:0x018d, B:53:0x0190, B:254:0x07e6, B:256:0x07f2, B:258:0x07fd, B:260:0x0805, B:261:0x0808, B:263:0x0814, B:264:0x081f, B:275:0x0851, B:265:0x0829, B:267:0x0834, B:269:0x083a, B:272:0x0844, B:274:0x084c, B:276:0x0854, B:277:0x0866, B:280:0x086e, B:282:0x087e, B:283:0x088c, B:285:0x0894, B:289:0x08b6, B:291:0x08cf, B:293:0x08e2, B:295:0x08fb, B:297:0x090e, B:299:0x0919, B:300:0x091c, B:302:0x097a, B:304:0x0980, B:310:0x09a5, B:312:0x09bd, B:314:0x09cb, B:316:0x09db, B:318:0x09e1, B:319:0x09e4, B:321:0x09ec, B:322:0x09ef, B:324:0x0a41, B:325:0x0a44, B:327:0x0a53, B:371:0x0b82, B:373:0x0b8e, B:375:0x0ba1, B:377:0x0ba9, B:379:0x0bb3, B:380:0x0bb6, B:389:0x0bfe, B:391:0x0c11, B:382:0x0bc6, B:384:0x0bd0, B:386:0x0bd8, B:387:0x0bdb, B:388:0x0beb, B:328:0x0a68, B:330:0x0a74, B:332:0x0a7c, B:334:0x0a84, B:335:0x0a87, B:340:0x0aac, B:346:0x0aba, B:348:0x0ac2, B:349:0x0ac5, B:354:0x0ae9, B:356:0x0b04, B:357:0x0b07, B:359:0x0b21, B:360:0x0b24, B:362:0x0b45, B:364:0x0b4d, B:365:0x0b50, B:370:0x0b79, B:366:0x0b5e, B:368:0x0b66, B:369:0x0b69, B:350:0x0ad2, B:352:0x0ada, B:353:0x0add, B:336:0x0a94, B:338:0x0a9c, B:339:0x0a9f, B:305:0x098d, B:307:0x0993, B:309:0x0999, B:296:0x090b, B:292:0x08df, B:286:0x089a, B:288:0x08a0, B:392:0x0c2e), top: B:399:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0593 A[Catch: all -> 0x0c41, TryCatch #0 {all -> 0x0c41, blocks: (B:3:0x0010, B:5:0x0027, B:8:0x002f, B:10:0x0043, B:11:0x0046, B:12:0x005b, B:15:0x006f, B:18:0x009d, B:20:0x00cd, B:23:0x00db, B:25:0x00e7, B:251:0x07cb, B:28:0x0117, B:31:0x012d, B:33:0x0133, B:54:0x01a7, B:56:0x01b7, B:58:0x01bf, B:59:0x01c2, B:62:0x01e9, B:64:0x01f5, B:66:0x0203, B:68:0x020f, B:70:0x021d, B:71:0x0228, B:72:0x022b, B:75:0x0240, B:151:0x04d0, B:152:0x04e2, B:155:0x04ea, B:161:0x050b, B:158:0x04fa, B:183:0x0587, B:185:0x0593, B:188:0x05a6, B:190:0x05bd, B:192:0x05c9, B:209:0x064c, B:211:0x0658, B:212:0x066c, B:214:0x0678, B:216:0x0686, B:218:0x068e, B:219:0x069d, B:221:0x06a3, B:222:0x06ba, B:224:0x06c0, B:225:0x06e6, B:226:0x06f3, B:231:0x0721, B:227:0x06fb, B:229:0x0709, B:232:0x072c, B:234:0x073b, B:235:0x073e, B:236:0x0756, B:238:0x075c, B:240:0x0771, B:241:0x0774, B:243:0x0789, B:245:0x0797, B:246:0x079b, B:248:0x07a1, B:250:0x07b3, B:196:0x05e8, B:198:0x05fa, B:201:0x060f, B:203:0x0628, B:205:0x0634, B:165:0x0513, B:181:0x056d, B:173:0x0547, B:176:0x0557, B:178:0x055d, B:180:0x0567, B:168:0x0521, B:170:0x052d, B:84:0x026a, B:87:0x027e, B:89:0x028a, B:91:0x029f, B:92:0x02a2, B:99:0x02f5, B:93:0x02ba, B:95:0x02c6, B:97:0x02db, B:98:0x02de, B:102:0x0301, B:104:0x032a, B:105:0x032d, B:107:0x0341, B:108:0x0344, B:111:0x035a, B:113:0x0383, B:114:0x0386, B:116:0x039a, B:117:0x039d, B:118:0x03ae, B:120:0x03e0, B:122:0x03e6, B:125:0x03f4, B:127:0x0426, B:128:0x043d, B:130:0x0449, B:132:0x0455, B:136:0x046b, B:133:0x0461, B:139:0x0472, B:142:0x0479, B:144:0x0487, B:145:0x048a, B:147:0x04a0, B:148:0x04a3, B:149:0x04bb, B:37:0x0141, B:39:0x0157, B:40:0x015a, B:42:0x016a, B:44:0x0174, B:46:0x017a, B:50:0x0185, B:52:0x018d, B:53:0x0190, B:254:0x07e6, B:256:0x07f2, B:258:0x07fd, B:260:0x0805, B:261:0x0808, B:263:0x0814, B:264:0x081f, B:275:0x0851, B:265:0x0829, B:267:0x0834, B:269:0x083a, B:272:0x0844, B:274:0x084c, B:276:0x0854, B:277:0x0866, B:280:0x086e, B:282:0x087e, B:283:0x088c, B:285:0x0894, B:289:0x08b6, B:291:0x08cf, B:293:0x08e2, B:295:0x08fb, B:297:0x090e, B:299:0x0919, B:300:0x091c, B:302:0x097a, B:304:0x0980, B:310:0x09a5, B:312:0x09bd, B:314:0x09cb, B:316:0x09db, B:318:0x09e1, B:319:0x09e4, B:321:0x09ec, B:322:0x09ef, B:324:0x0a41, B:325:0x0a44, B:327:0x0a53, B:371:0x0b82, B:373:0x0b8e, B:375:0x0ba1, B:377:0x0ba9, B:379:0x0bb3, B:380:0x0bb6, B:389:0x0bfe, B:391:0x0c11, B:382:0x0bc6, B:384:0x0bd0, B:386:0x0bd8, B:387:0x0bdb, B:388:0x0beb, B:328:0x0a68, B:330:0x0a74, B:332:0x0a7c, B:334:0x0a84, B:335:0x0a87, B:340:0x0aac, B:346:0x0aba, B:348:0x0ac2, B:349:0x0ac5, B:354:0x0ae9, B:356:0x0b04, B:357:0x0b07, B:359:0x0b21, B:360:0x0b24, B:362:0x0b45, B:364:0x0b4d, B:365:0x0b50, B:370:0x0b79, B:366:0x0b5e, B:368:0x0b66, B:369:0x0b69, B:350:0x0ad2, B:352:0x0ada, B:353:0x0add, B:336:0x0a94, B:338:0x0a9c, B:339:0x0a9f, B:305:0x098d, B:307:0x0993, B:309:0x0999, B:296:0x090b, B:292:0x08df, B:286:0x089a, B:288:0x08a0, B:392:0x0c2e), top: B:399:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05e8 A[Catch: all -> 0x0c41, TryCatch #0 {all -> 0x0c41, blocks: (B:3:0x0010, B:5:0x0027, B:8:0x002f, B:10:0x0043, B:11:0x0046, B:12:0x005b, B:15:0x006f, B:18:0x009d, B:20:0x00cd, B:23:0x00db, B:25:0x00e7, B:251:0x07cb, B:28:0x0117, B:31:0x012d, B:33:0x0133, B:54:0x01a7, B:56:0x01b7, B:58:0x01bf, B:59:0x01c2, B:62:0x01e9, B:64:0x01f5, B:66:0x0203, B:68:0x020f, B:70:0x021d, B:71:0x0228, B:72:0x022b, B:75:0x0240, B:151:0x04d0, B:152:0x04e2, B:155:0x04ea, B:161:0x050b, B:158:0x04fa, B:183:0x0587, B:185:0x0593, B:188:0x05a6, B:190:0x05bd, B:192:0x05c9, B:209:0x064c, B:211:0x0658, B:212:0x066c, B:214:0x0678, B:216:0x0686, B:218:0x068e, B:219:0x069d, B:221:0x06a3, B:222:0x06ba, B:224:0x06c0, B:225:0x06e6, B:226:0x06f3, B:231:0x0721, B:227:0x06fb, B:229:0x0709, B:232:0x072c, B:234:0x073b, B:235:0x073e, B:236:0x0756, B:238:0x075c, B:240:0x0771, B:241:0x0774, B:243:0x0789, B:245:0x0797, B:246:0x079b, B:248:0x07a1, B:250:0x07b3, B:196:0x05e8, B:198:0x05fa, B:201:0x060f, B:203:0x0628, B:205:0x0634, B:165:0x0513, B:181:0x056d, B:173:0x0547, B:176:0x0557, B:178:0x055d, B:180:0x0567, B:168:0x0521, B:170:0x052d, B:84:0x026a, B:87:0x027e, B:89:0x028a, B:91:0x029f, B:92:0x02a2, B:99:0x02f5, B:93:0x02ba, B:95:0x02c6, B:97:0x02db, B:98:0x02de, B:102:0x0301, B:104:0x032a, B:105:0x032d, B:107:0x0341, B:108:0x0344, B:111:0x035a, B:113:0x0383, B:114:0x0386, B:116:0x039a, B:117:0x039d, B:118:0x03ae, B:120:0x03e0, B:122:0x03e6, B:125:0x03f4, B:127:0x0426, B:128:0x043d, B:130:0x0449, B:132:0x0455, B:136:0x046b, B:133:0x0461, B:139:0x0472, B:142:0x0479, B:144:0x0487, B:145:0x048a, B:147:0x04a0, B:148:0x04a3, B:149:0x04bb, B:37:0x0141, B:39:0x0157, B:40:0x015a, B:42:0x016a, B:44:0x0174, B:46:0x017a, B:50:0x0185, B:52:0x018d, B:53:0x0190, B:254:0x07e6, B:256:0x07f2, B:258:0x07fd, B:260:0x0805, B:261:0x0808, B:263:0x0814, B:264:0x081f, B:275:0x0851, B:265:0x0829, B:267:0x0834, B:269:0x083a, B:272:0x0844, B:274:0x084c, B:276:0x0854, B:277:0x0866, B:280:0x086e, B:282:0x087e, B:283:0x088c, B:285:0x0894, B:289:0x08b6, B:291:0x08cf, B:293:0x08e2, B:295:0x08fb, B:297:0x090e, B:299:0x0919, B:300:0x091c, B:302:0x097a, B:304:0x0980, B:310:0x09a5, B:312:0x09bd, B:314:0x09cb, B:316:0x09db, B:318:0x09e1, B:319:0x09e4, B:321:0x09ec, B:322:0x09ef, B:324:0x0a41, B:325:0x0a44, B:327:0x0a53, B:371:0x0b82, B:373:0x0b8e, B:375:0x0ba1, B:377:0x0ba9, B:379:0x0bb3, B:380:0x0bb6, B:389:0x0bfe, B:391:0x0c11, B:382:0x0bc6, B:384:0x0bd0, B:386:0x0bd8, B:387:0x0bdb, B:388:0x0beb, B:328:0x0a68, B:330:0x0a74, B:332:0x0a7c, B:334:0x0a84, B:335:0x0a87, B:340:0x0aac, B:346:0x0aba, B:348:0x0ac2, B:349:0x0ac5, B:354:0x0ae9, B:356:0x0b04, B:357:0x0b07, B:359:0x0b21, B:360:0x0b24, B:362:0x0b45, B:364:0x0b4d, B:365:0x0b50, B:370:0x0b79, B:366:0x0b5e, B:368:0x0b66, B:369:0x0b69, B:350:0x0ad2, B:352:0x0ada, B:353:0x0add, B:336:0x0a94, B:338:0x0a9c, B:339:0x0a9f, B:305:0x098d, B:307:0x0993, B:309:0x0999, B:296:0x090b, B:292:0x08df, B:286:0x089a, B:288:0x08a0, B:392:0x0c2e), top: B:399:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0645 A[PHI: r4 r6
  0x0645: PHI (r4v18 lld) = (r4v17 lld), (r4v17 lld), (r4v23 lld) binds: [B:197:0x05f8, B:199:0x060b, B:195:0x05e3] A[DONT_GENERATE, DONT_INLINE]
  0x0645: PHI (r6v87 int) = (r6v86 int), (r6v86 int), (r6v94 int) binds: [B:197:0x05f8, B:199:0x060b, B:195:0x05e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0658 A[Catch: all -> 0x0c41, TryCatch #0 {all -> 0x0c41, blocks: (B:3:0x0010, B:5:0x0027, B:8:0x002f, B:10:0x0043, B:11:0x0046, B:12:0x005b, B:15:0x006f, B:18:0x009d, B:20:0x00cd, B:23:0x00db, B:25:0x00e7, B:251:0x07cb, B:28:0x0117, B:31:0x012d, B:33:0x0133, B:54:0x01a7, B:56:0x01b7, B:58:0x01bf, B:59:0x01c2, B:62:0x01e9, B:64:0x01f5, B:66:0x0203, B:68:0x020f, B:70:0x021d, B:71:0x0228, B:72:0x022b, B:75:0x0240, B:151:0x04d0, B:152:0x04e2, B:155:0x04ea, B:161:0x050b, B:158:0x04fa, B:183:0x0587, B:185:0x0593, B:188:0x05a6, B:190:0x05bd, B:192:0x05c9, B:209:0x064c, B:211:0x0658, B:212:0x066c, B:214:0x0678, B:216:0x0686, B:218:0x068e, B:219:0x069d, B:221:0x06a3, B:222:0x06ba, B:224:0x06c0, B:225:0x06e6, B:226:0x06f3, B:231:0x0721, B:227:0x06fb, B:229:0x0709, B:232:0x072c, B:234:0x073b, B:235:0x073e, B:236:0x0756, B:238:0x075c, B:240:0x0771, B:241:0x0774, B:243:0x0789, B:245:0x0797, B:246:0x079b, B:248:0x07a1, B:250:0x07b3, B:196:0x05e8, B:198:0x05fa, B:201:0x060f, B:203:0x0628, B:205:0x0634, B:165:0x0513, B:181:0x056d, B:173:0x0547, B:176:0x0557, B:178:0x055d, B:180:0x0567, B:168:0x0521, B:170:0x052d, B:84:0x026a, B:87:0x027e, B:89:0x028a, B:91:0x029f, B:92:0x02a2, B:99:0x02f5, B:93:0x02ba, B:95:0x02c6, B:97:0x02db, B:98:0x02de, B:102:0x0301, B:104:0x032a, B:105:0x032d, B:107:0x0341, B:108:0x0344, B:111:0x035a, B:113:0x0383, B:114:0x0386, B:116:0x039a, B:117:0x039d, B:118:0x03ae, B:120:0x03e0, B:122:0x03e6, B:125:0x03f4, B:127:0x0426, B:128:0x043d, B:130:0x0449, B:132:0x0455, B:136:0x046b, B:133:0x0461, B:139:0x0472, B:142:0x0479, B:144:0x0487, B:145:0x048a, B:147:0x04a0, B:148:0x04a3, B:149:0x04bb, B:37:0x0141, B:39:0x0157, B:40:0x015a, B:42:0x016a, B:44:0x0174, B:46:0x017a, B:50:0x0185, B:52:0x018d, B:53:0x0190, B:254:0x07e6, B:256:0x07f2, B:258:0x07fd, B:260:0x0805, B:261:0x0808, B:263:0x0814, B:264:0x081f, B:275:0x0851, B:265:0x0829, B:267:0x0834, B:269:0x083a, B:272:0x0844, B:274:0x084c, B:276:0x0854, B:277:0x0866, B:280:0x086e, B:282:0x087e, B:283:0x088c, B:285:0x0894, B:289:0x08b6, B:291:0x08cf, B:293:0x08e2, B:295:0x08fb, B:297:0x090e, B:299:0x0919, B:300:0x091c, B:302:0x097a, B:304:0x0980, B:310:0x09a5, B:312:0x09bd, B:314:0x09cb, B:316:0x09db, B:318:0x09e1, B:319:0x09e4, B:321:0x09ec, B:322:0x09ef, B:324:0x0a41, B:325:0x0a44, B:327:0x0a53, B:371:0x0b82, B:373:0x0b8e, B:375:0x0ba1, B:377:0x0ba9, B:379:0x0bb3, B:380:0x0bb6, B:389:0x0bfe, B:391:0x0c11, B:382:0x0bc6, B:384:0x0bd0, B:386:0x0bd8, B:387:0x0bdb, B:388:0x0beb, B:328:0x0a68, B:330:0x0a74, B:332:0x0a7c, B:334:0x0a84, B:335:0x0a87, B:340:0x0aac, B:346:0x0aba, B:348:0x0ac2, B:349:0x0ac5, B:354:0x0ae9, B:356:0x0b04, B:357:0x0b07, B:359:0x0b21, B:360:0x0b24, B:362:0x0b45, B:364:0x0b4d, B:365:0x0b50, B:370:0x0b79, B:366:0x0b5e, B:368:0x0b66, B:369:0x0b69, B:350:0x0ad2, B:352:0x0ada, B:353:0x0add, B:336:0x0a94, B:338:0x0a9c, B:339:0x0a9f, B:305:0x098d, B:307:0x0993, B:309:0x0999, B:296:0x090b, B:292:0x08df, B:286:0x089a, B:288:0x08a0, B:392:0x0c2e), top: B:399:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0829 A[Catch: all -> 0x0c41, TryCatch #0 {all -> 0x0c41, blocks: (B:3:0x0010, B:5:0x0027, B:8:0x002f, B:10:0x0043, B:11:0x0046, B:12:0x005b, B:15:0x006f, B:18:0x009d, B:20:0x00cd, B:23:0x00db, B:25:0x00e7, B:251:0x07cb, B:28:0x0117, B:31:0x012d, B:33:0x0133, B:54:0x01a7, B:56:0x01b7, B:58:0x01bf, B:59:0x01c2, B:62:0x01e9, B:64:0x01f5, B:66:0x0203, B:68:0x020f, B:70:0x021d, B:71:0x0228, B:72:0x022b, B:75:0x0240, B:151:0x04d0, B:152:0x04e2, B:155:0x04ea, B:161:0x050b, B:158:0x04fa, B:183:0x0587, B:185:0x0593, B:188:0x05a6, B:190:0x05bd, B:192:0x05c9, B:209:0x064c, B:211:0x0658, B:212:0x066c, B:214:0x0678, B:216:0x0686, B:218:0x068e, B:219:0x069d, B:221:0x06a3, B:222:0x06ba, B:224:0x06c0, B:225:0x06e6, B:226:0x06f3, B:231:0x0721, B:227:0x06fb, B:229:0x0709, B:232:0x072c, B:234:0x073b, B:235:0x073e, B:236:0x0756, B:238:0x075c, B:240:0x0771, B:241:0x0774, B:243:0x0789, B:245:0x0797, B:246:0x079b, B:248:0x07a1, B:250:0x07b3, B:196:0x05e8, B:198:0x05fa, B:201:0x060f, B:203:0x0628, B:205:0x0634, B:165:0x0513, B:181:0x056d, B:173:0x0547, B:176:0x0557, B:178:0x055d, B:180:0x0567, B:168:0x0521, B:170:0x052d, B:84:0x026a, B:87:0x027e, B:89:0x028a, B:91:0x029f, B:92:0x02a2, B:99:0x02f5, B:93:0x02ba, B:95:0x02c6, B:97:0x02db, B:98:0x02de, B:102:0x0301, B:104:0x032a, B:105:0x032d, B:107:0x0341, B:108:0x0344, B:111:0x035a, B:113:0x0383, B:114:0x0386, B:116:0x039a, B:117:0x039d, B:118:0x03ae, B:120:0x03e0, B:122:0x03e6, B:125:0x03f4, B:127:0x0426, B:128:0x043d, B:130:0x0449, B:132:0x0455, B:136:0x046b, B:133:0x0461, B:139:0x0472, B:142:0x0479, B:144:0x0487, B:145:0x048a, B:147:0x04a0, B:148:0x04a3, B:149:0x04bb, B:37:0x0141, B:39:0x0157, B:40:0x015a, B:42:0x016a, B:44:0x0174, B:46:0x017a, B:50:0x0185, B:52:0x018d, B:53:0x0190, B:254:0x07e6, B:256:0x07f2, B:258:0x07fd, B:260:0x0805, B:261:0x0808, B:263:0x0814, B:264:0x081f, B:275:0x0851, B:265:0x0829, B:267:0x0834, B:269:0x083a, B:272:0x0844, B:274:0x084c, B:276:0x0854, B:277:0x0866, B:280:0x086e, B:282:0x087e, B:283:0x088c, B:285:0x0894, B:289:0x08b6, B:291:0x08cf, B:293:0x08e2, B:295:0x08fb, B:297:0x090e, B:299:0x0919, B:300:0x091c, B:302:0x097a, B:304:0x0980, B:310:0x09a5, B:312:0x09bd, B:314:0x09cb, B:316:0x09db, B:318:0x09e1, B:319:0x09e4, B:321:0x09ec, B:322:0x09ef, B:324:0x0a41, B:325:0x0a44, B:327:0x0a53, B:371:0x0b82, B:373:0x0b8e, B:375:0x0ba1, B:377:0x0ba9, B:379:0x0bb3, B:380:0x0bb6, B:389:0x0bfe, B:391:0x0c11, B:382:0x0bc6, B:384:0x0bd0, B:386:0x0bd8, B:387:0x0bdb, B:388:0x0beb, B:328:0x0a68, B:330:0x0a74, B:332:0x0a7c, B:334:0x0a84, B:335:0x0a87, B:340:0x0aac, B:346:0x0aba, B:348:0x0ac2, B:349:0x0ac5, B:354:0x0ae9, B:356:0x0b04, B:357:0x0b07, B:359:0x0b21, B:360:0x0b24, B:362:0x0b45, B:364:0x0b4d, B:365:0x0b50, B:370:0x0b79, B:366:0x0b5e, B:368:0x0b66, B:369:0x0b69, B:350:0x0ad2, B:352:0x0ada, B:353:0x0add, B:336:0x0a94, B:338:0x0a9c, B:339:0x0a9f, B:305:0x098d, B:307:0x0993, B:309:0x0999, B:296:0x090b, B:292:0x08df, B:286:0x089a, B:288:0x08a0, B:392:0x0c2e), top: B:399:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean af(java.lang.String r40, long r41) {
        /*
            Method dump skipped, instructions count: 3147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.af(java.lang.String, long):boolean");
    }

    final boolean ag(String str, String str2) {
        kug kugVar = this.c;
        ai(kugVar);
        ksx ksxVarH = kugVar.h(str);
        if (ksxVarH != null && p().ai(str, ksxVarH.C())) {
            this.v.remove(str2);
            return true;
        }
        lig ligVar = (lig) this.v.get(str2);
        if (ligVar == null) {
            return true;
        }
        kkk.k(ligVar.a.l);
        return System.currentTimeMillis() >= ligVar.c;
    }

    final boolean ah() throws IOException {
        aC().g();
        FileLock fileLock = this.B;
        if (fileLock != null && fileLock.isValid()) {
            aB().k.a("Storage concurrent access okay");
            return true;
        }
        ktx ktxVar = this.c.y.d;
        File filesDir = this.l.a.getFilesDir();
        knz knzVar = kny.a;
        int i = koc.b;
        try {
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel());
            this.C = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            FileLock fileLockTryLock = fileChannelConvertMaybeLegacyFileChannelFromLibrary.tryLock();
            this.B = fileLockTryLock;
            if (fileLockTryLock != null) {
                aB().k.a("Storage concurrent access okay");
                return true;
            }
            aB().c.a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            aB().c.b("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            aB().c.b("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            aB().f.b("Storage lock already acquired", e3);
            return false;
        }
    }

    public final void ai(lht lhtVar) {
        if (lhtVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!lhtVar.ai()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(lhtVar.getClass()))));
        }
    }

    @Override // defpackage.lco
    public final Context az() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Bundle d(String str) {
        aC().g();
        v();
        lbb lbbVar = this.a;
        ai(lbbVar);
        if (lbbVar.d(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        lct lctVarN = n(str);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : lctVarN.b.entrySet()) {
            String strK = lct.k((lcq) entry.getValue());
            if (strK != null) {
                bundle2.putString(((lcs) entry.getKey()).e, strK);
            }
        }
        bundle.putAll(bundle2);
        kuk kukVarK = k(str, l(str), lctVarN, new ktz());
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : kukVarK.f.entrySet()) {
            String strK2 = lct.k((lcq) entry2.getValue());
            if (strK2 != null) {
                bundle3.putString(((lcs) entry2.getKey()).e, strK2);
            }
        }
        Boolean bool = kukVarK.d;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str2 = kukVarK.e;
        if (str2 != null) {
            bundle3.putString("cps_display_str", str2);
        }
        bundle.putAll(bundle3);
        kug kugVar = this.c;
        ai(kugVar);
        lim limVarO = kugVar.o(str, "_npa");
        bundle.putString("ad_personalization", 1 != (limVarO != null ? limVarO.e.equals(1L) : aj(str, new ktz())) ? "granted" : "denied");
        return bundle;
    }

    final Bundle e(String str, EventParcel eventParcel) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", eventParcel.b.b("_sid").longValue());
        kug kugVar = this.c;
        ai(kugVar);
        lim limVarO = kugVar.o(str, "_sno");
        if (limVarO != null) {
            Object obj = limVarO.e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    final ksx f(AppMetadata appMetadata) {
        boolean z;
        aC().g();
        v();
        kkk.k(appMetadata);
        String str = appMetadata.a;
        kkk.h(str);
        String str2 = appMetadata.t;
        if (!str2.isEmpty()) {
            this.G.put(str, new lif(this, str2));
        }
        kug kugVar = this.c;
        ai(kugVar);
        ksx ksxVarH = kugVar.h(str);
        lct lctVarI = n(str).i(lct.h(appMetadata.s, 100));
        lcs lcsVar = lcs.AD_STORAGE;
        String strE = lctVarI.n(lcsVar) ? this.i.e(str, appMetadata.n) : "";
        boolean z2 = true;
        boolean z3 = false;
        if (ksxVarH == null) {
            ksx ksxVar = new ksx(this.l, str);
            if (lctVarI.n(lcs.ANALYTICS_STORAGE)) {
                ksxVar.I(q(lctVarI));
            }
            if (lctVarI.n(lcsVar)) {
                ksxVar.aa(strE);
            }
            ksxVarH = ksxVar;
        } else if (lctVarI.n(lcsVar) && strE != null && !strE.equals(ksxVarH.z())) {
            boolean zIsEmpty = TextUtils.isEmpty(ksxVarH.z());
            ksxVarH.aa(strE);
            if (appMetadata.n && !"00000000-0000-0000-0000-000000000000".equals(this.i.d(str, lctVarI).first) && !zIsEmpty) {
                if (lctVarI.n(lcs.ANALYTICS_STORAGE)) {
                    ksxVarH.I(q(lctVarI));
                    z = false;
                } else {
                    z = true;
                }
                kug kugVar2 = this.c;
                ai(kugVar2);
                if (kugVar2.o(str, "_id") != null) {
                    kug kugVar3 = this.c;
                    ai(kugVar3);
                    if (kugVar3.o(str, "_lair") == null) {
                        kkk.k(this.l);
                        lim limVar = new lim(str, "auto", "_lair", System.currentTimeMillis(), 1L);
                        kug kugVar4 = this.c;
                        ai(kugVar4);
                        kugVar4.R(limVar);
                    }
                }
                z3 = z;
            } else if (TextUtils.isEmpty(ksxVarH.u()) && lctVarI.n(lcs.ANALYTICS_STORAGE)) {
                ksxVarH.I(q(lctVarI));
            }
        } else if (TextUtils.isEmpty(ksxVarH.u()) && lctVarI.n(lcs.ANALYTICS_STORAGE)) {
            ksxVarH.I(q(lctVarI));
        }
        ksxVarH.S(appMetadata.b);
        String str3 = appMetadata.k;
        if (!TextUtils.isEmpty(str3)) {
            ksxVarH.R(str3);
        }
        long j = appMetadata.e;
        if (j != 0) {
            ksxVarH.T(j);
        }
        String str4 = appMetadata.c;
        if (!TextUtils.isEmpty(str4)) {
            ksxVarH.K(str4);
        }
        ksxVarH.L(appMetadata.j);
        String str5 = appMetadata.d;
        if (str5 != null) {
            ksxVarH.J(str5);
        }
        ksxVarH.O(appMetadata.f);
        ksxVarH.Y(appMetadata.h);
        String str6 = appMetadata.g;
        if (!TextUtils.isEmpty(str6)) {
            ksxVarH.U(str6);
        }
        ksxVarH.H(appMetadata.n);
        ksxVarH.Z(appMetadata.p);
        ksxVarH.P(appMetadata.q);
        ksxVarH.ad(appMetadata.u);
        aety aetyVar = aety.a;
        aetyVar.eV();
        if (j().t(null, kzg.aL)) {
            ksxVarH.ab(appMetadata.r);
        } else {
            aetyVar.eV();
            if (j().t(null, kzg.aK)) {
                ksxVarH.ab(null);
            }
        }
        ksxVarH.ag(appMetadata.v);
        ksxVarH.af(appMetadata.B);
        aeuw.a.eV();
        if (j().t(null, kzg.aP)) {
            ksxVarH.G(appMetadata.z);
        }
        ksxVarH.ah(appMetadata.w);
        ksxVarH.ac(appMetadata.C);
        ksxVarH.M(appMetadata.E);
        if (ksxVarH.an()) {
            z2 = z3;
        } else if (!z3) {
            return ksxVarH;
        }
        kug kugVar5 = this.c;
        ai(kugVar5);
        kugVar5.aa(ksxVarH, z2);
        return ksxVarH;
    }

    public final AppMetadata i(String str) {
        kug kugVar = this.c;
        ai(kugVar);
        ksx ksxVarH = kugVar.h(str);
        if (ksxVarH == null || TextUtils.isEmpty(ksxVarH.w())) {
            aB().j.b("No app data available; dropping", str);
            return null;
        }
        Boolean boolAl = al(ksxVarH);
        if (boolAl == null || boolAl.booleanValue()) {
            return new AppMetadata(str, ksxVarH.y(), ksxVarH.w(), ksxVarH.c(), ksxVarH.v(), ksxVarH.i(), ksxVarH.f(), (String) null, ksxVarH.am(), false, ksxVarH.x(), 0L, 0, ksxVarH.al(), false, ksxVarH.p(), ksxVarH.g(), ksxVarH.D(), n(str).m(), "", (String) null, ksxVarH.ao(), ksxVarH.o(), n(str).c, l(str).c, ksxVarH.a(), ksxVarH.d(), ksxVarH.C(), ksxVarH.A(), 0L, ksxVarH.b());
        }
        aB().c.b("App version does not match; dropping. appId", lab.b(str));
        return null;
    }

    public final ktx j() {
        lbk lbkVar = this.l;
        kkk.k(lbkVar);
        return lbkVar.d;
    }

    final kuk k(String str, kuk kukVar, lct lctVar, ktz ktzVar) {
        int i;
        lcq lcqVar;
        lcs lcsVar;
        int i2;
        lbb lbbVar = this.a;
        ai(lbbVar);
        if (lbbVar.d(str) == null) {
            if (kukVar.c() == lcq.DENIED) {
                i2 = kukVar.b;
                ktzVar.a(lcs.AD_USER_DATA, i2);
            } else {
                ktzVar.a.put((EnumMap) lcs.AD_USER_DATA, (lcs) kty.FAILSAFE);
                i2 = 90;
            }
            return new kuk((Boolean) false, i2, (Boolean) true, "-");
        }
        lcq lcqVarC = kukVar.c();
        lcq lcqVar2 = lcq.GRANTED;
        if (lcqVarC == lcqVar2 || lcqVarC == (lcqVar = lcq.DENIED)) {
            i = kukVar.b;
            ktzVar.a(lcs.AD_USER_DATA, i);
        } else {
            if (lcqVarC != lcq.POLICY || (lcqVarC = lbbVar.c(str, (lcsVar = lcs.AD_USER_DATA))) == lcq.UNINITIALIZED) {
                lcs lcsVar2 = lcs.AD_USER_DATA;
                lbbVar.g();
                lbbVar.i(str);
                ljs ljsVarD = lbbVar.d(str);
                lcs lcsVarS = null;
                if (ljsVarD != null) {
                    Iterator it = ljsVarD.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ljj ljjVar = (ljj) it.next();
                        int iA = ljn.a(ljjVar.b);
                        if (iA == 0) {
                            iA = 1;
                        }
                        if (lcsVar2 == lbbVar.s(iA)) {
                            int iA2 = ljn.a(ljjVar.c);
                            if (iA2 == 0) {
                                iA2 = 1;
                            }
                            lcsVarS = lbbVar.s(iA2);
                        }
                    }
                }
                lcqVarC = lctVar.c();
                boolean z = lcqVarC == lcqVar2 || lcqVarC == lcqVar;
                if (lcsVarS == lcs.AD_STORAGE && z) {
                    ktzVar.a.put((EnumMap) lcsVar2, (lcs) kty.REMOTE_DELEGATION);
                } else {
                    ktzVar.a.put((EnumMap) lcsVar2, (lcs) kty.REMOTE_DEFAULT);
                    lcqVarC = true != lbbVar.l(str, lcsVar2) ? lcqVar : lcqVar2;
                }
            } else {
                ktzVar.a.put((EnumMap) lcsVar, (lcs) kty.REMOTE_ENFORCED_DEFAULT);
            }
            i = 90;
        }
        boolean zM = lbbVar.m(str);
        ai(lbbVar);
        lbbVar.g();
        lbbVar.i(str);
        TreeSet treeSet = new TreeSet();
        ljs ljsVarD2 = lbbVar.d(str);
        if (ljsVarD2 != null) {
            Iterator it2 = ljsVarD2.e.iterator();
            while (it2.hasNext()) {
                treeSet.add(((ljp) it2.next()).b);
            }
        }
        if (lcqVarC == lcq.DENIED || treeSet.isEmpty()) {
            return new kuk((Boolean) false, i, Boolean.valueOf(zM), "-");
        }
        return new kuk((Boolean) true, i, Boolean.valueOf(zM), zM ? TextUtils.join("", treeSet) : "");
    }

    final kuk l(String str) {
        aC().g();
        v();
        Map map = this.F;
        kuk kukVar = (kuk) map.get(str);
        if (kukVar != null) {
            return kukVar;
        }
        kug kugVar = this.c;
        ai(kugVar);
        kkk.k(str);
        kugVar.g();
        kugVar.ag();
        kuk kukVarB = kuk.b(kugVar.Z("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, kukVarB);
        return kukVarB;
    }

    public final lai m() {
        lai laiVar = this.d;
        if (laiVar != null) {
            return laiVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    final lct n(String str) {
        lct lctVar = lct.a;
        aC().g();
        v();
        lct lctVarM = (lct) this.E.get(str);
        if (lctVarM == null) {
            kug kugVar = this.c;
            ai(kugVar);
            lctVarM = kugVar.m(str);
            if (lctVarM == null) {
                lctVarM = lct.a;
            }
            W(str, lctVarM);
        }
        return lctVarM;
    }

    public final lio p() {
        lbk lbkVar = this.l;
        kkk.k(lbkVar);
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        return lioVar;
    }

    final String q(lct lctVar) {
        if (!lctVar.n(lcs.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        p().F().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String r(AppMetadata appMetadata) {
        try {
            return (String) aC().c(new lib(this, appMetadata)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            aB().c.c("Failed to get app instance id. appId", lab.b(appMetadata.a), e);
            return null;
        }
    }

    final List s(AppMetadata appMetadata, Bundle bundle) {
        aC().g();
        aeuw.a.eV();
        ktx ktxVarJ = j();
        String str = appMetadata.a;
        if (!ktxVarJ.t(str, kzg.aP) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    aB().c.a("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        kug kugVar = this.c;
                        ai(kugVar);
                        int i2 = intArray[i];
                        long j = longArray[i];
                        kkk.h(str);
                        kugVar.g();
                        kugVar.ag();
                        try {
                            int iDelete = kugVar.e().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            lbk lbkVar = kugVar.y;
                            lab labVar = lbkVar.f;
                            lbkVar.o(labVar);
                            labVar.k.d(a.a(iDelete, "Pruned ", " trigger URIs. appId, source, timestamp"), str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            lbk lbkVar2 = kugVar.y;
                            lab labVar2 = lbkVar2.f;
                            lbkVar2.o(labVar2);
                            labVar2.c.c("Error pruning trigger URIs. appId", lab.b(str), e);
                        }
                    }
                }
            }
        }
        kug kugVar2 = this.c;
        ai(kugVar2);
        String str2 = appMetadata.a;
        kkk.h(str2);
        kugVar2.g();
        kugVar2.ag();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = kugVar2.e().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new TriggerUriParcel(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } finally {
            }
        } catch (SQLiteException e2) {
            lbk lbkVar3 = kugVar2.y;
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.c.c("Error querying trigger uris. appId", lab.b(str2), e2);
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    final void t() {
        aC().g();
        v();
        if (this.y) {
            return;
        }
        this.y = true;
        if (ah()) {
            FileChannel fileChannel = this.C;
            aC().g();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                aB().c.a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        aB().f.b("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    aB().c.b("Failed to read from channel", e);
                }
            }
            kzq kzqVarE = this.l.e();
            kzqVarE.a();
            int i3 = kzqVarE.a;
            aC().g();
            if (i > i3) {
                aB().c.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i3));
                return;
            }
            if (i < i3) {
                FileChannel fileChannel2 = this.C;
                aC().g();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    aB().c.a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(i3);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            aB().c.b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        aB().k.c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i3));
                        return;
                    } catch (IOException e2) {
                        aB().c.b("Failed to write to channel", e2);
                    }
                }
                aB().c.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i3));
            }
        }
    }

    final void v() {
        if (!this.m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void w(lld lldVar, lct lctVar) {
        if (!lctVar.n(lcs.AD_STORAGE)) {
            if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lldVar.y();
            }
            lle lleVar = (lle) lldVar.b;
            lle lleVar2 = lle.a;
            lleVar.b &= -65537;
            lle lleVar3 = lle.a;
            lleVar.v = lleVar3.v;
            if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lldVar.y();
            }
            lle lleVar4 = (lle) lldVar.b;
            lleVar4.b &= -131073;
            lleVar4.w = false;
            if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lldVar.y();
            }
            lle lleVar5 = (lle) lldVar.b;
            lleVar5.b &= Integer.MAX_VALUE;
            lleVar5.I = lleVar3.I;
        }
        if (lctVar.n(lcs.ANALYTICS_STORAGE)) {
            return;
        }
        if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lldVar.y();
        }
        lle lleVar6 = (lle) lldVar.b;
        lle lleVar7 = lle.a;
        lleVar6.b &= -262145;
        lle lleVar8 = lle.a;
        lleVar6.x = lleVar8.x;
        if ((lldVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lldVar.y();
        }
        lle lleVar9 = (lle) lldVar.b;
        lleVar9.c &= -8193;
        lleVar9.P = lleVar8.P;
    }

    public final void x() {
        aC().g();
        if (this.z || this.s || this.A) {
            aB().k.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.z), Boolean.valueOf(this.s), Boolean.valueOf(this.A));
            return;
        }
        aB().k.a("Stopping uploading service(s)");
        List list = this.o;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        List list2 = this.o;
        kkk.k(list2);
        list2.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void y(java.lang.String r10, defpackage.lld r11) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lih.y(java.lang.String, lld):void");
    }

    final void z(ksx ksxVar) {
        aC().g();
        if (TextUtils.isEmpty(ksxVar.y())) {
            String strT = ksxVar.t();
            kkk.k(strT);
            H(strT, 204, null, null, null);
            return;
        }
        String strT2 = ksxVar.t();
        kkk.k(strT2);
        aB().k.b("Fetching remote configuration", strT2);
        lbb lbbVar = this.a;
        ai(lbbVar);
        ljy ljyVarE = lbbVar.e(strT2);
        ai(lbbVar);
        lbbVar.g();
        String str = (String) lbbVar.h.get(strT2);
        we weVar = null;
        if (ljyVarE != null) {
            if (!TextUtils.isEmpty(str)) {
                we weVar2 = new we();
                weVar2.put("If-Modified-Since", str);
                weVar = weVar2;
            }
            ai(lbbVar);
            lbbVar.g();
            String str2 = (String) lbbVar.i.get(strT2);
            if (!TextUtils.isEmpty(str2)) {
                if (weVar == null) {
                    weVar = new we();
                }
                weVar.put("If-None-Match", str2);
            }
        }
        this.z = true;
        lag lagVar = this.b;
        ai(lagVar);
        lagVar.a(ksxVar, weVar, new lad() { // from class: lhw
            @Override // defpackage.lad
            public final void a(String str3, int i, Throwable th, byte[] bArr, Map map) {
                this.a.H(str3, i, th, bArr, map);
            }
        });
    }
}
