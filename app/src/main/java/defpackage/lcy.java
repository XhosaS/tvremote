package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lcy {
    final Context a;
    Boolean b;
    long c;
    InitializationParams d;
    boolean e;
    final Long f;
    String g;

    public lcy(Context context, InitializationParams initializationParams, Long l) {
        this.e = true;
        kkk.k(context);
        Context applicationContext = context.getApplicationContext();
        kkk.k(applicationContext);
        this.a = applicationContext;
        this.f = l;
        if (initializationParams != null) {
            this.d = initializationParams;
            this.e = initializationParams.c;
            this.c = initializationParams.b;
            this.g = initializationParams.e;
            Bundle bundle = initializationParams.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
