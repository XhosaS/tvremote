package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aru {
    public final Level a;
    public final String b;
    public final String c;
    public final long d;

    public aru() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aru) {
            aru aruVar = (aru) obj;
            if (this.a.equals(aruVar.a) && this.b.equals(aruVar.b) && this.c.equals(aruVar.c) && this.d == aruVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AbseilLogData{logLevel=" + this.a.toString() + ", logFormat=" + this.b + ", fileName=" + this.c + ", threadId=" + this.d + "}";
    }

    public aru(Level level, String str, String str2, long j) {
        this.a = level;
        if (str == null) {
            throw new NullPointerException("Null logFormat");
        }
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
