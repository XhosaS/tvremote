package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import androidx.work.impl.WorkDatabase;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eet implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public eet(dya dyaVar, int i) {
        this.b = i;
        this.a = dyaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        Object objA = null;
        boolean z = false;
        int i = 0;
        switch (this.b) {
            case 0:
                ttm ttmVar = eeu.a;
                byte[] bArr = (byte[]) this.a;
                return ecm.f(bArr, bArr.length, -1);
            case 1:
                Object obj = this.a;
                ((dya) obj).e.set(true);
                try {
                    Process.setThreadPriority(10);
                    objA = ((dya) obj).a();
                    Binder.flushPendingCommands();
                    return objA;
                } finally {
                }
            case 2:
                guw guwVar = ((gsb) this.a).a;
                if (guwVar.c != gpx.a) {
                    String str = gsc.a;
                    gpn.b();
                    return true;
                }
                if ((!guwVar.e() && !guwVar.d()) || System.currentTimeMillis() >= guwVar.a()) {
                    return false;
                }
                gpn.b();
                String str2 = gsc.a;
                return true;
            case 3:
                gsb gsbVar = (gsb) this.a;
                String str3 = gsbVar.c;
                gux guxVar = gsbVar.e;
                if (guxVar.b(str3) == gpx.a) {
                    guxVar.B(gpx.b, str3);
                    guxVar.w(str3);
                    guxVar.t(str3, -256);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return Integer.valueOf(fki.au((WorkDatabase) ((cb) this.a).a, "next_alarm_manager_id"));
            case 5:
                WorkDatabase workDatabase = (WorkDatabase) ((cb) this.a).a;
                int iAu = fki.au(workDatabase, "next_job_scheduler_id");
                if (iAu >= 0) {
                    i = iAu;
                } else {
                    fki.av(workDatabase, "next_job_scheduler_id", 1);
                }
                return Integer.valueOf(i);
            case 6:
                Map map = hbp.a;
                return new hcb(this.a);
            case 7:
                mbx mbxVar = (mbx) this.a;
                SharedPreferences.Editor editorEdit = mbxVar.c.edit();
                int i2 = ((lxc) mbxVar.b).b;
                if (editorEdit.putInt(krh.UPDATE_WORKER_LAST_RUN_VERSION_CODE, i2).commit()) {
                    return new gpl();
                }
                krd.f(a.cf(i2, "Failed to mark work as having executed in version "));
                return new gpj();
            case 8:
                tvn tvnVar = oww.a;
                return ((Context) this.a).getSharedPreferences("growthkit_shared_prefs", 0);
            case 9:
                try {
                    ona.a(((TestingToolsBroadcastReceiver) this.a).i);
                    return true;
                } catch (nvz | nwa e) {
                    ((tvk) ((tvk) ((tvk) TestingToolsBroadcastReceiver.a.g()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", (char) 435, "TestingToolsBroadcastReceiver.java")).s("Failed to install security provider, GrowthKit sync can't run.");
                    return false;
                }
            case 10:
                return this.a.b();
            case 11:
                tvn tvnVar2 = pbg.a;
                ?? r0 = this.a;
                HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(r0.size());
                for (Map.Entry entry : r0.entrySet()) {
                    try {
                        Intent intent = (Intent) ((uhp) entry.getValue()).get();
                        if (intent != null) {
                            uxv uxvVarB = uxv.b(((uxw) entry.getKey()).e);
                            if (uxvVarB == null) {
                                uxvVarB = uxv.ACTION_UNKNOWN;
                            }
                            mapNewHashMapWithExpectedSize.put(uxvVarB, intent);
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        tvk tvkVar = (tvk) ((tvk) ((tvk) pbg.a.g()).i(e2)).j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "getActionIntentMapFuture", 655, "TriggeringEventProcessor.java");
                        uxv uxvVarB2 = uxv.b(((uxw) entry.getKey()).e);
                        if (uxvVarB2 == null) {
                            uxvVarB2 = uxv.ACTION_UNKNOWN;
                        }
                        tvkVar.B("Failed to add intent for action of type [%s] and text [%s]", uxvVarB2.name(), ((uxw) entry.getKey()).f);
                    }
                }
                return mapNewHashMapWithExpectedSize;
            case 12:
                return (Boolean) ((ufb) this.a).s();
            case 13:
                tvn tvnVar3 = pbg.a;
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    if (!((Map) ((uhp) it.next()).get()).isEmpty()) {
                        return true;
                    }
                }
                return false;
            case 14:
                tvn tvnVar4 = pfh.a;
                return this.a;
            case 15:
                tvn tvnVar5 = pfh.a;
                return this.a;
            case 16:
                return this.a.b();
            case 17:
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    pjd pjdVar = (pjd) sfy.J((uhp) it2.next());
                    if (pjdVar != null) {
                        sij.x(objA == null, "More than one auth provider provided result.");
                        objA = pjdVar;
                    }
                }
                if (objA != null) {
                    return objA;
                }
                throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
            case 18:
                HashMap map2 = new HashMap();
                for (Map.Entry entry2 : this.a.entrySet()) {
                    map2.put((pli) entry2.getKey(), (vty[]) sfy.J((Future) entry2.getValue()));
                }
                return map2;
            case 19:
                Context context = ((rjl) this.a).b;
                String str4 = nhd.a;
                ocv.aF(context);
                nhk.e(context, 11400000);
                return (Boolean) nhk.g(context, nhk.d, new nhi(context.getApplicationInfo().packageName, context));
            default:
                Context context2 = ((rjl) this.a).b;
                final String[] strArr = rjl.a;
                String str5 = nhd.a;
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final rbi rbiVarL = rbi.l(context2);
                try {
                    ocv.aF(context2);
                    ocv.aD("com.google");
                    nhk.e(context2, 8400000);
                    final String className = context2 instanceof Activity ? ((Activity) context2).getComponentName().getClassName() : "";
                    try {
                        nhj nhjVar = new nhj() { // from class: nhe
                            public final /* synthetic */ String a = "com.google";

                            @Override // defpackage.nhj
                            public final Object a(IBinder iBinder) throws IOException {
                                ndp ndpVar;
                                Parcelable[] parcelableArray;
                                String[] strArr2 = nhk.b;
                                if (iBinder == null) {
                                    ndpVar = null;
                                } else {
                                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                                    ndpVar = iInterfaceQueryLocalInterface instanceof ndp ? (ndp) iInterfaceQueryLocalInterface : new ndp(iBinder);
                                }
                                String str6 = className;
                                String[] strArr3 = strArr;
                                String str7 = this.a;
                                Bundle bundle = new Bundle();
                                bundle.putString("accountType", str7);
                                bundle.putStringArray("account_features", strArr3);
                                bundle.putString("callingActivity", str6);
                                Parcel parcelK = ndpVar.k();
                                ifl.c(parcelK, bundle);
                                Parcel parcelL = ndpVar.l(6, parcelK);
                                Bundle bundle2 = (Bundle) ifl.a(parcelL, Bundle.CREATOR);
                                parcelL.recycle();
                                if (bundle2 == null || (parcelableArray = bundle2.getParcelableArray("accounts")) == null) {
                                    throw new IOException("Receive null result from service call.");
                                }
                                Account[] accountArr = new Account[parcelableArray.length];
                                for (int i3 = 0; i3 < parcelableArray.length; i3++) {
                                    accountArr[i3] = (Account) parcelableArray[i3];
                                }
                                rbiVarL.i(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                                return accountArr;
                            }
                        };
                        rbiVarL = rbiVarL;
                        return Arrays.asList((Account[]) nhk.g(context2, nhk.d, nhjVar));
                    } catch (Exception e3) {
                        e = e3;
                        rbiVarL = rbiVarL;
                        rbiVarL.i(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                        throw e;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
        }
    }

    public /* synthetic */ eet(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
