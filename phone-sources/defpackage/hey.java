package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hey implements hev {
    public final boolean a;
    public final int b;

    public hey(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        if (hbvVar.i) {
            return new hcs(this);
        }
        hhk.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        int i = this.b;
        return a.cg(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE", "MergePaths{mode=", "}");
    }
}
