package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zts extends zuj {
    public static zra b(zqy zqyVar, zic zicVar) {
        try {
            zjh zjhVarV = zjh.v(zicVar.n());
            if (!(zjhVarV instanceof zjm)) {
                return new zra(zqyVar, zjd.f(zjhVarV).b);
            }
            zjm zjmVarJ = zjm.j(zjhVarV);
            return new zra(zqyVar, zjd.f(zjmVarJ.h(0)).b, zjd.f(zjmVarJ.h(1)).b);
        } catch (Exception unused) {
            return new zra(zqyVar, zicVar.n());
        }
    }

    @Override // defpackage.zuj
    public final zod a(zmw zmwVar) {
        return b(zun.y(zmwVar.a.a), zmwVar.b);
    }
}
