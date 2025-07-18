package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcn implements xcm, xbw {
    public final Object a;

    private xcn(Object obj) {
        this.a = obj;
    }

    public static xcm a(Object obj) {
        obj.getClass();
        return new xcn(obj);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final Object b() {
        return this.a;
    }
}
