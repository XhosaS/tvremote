package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rso {
    public final agum a;
    private final zyd b;

    public rso(zyd zydVar, agum agumVar) {
        this.b = zydVar;
        this.a = agumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rso)) {
            return false;
        }
        rso rsoVar = (rso) obj;
        return agvy.c(this.b, rsoVar.b) && agvy.c(this.a, rsoVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "RegistryResult(allAudioPushed=" + this.b + ", unregister=" + this.a + ")";
    }
}
