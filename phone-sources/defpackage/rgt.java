package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rgt implements rdm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rgt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rdm
    public final rdu a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return (rdu) this.a;
        }
        if (i != 1) {
            return new rdh(((rfm) this.a).a());
        }
        int i2 = qws.a;
        rdh rdhVar = new rdh((rfc) this.a);
        rdhVar.m(rej.COMMON_ACTION_CARD);
        return rdhVar;
    }
}
