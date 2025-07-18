package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdt {
    public boolean a;
    public PreferenceScreen b;
    public gds c;
    public gdq d;
    public gdr e;
    private final Context f;
    private long g = 0;
    private SharedPreferences h;
    private SharedPreferences.Editor i;
    private String j;

    public gdt(Context context) {
        this.f = context;
        f(String.valueOf(context.getPackageName()).concat("_preferences"));
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.g;
            this.g = 1 + j;
        }
        return j;
    }

    public final SharedPreferences.Editor b() {
        if (!this.a) {
            return c().edit();
        }
        if (this.i == null) {
            this.i = c().edit();
        }
        return this.i;
    }

    public final SharedPreferences c() {
        if (this.h == null) {
            this.h = this.f.getSharedPreferences(this.j, 0);
        }
        return this.h;
    }

    public final Preference d(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.b;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l(charSequence);
    }

    public final void e(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.i) != null) {
            editor.apply();
        }
        this.a = z;
    }

    public final void f(String str) {
        this.j = str;
        this.h = null;
    }
}
