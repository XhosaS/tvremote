package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nki implements nwi {
    final CastDevice a;
    final Bundle b;
    final int c;
    final String d = UUID.randomUUID().toString();
    final jys e;

    public nki(nkh nkhVar) {
        this.a = nkhVar.a;
        this.e = nkhVar.d;
        this.c = nkhVar.b;
        this.b = nkhVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nki)) {
            return false;
        }
        nki nkiVar = (nki) obj;
        return a.Q(this.a, nkiVar.a) && ocv.aI(this.b, nkiVar.b) && this.c == nkiVar.c && a.Q(this.d, nkiVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d});
    }
}
