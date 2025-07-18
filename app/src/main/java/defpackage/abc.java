package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abc {
    final Bundle a;
    public final abo[] b;
    public final boolean c;
    boolean d;

    @Deprecated
    public int e;
    public final CharSequence f;
    public final PendingIntent g;
    private IconCompat h;

    public abc(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, abo[] aboVarArr) {
        this.d = true;
        this.h = iconCompat;
        if (iconCompat.b() == 2) {
            this.e = iconCompat.a();
        }
        this.f = abh.c(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.b = aboVarArr;
        this.c = true;
        this.d = true;
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.e) != 0) {
            this.h = IconCompat.f(null, "", i);
        }
        return this.h;
    }
}
