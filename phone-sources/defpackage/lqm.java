package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqm implements lxy {
    public final ksy a;
    public final ksn b;
    public final int c;
    public final int d;

    public lqm(ksn ksnVar, ksy ksyVar) {
        this.b = ksnVar;
        this.a = ksyVar;
        this.c = 0;
        this.d = 0;
    }

    @Override // defpackage.lxy
    public final String a() {
        return this.b.a;
    }

    @Override // defpackage.lxy
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lqm lqmVar = (lqm) obj;
        if (this.c == lqmVar.c && this.d == lqmVar.d && this.a.equals(lqmVar.a)) {
            return this.b.equals(lqmVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public lqm(ksn ksnVar, ksy ksyVar, int i, int i2) {
        this.b = ksnVar;
        this.a = ksyVar;
        this.c = i;
        this.d = i2;
    }
}
