package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvo extends yiv {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ ibe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvo(ibe ibeVar, yih yihVar) {
        super(yihVar);
        this.e = ibeVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
