package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cob {
    public final int a;
    public final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public cob(boolean z, boolean z2) {
        int i = true != z ? 262152 : 262144;
        this.a = z2 ? i : i | 512;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cob)) {
            return false;
        }
        cob cobVar = (cob) obj;
        if (this.a != cobVar.a) {
            return false;
        }
        boolean z = cobVar.b;
        boolean z2 = cobVar.c;
        boolean z3 = cobVar.d;
        boolean z4 = cobVar.e;
        boolean z5 = cobVar.f;
        return true;
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + a.q(true)) * 31) + a.q(true)) * 31) + a.q(true)) * 31) + a.q(true)) * 31) + a.q(false);
    }

    public /* synthetic */ cob() {
        this(true, true);
    }
}
