package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cct extends ykt implements yjk {
    final /* synthetic */ boolean a;
    final /* synthetic */ ghc b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cct(boolean z, ghc ghcVar, String str) {
        super(0);
        this.a = z;
        this.b = ghcVar;
        this.c = str;
    }

    @Override // defpackage.yjk
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.a) {
            ghc ghcVar = this.b;
            String str = this.c;
            Object obj = ghcVar.a;
            synchronized (((ghh) obj).g) {
            }
        }
        return ygi.a;
    }
}
