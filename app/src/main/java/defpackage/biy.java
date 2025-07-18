package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
class biy {
    final int a;
    final int b;
    final String c;

    public biy(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.z;
        this.b = preference.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof biy)) {
            return false;
        }
        biy biyVar = (biy) obj;
        return this.a == biyVar.a && this.b == biyVar.b && TextUtils.equals(this.c, biyVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
