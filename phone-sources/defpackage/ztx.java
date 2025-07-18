package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ztx extends zuj {
    @Override // defpackage.zuj
    public final zod a(zmw zmwVar) {
        byte[] bArrBh = zjd.f(zmwVar.a()).b;
        if (vxr.aQ(bArrBh, 0) == 1) {
            return zsa.a(vxr.bh(bArrBh, 4, bArrBh.length));
        }
        if (bArrBh.length == 64) {
            bArrBh = vxr.bh(bArrBh, 4, 64);
        }
        return zru.a(bArrBh);
    }
}
