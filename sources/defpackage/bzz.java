package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bzz extends bzk {
    public bzz() {
        super(4);
    }

    public cab f() {
        int i = this.b;
        if (i == 0) {
            return cbd.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new cbf(obj);
        }
        cab cabVarL = cab.l(i, this.a);
        this.b = cabVarL.size();
        this.c = true;
        return cabVarL;
    }

    public final void g(Iterable iterable) {
        super.e(iterable);
    }

    @Override // defpackage.bzk
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        obj.getClass();
        super.c(obj);
    }
}
