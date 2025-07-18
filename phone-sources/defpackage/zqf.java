package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqf extends zix {
    public final int a;
    public final int b;
    public final zmd c;
    private final ziu d;

    public zqf(int i, int i2, zmd zmdVar) {
        this.d = new ziu(0L);
        this.a = i;
        this.b = i2;
        this.c = zmdVar;
    }

    public static zqf a(Object obj) {
        if (obj instanceof zqf) {
            return (zqf) obj;
        }
        if (obj != null) {
            return new zqf(zjm.j(obj));
        }
        return null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(this.d);
        ziiVar.b(new ziu(this.a));
        ziiVar.b(new ziu(this.b));
        ziiVar.b(this.c);
        return new zkq(ziiVar);
    }

    private zqf(zjm zjmVar) {
        this.d = ziu.m(zjmVar.h(0));
        this.a = ziu.m(zjmVar.h(1)).f();
        this.b = ziu.m(zjmVar.h(2)).f();
        this.c = zmd.a(zjmVar.h(3));
    }
}
