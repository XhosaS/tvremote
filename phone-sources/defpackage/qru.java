package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qru {
    private final int a;

    public qru(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qru) && this.a == ((qru) obj).a;
    }

    public final int hashCode() {
        int i = this.a;
        a.bw(i);
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessingMetadata(processingTrigger=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "POSTED_LOCAL_NOTIFICATION" : "FETCHED_FROM_SERVER" : "EXECUTED_SCHEDULED_TASK" : "RECEIVED_FROM_FCM"));
        sb.append(")");
        return sb.toString();
    }
}
