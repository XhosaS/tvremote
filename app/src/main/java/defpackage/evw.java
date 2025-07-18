package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evw implements DisplayManager.DisplayListener {
    final /* synthetic */ evx a;

    public evw(evx evxVar) {
        this.a = evxVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        ((zdv) evx.a.b().q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl$displayListener$1", "onDisplayAdded", 91, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("added");
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        evx evxVar = this.a;
        DisplayManager displayManager = evxVar.b;
        if (displayManager.getDisplay(i) != null) {
            evxVar.d(displayManager);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        ((zdv) evx.a.b().q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl$displayListener$1", "onDisplayRemoved", 95, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("removed");
    }
}
