package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlu extends zix {
    public final zjb a;
    public final zih b;

    public zlu(zjb zjbVar, zih zihVar) {
        this.a = zjbVar;
        this.b = zihVar;
    }

    public static zlu a(Object obj) {
        if (obj instanceof zlu) {
            return (zlu) obj;
        }
        if (obj != null) {
            return new zlu(zjm.j(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(2);
        ziiVar.b(this.a);
        ziiVar.b(this.b);
        return new zkq(ziiVar);
    }

    private zlu(zjm zjmVar) {
        this.a = (zjb) zjmVar.h(0);
        this.b = zjmVar.h(1);
    }
}
