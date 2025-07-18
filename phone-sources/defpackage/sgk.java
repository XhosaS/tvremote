package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgk implements sgi {
    public final int a;
    public final sgn b;
    public String c;
    private Integer d;
    private int e;

    public sgk(int i, sgn sgnVar) {
        this.a = i;
        this.b = sgnVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sgk) {
            sgk sgkVar = (sgk) obj;
            if (this.a == sgkVar.a) {
                int i = sgkVar.e;
                if (a.au(null, null)) {
                    Integer num = sgkVar.d;
                    if (a.au(null, null) && this.b.equals(sgkVar.b) && a.au(this.c, sgkVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return sir.a(this.a, sir.b(this.c, sir.b(null, sir.b(null, this.b.hashCode()))));
    }

    public final String toString() {
        return String.format(Locale.US, "UserEvent action: %d%s%s on: %s ", Integer.valueOf(this.a), "", "", this.b.toString());
    }
}
