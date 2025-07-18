package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ztw extends zuj {
    @Override // defpackage.zuj
    public final zod a(zmw zmwVar) {
        zrd zrdVarZ = zun.z(zmwVar.a.a);
        try {
            zjh zjhVarA = zmwVar.a();
            zpx zpxVar = zjhVarA != null ? new zpx(zjm.j(zjhVarA)) : null;
            return new zrf(zrdVarZ, vxr.bd(zpxVar.a), vxr.bd(zpxVar.b));
        } catch (Exception unused) {
            return new zrf(zrdVarZ, zmwVar.b.n());
        }
    }
}
