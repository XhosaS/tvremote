package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.UserManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtl {
    private static volatile unc a;

    public static void A(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public static void B(vtw vtwVar, int i, boolean z) {
        if (((vlu) vtwVar.b).b.size() <= 0) {
            if (!z) {
                return;
            }
            while (((vlu) vtwVar.b).b.size() <= 0) {
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                vlu vluVar = (vlu) vtwVar.b;
                vluVar.b();
                vluVar.b.g(0L);
            }
        }
        long jA = ((vlu) vtwVar.b).b.a(0);
        long j = 1 << i;
        long j2 = z ? jA | j : (~j) & jA;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vlu vluVar2 = (vlu) vtwVar.b;
        vluVar2.b();
        vluVar2.b.e(0, j2);
    }

    public static boolean C(Context context, String str) {
        return czi.b(context, str) == 0;
    }

    public static boolean D(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static boolean E() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean G() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean H() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean I() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean J(Context context) {
        return E() && context.getApplicationInfo().targetSdkVersion >= 26;
    }

    public static boolean K(Context context) {
        return ctk.b() && context.getApplicationInfo().targetSdkVersion >= 33;
    }

    public static final qoq L(Context context) {
        return context.getPackageManager().hasSystemFeature("org.chromium.arc") ? qoq.f : (H() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) ? qoq.e : (context.getPackageManager().hasSystemFeature("com.google.android.tv") || context.getPackageManager().hasSystemFeature("android.hardware.type.television") || context.getPackageManager().hasSystemFeature("android.software.leanback")) ? qoq.b : (E() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? qoq.d : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? qoq.c : qoq.a;
    }

    public static final String M(Object obj) {
        if (obj instanceof Iterable) {
            return N((Iterable) obj);
        }
        if (!(obj instanceof Object[])) {
            String strValueOf = String.valueOf(obj);
            return (obj == null || strValueOf.length() == 0 || xfr.a.get().a()) ? strValueOf : String.valueOf(strValueOf.hashCode());
        }
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return N(objArr.length == 0 ? yhb.a : new ymz(objArr, 1));
    }

    public static final String N(Iterable iterable) {
        iterable.getClass();
        return yfm.ax(iterable, null, "[", "]", new oun(18), 25);
    }

    public static final Long P(Context context) {
        try {
            long jB = opc.b(context.getContentResolver(), "android_id", -1L);
            Long lValueOf = jB == -1 ? null : Long.valueOf(jB);
            if (lValueOf == null) {
                ((tvk) qno.a.g()).s("Failed to get android ID.");
            }
            return lValueOf;
        } catch (SecurityException e) {
            ((tvk) ((tvk) qno.a.f()).i(e)).s("Exception reading GServices key - ANDROID_ID.");
            return null;
        }
    }

    public static final Long Q(Context context) {
        Object systemService = context.getSystemService("user");
        systemService.getClass();
        long serialNumberForUser = ((UserManager) systemService).getSerialNumberForUser(Process.myUserHandle());
        if (serialNumberForUser == -1) {
            return null;
        }
        return Long.valueOf(serialNumberForUser);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r0.add((com.google.common.collect.ImmutableSet.Builder) r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.common.collect.ImmutableSet R(java.lang.String r8) throws java.lang.NumberFormatException {
        /*
            java.lang.String r0 = ","
            uof r0 = defpackage.uof.h(r0)
            java.lang.Iterable r8 = r0.b(r8)
            com.google.common.collect.ImmutableSet$Builder r0 = com.google.common.collect.ImmutableSet.builder()
            java.util.Iterator r8 = r8.iterator()
        L12:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            qqj[] r2 = defpackage.qqj.values()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L29:
            if (r5 >= r3) goto L38
            r6 = r2[r5]
            int r7 = r6.c
            if (r7 != r1) goto L35
            r0.add(r6)
            goto L12
        L35:
            int r5 = r5 + 1
            goto L29
        L38:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            java.lang.String r0 = "Notification channel %d is not supported."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r8.<init>(r0)
            throw r8
        L4d:
            com.google.common.collect.ImmutableSet r8 = r0.build()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtl.R(java.lang.String):com.google.common.collect.ImmutableSet");
    }

    public static final String S(ImmutableSet immutableSet) {
        StringBuilder sb = new StringBuilder();
        ImmutableList<E> immutableListAsList = immutableSet.asList();
        for (int i = 0; i < immutableListAsList.size(); i++) {
            sb.append(((qqj) immutableListAsList.get(i)).c);
            if (i < immutableSet.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static final int T(int i) {
        int[] iArrAf = osk.af();
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArrAf[i2];
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i) {
                return i3;
            }
        }
        throw new IllegalArgumentException(String.format("Account type %d is not supported.", Integer.valueOf(i)));
    }

    public static final String U(qen qenVar) {
        String strValueOf = qenVar != null ? Long.valueOf(qenVar.a) : "device_level";
        Objects.toString(strValueOf);
        return strValueOf.toString().concat("_per_account_gnp_room.db");
    }

    public static final qqd V(tst tstVar, tst tstVar2, tst tstVar3, qel qelVar, yfo yfoVar) {
        qelVar.getClass();
        if (qelVar.a()) {
            return ((qit) yfoVar).a().booleanValue() ? (qqd) ((ttd) tstVar).a : (qqd) ((ttd) tstVar3).a;
        }
        if (qelVar.b()) {
            return (qqd) ((ttd) tstVar2).a;
        }
        throw new IllegalStateException("Unsupported targetType for RegistrationDataProviderHelper");
    }

    public static final int W(vjj vjjVar, List list, Map map) {
        int iIntValue;
        list.getClass();
        map.getClass();
        if (vjjVar == null) {
            return 0;
        }
        vtw vtwVar = (vtw) vjjVar.a(5, null);
        vtwVar.x(vjjVar);
        upq upqVarD = vfi.D(vtwVar);
        vtw vtwVar2 = (vtw) upqVarD.b;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        vuc vucVar = vtwVar2.b;
        vjj vjjVar2 = (vjj) vucVar;
        vjjVar2.b &= -5;
        vjjVar2.e = 0;
        if (!vucVar.A()) {
            vtwVar2.u();
        }
        vjj vjjVar3 = (vjj) vtwVar2.b;
        vjjVar3.b &= -17;
        vjjVar3.h = vjj.a.h;
        vwv<vji> vwvVarC = upqVarD.c();
        ArrayList arrayList = new ArrayList(yfm.z(vwvVarC, 10));
        for (vji vjiVar : vwvVarC) {
            vtw vtwVar3 = (vtw) vjiVar.a(5, null);
            vtwVar3.x(vjiVar);
            ulp ulpVarP = vef.P(vtwVar3);
            vtw vtwVar4 = (vtw) ulpVarP.a;
            if (!vtwVar4.b.A()) {
                vtwVar4.u();
            }
            vji vjiVar2 = (vji) vtwVar4.b;
            vji vjiVar3 = vji.a;
            vjiVar2.b &= -2;
            vji vjiVar4 = vji.a;
            vjiVar2.c = vjiVar4.c;
            if (!vtwVar4.b.A()) {
                vtwVar4.u();
            }
            vuc vucVar2 = vtwVar4.b;
            vji vjiVar5 = (vji) vucVar2;
            vjiVar5.d = null;
            vjiVar5.b &= -3;
            if (!vucVar2.A()) {
                vtwVar4.u();
            }
            vji vjiVar6 = (vji) vtwVar4.b;
            vjiVar6.b &= -17;
            vjiVar6.g = vjiVar4.g;
            arrayList.add(ulpVarP.Z());
        }
        List listAj = yfm.aj(arrayList, new qbi(3));
        upqVarD.c();
        upqVarD.e();
        upqVarD.c();
        upqVarD.d(listAj);
        vjj vjjVarB = upqVarD.b();
        if (vjjVarB.A()) {
            iIntValue = vjjVarB.j();
        } else {
            int iJ = vjjVarB.M;
            if (iJ == 0) {
                iJ = vjjVarB.j();
                vjjVarB.M = iJ;
            }
            iIntValue = iJ;
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((qpv) it.next()).a().hashCode()));
        }
        Iterator it2 = yfm.ai(arrayList2).iterator();
        while (it2.hasNext()) {
            iIntValue = (iIntValue * 53) + ((Number) it2.next()).intValue();
        }
        ArrayList<qpw> arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof qpw) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(yfm.z(arrayList3, 10));
        for (qpw qpwVar : arrayList3) {
            int iHashCode = qpwVar.a.hashCode() * 53;
            qen qenVar = (qen) map.get(qpwVar);
            String str = qenVar != null ? qenVar.d : null;
            arrayList4.add(Integer.valueOf(iHashCode + (str != null ? str.hashCode() : 0)));
        }
        Iterator it3 = yfm.ai(arrayList4).iterator();
        while (it3.hasNext()) {
            iIntValue = (iIntValue * 53) + ((Number) it3.next()).intValue();
        }
        return iIntValue;
    }

    public static final qel X(tst tstVar, yfo yfoVar) {
        return (!((qit) yfoVar).a().booleanValue() || ((Boolean) tstVar.e(false)).booleanValue()) ? qel.a : qel.b;
    }

    public static final qjx Y(qqc qqcVar) {
        qqcVar.getClass();
        if (qqcVar instanceof qqf) {
            return qjx.b;
        }
        if ((qqcVar instanceof qqi) || (qqcVar instanceof qqh)) {
            return qjx.c;
        }
        if (qqcVar instanceof qqg) {
            return qjx.d;
        }
        if (qqcVar instanceof qqb) {
            return qjx.e;
        }
        if (qqcVar instanceof qqa) {
            return qjx.a;
        }
        throw new yfu();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Z(defpackage.yjk r22, defpackage.bkp r23, boolean r24, defpackage.bol r25, defpackage.arb r26, defpackage.yy r27, defpackage.yka r28, defpackage.bao r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtl.Z(yjk, bkp, boolean, bol, arb, yy, yka, bao, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.qtk a(java.lang.Object r3, defpackage.qth r4) {
        /*
            java.lang.String r0 = r4.d(r3)
            r4.j(r3)
            r0.getClass()
            ttu r3 = new ttu
            r3.<init>(r0)
            boolean r4 = r3.c
            r0 = 1
            if (r4 != 0) goto L16
        L14:
            r1 = r0
            goto L2e
        L16:
            java.lang.String r4 = r3.a
            r1 = 0
            if (r4 == 0) goto L24
            java.lang.String r2 = "/seed/"
            boolean r4 = defpackage.ylh.ac(r4, r2)
            if (r4 != r0) goto L24
            goto L2e
        L24:
            java.lang.String r3 = r3.b
            java.lang.String r4 = "glimitedaccount.com"
            boolean r3 = defpackage.ylh.S(r3, r4)
            if (r3 == 0) goto L14
        L2e:
            r3 = r1 ^ 1
            qtk r4 = new qtk
            r4.<init>(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtl.a(java.lang.Object, qth):qtk");
    }

    public static final int aB(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 2;
        }
        ((tug) tui.l("com/google/android/libraries/googletv/player/common/rpc/LicenseRequestTypeKt").g().j("com/google/android/libraries/googletv/player/common/rpc/LicenseRequestTypeKt", "toLicenseRequestType", 62, "LicenseRequestType.kt")).t("Unknown MediaDrm.KeyRequest type: %d", i);
        return 3;
    }

    public static /* synthetic */ String aC(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "REQUEST_TYPE_RELEASE" : "REQUEST_TYPE_RENEWAL" : "REQUEST_TYPE_NONE" : "REQUEST_TYPE_UPDATE" : "REQUEST_TYPE_INITIAL";
    }

    public static /* synthetic */ String aD(int i) {
        return i != 1 ? i != 2 ? "HDR" : "SDR" : "NONE";
    }

    public static final String aE(eph ephVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestType", aC(aB(ephVar.a)));
            jSONObject.put("licenseServerUrl", ephVar.c);
            jSONObject.put("data", Base64.encodeToString((byte[]) ephVar.b, 3)).getClass();
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public static final otx aF(Collection collection, int i, int i2) {
        Object next;
        int i3;
        collection.getClass();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            otx otxVar = (otx) next;
            if (i2 == otxVar.b && (i == (i3 = otxVar.c) || (i == 2 && i3 == 1))) {
                break;
            }
        }
        otx otxVar2 = (otx) next;
        if (otxVar2 != null) {
            return otxVar2;
        }
        if (i2 != 4 || i != 2) {
            return null;
        }
        byte[] bytes = "default".getBytes(ynd.a);
        bytes.getClass();
        return new otx(bytes, 4, 2, otw.d);
    }

    public static final Intent aG() {
        Intent intentPutExtra = new Intent(DeviceNotificationActivity.ACTION_VR).setPackage("com.google.android.videos").addFlags(268435456).putExtra("referrer", "com.google.android.apps.googletv.app.device.virtualremote.ui.QuickSettingTileService");
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    public static uhp aH(onz onzVar) {
        final otu otuVar = new otu(onzVar);
        onzVar.l(ugk.a, new ont() { // from class: ott
            @Override // defpackage.ont
            public final void a(onz onzVar2) {
                boolean z = ((ooe) onzVar2).c;
                otu otuVar2 = otuVar;
                if (z) {
                    otuVar2.cancel(false);
                    return;
                }
                if (onzVar2.i()) {
                    otuVar2.b(onzVar2.e());
                    return;
                }
                Exception excD = onzVar2.d();
                if (excD == null) {
                    throw new IllegalStateException();
                }
                otuVar2.e(excD);
            }
        });
        return otuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void aI(Intent intent, ngr ngrVar) {
        int i;
        switch (ngrVar.e) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        switch (i - 2) {
            case 0:
                throw new IllegalArgumentException("Can't assign unknown extra");
            case 1:
                intent.putExtra(ngrVar.d, ngrVar.b == 3 ? (String) ngrVar.c : "");
                return;
            case 2:
                intent.putExtra(ngrVar.d, (byte) (ngrVar.b == 4 ? ((Integer) ngrVar.c).intValue() : 0));
                return;
            case 3:
                intent.putExtra(ngrVar.d, (short) (ngrVar.b == 5 ? ((Integer) ngrVar.c).intValue() : 0));
                return;
            case 4:
                intent.putExtra(ngrVar.d, ngrVar.b == 6 ? ((Integer) ngrVar.c).intValue() : 0);
                return;
            case 5:
                intent.putExtra(ngrVar.d, ngrVar.b == 7 ? ((Long) ngrVar.c).longValue() : 0L);
                return;
            case 6:
                intent.putExtra(ngrVar.d, ngrVar.b == 8 ? ((Float) ngrVar.c).floatValue() : 0.0f);
                return;
            case 7:
                intent.putExtra(ngrVar.d, ngrVar.b == 9 ? ((Double) ngrVar.c).doubleValue() : 0.0d);
                return;
            case 8:
                intent.putExtra(ngrVar.d, ngrVar.b == 10 ? ((Boolean) ngrVar.c).booleanValue() : false);
                return;
            case 9:
                String[] strArr = new String[ngrVar.f.size()];
                for (int i2 = 0; i2 < ngrVar.f.size(); i2++) {
                    strArr[i2] = (String) ngrVar.f.get(i2);
                }
                intent.putExtra(ngrVar.d, strArr);
                return;
            case 10:
                byte[] bArr = new byte[ngrVar.g.size()];
                for (int i3 = 0; i3 < ngrVar.g.size(); i3++) {
                    bArr[i3] = (byte) ngrVar.g.e(i3);
                }
                intent.putExtra(ngrVar.d, bArr);
                return;
            case 11:
                short[] sArr = new short[ngrVar.h.size()];
                for (int i4 = 0; i4 < ngrVar.h.size(); i4++) {
                    sArr[i4] = (short) ngrVar.h.e(i4);
                }
                intent.putExtra(ngrVar.d, sArr);
                return;
            case 12:
                int[] iArr = new int[ngrVar.i.size()];
                for (int i5 = 0; i5 < ngrVar.i.size(); i5++) {
                    iArr[i5] = ngrVar.i.e(i5);
                }
                intent.putExtra(ngrVar.d, iArr);
                return;
            case 13:
                long[] jArr = new long[ngrVar.j.size()];
                for (int i6 = 0; i6 < ngrVar.j.size(); i6++) {
                    jArr[i6] = ngrVar.j.a(i6);
                }
                intent.putExtra(ngrVar.d, jArr);
                return;
            case 14:
                float[] fArr = new float[ngrVar.k.size()];
                for (int i7 = 0; i7 < ngrVar.k.size(); i7++) {
                    fArr[i7] = ngrVar.k.e(i7);
                }
                intent.putExtra(ngrVar.d, fArr);
                return;
            case 15:
                double[] dArr = new double[ngrVar.l.size()];
                for (int i8 = 0; i8 < ngrVar.l.size(); i8++) {
                    dArr[i8] = ngrVar.l.e(i8);
                }
                intent.putExtra(ngrVar.d, dArr);
                return;
            case 16:
                boolean[] zArr = new boolean[ngrVar.m.size()];
                for (int i9 = 0; i9 < ngrVar.m.size(); i9++) {
                    zArr[i9] = ngrVar.m.f(i9);
                }
                intent.putExtra(ngrVar.d, zArr);
                return;
            default:
                throw new IllegalArgumentException("Unrecognized extra type");
        }
    }

    public static /* synthetic */ Set aJ(tst tstVar, yfo yfoVar) {
        return tstVar.g() ? ImmutableSet.of((rqf) yfoVar.b()) : ImmutableSet.of();
    }

    public static /* synthetic */ int aK(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return !context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? R.style.Theme_Design_Light_BottomSheetDialog : typedValue.resourceId;
    }

    public static /* synthetic */ double aL(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static /* synthetic */ double[] aM(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        return new double[]{d2 + d4 + d6, d7 + d8 + d9, (d * dArr5[0]) + (d3 * dArr5[1]) + (d5 * dArr5[2])};
    }

    public static /* synthetic */ byte[] aN(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
            i2 -= iMin;
        }
        return bArrCopyOf;
    }

    public static /* synthetic */ String aO(uiz uizVar) {
        String str = uizVar.d().c;
        if (str != null) {
            return str;
        }
        String str2 = uizVar.d().b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static void aP(RuntimeException runtimeException, oqp oqpVar, String str) {
        ngj ngjVar = oqpVar.a;
        if (ngjVar != ngj.STARTUP && ngjVar != ngj.TELEDOCTOR) {
            throw runtimeException;
        }
        try {
            Log.e("ExceptionUtil", a.cr(str, "RuntimeException while safely performing function: "), runtimeException);
        } catch (RuntimeException unused) {
        }
    }

    public static uhp aQ(Callable callable) {
        uhq uhqVar = new uhq(callable);
        new Thread(uhqVar).start();
        return uhqVar;
    }

    public static synchronized unc aR(Context context) {
        aafi aafiVar;
        aafiVar = new aafi(Collections.singletonList(new sjr(new upc(context))));
        ocv ocvVar = ogg.a;
        return aT(aafiVar, ocv.p(4));
    }

    public static uhp aS(List list, jzs jzsVar) {
        int size = list.size();
        vvi[] vviVarArr = new vty[size];
        List arrayList = new ArrayList();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            pka pkaVar = (pka) list.get(size);
            vty vtyVar = (vty) ucj.a.m();
            ucy ucyVar = pkaVar.d;
            if (ucyVar == null) {
                ucyVar = ucy.a;
            }
            int i = ucyVar.d;
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            ucj ucjVar = (ucj) vtyVar.b;
            ucjVar.b |= 1;
            ucjVar.c = i;
            vviVarArr[size] = vtyVar;
            int i2 = pkaVar.e;
            int iAL = a.aL(i2);
            if (iAL != 0 && iAL != 1) {
                int iAL2 = a.aL(i2);
                int i3 = iAL2 != 0 ? iAL2 : 1;
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                ucj ucjVar2 = (ucj) vtyVar.b;
                ucjVar2.i = i3 - 1;
                ucjVar2.b |= 32;
            }
            if (pkaVar.c.size() > 0) {
                jzsVar.r(pkaVar, pkaVar.c, vviVarArr[size], arrayList);
            }
        }
        return arrayList.isEmpty() ? sfy.C(vviVarArr) : sfy.O(arrayList).a(new grz(arrayList, vviVarArr, 8, null), ugk.a);
    }

    public static synchronized unc aT(aafi aafiVar, Executor executor) {
        if (a == null) {
            smf smfVar = smf.a;
            HashMap map = new HashMap();
            sik.b(sly.a, map);
            a = new unc(executor, aafiVar, smfVar, map);
        }
        return a;
    }

    public static pjx aU(pji pjiVar, rdd rddVar, tst tstVar) {
        pla.a = ((Boolean) tstVar.e(false)).booleanValue();
        return new pla(pjiVar);
    }

    public static final void aa(yjk yjkVar, bkp bkpVar, boolean z, bol bolVar, arb arbVar, qs qsVar, yy yyVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        bol bolVarA;
        boolean z2;
        bao baoVar2;
        boolean z3;
        bol bolVar2;
        ykaVar.getClass();
        bao baoVarD = baoVar.d(-229789338);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(arbVar) ? 8192 : 16384;
        }
        int i4 = 196608 | i3;
        if ((1572864 & i) == 0) {
            i4 |= true != baoVarD.F(qsVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i4 |= true != baoVarD.F(yyVar) ? 4194304 : 8388608;
        }
        int i5 = i4 | 100663296;
        if ((805306368 & i) == 0) {
            i5 |= true != baoVarD.H(ykaVar) ? 268435456 : 536870912;
        }
        if ((306783379 & i5) == 306783378 && baoVarD.K()) {
            baoVarD.t();
            z3 = z;
            bolVar2 = bolVar;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                yy yyVar2 = pog.a;
                bolVarA = pog.a(baoVarD);
                z2 = true;
            } else {
                baoVarD.t();
                z2 = z;
                bolVarA = bolVar;
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            aj(yjkVar, bkpVar, z2, bolVarA, arbVar, null, qsVar, yyVar, null, ykaVar, baoVar2, i5 & 2147476478, 0);
            z3 = z2;
            bolVar2 = bolVarA;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ket(yjkVar, bkpVar, z3, bolVar2, arbVar, qsVar, yyVar, ykaVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ab(final defpackage.yjk r28, final defpackage.yjz r29, defpackage.bkp r30, defpackage.yjz r31, defpackage.yjz r32, defpackage.yjz r33, defpackage.yjz r34, defpackage.bol r35, long r36, float r38, long r39, long r41, long r43, defpackage.cns r45, defpackage.bao r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtl.ab(yjk, yjz, bkp, yjz, yjz, yjz, yjz, bol, long, float, long, long, long, cns, bao, int, int, int):void");
    }

    public static int ac(int i, Context context) throws Resources.NotFoundException {
        return new sst(context).a(sip.d(context, R.attr.colorSurface, 0), context.getResources().getDimension(i));
    }

    public static View ad(bl blVar) {
        sij.o(blVar.getDialog() != null, "Wrap OnShowListener with SyntheticDialogs#whileDialogExists");
        return blVar.getDialog().getWindow().findViewById(android.R.id.content);
    }

    public static void ae(bl blVar) {
        View viewA;
        pju pjuVarC = pkd.c(ad(blVar));
        pjuVarC.getClass();
        bv parentFragment = blVar.getParentFragment();
        while (true) {
            if (parentFragment != null) {
                viewA = parentFragment.getView();
                if (viewA != null && pkd.c(viewA) != null) {
                    break;
                } else {
                    parentFragment = parentFragment.getParentFragment();
                }
            } else {
                viewA = pkd.a(blVar.getActivity());
                break;
            }
        }
        pju pjuVarC2 = pkd.c(viewA);
        pjuVarC2.getClass();
        sij.o(pjuVarC.c instanceof pkd, "Cannot reparent synthetic nodes.");
        sij.o(!pjuVarC.d(), "Node is already impressed.");
        pjuVarC2.c.e(pjuVarC);
    }

    public static pjs af(wji wjiVar, vsz vszVar) {
        vtw vtwVarM = nbs.a.m();
        if (wjiVar != null) {
            vtw vtwVarM2 = ubz.a.m();
            vtw vtwVarM3 = uby.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            uby ubyVar = (uby) vtwVarM3.b;
            ubyVar.c = wjiVar;
            ubyVar.b |= 1;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ubz ubzVar = (ubz) vtwVarM2.b;
            uby ubyVar2 = (uby) vtwVarM3.r();
            ubyVar2.getClass();
            ubzVar.d = ubyVar2;
            ubzVar.b |= 2;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            nbs nbsVar = (nbs) vtwVarM.b;
            ubz ubzVar2 = (ubz) vtwVarM2.r();
            ubzVar2.getClass();
            nbsVar.c = ubzVar2;
            nbsVar.b |= 1;
        }
        if (vszVar != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            nbs nbsVar2 = (nbs) vtwVarM.b;
            nbsVar2.b |= 2;
            nbsVar2.d = vszVar;
        }
        return new pjs(nbu.b, (nbs) vtwVarM.r());
    }

    public static pjt ag(nbt nbtVar) {
        return new pjt(nbu.a, nbtVar);
    }

    public static pjv ah(ubx ubxVar) {
        return new pjv(nbu.c, ubxVar);
    }

    public static pjs ai(long j) {
        vvd vvdVar = pmu.a;
        vtw vtwVarM = plx.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        plx plxVar = (plx) vtwVarM.b;
        plxVar.b |= 1;
        plxVar.c = j;
        return new pjs(vvdVar, (plx) vtwVarM.r());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void aj(defpackage.yjk r26, defpackage.bkp r27, boolean r28, defpackage.bol r29, defpackage.arb r30, defpackage.ard r31, defpackage.qs r32, defpackage.yy r33, defpackage.kw r34, defpackage.yka r35, defpackage.bao r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtl.aj(yjk, bkp, boolean, bol, arb, ard, qs, yy, kw, yka, bao, int, int):void");
    }

    public static ucz ak(plh plhVar, boolean z) {
        List listB = plhVar.b();
        for (int i = !z ? 1 : 0; i < listB.size(); i++) {
            pka pkaVar = (pka) listB.get(i);
            ucy ucyVar = pkaVar.d;
            if (ucyVar == null) {
                ucyVar = ucy.a;
            }
            if ((ucyVar.b & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                ucy ucyVar2 = pkaVar.d;
                if (ucyVar2 == null) {
                    ucyVar2 = ucy.a;
                }
                ucz uczVar = ucyVar2.e;
                return uczVar == null ? ucz.a : uczVar;
            }
        }
        return null;
    }

    public static final void al(int i, boolean z, vty[] vtyVarArr, plj pljVar, Map map, vtw vtwVar, vtw vtwVar2) {
        vty vtyVar = vtyVarArr[i];
        vvd vvdVar = uaw.a;
        if (vtyVar.bJ(vvdVar)) {
            z = true;
        } else if (z) {
            ucj ucjVar = (ucj) vtyVar.b;
            vtyVar.bL(vvdVar, Long.valueOf((ucjVar.c << 32) | (ucjVar.d & 4294967295L)));
        }
        boolean z2 = z;
        Iterator it = DesugarCollections.unmodifiableList(((ucj) vtyVar.b).e).iterator();
        while (it.hasNext()) {
            al(((Integer) it.next()).intValue(), z2, vtyVarArr, pljVar, map, vtwVar, vtwVar2);
        }
    }

    public static final void am(ucz uczVar, pli pliVar, plj pljVar, vtw vtwVar) {
        if (pljVar.b.size() == 1) {
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uao uaoVar = (uao) vtwVar.b;
            uao uaoVar2 = uao.a;
            uaoVar.e = uczVar;
            uaoVar.b |= 2;
            return;
        }
        ucy ucyVar = aq(pliVar).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        ucz uczVar2 = ucyVar.e;
        if (uczVar2 == null) {
            uczVar2 = ucz.a;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uao uaoVar3 = (uao) vtwVar.b;
        uao uaoVar4 = uao.a;
        uczVar2.getClass();
        uaoVar3.e = uczVar2;
        uaoVar3.b |= 2;
    }

    public static final void an(vty vtyVar, vty[] vtyVarArr) {
        if (vtyVarArr == null) {
            return;
        }
        vtw vtwVarM = uaq.a.m();
        for (int i = 1; i < vtyVarArr.length; i++) {
            ucj ucjVar = (ucj) vtyVarArr[i].r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uaq uaqVar = (uaq) vtwVarM.b;
            ucjVar.getClass();
            vun vunVar = uaqVar.b;
            if (!vunVar.c()) {
                uaqVar.b = vuc.s(vunVar);
            }
            uaqVar.b.add(ucjVar);
        }
        vtyVar.bL(uar.a, (uaq) vtwVarM.r());
    }

    public static uhp ao() {
        return sfy.C(vtn.a);
    }

    public static uhp ap() {
        return sfy.C(null);
    }

    public static pka aq(plh plhVar) {
        return (pka) plhVar.b().get(r1.size() - 1);
    }

    public static pka ar(plh plhVar) {
        return (pka) plhVar.b().get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void as(defpackage.pju r6, java.util.List r7) {
        /*
        L0:
            if (r6 == 0) goto L4e
            r0 = r6
            pju r0 = (defpackage.pju) r0
            pka r1 = r0.a()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            ucy r4 = r1.d
            if (r4 != 0) goto L13
            ucy r4 = defpackage.ucy.a
        L13:
            int r4 = r4.b
            r4 = r4 & 8
            if (r4 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r2
        L1c:
            java.lang.String r5 = "Instrumented view has no VE ID."
            defpackage.sij.x(r4, r5)
            r7.add(r1)
        L24:
            pks r4 = r0.c
            java.lang.Object r4 = r4.d()
            if (r4 != 0) goto L4c
            pks r7 = r0.c
            boolean r7 = r7.o()
            if (r7 != 0) goto L45
            vvd r7 = defpackage.pnj.a
            r1.i(r7)
            vtr r0 = r1.l
            java.lang.Object r7 = r7.c
            vub r7 = (defpackage.vub) r7
            boolean r7 = r0.m(r7)
            if (r7 == 0) goto L46
        L45:
            r2 = r3
        L46:
            java.lang.String r7 = "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s"
            defpackage.sij.z(r2, r7, r6)
            return
        L4c:
            r6 = r4
            goto L0
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtl.as(pju, java.util.List):void");
    }

    public static final long at(vfd vfdVar) {
        return (long) (((vfdVar.b * 365 * 86400000) + (vfdVar.c * 30 * 86400000) + (vfdVar.d * 86400000) + (vfdVar.e * 3600000) + (vfdVar.f * 60000) + vfdVar.g) * 1000.0d);
    }

    public static final ouq au(int i) {
        int i2 = i - 2;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ouq.g : ouq.f : ouq.e : ouq.d : ouq.c : ouq.b : ouq.a;
    }

    public static final List av(dze dzeVar) {
        yhp yhpVar = new yhp((byte[]) null);
        yhpVar.add("Format [");
        yhpVar.add("\tid: " + dzeVar.K + ", label: " + dzeVar.L + ", language: " + dzeVar.N + ", codecs: " + dzeVar.U + ", selection flags: " + dzeVar.O + ", role flags: " + dzeVar.P + ", average bitrate: " + dzeVar.R + ", peak bitrate: " + dzeVar.S + ", bitrate: " + dzeVar.T);
        StringBuilder sb = new StringBuilder("\tcontainer mime type: ");
        sb.append(dzeVar.X);
        sb.append(", sample mime type: ");
        String str = dzeVar.Y;
        sb.append(str);
        sb.append(", max input size: ");
        sb.append(dzeVar.Z);
        sb.append(", sub sample offset: ");
        sb.append(dzeVar.ad);
        yhpVar.add(sb.toString());
        yhpVar.add("\twidth: " + dzeVar.af + ", height: " + dzeVar.ag + ", frameRate: " + dzeVar.aj + ", rotation degrees: " + dzeVar.ak + ", pixel width ratio: " + dzeVar.al + ", stereo mode: " + dzeVar.an + ", channel count: " + dzeVar.aq + ", sample rate: " + dzeVar.ar);
        int i = dzeVar.at;
        int i2 = dzeVar.au;
        int i3 = dzeVar.av;
        int i4 = dzeVar.az;
        int i5 = dzeVar.as;
        StringBuilder sb2 = new StringBuilder("\tencoder delay: ");
        sb2.append(i);
        sb2.append(", encoder padding: ");
        sb2.append(i2);
        sb2.append(", accessibility channel: ");
        sb2.append(i3);
        sb2.append(", crypto type: ");
        sb2.append(i4);
        sb2.append(", PCM encoding: ");
        sb2.append(i5);
        yhpVar.add(sb2.toString());
        dyt dytVar = dzeVar.ao;
        if (dytVar != null) {
            List listP = yfm.p("Color Info space: " + dytVar.h + ", range: " + dytVar.i + ", transfer: " + dytVar.j);
            ArrayList arrayList = new ArrayList(yfm.z(listP, 10));
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                arrayList.add("\t".concat(String.valueOf((String) it.next())));
            }
            yhpVar.addAll(arrayList);
        }
        ead eadVar = dzeVar.V;
        if (eadVar != null) {
            int iA = eadVar.a();
            ymd ymdVarR = ykn.r(0, eadVar.a());
            ArrayList arrayList2 = new ArrayList(yfm.z(ymdVarR, 10));
            yhf yhfVarC = ymdVarR.iterator();
            while (((ymc) yhfVarC).a) {
                arrayList2.add(eadVar.b(yhfVarC.a()));
            }
            List listP2 = yfm.p("Metadata " + iA + " entries: " + arrayList2 + ", presentation time: " + eadVar.b);
            ArrayList arrayList3 = new ArrayList(yfm.z(listP2, 10));
            Iterator it2 = listP2.iterator();
            while (it2.hasNext()) {
                arrayList3.add("\t".concat(String.valueOf((String) it2.next())));
            }
            yhpVar.addAll(arrayList3);
        }
        if (str != null && ylh.ac(str, "image/")) {
            yhpVar.add("\ttile count horizontal: " + dzeVar.ax + ", tile count vertical: " + dzeVar.ay);
        }
        yhpVar.add("]");
        return yfm.o(yhpVar);
    }

    public static final List aw(enu enuVar) {
        return yfm.p("\t\tschemeIdUri: " + enuVar.a + ", value: " + enuVar.b + ", id: " + enuVar.c);
    }

    public static final boolean ax(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final boolean ay(String str) {
        return ylh.ac(str, "avc") || yks.e(str, "vp9") || ylh.ac(str, "hvc1.1");
    }

    public static final boolean az(Context context) {
        Display display;
        int[] supportedHdrTypes;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                display = context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                display = displayManager != null ? context.createDisplayContext(displayManager.getDisplay(0)).getDisplay() : null;
            }
        } else {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            display = ((WindowManager) systemService).getDefaultDisplay();
        }
        if (display == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 34) {
            Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
            return (hdrCapabilities == null || (supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes()) == null || supportedHdrTypes.length == 0) ? false : true;
        }
        int[] supportedHdrTypes2 = display.getMode().getSupportedHdrTypes();
        supportedHdrTypes2.getClass();
        if (supportedHdrTypes2.length != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNKNOWN";
    }

    public static pjd c(qth qthVar, Object obj) {
        if (obj == null) {
            return new pjd(2, null);
        }
        qthVar.j(obj);
        return pjd.a(qthVar.c(obj));
    }

    public static psy d(qsx qsxVar, Bundle bundle) {
        return (psy) ykr.n(yim.a, new pfd(qsxVar, bundle, (yih) null, 18));
    }

    public static final int e(vjq vjqVar) {
        vtw vtwVar = (vtw) vjqVar.a(5, null);
        vtwVar.x(vjqVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vuc vucVar = vtwVar.b;
        vjq vjqVar2 = (vjq) vucVar;
        vjqVar2.i = null;
        vjqVar2.b &= -33;
        if (!vucVar.A()) {
            vtwVar.u();
        }
        vuc vucVar2 = vtwVar.b;
        vjq vjqVar3 = (vjq) vucVar2;
        vjqVar3.b &= -2;
        vjqVar3.c = 0;
        if (!vucVar2.A()) {
            vtwVar.u();
        }
        vjq vjqVar4 = (vjq) vtwVar.b;
        vjqVar4.b &= -65;
        vjqVar4.j = vjq.a.j;
        if ((vjqVar.b & 4) != 0) {
            vkk vkkVar = vjqVar.e;
            if (vkkVar == null) {
                vkkVar = vkk.a;
            }
            vtw vtwVar2 = (vtw) vkkVar.a(5, null);
            vtwVar2.x(vkkVar);
            if (!vtwVar2.b.A()) {
                vtwVar2.u();
            }
            vkk vkkVar2 = (vkk) vtwVar2.b;
            vkkVar2.b &= -5;
            vkkVar2.e = vkk.a.e;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            vjq vjqVar5 = (vjq) vtwVar.b;
            vkk vkkVar3 = (vkk) vtwVar2.r();
            vkkVar3.getClass();
            vjqVar5.e = vkkVar3;
            vjqVar5.b |= 4;
        }
        vjq vjqVar6 = (vjq) vtwVar.r();
        if (vjqVar6.A()) {
            return vjqVar6.j();
        }
        int i = vjqVar6.M;
        if (i != 0) {
            return i;
        }
        int iJ = vjqVar6.j();
        vjqVar6.M = iJ;
        return iJ;
    }

    public static final qry f(qrx qrxVar) {
        if (qrxVar != null) {
            return new qry(true, qrxVar);
        }
        throw new IllegalArgumentException("DropReason should not be null.");
    }

    public static final qru g(pvi pviVar) {
        vhm vhmVar = pviVar != null ? pviVar.c : null;
        int i = 5;
        if (vhmVar != null) {
            switch (vhmVar.ordinal()) {
                case 0:
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                case 4:
                    i = 3;
                    break;
                case 5:
                case 6:
                    i = 4;
                    break;
                default:
                    throw new yfu();
            }
        }
        return new qru(i);
    }

    public static final /* synthetic */ qre h(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (qre) vucVarO;
    }

    public static final void i(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        qre qreVar = (qre) vtwVar.b;
        qre qreVar2 = qre.a;
        qreVar.b |= 4;
        qreVar.f = str;
    }

    public static final void j(vmo vmoVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        qre qreVar = (qre) vtwVar.b;
        qre qreVar2 = qre.a;
        qreVar.d = vmoVar;
        qreVar.b |= 1;
    }

    public static final void l(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        qre qreVar = (qre) vtwVar.b;
        qre qreVar2 = qre.a;
        qreVar.e = i - 1;
        qreVar.b |= 2;
    }

    public static final void m(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        qre qreVar = (qre) vtwVar.b;
        qre qreVar2 = qre.a;
        qreVar.h = a.aF(i);
        qreVar.b |= 16;
    }

    public static final void n(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        qre qreVar = (qre) vtwVar.b;
        qre qreVar2 = qre.a;
        qreVar.g = i - 1;
        qreVar.b |= 8;
    }

    public static final /* synthetic */ qrd o(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (qrd) vucVarO;
    }

    public static final void p(vtw vtwVar) {
        DesugarCollections.unmodifiableList(((qrd) vtwVar.b).b).getClass();
    }

    public static final qpv q(qqv qqvVar) {
        int i = qqvVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            String str = (i == 1 ? (qqs) qqvVar.c : qqs.a).b;
            str.getClass();
            return new qpz(str);
        }
        if (i3 == 1) {
            return qqn.a;
        }
        if (i3 == 2) {
            return qql.a;
        }
        if (i3 == 3) {
            String str2 = (i == 4 ? (qqq) qqvVar.c : qqq.a).b;
            str2.getClass();
            return new qpw(str2);
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new yfu();
            }
            throw new IllegalStateException("Account not set in account representation proto");
        }
        String str3 = (i == 5 ? (qqr) qqvVar.c : qqr.a).b;
        str3.getClass();
        return new qpx(str3, (qqvVar.b == 5 ? (qqr) qqvVar.c : qqr.a).c);
    }

    public static Map s(qqc qqcVar) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        qqcVar.b(builder);
        ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
        immutableMapBuildOrThrow.getClass();
        return immutableMapBuildOrThrow;
    }

    public static final qpv t(String str) {
        return (str == null || str.length() == 0) ? qqn.a : new qpz(str);
    }

    public static boolean u(qpv qpvVar) {
        boolean z = false;
        if (!(qpvVar instanceof qpz) && !(qpvVar instanceof qpw)) {
            if (qpvVar instanceof qpx) {
                return false;
            }
            z = true;
            if (!(qpvVar instanceof qqn)) {
                if (qpvVar instanceof qql) {
                    return true;
                }
                throw new yfu();
            }
        }
        return z;
    }

    public static final String v(String str) {
        return (str == null || str.length() == 0) ? "SIGNED_OUT" : "SIGNED_IN";
    }

    public static int w(int i, int i2, int i3) {
        return csq.f(csq.g(i2, i3), i);
    }

    public static int x(DisplayMetrics displayMetrics, int i) {
        return (int) ((i * displayMetrics.density) + 0.5d);
    }

    public static int y(wes wesVar) {
        float f;
        if ((wesVar.b & 1) != 0) {
            vtu vtuVar = wesVar.f;
            if (vtuVar == null) {
                vtuVar = vtu.a;
            }
            f = vtuVar.b;
        } else {
            f = 1.0f;
        }
        return Color.argb(((int) (f * 255.0f)) & 255, ((int) (wesVar.c * 255.0f)) & 255, ((int) (wesVar.d * 255.0f)) & 255, ((int) (wesVar.e * 255.0f)) & 255);
    }

    public static View z(Activity activity) {
        Window window;
        for (bv bvVar : ((by) activity).getSupportFragmentManager().j()) {
            if (bvVar instanceof bl) {
                View view = bvVar.getView();
                return (view != null || (window = ((bl) bvVar).getDialog().getWindow()) == null) ? view : window.getDecorView();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object aA(defpackage.yjv r5, defpackage.yih r6) throws defpackage.ouf {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.oug
            if (r0 == 0) goto L13
            r0 = r6
            oug r0 = (defpackage.oug) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            oug r0 = new oug
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r6)     // Catch: defpackage.xtn -> L27
            return r6
        L27:
            r5 = move-exception
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            r0.b = r3     // Catch: defpackage.xtn -> L27
            java.lang.Object r5 = r5.a(r0)     // Catch: defpackage.xtn -> L27
            if (r5 != r1) goto L3d
            return r1
        L3d:
            return r5
        L3e:
            xtk r6 = r5.a
            ouf r0 = new ouf
            r6.getClass()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtl.aA(yjv, yih):java.lang.Object");
    }
}
