package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaah {
    public static final Object a = new Object();
    public static final String b = "aaah";
    private final zzv c;

    public aaah(aaag aaagVar) {
        Context context = aaagVar.a;
        String str = aaagVar.b;
        String str2 = aaagVar.c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.c = aaagVar.f;
    }

    public final synchronized zzu a() {
        return this.c.a();
    }
}
