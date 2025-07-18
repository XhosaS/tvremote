package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brw {
    public final brv a;
    public final byte b;
    public final byte c;

    public brw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brw) {
            brw brwVar = (brw) obj;
            if (this.a.equals(brwVar.a) && this.b == brwVar.b && this.c == brwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "AudioStartParams{reason=" + this.a.toString() + ", codec=" + ((int) this.b) + ", streamId=" + ((int) this.c) + "}";
    }

    public brw(brv brvVar, byte b, byte b2) {
        if (brvVar == null) {
            throw new NullPointerException("Null reason");
        }
        this.a = brvVar;
        this.b = b;
        this.c = b2;
    }
}
