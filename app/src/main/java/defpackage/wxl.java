package defpackage;

import j$.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxl {
    public final UUID a;
    public final int b;

    public wxl(UUID uuid, int i) {
        this.a = uuid;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxl)) {
            return false;
        }
        wxl wxlVar = (wxl) obj;
        return this.b == wxlVar.b && Objects.equals(this.a, wxlVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }
}
