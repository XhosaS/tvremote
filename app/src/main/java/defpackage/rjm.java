package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjm implements rjy {
    public final String a;
    public final rkq b;

    public rjm(String str, rkq rkqVar) {
        this.a = str;
        this.b = rkqVar;
    }

    @Override // defpackage.rjy
    public final rjx a(String str, boolean z) {
        return new rja(this.a, str, this.b);
    }

    @Override // defpackage.rjy
    public final rjx b(String str, long j) {
        return new rjh(this.a, str, this.b, j);
    }

    @Override // defpackage.rjy
    public final rjx c(String str, String str2) {
        return new rjj(this.a, str, this.b, str2);
    }

    @Override // defpackage.rjy
    public final rjx d(String str, boolean z) {
        return new rjb(this.a, str, this.b, z);
    }

    @Override // defpackage.rjy
    public final rjx e(String str, riz rizVar, String str2) {
        return new rjd(this.a, str, this.b, rizVar, str2);
    }
}
