package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dko extends dla {
    @Override // defpackage.dla
    public final deu a(ddp ddpVar) {
        byte[] bArrT = czx.f(ddpVar.a()).b;
        if (dos.c(bArrT, 0) == 1) {
            return dir.a(dos.t(bArrT, 4, bArrT.length));
        }
        if (bArrT.length == 64) {
            bArrT = dos.t(bArrT, 4, 64);
        }
        return dil.a(bArrT);
    }
}
