package defpackage;

import android.net.Uri;
import android.os.PowerManager;
import j$.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpc extends vww {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/observers/HardwareHotwordMicToggleObserver");
    private static final Duration c;
    public final Set a;
    private final jcy d;
    private final agow e;
    private final PowerManager.WakeLock f;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        durationOfSeconds.getClass();
        c = durationOfSeconds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpc(Executor executor, jcy jcyVar, agow agowVar, PowerManager powerManager, wxc wxcVar) {
        super(wxcVar, "HardwareHotwordMicToggleObserver", executor);
        executor.getClass();
        jcyVar.getClass();
        agowVar.getClass();
        powerManager.getClass();
        wxcVar.getClass();
        this.d = jcyVar;
        this.e = agowVar;
        this.a = new LinkedHashSet();
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "Katniss:LED_WAKELOCK");
        wakeLockNewWakeLock.setReferenceCounted(false);
        wakeLockNewWakeLock.getClass();
        this.f = wakeLockNewWakeLock;
    }

    @Override // defpackage.vww
    public final void a(boolean z, Uri uri) {
        this.f.acquire(c.toMillis());
        boolean zD = this.d.d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            lyp lypVar = ((lxx) it.next()).a;
            ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer", "hotwordMicToggleListener$lambda$4", 256, "KatnissVoiceInteractionServicePeer.kt")).x("Hotword mic toggle state changed to %b", Boolean.valueOf(zD));
            lypVar.f.p(zD);
            lypVar.l.i(zD);
        }
        if (zD) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/observers/HardwareHotwordMicToggleObserver", "refreshMuteState", 69, "HardwareHotwordMicToggleObserver.kt")).u("HardwareMuteToggleObserver refresh: isOff");
            ((gcd) this.e.a()).e();
        } else {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/observers/HardwareHotwordMicToggleObserver", "refreshMuteState", 66, "HardwareHotwordMicToggleObserver.kt")).u("HardwareMuteToggleObserver refresh: isMuted");
            ((gcd) this.e.a()).d();
        }
    }
}
