package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewh extends ezh {
    private final eba b;

    public ewh(ezf ezfVar, eba ebaVar) {
        super(ezfVar);
        this.b = ebaVar;
    }

    @Override // defpackage.ezh, defpackage.ezi
    public final int e(dze dzeVar) {
        return this.a.s(this.b.a(dzeVar));
    }

    @Override // defpackage.ezh
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof ewh)) {
            return this.b.equals(((ewh) obj).b);
        }
        return false;
    }

    @Override // defpackage.ezh, defpackage.ezi
    public final dze f(int i) {
        return this.b.c(this.a.q(i));
    }

    @Override // defpackage.ezh, defpackage.ezf
    public final dze g() {
        return this.b.c(this.a.r());
    }

    @Override // defpackage.ezh, defpackage.ezi
    public final eba h() {
        return this.b;
    }

    @Override // defpackage.ezh
    public final int hashCode() {
        return (super.hashCode() * 31) + this.b.hashCode();
    }
}
