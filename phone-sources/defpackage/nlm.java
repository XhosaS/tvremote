package defpackage;

import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlm {
    public final long a;
    private final int b = 0;
    private final boolean c = false;
    private final JSONObject d = null;

    public nlm(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlm)) {
            return false;
        }
        nlm nlmVar = (nlm) obj;
        if (this.a == nlmVar.a) {
            int i = nlmVar.b;
            boolean z = nlmVar.c;
            JSONObject jSONObject = nlmVar.d;
            if (a.Q(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, false, null});
    }
}
