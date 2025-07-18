package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rio implements rjy {
    private final rkq a;

    public rio(rkq rkqVar) {
        this.a = rkqVar;
    }

    @Override // defpackage.rjy
    public final rjx a(String str, boolean z) {
        return new ric(str, this.a);
    }

    @Override // defpackage.rjy
    public final rjx b(String str, long j) {
        return new rii(str, this.a, j);
    }

    @Override // defpackage.rjy
    public final rjx c(String str, String str2) {
        return new ril(str, this.a, str2);
    }

    @Override // defpackage.rjy
    public final rjx d(String str, boolean z) {
        return new rid(str, this.a, z);
    }

    @Override // defpackage.rjy
    public final rjx e(String str, riz rizVar, String str2) {
        return new rif(str, this.a, rizVar, str2);
    }
}
