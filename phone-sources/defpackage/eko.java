package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eko implements ecw {
    public final /* synthetic */ ekl a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ eko(ekl eklVar, boolean z, int i) {
        this.c = i;
        this.a = eklVar;
        this.b = z;
    }

    @Override // defpackage.ecw
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            ((ekm) obj).D(this.a, this.b);
            return;
        }
        if (i == 1) {
            ekm ekmVar = (ekm) obj;
            ekmVar.aa();
            ekmVar.p(this.a, this.b);
            return;
        }
        if (i != 2) {
            ((ekm) obj).C(this.a, this.b);
        } else {
            ((ekm) obj).q(this.a, this.b);
        }
    }
}
