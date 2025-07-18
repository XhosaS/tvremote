package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mit extends mir {
    public final kvf c;
    public final kxg d;

    public mit(kvf kvfVar, kxg kxgVar, lio lioVar) {
        super(kvfVar.o(), liq.g(600, kxgVar.c), lioVar);
        this.c = kvfVar;
        this.d = kxgVar;
    }

    @Override // defpackage.mir, defpackage.mis
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        mit mitVar = (mit) obj;
        if (this.c.equals(mitVar.c)) {
            return this.d.equals(mitVar.d);
        }
        return false;
    }

    @Override // defpackage.mir, defpackage.mis
    public final int hashCode() {
        return (((super.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
