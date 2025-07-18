package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zq extends bko implements cac {
    public Object a;
    private final /* synthetic */ int b;

    public zq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [bkc, java.lang.Object] */
    @Override // defpackage.cac
    public final /* synthetic */ Object cl(Object obj) {
        if (this.b != 0) {
            ze zeVar = obj instanceof ze ? (ze) obj : null;
            if (zeVar == null) {
                zeVar = new ze(null);
            }
            int i = ye.b;
            zeVar.c = new yb(this.a);
            return zeVar;
        }
        ze zeVar2 = obj instanceof ze ? (ze) obj : null;
        if (zeVar2 == null) {
            zeVar2 = new ze(null);
        }
        int i2 = ye.b;
        zeVar2.c = new yd((bkh) this.a);
        return zeVar2;
    }
}
