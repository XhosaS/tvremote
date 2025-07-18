package defpackage;

import android.content.Context;
import android.hardware.lights.LightsManager;
import android.os.Build;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcy {
    public static final gcy a = new gcy();
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/led/controller/SingletonModule");

    private gcy() {
    }

    public final gcd a(Context context, agow agowVar, agow agowVar2) {
        context.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        if (Build.VERSION.SDK_INT <= 29) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/led/controller/SingletonModule", "provideLedController", 56, "SingletonModule.kt")).u("Fall back to legacy LED controller on Q and below devices");
            Object objA = agowVar2.a();
            objA.getClass();
            return (gcd) objA;
        }
        if (abs.a(context, "android.permission.CONTROL_DEVICE_LIGHTS") == 0) {
            Object objA2 = agowVar.a();
            objA2.getClass();
            return (gcd) objA2;
        }
        ((zdv) b.d().q("com/google/android/apps/tvsearch/led/controller/SingletonModule", "provideLedController", 63, "SingletonModule.kt")).u("Fall back to legacy LED controller as Katniss doesn't have lights permission");
        Object objA3 = agowVar2.a();
        objA3.getClass();
        return (gcd) objA3;
    }

    public final boolean b(Context context, boolean z, LightsManager lightsManager) {
        List lights;
        context.getClass();
        if (Build.VERSION.SDK_INT <= 29) {
            return true;
        }
        if (!z) {
            return false;
        }
        if (context.checkSelfPermission("android.permission.CONTROL_DEVICE_LIGHTS") != 0) {
            return true;
        }
        if (lightsManager == null || (lights = lightsManager.getLights()) == null) {
            return false;
        }
        return !lights.isEmpty();
    }
}
