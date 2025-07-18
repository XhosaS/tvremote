package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibz {
    public final ysn a;
    public boolean b;
    private final boolean c;

    public ibz(ysn ysnVar, boolean z) {
        this.a = ysnVar;
        this.c = z;
        this.b = !z;
    }

    public final void a() {
        this.a.e(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibz)) {
            return false;
        }
        ibz ibzVar = (ibz) obj;
        return yks.e(this.a, ibzVar.a) && this.c == ibzVar.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.q(this.c);
    }

    public final String toString() {
        return "ChannelEntry(channel=" + this.a + ", piggybackOnly=" + this.c + ")";
    }
}
