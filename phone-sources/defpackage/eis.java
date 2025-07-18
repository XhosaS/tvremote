package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eis implements ecw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eis(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.ecw
    public final void a(Object obj) {
        switch (this.c) {
            case 0:
                int i = eiz.J;
                ((eam) obj).df((dzy) this.b, this.a);
                break;
            case 1:
                int i2 = eiz.J;
                ((eam) obj).z(((ejx) this.b).b, this.a);
                break;
            case 2:
                ((ekm) obj).F((ekl) this.b, this.a);
                break;
            case 3:
                ((ekm) obj).ab((ekl) this.b, this.a);
                break;
            case 4:
                ((ekm) obj).w((ekl) this.b, this.a);
                break;
            case 5:
                ((ekm) obj).aq((ekl) this.b, this.a);
                break;
            case 6:
                ((ekm) obj).v((ekl) this.b, this.a);
                break;
            case 7:
                ekm ekmVar = (ekm) obj;
                ekmVar.W();
                ekmVar.m((ekl) this.b, this.a);
                break;
            case 8:
                ((ekm) obj).d((ekl) this.b, this.a);
                break;
            default:
                ((ekm) obj).B((ekl) this.b, this.a);
                break;
        }
    }
}
