package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqs extends ggi {
    private final Context c;

    public gqs(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        if (this.b >= 10) {
            ghkVar.k(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
