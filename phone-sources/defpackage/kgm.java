package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgm {
    public final Context a;
    private final boolean b;

    public kgm(Context context) {
        context.getClass();
        this.b = true;
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgm)) {
            return false;
        }
        kgm kgmVar = (kgm) obj;
        boolean z = kgmVar.b;
        return yks.e(this.a, kgmVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 38161;
    }

    public final String toString() {
        return "ToggleOpenBottomSheet(isOpen=true, uiContext=" + this.a + ")";
    }
}
