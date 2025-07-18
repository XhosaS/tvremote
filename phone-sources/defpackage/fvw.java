package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvw {
    public final String a;
    public final int b = 1;
    private final int c = 0;
    private final int d = 0;
    private final CharSequence e = null;

    public fvw(dxc dxcVar) {
        this.a = (String) dxcVar.a;
        crl.i(true, "The custom subtext message cannot be null if subtext is SUBTEXT_CUSTOM.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvw)) {
            return false;
        }
        fvw fvwVar = (fvw) obj;
        if (this.a.equals(fvwVar.a)) {
            int i = fvwVar.b;
            int i2 = fvwVar.c;
            int i3 = fvwVar.d;
            CharSequence charSequence = fvwVar.e;
            if (TextUtils.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, 1, 0, 0, null);
    }
}
