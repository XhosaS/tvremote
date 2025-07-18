package defpackage;

import android.content.SharedPreferences;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozx {
    public final SharedPreferences a;

    static {
        pae.b("home_graph_last_refreshed");
    }

    public ozx(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void a(String str) {
        this.a.edit().putLong(pae.a("home_graph_last_refreshed", str), Instant.now().toEpochMilli()).apply();
    }
}
