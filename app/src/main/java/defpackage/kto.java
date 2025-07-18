package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class kto extends ktp {
    public final lis a;
    final /* synthetic */ ktr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kto(ktr ktrVar, String str, int i, lis lisVar) {
        super(str, i);
        this.b = ktrVar;
        this.a = lisVar;
    }

    @Override // defpackage.ktp
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.ktp
    public final boolean b() {
        return (this.a.b & 8) != 0;
    }

    @Override // defpackage.ktp
    public final boolean c() {
        return false;
    }
}
