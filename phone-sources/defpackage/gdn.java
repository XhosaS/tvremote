package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdn {
    final int a;
    final int b;
    final String c;

    public gdn(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.B;
        this.b = preference.C;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gdn)) {
            return false;
        }
        gdn gdnVar = (gdn) obj;
        return this.a == gdnVar.a && this.b == gdnVar.b && TextUtils.equals(this.c, gdnVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
