package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkz extends dla {
    @Override // defpackage.dla
    public final deu a(ddp ddpVar) {
        try {
            byte[] bArr = czx.f(ddpVar.a()).b;
            return new dkg(dle.J(ddpVar.a.a), dos.t(bArr, 4, bArr.length));
        } catch (Exception unused) {
            return new dkg(dle.J(ddpVar.a.a), ddpVar.b.n());
        }
    }
}
