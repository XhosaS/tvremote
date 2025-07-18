package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjs {
    public static final bjs a = new bjs();

    private bjs() {
    }

    public final Object a(Context context, agux aguxVar) {
        try {
            return aguxVar.a(context);
        } catch (NoClassDefFoundError unused) {
            Log.d("MeasurementManager", "Unable to find adservices code, check manifest for uses-library tag, versionS=" + bjr.a.b());
            return null;
        }
    }
}
