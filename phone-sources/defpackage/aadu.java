package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class aadu extends aads {
    private static final long serialVersionUID = 8019982251647420015L;
    public final aabu a;

    public aadu(aabu aabuVar, aabw aabwVar) {
        super(aabwVar);
        if (!aabuVar.h()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.a = aabuVar;
    }

    @Override // defpackage.aabu
    public long b(long j, int i) {
        return this.a.b(j, i);
    }

    @Override // defpackage.aabu
    public long c(long j, long j2) {
        return this.a.c(j, j2);
    }

    @Override // defpackage.aabu
    public long d(long j, long j2) {
        return this.a.d(j, j2);
    }

    @Override // defpackage.aabu
    public long e() {
        return this.a.e();
    }

    @Override // defpackage.aabu
    public final boolean g() {
        return this.a.g();
    }
}
