package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cts implements ctn {
    public final boolean a;
    public final int b;

    public cts(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        if (cqdVar.i) {
            return new crf(this);
        }
        ((cwq) cwr.a).a("Animation contains merge paths but they are disabled.", null);
        return null;
    }

    public final String toString() {
        int i = this.b;
        return a.e(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE", "MergePaths{mode=", "}");
    }
}
