package defpackage;

import android.hardware.lights.LightState;
import android.hardware.lights.LightsManager;
import android.hardware.lights.LightsRequest;
import android.os.Build;
import android.os.DeadSystemException;
import android.os.ServiceSpecificException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gda implements gcz {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/led/player/AssistantLedsImpl");
    private static final int[] b = {0, 0, 0, 0};
    private final LightsManager c;
    private LightsManager.LightsSession d;

    public gda(LightsManager lightsManager) {
        this.c = lightsManager;
    }

    private final void c(int[] iArr) {
        LightsManager lightsManager = this.c;
        if (lightsManager == null) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/led/player/AssistantLedsImpl", "setLightsUsingLightsManager", 63, "AssistantLedsImpl.kt")).u("LightsManager is not ready!");
            return;
        }
        try {
            synchronized (gda.class) {
                if (this.d == null) {
                    ((zdv) a.b().q("com/google/android/apps/tvsearch/led/player/AssistantLedsImpl", "requestLightsBySession", 86, "AssistantLedsImpl.kt")).u("Opening lightsSession");
                    this.d = lightsManager.openSession();
                }
                LightsRequest.Builder builder = new LightsRequest.Builder();
                List lights = lightsManager.getLights();
                if (lights == null) {
                    lights = agrd.a;
                }
                for (int i = 0; i < lights.size() && i < iArr.length; i++) {
                    int i2 = iArr[i];
                    builder.setLight(mr$$ExternalSyntheticApiModelOutline0.m146m(lights.get(i)), new LightState(iArr[i]));
                }
                LightsManager.LightsSession lightsSession = this.d;
                if (lightsSession != null) {
                    lightsSession.requestLights(builder.build());
                }
            }
        } catch (DeadSystemException e) {
            ((zdv) ((zdv) a.c()).p(e).q("com/google/android/apps/tvsearch/led/player/AssistantLedsImpl", "setLightsUsingLightsManager", 73, "AssistantLedsImpl.kt")).u("Can't set lights using LightManager API");
        } catch (IllegalStateException e2) {
            ((zdv) ((zdv) a.c()).p(e2).q("com/google/android/apps/tvsearch/led/player/AssistantLedsImpl", "setLightsUsingLightsManager", 71, "AssistantLedsImpl.kt")).u("Can't set lights using LightManager API");
        } catch (ServiceSpecificException e3) {
            ((zdv) ((zdv) a.c()).p(e3).q("com/google/android/apps/tvsearch/led/player/AssistantLedsImpl", "setLightsUsingLightsManager", 69, "AssistantLedsImpl.kt")).u("Can't set lights using LightManager API");
        }
    }

    @Override // defpackage.gcz
    public final void a(int[] iArr) {
        if (Build.VERSION.SDK_INT < 30) {
            throw new UnsupportedOperationException("Katniss couldn't set light on Q and below devices.");
        }
        c(iArr);
    }

    @Override // defpackage.gcz
    public final void b() {
        if (Build.VERSION.SDK_INT < 30) {
            throw new UnsupportedOperationException("Katniss couldn't set light on Q and below devices.");
        }
        a(b);
        try {
            synchronized (gda.class) {
                if (this.d != null) {
                    ((zdv) a.b().q("com/google/android/apps/tvsearch/led/player/AssistantLedsImpl", "closeLightsSession", 113, "AssistantLedsImpl.kt")).u("Closing lightsSession");
                    LightsManager.LightsSession lightsSession = this.d;
                    if (lightsSession != null) {
                        lightsSession.close();
                    }
                    this.d = null;
                }
            }
        } catch (ServiceSpecificException e) {
            ((zdv) ((zdv) a.c()).p(e).q("com/google/android/apps/tvsearch/led/player/AssistantLedsImpl", "turnOff", 56, "AssistantLedsImpl.kt")).u("Can't close lightsSession using LightsManager API");
        }
    }
}
