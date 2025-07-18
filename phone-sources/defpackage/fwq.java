package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwq {
    public final fxm a;
    public final boolean b = false;

    public fwq(fxm fxmVar) {
        this.a = fxmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && yks.e(this.a, ((fwq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = ylg.a;
        sb.append(new ykl(getClass()).c());
        fxm fxmVar = this.a;
        Objects.toString(fxmVar);
        sb.append(" Type: ".concat(fxmVar.toString()));
        sb.append(" Nullable: false");
        return sb.toString();
    }
}
