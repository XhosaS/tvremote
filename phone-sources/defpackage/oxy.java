package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxy extends yiv {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ oya d;
    int e;
    String f;
    ylf g;
    StringBuilder h;
    StringBuilder i;
    upq j;
    upq k;
    upq l;
    upq m;
    upq n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxy(oya oyaVar, yih yihVar) {
        super(yihVar);
        this.d = oyaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.p(null, 0, false, null, null, null, this);
    }
}
