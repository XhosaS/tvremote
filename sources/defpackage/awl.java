package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awl {
    public final awt a;
    private final byg b;
    private final byg c;

    public awl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awl) {
            awl awlVar = (awl) obj;
            if (this.a.equals(awlVar.a) && this.b.equals(awlVar.b) && this.c.equals(awlVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent()}";
    }

    public awl(awt awtVar, byg bygVar, byg bygVar2) {
        this.a = awtVar;
        this.b = bygVar;
        this.c = bygVar2;
    }
}
