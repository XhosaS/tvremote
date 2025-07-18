package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class niv implements nwi {
    public final Bundle a;

    static {
        new Bundle();
    }

    public niv(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof niv) {
            return ocv.aI(this.a, ((niv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
