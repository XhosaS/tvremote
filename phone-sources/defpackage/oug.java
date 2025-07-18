package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oug extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ qtl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oug(qtl qtlVar, yih yihVar) {
        super(yihVar);
        this.c = qtlVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.aA(null, this);
    }
}
