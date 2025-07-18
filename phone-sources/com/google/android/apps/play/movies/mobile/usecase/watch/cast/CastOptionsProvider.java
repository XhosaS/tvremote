package com.google.android.apps.play.movies.mobile.usecase.watch.cast;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import com.google.android.apps.play.movies.common.VideosGlobals;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.common.collect.ImmutableList;
import defpackage.iea;
import defpackage.ieg;
import defpackage.kqc;
import defpackage.krd;
import defpackage.ksn;
import defpackage.ldy;
import defpackage.lfj;
import defpackage.lfn;
import defpackage.mif;
import defpackage.msj;
import defpackage.nkp;
import defpackage.nlc;
import defpackage.nmj;
import defpackage.nnj;
import defpackage.now;
import defpackage.npj;
import defpackage.npk;
import defpackage.ocv;
import defpackage.tst;
import defpackage.tyt;
import defpackage.tyz;
import defpackage.tza;
import defpackage.yyh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CastOptionsProvider implements nnj {
    @Override // defpackage.nnj
    public List<yyh> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // defpackage.nnj
    public nmj getCastOptions(Context context) throws JSONException {
        lfj lfjVar;
        if (!(context instanceof kqc)) {
            return null;
        }
        VideosGlobals videosGlobalsC = ((kqc) context).c();
        iea<ieg<ksn>> accountRepository = videosGlobalsC.getAccountRepository();
        lfn lfnVar = (lfn) ((mif) videosGlobalsC).bG.b();
        String name = DeviceNotificationActivity.class.getName();
        ArrayList arrayList = new ArrayList();
        arrayList.add(MediaIntentReceiver.ACTION_REWIND);
        arrayList.add(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
        arrayList.add(MediaIntentReceiver.ACTION_STOP_CASTING);
        int i = 0;
        int[] iArr = {0, 1};
        ImmutableList immutableList = npk.a;
        npj.k("smallIconDrawableResId");
        int iK = npj.k("stopLiveStreamDrawableResId");
        int iK2 = npj.k("pauseDrawableResId");
        int iK3 = npj.k("playDrawableResId");
        int iK4 = npj.k("skipNextDrawableResId");
        int iK5 = npj.k("skipPrevDrawableResId");
        int iK6 = npj.k("forwardDrawableResId");
        int iK7 = npj.k("forward10DrawableResId");
        int iK8 = npj.k("forward30DrawableResId");
        int iK9 = npj.k("rewindDrawableResId");
        int iK10 = npj.k("rewind10DrawableResId");
        int iK11 = npj.k("rewind30DrawableResId");
        int iK12 = npj.k("disconnectDrawableResId");
        int size = arrayList.size();
        int i2 = 2;
        if (size < 2) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Invalid number of compat actions: %d > %d.", 2, Integer.valueOf(size)));
        }
        while (i < i2) {
            int i3 = iArr[i];
            if (i3 < 0 || i3 >= size) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "Index %d in compatActionIndices out of range: [0, %d]", Integer.valueOf(i3), Integer.valueOf(size - 1)));
            }
            i++;
            i2 = 2;
        }
        int i4 = i2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
        ocv.au(true, "skipStepMs must be positive.");
        int i5 = 2131231832;
        if (!lfnVar.cH() && !lfnVar.cL()) {
            i5 = 2131231835;
        }
        npk npkVarL = npj.l(name, arrayList2, iArrCopyOf, i5, iK, iK2, iK3, iK4, iK5, iK6, iK7, iK8, iK9, iK10, iK11, iK12);
        npj.l(null, npk.a, npk.b, npj.k("smallIconDrawableResId"), npj.k("stopLiveStreamDrawableResId"), npj.k("pauseDrawableResId"), npj.k("playDrawableResId"), npj.k("skipNextDrawableResId"), npj.k("skipPrevDrawableResId"), npj.k("forwardDrawableResId"), npj.k("forward10DrawableResId"), npj.k("forward30DrawableResId"), npj.k("rewindDrawableResId"), npj.k("rewind10DrawableResId"), npj.k("rewind30DrawableResId"), npj.k("disconnectDrawableResId"));
        now nowVarP = npj.p(new msj(), npkVarL, true);
        ldy ldyVar = (ldy) accountRepository;
        if (ldyVar.a().m()) {
            tyz tyzVar = lfj.a;
            ksn ksnVar = (ksn) ldyVar.a().g();
            int i6 = 3;
            if (!lfnVar.cH() && !lfnVar.cL()) {
                i6 = i4;
            }
            String str = Build.MODEL;
            str.getClass();
            String str2 = ksnVar.a;
            tyz tyzVar2 = lfj.a;
            int length = str2.length();
            tza tzaVarC = ((tyt) tyzVar2).c(length + length);
            tzaVarC.d(str2);
            String strEncodeToString = Base64.encodeToString(tzaVarC.m().d(), 11);
            strEncodeToString.getClass();
            lfjVar = new lfj(strEncodeToString, i6, str);
        } else {
            lfjVar = null;
        }
        ArrayList arrayList3 = new ArrayList();
        nlc nlcVar = new nlc();
        ArrayList arrayList4 = new ArrayList();
        boolean z = !lfnVar.bV();
        String strBg = lfnVar.bg();
        tst tstVarH = tst.h(nowVarP);
        if (lfjVar != null) {
            nlcVar = new nlc();
            nlcVar.c = lfnVar.bV();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("account", lfjVar.b);
                jSONObject.put("appBrand", lfjVar.d - 1);
                jSONObject.put("deviceName", lfjVar.c).getClass();
            } catch (JSONException e) {
                krd.d("Unable to cast with cast connect", e);
            }
            nlcVar.d = new nkp(jSONObject.toString(), "android");
        }
        return new nmj(strBg, arrayList3, z, nlcVar, true, (now) tstVarH.e(nmj.c), true, 0.05000000074505806d, false, false, false, arrayList4, true, false, nmj.a, nmj.b, false, false);
    }
}
