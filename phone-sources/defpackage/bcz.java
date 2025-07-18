package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcz implements bds {
    private final /* synthetic */ int d;
    public static final bcz c = new bcz(2);
    public static final bcz b = new bcz(1);
    public static final bcz a = new bcz(0);

    private bcz(int i) {
        this.d = i;
    }

    @Override // defpackage.bds
    public final boolean a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return obj == obj2;
        }
        if (i != 1) {
            return yks.e(obj, obj2);
        }
        return false;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "StructuralEqualityPolicy" : "NeverEqualPolicy" : "ReferentialEqualityPolicy";
    }
}
