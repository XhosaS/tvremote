package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lhl implements idy {
    final /* synthetic */ ksn a;
    final /* synthetic */ ksy b;
    final /* synthetic */ String c;
    final /* synthetic */ lhm d;
    private final /* synthetic */ int e;

    public lhl(lhm lhmVar, ksn ksnVar, ksy ksyVar, String str, int i) {
        this.e = i;
        this.a = ksnVar;
        this.b = ksyVar;
        this.c = str;
        this.d = lhmVar;
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        if (this.e != 0) {
            String str = this.c;
            ksy ksyVar = this.b;
            this.d.b(this.a, ksyVar, str, (ieg) obj);
            return;
        }
        String str2 = this.c;
        ksy ksyVar2 = this.b;
        this.d.c(this.a, ksyVar2, str2, (ieg) obj);
    }
}
