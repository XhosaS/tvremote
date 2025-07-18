package defpackage;

import android.content.Context;
import android.hardware.hdmi.HdmiControlManager;
import android.hardware.hdmi.HdmiDeviceInfo;
import android.hardware.hdmi.HdmiPlaybackClient;
import android.media.tv.TvInputInfo;
import android.media.tv.TvInputManager;
import android.os.PowerManager;
import j$.time.Duration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iru implements irr {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/shared/screencontrol/ScreenControllerImpl");
    public static final Duration b;
    private final Context c;
    private final ahbt d;
    private final PowerManager e;
    private final TvInputManager f;
    private final boolean g;
    private final irp h;

    static {
        Duration durationOfMillis = Duration.ofMillis(1000L);
        durationOfMillis.getClass();
        b = durationOfMillis;
    }

    public iru(Context context, ahbt ahbtVar, irp irpVar, PowerManager powerManager, TvInputManager tvInputManager, boolean z) {
        context.getClass();
        ahbtVar.getClass();
        powerManager.getClass();
        this.c = context;
        this.d = ahbtVar;
        this.h = irpVar;
        this.e = powerManager;
        this.f = tvInputManager;
        this.g = z;
    }

    @Override // defpackage.irr
    public final boolean a(String str, boolean z) throws Exception {
        ewk ewkVar;
        HdmiDeviceInfo hdmiDeviceInfo;
        str.getClass();
        TvInputManager tvInputManager = this.f;
        if (tvInputManager == null) {
            ewkVar = null;
        } else {
            ewl ewlVar = ewl.a;
            List<TvInputInfo> tvInputList = tvInputManager.getTvInputList();
            tvInputList.getClass();
            ewkVar = (ewk) ewlVar.d(tvInputList, this.c).get(str);
        }
        if (ewkVar == null) {
            return false;
        }
        irp irpVar = this.h;
        if (!irpVar.a()) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/shared/screencontrol/ScreenControllerImpl", "toggleRemoteDevice", 69, "ScreenControllerImpl.kt")).u("HDMI control unavailable");
            return false;
        }
        this.c.startActivity(z ? ewkVar.e : ewkVar.f);
        ewk ewkVar2 = ewkVar.d;
        if (ewkVar2 != null && (hdmiDeviceInfo = ewkVar2.c) != null) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/shared/screencontrol/ScreenControllerImpl", "toggleRemoteDevice", 80, "ScreenControllerImpl.kt")).I("Changing state of remote device(id: %d type: %d) to %b", Integer.valueOf(hdmiDeviceInfo.getId()), Integer.valueOf(hdmiDeviceInfo.getDeviceType()), Boolean.valueOf(z));
            try {
                if (z) {
                    Method method = HdmiControlManager.class.getMethod("askRemoteDeviceToBecomeActiveSource", HdmiDeviceInfo.class);
                    method.getClass();
                    method.invoke(irpVar.a, hdmiDeviceInfo);
                    return true;
                }
                Method method2 = HdmiControlManager.class.getMethod("powerOffRemoteDevice", HdmiDeviceInfo.class);
                method2.getClass();
                method2.invoke(irpVar.a, hdmiDeviceInfo);
                return true;
            } catch (Exception e) {
                if (!(e instanceof SecurityException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof IllegalArgumentException)) {
                    throw e;
                }
            }
        }
        return false;
    }

    @Override // defpackage.irr
    public final boolean b() {
        if (!this.g) {
            c();
            return d(false);
        }
        ahal.e(this.d, null, 0, new irt(this, null), 3);
        ((zdv) a.b().q("com/google/android/apps/tvsearch/shared/screencontrol/ScreenControllerImpl", "turnOnScreen", 49, "ScreenControllerImpl.kt")).u("Delaying screen on");
        return true;
    }

    public final void c() {
        PowerManager.WakeLock wakeLockNewWakeLock = this.e.newWakeLock(805306378, "katniss:ScreenController");
        if (wakeLockNewWakeLock.isHeld()) {
            wakeLockNewWakeLock.release();
        }
        wakeLockNewWakeLock.acquire();
        wakeLockNewWakeLock.release();
    }

    public final boolean d(boolean z) {
        irp irpVar = this.h;
        if (!irpVar.a()) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/shared/screencontrol/ScreenControllerImpl", "setStandbyMode", 135, "ScreenControllerImpl.kt")).u("HDMI control unavailable");
            return false;
        }
        HdmiControlManager hdmiControlManager = irpVar.a;
        if (hdmiControlManager != null) {
            hdmiControlManager.setStandbyMode(z);
        }
        HdmiPlaybackClient hdmiPlaybackClient = irpVar.b;
        if (hdmiPlaybackClient != null) {
            if (z) {
                hdmiPlaybackClient.sendStandby();
            } else {
                hdmiPlaybackClient.oneTouchPlay(new HdmiPlaybackClient.OneTouchPlayCallback() { // from class: irs
                    public final void onComplete(int i) {
                        zdy zdyVar = iru.a;
                    }
                });
            }
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/shared/screencontrol/ScreenControllerImpl", "setStandbyMode", 141, "ScreenControllerImpl.kt")).x("Called setStandbyMode(%b)", Boolean.valueOf(z));
        return true;
    }
}
