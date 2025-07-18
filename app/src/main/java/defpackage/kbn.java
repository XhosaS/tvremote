package defpackage;

import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbn extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return CloudMessagingMessengerCompat.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return CloudMessagingMessengerCompat.class;
    }
}
