package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyh {
    public final ContentResolver a;

    public gyh(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final boolean a() {
        return lwy.b(this.a, "aah:enable_multiple_providers_per_app", true);
    }

    public final boolean b() {
        return lwy.b(this.a, "aah:enable_play_intent_caching", false);
    }

    public final boolean c() {
        return lwy.b(this.a, "aah:should_enable_live_cards", true);
    }
}
