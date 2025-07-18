package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrn {
    public final qrj a;
    private final qru b;
    private final boolean c;
    private final int d;

    public qrn(int i, qru qruVar, qrj qrjVar, boolean z) {
        this.d = i;
        this.b = qruVar;
        this.a = qrjVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrn)) {
            return false;
        }
        qrn qrnVar = (qrn) obj;
        return this.d == qrnVar.d && yks.e(this.b, qrnVar.b) && yks.e(this.a, qrnVar.a) && this.c == qrnVar.c;
    }

    public final int hashCode() {
        int i = this.d;
        a.bw(i);
        int iHashCode = (i * 31) + this.b.hashCode();
        qrj qrjVar = this.a;
        return (((iHashCode * 31) + (qrjVar == null ? 0 : qrjVar.hashCode())) * 31) + a.q(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationCreatedInfo(reason=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? "RESURFACE" : "REPLACED" : "NEW"));
        sb.append(", processingMetadata=");
        sb.append(this.b);
        sb.append(", imageLoadingOutcome=");
        sb.append(this.a);
        sb.append(", hasUserFeedbackSurvey=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
