package defpackage;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ien extends icu implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final SharedPreferences g;
    private final Set h;

    public ien(SharedPreferences sharedPreferences, String... strArr) {
        this.h = new HashSet(Arrays.asList(strArr));
        sharedPreferences.getClass();
        this.g = sharedPreferences;
    }

    @Override // defpackage.icu
    public final void ec() {
        this.g.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // defpackage.icu
    public final void ed() {
        this.g.unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.h.contains(str)) {
            eb();
        }
    }
}
