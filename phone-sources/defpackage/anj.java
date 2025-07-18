package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anj {
    public final boolean a;
    public final amo b;
    public final aml c;

    public anj(boolean z, amo amoVar, aml amlVar) {
        this.a = z;
        this.b = amoVar;
        this.c = amlVar;
    }

    public final int a() {
        return this.c.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
        sb.append(this.a);
        sb.append(", crossed=");
        int iA = a();
        sb.append((Object) (iA != 1 ? iA != 2 ? "COLLAPSED" : "NOT_CROSSED" : "CROSSED"));
        sb.append(", info=\n\t");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
