package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxb implements cly {
    private final /* synthetic */ int j;
    static final cly i = new cxb(8);
    static final cly h = new cxb(7);
    static final cly g = new cxb(6);
    static final cly f = new cxb(5);
    static final cly e = new cxb(4);
    static final cly d = new cxb(3);
    static final cly c = new cxb(2);
    static final cly b = new cxb(1);
    static final cly a = new cxb(0);

    private cxb(int i2) {
        this.j = i2;
    }

    @Override // defpackage.cly
    public final boolean a(int i2) {
        switch (this.j) {
            case 0:
                return ii.aa(i2) != 0;
            case 1:
                return dnx.aq(i2) != 0;
            case 2:
                return ii.aa(i2) != 0;
            case 3:
                return dnx.ap(i2) != 0;
            case 4:
                return ii.ab(i2) != 0;
            case 5:
                return dnx.aq(i2) != 0;
            case 6:
                return dnx.ap(i2) != 0;
            case 7:
                return dnx.aq(i2) != 0;
            default:
                return ii.ad(i2);
        }
    }
}
