package defpackage;

import android.content.Context;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sco {
    public static final sco a = new sco(null);
    private final CharSequence b;
    private final int c = 0;
    private final int d = 0;
    private final int e = 0;
    private final Object[] f = new Object[0];

    public sco(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final CharSequence a(Context context) {
        context.getResources().getClass();
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sco)) {
            return false;
        }
        sco scoVar = (sco) obj;
        int i = scoVar.c;
        int i2 = scoVar.d;
        int i3 = scoVar.e;
        return yks.e(this.b, scoVar.b) && Arrays.equals(this.f, scoVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, 0, 0, 0, this.f});
    }

    public final String toString() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence.toString() : "null";
    }
}
