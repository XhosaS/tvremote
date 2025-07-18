package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eky implements ecw {
    public final /* synthetic */ ekl a;
    private final /* synthetic */ int b;

    public /* synthetic */ eky(ekl eklVar, int i) {
        this.b = i;
        this.a = eklVar;
    }

    @Override // defpackage.ecw
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((ekm) obj).k(this.a);
            return;
        }
        if (i == 1) {
            ((ekm) obj).Q(this.a);
            return;
        }
        if (i == 2) {
            ((ekm) obj).l(this.a);
            return;
        }
        if (i == 3) {
            ((ekm) obj).an(this.a);
        } else if (i != 4) {
            ((ekm) obj).o(this.a);
        } else {
            ((ekm) obj).j(this.a);
        }
    }
}
