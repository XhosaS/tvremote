package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crg {
    public final Bundle a;
    public final boolean b;
    public boolean c;

    @Deprecated
    public int d;
    public final CharSequence e;
    public final PendingIntent f;
    public final ity[] g;
    private IconCompat h;

    public crg(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ity[] ityVarArr) {
        this.c = true;
        this.h = iconCompat;
        if (iconCompat != null && iconCompat.b() == 2) {
            this.d = iconCompat.a();
        }
        this.e = crm.c(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.g = ityVarArr;
        this.b = true;
        this.c = true;
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.d) != 0) {
            this.h = IconCompat.g(null, "", i);
        }
        return this.h;
    }
}
