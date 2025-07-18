package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hag implements hak {
    private final Context a;

    public hag(Context context) {
        this.a = context;
    }

    @Override // defpackage.hak
    public final Object dK(yih yihVar) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        hae haeVar = new hae(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new haj(haeVar, haeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hag) && yks.e(this.a, ((hag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
