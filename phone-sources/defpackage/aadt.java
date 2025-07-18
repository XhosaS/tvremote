package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class aadt extends aadr {
    public final aabm b;

    protected aadt(aabm aabmVar, aabo aaboVar) {
        super(aaboVar);
        if (aabmVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!aabmVar.w()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.b = aabmVar;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public int c() {
        throw null;
    }

    @Override // defpackage.aabm
    public int d() {
        throw null;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public aabu s() {
        return this.b.s();
    }

    @Override // defpackage.aabm
    public aabu u() {
        return this.b.u();
    }

    @Override // defpackage.aabm
    public final void x() {
    }
}
