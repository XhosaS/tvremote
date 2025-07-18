package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kak extends rdd {
    final /* synthetic */ ksn a;
    final /* synthetic */ qwo b;
    final /* synthetic */ ldv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kak(ksn ksnVar, qwo qwoVar, ldv ldvVar) {
        super(null, null, null);
        this.a = ksnVar;
        this.b = qwoVar;
        this.c = ldvVar;
    }

    @Override // defpackage.rdd
    public final void a() {
        kaf.a(this.a, this.b);
    }

    @Override // defpackage.rdd
    public final /* synthetic */ void b(Object obj) {
        rgj rgjVar = (rgj) obj;
        if (this.b.a() == null || rgjVar == null) {
            return;
        }
        String str = this.a.a;
        String str2 = rgjVar.c;
        if (yks.e(str, str2)) {
            return;
        }
        this.c.p(ksn.b(str2));
    }
}
