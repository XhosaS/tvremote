package defpackage;

import android.hardware.SensorPrivacyManager;
import android.os.Build;
import android.util.ArraySet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bth {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/features/UserMicPrivacyObserver");
    public boolean b;
    private final ArraySet c = new ArraySet();

    public bth(buf bufVar) {
        if (Build.VERSION.SDK_INT < 31) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/features/UserMicPrivacyObserver", "<init>", 27, "UserMicPrivacyObserver.java")).p("Microphone privacy is not supported");
            this.b = false;
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            ((cbs) a.b().j("com/google/android/tv/remote/service/features/UserMicPrivacyObserver", "<init>", 32, "UserMicPrivacyObserver.java")).p("Microphone privacy is ignored");
            this.b = false;
        } else {
            if (bufVar.checkSelfPermission("android.permission.OBSERVE_SENSOR_PRIVACY") == -1) {
                ((cbs) a.g().j("com/google/android/tv/remote/service/features/UserMicPrivacyObserver", "<init>", 38, "UserMicPrivacyObserver.java")).p("No permission granted to observe microphone privacy mode");
                return;
            }
            SensorPrivacyManager sensorPrivacyManagerM17m = gh$$ExternalSyntheticApiModelOutline0.m17m(bufVar.getSystemService(gh$$ExternalSyntheticApiModelOutline0.m()));
            SensorPrivacyManager.OnSensorPrivacyChangedListener onSensorPrivacyChangedListener = new SensorPrivacyManager.OnSensorPrivacyChangedListener() { // from class: btg
                public final void onSensorPrivacyChanged(int i, boolean z) {
                    bth bthVar = this.a;
                    if (bthVar.b != z) {
                        bthVar.b = z;
                        ((cbs) bth.a.e().j("com/google/android/tv/remote/service/features/UserMicPrivacyObserver", "<init>", 48, "UserMicPrivacyObserver.java")).t("Microphone privacy is now %s", true != z ? "disabled" : "enabled");
                        bthVar.a();
                    }
                }
            };
            sensorPrivacyManagerM17m.addSensorPrivacyListener(1, onSensorPrivacyChangedListener);
            bufVar.k(new bsp(sensorPrivacyManagerM17m, onSensorPrivacyChangedListener, 2));
            this.b = sensorPrivacyManagerM17m.isSensorPrivacyEnabled(1);
            ((cbs) a.c().j("com/google/android/tv/remote/service/features/UserMicPrivacyObserver", "<init>", 58, "UserMicPrivacyObserver.java")).t("Microphone privacy is %s", true != this.b ? "disabled" : "enabled");
        }
    }

    public final synchronized void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((brn) it.next()).b();
        }
    }

    public final synchronized void b(brn brnVar) {
        this.c.remove(brnVar);
    }

    public final synchronized void c(brn brnVar) {
        this.c.add(brnVar);
    }
}
