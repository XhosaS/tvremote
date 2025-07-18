package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mw {
    private final mz a;
    private final int b;

    public mw(mz mzVar, int i) {
        this.a = mzVar;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        sb.append((Object) (this.b != 1 ? "Finished" : "BoundReached"));
        sb.append(", endState=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
