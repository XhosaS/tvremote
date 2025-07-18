package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class fl {
    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(fl.class.getClassLoader());
        }
    }
}
