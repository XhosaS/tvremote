package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeii {
    public static Object a(Context context) {
        ComponentCallbacks2 componentCallbacks2A = aehn.a(context.getApplicationContext());
        boolean z = componentCallbacks2A instanceof aeiz;
        Object[] objArr = {componentCallbacks2A.getClass()};
        if (z) {
            return ((aeiz) componentCallbacks2A).dN();
        }
        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", objArr));
    }
}
