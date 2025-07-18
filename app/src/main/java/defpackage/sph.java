package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sph implements zxe {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ zyd c;
    final /* synthetic */ spi d;

    public sph(spi spiVar, int i, String str, zyd zydVar) {
        this.a = i;
        this.b = str;
        this.c = zydVar;
        this.d = spiVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) spi.a.d().o(zfi.a, "ALT.AudioOpChecker")).p(th)).q("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker$1", "onFailure", (char) 159, "RecordAudioOpChecker.java")).u("#audio# Failed getting startListening future");
    }

    @Override // defpackage.zxe
    public final /* synthetic */ void b(Object obj) {
        zer zerVar = zfi.a;
        int i = Build.VERSION.SDK_INT;
        spi spiVar = this.d;
        String str = this.b;
        if (i >= 30) {
            Context context = spiVar.b;
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            if (appOpsManager == null) {
                ((zdv) ((zdv) spi.a.d().o(zerVar, "ALT.AudioOpChecker")).q("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker", "startOp", 82, "RecordAudioOpChecker.java")).u("#audio# unable to get access to app ops manager for startOp");
            } else {
                appOpsManager.startOp("android:record_audio", Process.myUid(), context.getPackageName(), str, null);
            }
        }
        zxn.p(this.c, wyo.f(new spg(this, str)), spiVar.c);
    }
}
