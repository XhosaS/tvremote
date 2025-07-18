package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyr {
    public final boolean a;
    public final Map b;

    public qyr(boolean z, Map map) {
        this.a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyr)) {
            return false;
        }
        qyr qyrVar = (qyr) obj;
        return this.a == qyrVar.a && yks.e(this.b, qyrVar.b);
    }

    public final int hashCode() {
        return (a.q(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Data(isLightTheme=" + this.a + ", resolvedColorsMap=" + this.b + ")";
    }
}
