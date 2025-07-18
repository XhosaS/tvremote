package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahcq implements ahdg {
    public final boolean a;

    public ahcq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ahdg
    public final ahea a() {
        return null;
    }

    @Override // defpackage.ahdg
    public final boolean fo() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
