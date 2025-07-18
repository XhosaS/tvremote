package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwy extends agww {
    public static final agwy d = new agwy(1, 0);

    public agwy(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.agww
    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.agww
    public final boolean equals(Object obj) {
        if (obj instanceof agwy) {
            if (b() && ((agwy) obj).b()) {
                return true;
            }
            agwy agwyVar = (agwy) obj;
            return this.a == agwyVar.a && this.b == agwyVar.b;
        }
        return false;
    }

    @Override // defpackage.agww
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.agww
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
