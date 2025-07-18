package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.util.ArrayMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqs implements bqy {
    private static final cbt a = cbt.k("com/google/android/tv/remote/service/audio/provider/AppOpsDisclosureService");
    private final AppOpsManager b;
    private final PackageManager c;
    private final ArrayMap d = new ArrayMap();
    private final bsi e;

    public bqs(Context context, bsi bsiVar) {
        this.b = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        this.c = context.getPackageManager();
        this.e = bsiVar;
    }

    @Override // defpackage.bqy
    public final void a(IBinder iBinder) {
        synchronized (this) {
            bda bdaVar = (bda) this.d.remove(iBinder);
            if (bdaVar == null) {
                return;
            }
            cbs cbsVar = (cbs) ((cbs) a.e().g(btt.a)).j("com/google/android/tv/remote/service/audio/provider/AppOpsDisclosureService", "closeMic", 110, "AppOpsDisclosureService.java");
            Object obj = bdaVar.c;
            int i = bdaVar.a;
            cbsVar.A("closeMic %s %s(%d)", iBinder, obj, Integer.valueOf(i));
            this.b.finishOp((String) bdaVar.b, i, (String) obj);
        }
    }

    @Override // defpackage.bqy
    public final boolean b(IBinder iBinder, boolean z, int i, String str) {
        String str2;
        if (!z || Build.VERSION.SDK_INT < 33) {
            str2 = "android:record_audio";
        } else {
            if (this.c.checkPermission("android.permission.RECORD_AUDIO", str) == -1) {
                ((cbs) a.g().j("com/google/android/tv/remote/service/audio/provider/AppOpsDisclosureService", "openMic", 56, "AppOpsDisclosureService.java")).z("Package %s doesn't hold %s", str, "android.permission.RECORD_AUDIO");
                return false;
            }
            str2 = "android:receive_explicit_user_interaction_audio";
        }
        if (str == null || i == -1) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/audio/provider/AppOpsDisclosureService", "openMic", 66, "AppOpsDisclosureService.java")).p("Unable to resolve target package or uid");
            return false;
        }
        int iStartOpNoThrow = this.b.startOpNoThrow(str2, i, str);
        cbt cbtVar = a;
        ((cbs) ((cbs) cbtVar.e().g(btt.a)).j("com/google/android/tv/remote/service/audio/provider/AppOpsDisclosureService", "openMic", 70, "AppOpsDisclosureService.java")).B("openMic %s %s(%d) %d", iBinder, str, Integer.valueOf(i), Integer.valueOf(iStartOpNoThrow));
        if (iStartOpNoThrow == 1) {
            if (Build.VERSION.SDK_INT == 30 && str.equals("com.google.android.katniss")) {
                ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/audio/provider/AppOpsDisclosureService", "openMic", 75, "AppOpsDisclosureService.java")).p("Google Assistant is not allowed to record audio!!! Ignoring...");
                this.e.a(1014, 0L);
                iStartOpNoThrow = 0;
            } else {
                iStartOpNoThrow = 1;
            }
        }
        if (iStartOpNoThrow == 0) {
            synchronized (this) {
                this.d.put(iBinder, new bda(str2, i, str));
            }
            return true;
        }
        ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/audio/provider/AppOpsDisclosureService", "openMic", 86, "AppOpsDisclosureService.java")).t("%s doesn't have access to the on-remote mic", str);
        if (iStartOpNoThrow == 1) {
            this.b.finishOp(str2, i, str);
        }
        return false;
    }
}
