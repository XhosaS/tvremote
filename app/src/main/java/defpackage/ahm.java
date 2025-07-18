package defpackage;

import android.content.res.Resources;
import android.view.InputDevice;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahm {
    public static int a(Resources resources, int i, afl aflVar, int i2) {
        int dimensionPixelSize;
        return i != -1 ? (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize : ((Integer) aflVar.a()).intValue();
    }

    public static boolean b(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }
}
