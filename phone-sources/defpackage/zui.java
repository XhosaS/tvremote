package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zui extends zuj {
    @Override // defpackage.zuj
    public final zod a(zmw zmwVar) {
        try {
            byte[] bArr = zjd.f(zmwVar.a()).b;
            return new ztp(zun.J(zmwVar.a.a), vxr.bh(bArr, 4, bArr.length));
        } catch (Exception unused) {
            return new ztp(zun.J(zmwVar.a.a), zmwVar.b.n());
        }
    }
}
