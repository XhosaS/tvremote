package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzh extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ rbi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzh(rbi rbiVar, yih yihVar) {
        super(yihVar);
        this.c = rbiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
