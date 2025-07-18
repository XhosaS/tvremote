package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdz extends boy {
    private final Context c;

    public cdz(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) {
        if (this.b >= 10) {
            brmVar.c(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
