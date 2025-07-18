package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaee extends aadu {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;

    public aaee(aabu aabuVar, aabw aabwVar) {
        super(aabuVar, aabwVar);
        this.b = 100;
    }

    @Override // defpackage.aads, defpackage.aabu
    public final int a(long j, long j2) {
        return this.a.a(j, j2) / 100;
    }

    @Override // defpackage.aadu, defpackage.aabu
    public final long b(long j, int i) {
        return this.a.c(j, i * 100);
    }

    @Override // defpackage.aadu, defpackage.aabu
    public final long c(long j, long j2) {
        return this.a.c(j, vxr.aw(j2, 100));
    }

    @Override // defpackage.aadu, defpackage.aabu
    public final long d(long j, long j2) {
        return this.a.d(j, j2) / 100;
    }

    @Override // defpackage.aadu, defpackage.aabu
    public final long e() {
        return this.a.e() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aaee) {
            aaee aaeeVar = (aaee) obj;
            if (this.a.equals(aaeeVar.a) && this.d == aaeeVar.d) {
                int i = aaeeVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.a.hashCode();
    }
}
