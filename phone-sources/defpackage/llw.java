package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llw {
    public final Bundle a;

    public llw() {
        this(null);
    }

    private static int n(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    private static boolean o(Bundle bundle, Bundle bundle2, String str) {
        return ksk.m(bundle.get(str), bundle2.get(str));
    }

    public final int a(int i) {
        return this.a.getInt("played_from_millis", i);
    }

    public final String b() {
        return this.a.getString("lang");
    }

    public final String c() {
        return this.a.getString(krh.AUDIO_LANGUAGE, null);
    }

    public final void d(int i) {
        this.a.putInt("played_from_millis", i);
    }

    public final void e(int i) {
        this.a.putInt("resume_time", i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llw)) {
            return false;
        }
        Bundle bundle = ((llw) obj).a;
        Bundle bundle2 = this.a;
        return o(bundle2, bundle, "lang") && o(bundle2, bundle, "audio_index") && o(bundle2, bundle, krh.AUDIO_LANGUAGE) && o(bundle2, bundle, "resume_time") && o(bundle2, bundle, "short_clock") && o(bundle2, bundle, "contains_dub_cards");
    }

    public final void f(int i) {
        this.a.putInt("audio_index", i);
    }

    public final void g(String str) {
        if (str == null) {
            str = "";
        }
        this.a.putString("lang", str);
    }

    public final void h(String str) {
        this.a.putString(krh.AUDIO_LANGUAGE, str);
    }

    public final int hashCode() {
        Bundle bundle = this.a;
        return (((((((((n(bundle.get("lang")) * 31) + n(bundle.get("audio_index"))) * 31) + n(bundle.get(krh.AUDIO_LANGUAGE))) * 31) + n(bundle.get("resume_time"))) * 31) + n(bundle.get("short_clock"))) * 31) + n(bundle.get("contains_dub_cards"));
    }

    public final boolean i() {
        return this.a.getBoolean("contains_dub_cards", false);
    }

    public final boolean j() {
        return this.a.containsKey("resume_time");
    }

    public final int k() {
        return this.a.getInt("resume_time", -1);
    }

    public final int l() {
        return this.a.getInt("audio_index", -1);
    }

    public final void m() {
        this.a.putBoolean("contains_dub_cards", true);
    }

    public llw(Bundle bundle) {
        this.a = bundle == null ? new Bundle() : bundle;
    }
}
