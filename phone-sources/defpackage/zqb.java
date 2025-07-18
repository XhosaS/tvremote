package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqb extends zix {
    public final zmd a;
    private final ziu b;

    private zqb(zjm zjmVar) {
        this.b = ziu.m(zjmVar.h(0));
        this.a = zmd.a(zjmVar.h(1));
    }

    public static final zqb a(Object obj) {
        if (obj instanceof zqb) {
            return (zqb) obj;
        }
        if (obj != null) {
            return new zqb(zjm.j(obj));
        }
        return null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(this.b);
        ziiVar.b(this.a);
        return new zkq(ziiVar);
    }

    public zqb(zmd zmdVar) {
        this.b = new ziu(0L);
        this.a = zmdVar;
    }
}
