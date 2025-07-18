package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrq extends sbx {
    public final jaf a;
    private final kdh b;

    public jrq(kdh kdhVar, jaf jafVar) {
        jafVar.getClass();
        this.b = kdhVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        kjv kjvVarE = this.b.e();
        kjvVarE.a = new jmm(this, ixiVar, 19);
        kjvVarE.b = new jnq(this, ixiVar, 15);
        return kjvVarE;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        kjv kjvVar = (kjv) obj2;
        kjvVar.F(((ixi) obj).a, new String[0]);
        kjvVar.r(true);
    }
}
