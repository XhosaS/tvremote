package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqe extends zix {
    public final int a;
    public final zmd b;
    private final ziu c;

    public zqe(int i, zmd zmdVar) {
        this.c = new ziu(0L);
        this.a = i;
        this.b = zmdVar;
    }

    public static zqe a(Object obj) {
        if (obj instanceof zqe) {
            return (zqe) obj;
        }
        if (obj != null) {
            return new zqe(zjm.j(obj));
        }
        return null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(this.c);
        ziiVar.b(new ziu(this.a));
        ziiVar.b(this.b);
        return new zkq(ziiVar);
    }

    private zqe(zjm zjmVar) {
        this.c = ziu.m(zjmVar.h(0));
        this.a = ziu.m(zjmVar.h(1)).f();
        this.b = zmd.a(zjmVar.h(2));
    }
}
