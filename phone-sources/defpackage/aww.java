package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aww extends a {
    public final bkc a;
    public final bkc b;
    private final boolean c;

    public aww() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aww)) {
            return false;
        }
        aww awwVar = (aww) obj;
        boolean z = awwVar.c;
        return yks.e(this.a, awwVar.a) && yks.e(this.b, awwVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 38347) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aww(byte[] bArr) {
        super(null);
        bkc bkcVar = bkb.j;
        this.c = false;
        this.a = bkcVar;
        this.b = bkcVar;
    }
}
