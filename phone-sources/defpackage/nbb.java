package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nbb implements tsl {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nbb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v74, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r14v9, types: [iea, java.lang.Object] */
    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        String str;
        ksy ksyVar;
        int i = 0;
        switch (this.c) {
            case 0:
                lwp lwpVar = (lwp) obj;
                naz nazVar = new naz(null);
                tst tstVarI = trk.a;
                nazVar.c = tstVarI;
                nazVar.d = tstVarI;
                nazVar.a(false);
                String str2 = lwpVar.a;
                if (str2 == null) {
                    throw new NullPointerException("Null title");
                }
                nazVar.a = str2;
                ieg iegVar = lwpVar.b;
                nazVar.b = (ksy) iegVar.g();
                String str3 = lwpVar.c;
                tst tstVarI2 = (TextUtils.isEmpty(str3) || !jys.aa(str3)) ? tstVarI : tst.i(Integer.valueOf(Integer.parseInt(ksi.g(str3))));
                Object obj2 = this.b;
                if (lwpVar instanceof lwr) {
                    int i2 = ((lwr) lwpVar).e;
                    String string = i2 == 0 ? "" : ((Resources) obj2).getString(R.string.movie_duration, Integer.valueOf(i2));
                    if (!TextUtils.isEmpty(string) || tstVarI2.g()) {
                        if (tstVarI2.g()) {
                            string = jwq.G((Resources) obj2, true, ksi.f(((Integer) tstVarI2.c()).intValue()), string);
                        }
                        tstVarI = tst.i(string);
                    }
                } else if (tstVarI2.g()) {
                    String str4 = ((lwv) lwpVar).e;
                    String strG = "";
                    if (!TextUtils.isEmpty(str4) && jys.aa(str4)) {
                        strG = ksi.g(str4);
                    }
                    tstVarI = tst.i(((Resources) obj2).getString(R.string.knowledge_years, Integer.toString(((Integer) tstVarI2.c()).intValue()), strG));
                }
                nazVar.c = tstVarI;
                tju tjuVar = lwpVar.d;
                if (tjuVar != null) {
                    nazVar.d = tst.i(tjuVar.g);
                }
                if (iegVar.m()) {
                    nazVar.a(((kxi) this.a.a()).a((ksy) iegVar.g()));
                }
                if (nazVar.f == 1 && (str = nazVar.a) != null && (ksyVar = nazVar.b) != null) {
                    return new nba(str, ksyVar, nazVar.c, nazVar.d, nazVar.e);
                }
                StringBuilder sb = new StringBuilder();
                if (nazVar.a == null) {
                    sb.append(" title");
                }
                if (nazVar.b == null) {
                    sb.append(" assetId");
                }
                if (nazVar.f == 0) {
                    sb.append(" watchlisted");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            case 1:
                return (vzg) ((ImmutableList) this.b).get(this.a.indexOf((val) obj));
            case 2:
                tvn tvnVar = TestingToolsBroadcastReceiver.a;
                Bundle bundle = new Bundle();
                vtw vtwVarM = oys.a.m();
                for (oyw oywVar : ((Map) obj).values()) {
                    uwi uwiVar = oywVar.c;
                    if (uwiVar == null) {
                        uwiVar = uwi.a;
                    }
                    uwm uwmVar = uwiVar.c;
                    if (uwmVar == null) {
                        uwmVar = uwm.a;
                    }
                    if (((String) this.a).equals(osk.v(uwmVar))) {
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        oys oysVar = (oys) vtwVarM.b;
                        oywVar.getClass();
                        vun vunVar = oysVar.b;
                        if (!vunVar.c()) {
                            oysVar.b = vuc.s(vunVar);
                        }
                        oysVar.b.add(oywVar);
                    }
                }
                Object obj3 = this.b;
                bundle.putByteArray("eval_result", ((oys) vtwVarM.r()).h());
                ((BroadcastReceiver.PendingResult) obj3).setResultExtras(bundle);
                return true;
            case 3:
                rzy rzyVar = (rzy) obj;
                ?? r0 = this.a;
                if (r0.hasNext()) {
                    Object obj4 = this.b;
                    rzyVar.A(" WHERE (account = ?");
                    rzyVar.B(pec.f((String) obj4));
                    rzyVar.A(" AND (");
                    pec.g(rzyVar, (uxl) r0.next());
                    while (r0.hasNext()) {
                        rzyVar.A(" OR ");
                        pec.g(rzyVar, (uxl) r0.next());
                    }
                    rzyVar.A("))");
                }
                return null;
            case 4:
                rzy rzyVar2 = (rzy) obj;
                ?? r02 = this.a;
                if (r02.hasNext()) {
                    Object obj5 = this.b;
                    rzyVar2.A(" WHERE (account = ?");
                    rzyVar2.B(pel.g((String) obj5));
                    rzyVar2.A(" AND (");
                    pel.h(rzyVar2, (uzh) r02.next());
                    while (r02.hasNext()) {
                        rzyVar2.A(" OR ");
                        pel.h(rzyVar2, (uzh) r02.next());
                    }
                    rzyVar2.A("))");
                }
                return null;
            case 5:
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                sgr sgrVar = ((qpp) this.a).b;
                String strA = ((qpk) this.b).a();
                if (sgrVar.d(strA) == null) {
                    ((tvk) ((tvk) qpp.a.f()).j("com/google/android/libraries/notifications/platform/media/impl/basic/BasicMediaManager", "loadBitmapFromFileCache", 201, "BasicMediaManager.java")).v("Error loading media. File not found in cache %s", strA);
                    return null;
                }
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(sgrVar.e(strA), options);
                if (bitmapDecodeFile == null) {
                    ((tvk) ((tvk) qpp.a.f()).j("com/google/android/libraries/notifications/platform/media/impl/basic/BasicMediaManager", "loadBitmapFromFileCache", 207, "BasicMediaManager.java")).v("Error loading media from file: %s", strA);
                    return null;
                }
                ((tvk) qpp.a.l().j("com/google/android/libraries/notifications/platform/media/impl/basic/BasicMediaManager", "loadBitmapFromFileCache", 210, "BasicMediaManager.java")).v("Media Loaded from file: %s", strA);
                return bitmapDecodeFile;
            case 6:
                qdl qdlVar = (qdl) obj;
                if (qdlVar.g()) {
                    ((tvk) ((tvk) qse.a.g()).j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "storeAllAccountsAsync", 172, "RegistrationHandler.java")).s("Failed fetching accounts from storage, not storing accounts");
                } else {
                    for (qen qenVar : (List) qdlVar.c()) {
                        String str5 = qenVar.b;
                        int i3 = qenVar.f;
                        if (i3 == 1 || i3 == 2 || i3 == 3) {
                            ((qse) this.b).a(str5, true, (vmd) this.a);
                        }
                    }
                }
                return null;
            case 7:
                yys yysVar = (yys) ((ImmutableList) this.a).get(0);
                while (true) {
                    if (!((SharedPreferences) ((rro) this.b).d.b()).edit().putString("lastExitProcessName", yysVar.c).putLong("lastExitTimestamp", yysVar.g).commit()) {
                        i++;
                        if (i >= 3) {
                            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 220, "ApplicationExitMetricServiceImpl.java")).s("Failed to persist most recent App Exit");
                        }
                    }
                }
                return null;
            case 8:
                rvv rvvVar = (rvv) obj;
                vtw vtwVar = (vtw) rvvVar.a(5, null);
                vtwVar.x(rvvVar);
                vty vtyVar = (vty) vtwVar;
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                Object obj6 = this.a;
                Object obj7 = this.b;
                rvv rvvVar2 = (rvv) vtyVar.b;
                rvv rvvVar3 = rvv.a;
                obj6.getClass();
                rvvVar2.c = (zba) obj6;
                rvvVar2.b |= 1;
                rvv rvvVar4 = (rvv) vtyVar.r();
                rwd rwdVar = (rwd) obj7;
                String[] strArr = {rwdVar.b.getClass().getName()};
                Intent intent = new Intent();
                Context context = rwdVar.a;
                intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
                intent.setPackage(context.getPackageName());
                intent.putExtra("Transmitters", strArr);
                intent.putExtra("MetricSnapshot", rvvVar4.h());
                context.sendBroadcast(intent);
                return null;
            case 9:
                return (rym) ((unc) ((ulp) this.a).a).a.get(new tsu((String) obj, ((nsw) this.b).i));
            case 10:
                rxx rxxVar = (rxx) obj;
                int i4 = ryy.a;
                Object obj8 = this.b;
                rxv rxvVar = rxv.a;
                obj8.getClass();
                vve vveVar = rxxVar.b;
                if (vveVar.containsKey(obj8)) {
                    rxvVar = (rxv) vveVar.get(obj8);
                }
                Object obj9 = this.a;
                vtw vtwVar2 = (vtw) rxvVar.a(5, null);
                vtwVar2.x(rxvVar);
                if (!DesugarCollections.unmodifiableList(((rxv) vtwVar2.b).c).contains(obj9)) {
                    vtwVar2.al((String) obj9);
                }
                vtw vtwVar3 = (vtw) rxxVar.a(5, null);
                vtwVar3.x(rxxVar);
                if (!vtwVar2.b.A()) {
                    vtwVar2.u();
                }
                rxv rxvVar2 = (rxv) vtwVar2.b;
                rxvVar2.b |= 1;
                rxvVar2.d = (String) obj9;
                vtwVar3.am((String) obj8, (rxv) vtwVar2.r());
                return (rxx) vtwVar3.r();
            case 11:
                Uri uri = (Uri) obj;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                intentFilter.addDataScheme(uri.getScheme());
                intentFilter.addDataPath(uri.getPath(), 0);
                int i5 = tzc.a;
                intentFilter.addDataPath(uri.buildUpon().path(tzj.a.b(uri.getPath(), StandardCharsets.UTF_8).toString()).build().getPath(), 0);
                intentFilter.addDataAuthority("*", null);
                ?? r03 = this.a;
                sld sldVar = new sld(r03);
                Object obj10 = this.b;
                if (Build.VERSION.SDK_INT >= 33) {
                    slf slfVar = (slf) obj10;
                    slfVar.b.registerReceiver(sldVar, intentFilter, slfVar.d, slfVar.e, 2);
                } else {
                    slf slfVar2 = (slf) obj10;
                    slfVar2.b.registerReceiver(sldVar, intentFilter, slfVar2.d, slfVar2.e);
                }
                synchronized (((slf) obj10).i) {
                    ((slf) obj10).h.put(uri, r03);
                }
                return null;
            default:
                return ((xpz) obj).a((xsq) this.a, (xpy) this.b);
        }
    }

    public /* synthetic */ nbb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ nbb(String str, int i) {
        this.c = i;
        this.b = str;
        this.a = "";
    }
}
