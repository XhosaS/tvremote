package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jfp extends yiz implements yjz {
    final /* synthetic */ jfq a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfp(jfq jfqVar, int i, int i2, int i3, int i4, yih yihVar) {
        super(2, yihVar);
        this.a = jfqVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jfp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new jfp(this.a, this.b, this.c, this.d, this.e, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        jfq jfqVar = this.a;
        ComposeView composeViewE = jfqVar.e();
        composeViewE.i();
        composeViewE.b(new bhq(-878486361, true, new jfo(jfqVar, this.b, this.c, this.d, this.e)));
        return ygi.a;
    }
}
