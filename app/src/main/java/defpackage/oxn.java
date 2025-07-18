package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxn {
    public final SharedPreferences a;

    public oxn(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        sharedPreferences.getString("assistantSettingsVersionInfo", null);
    }
}
