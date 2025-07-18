package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ypo implements yqa {
    public final boolean a;

    public ypo(boolean z) {
        this.a = z;
    }

    @Override // defpackage.yqa
    public final yqq eC() {
        return null;
    }

    @Override // defpackage.yqa
    public final boolean eE() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
