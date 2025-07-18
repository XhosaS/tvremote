package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eta {
    public final String a;
    public final boolean b;
    public final boolean c;

    public eta(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == eta.class) {
            eta etaVar = (eta) obj;
            if (TextUtils.equals(this.a, etaVar.a) && this.b == etaVar.b && this.c == etaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true == this.c ? 1231 : 1237);
    }
}
