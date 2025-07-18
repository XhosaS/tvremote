package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afwj extends afhh {
    public final afem a;
    public final afih b;
    public final afil c;
    private final afhf d;

    public afwj(afil afilVar, afih afihVar, afem afemVar, afhf afhfVar) {
        afilVar.getClass();
        this.c = afilVar;
        afihVar.getClass();
        this.b = afihVar;
        afemVar.getClass();
        this.a = afemVar;
        afhfVar.getClass();
        this.d = afhfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            afwj afwjVar = (afwj) obj;
            if (yqs.a(this.a, afwjVar.a) && yqs.a(this.b, afwjVar.b) && yqs.a(this.c, afwjVar.c) && yqs.a(this.d, afwjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        afem afemVar = this.a;
        afih afihVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + afihVar.toString() + " callOptions=" + afemVar.toString() + "]";
    }
}
