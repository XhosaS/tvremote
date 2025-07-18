package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmg extends ykt implements yjv {
    final /* synthetic */ ylf a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmg(ylf ylfVar, int i) {
        super(1);
        this.a = ylfVar;
        this.b = i;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((bmr) obj).g(this.b));
        ylf ylfVar = this.a;
        ylfVar.a = boolValueOf;
        return (Boolean) ylfVar.a;
    }
}
