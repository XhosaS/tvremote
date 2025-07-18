package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovm implements net {
    public static final ovm a = new ovm();
    private static final tui b = tui.l("com/google/android/libraries/googletv/player/kinetoscope/initializer/VideoInitializerUtils");
    private static final List c = new ArrayList();

    private ovm() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ewb a(Context context, enr enrVar, nex nexVar, net netVar, tst tstVar, tst tstVar2, yfo yfoVar, ove oveVar, egc egcVar, byte[] bArr) {
        String str;
        if (oveVar != null) {
            ((tug) ove.a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurDrmSessionManager", "setMode", 193, "NurDrmSessionManager.kt")).B("mode: %s, offlineLicenseKeySetId: %s", "MODE_PLAYBACK", bArr != null ? new String(bArr, ynd.a) : null);
            oveVar.b = bArr;
        }
        int i = context.getApplicationContext().getApplicationInfo().labelRes;
        String string = i != 0 ? context.getString(i) : context.getPackageName();
        String str2 = edt.a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String str3 = string + "/" + str + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.8.0-alpha01";
        eha ehaVar = new eha((CronetEngine) yfoVar.b(), new ugl());
        ehaVar.a = str3;
        ovj ovjVar = new ovj(ehaVar, tstVar, tstVar2);
        Cnew cnew = new Cnew();
        List list = c;
        list.add(cnew);
        eft eftVar = new eft(ovjVar, cnew);
        if (egcVar != null) {
            egg eggVar = new egg();
            eggVar.a = egcVar;
            eggVar.d = eftVar;
            eggVar.e(null);
            eftVar = eggVar;
        }
        DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(new eni(eftVar), eftVar);
        if (oveVar != null) {
            dashMediaSource$Factory.f(new lmm(oveVar, 2));
            list.add(oveVar);
        }
        enf enfVarA = dashMediaSource$Factory.a(enrVar);
        if (nexVar != null) {
            if (netVar != null) {
                list.add(netVar);
                return new nev(enfVarA, nexVar, a);
            }
            ((tug) b.g().j("com/google/android/libraries/googletv/player/kinetoscope/initializer/VideoInitializerUtils", "prepareMediaSource", 74, "VideoInitializerUtils.kt")).s("Could not create a PlaybackNonceInsertingMediaSource because no PlaybackNonceInsertingMediaSource.Listener was provided.");
        }
        return enfVarA;
    }

    @Override // defpackage.net
    public final void G(String str) {
        str.getClass();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((net) it.next()).G(str);
        }
    }
}
