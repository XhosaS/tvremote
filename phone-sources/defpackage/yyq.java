package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yyq extends ywp {
    public final upq c;

    public yyq(long j, yyq yyqVar, int i) {
        super(j, yyqVar, i);
        this.c = new upq(yyp.f);
    }

    @Override // defpackage.ywp
    public final int a() {
        return yyp.f;
    }

    @Override // defpackage.ywp
    public final void l(int i) {
        upq upqVar = this.c;
        upqVar.C(i).c(yyp.e);
        s();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
