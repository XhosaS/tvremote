package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ild extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ilf b;
    int c;
    String d;
    wll e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ild(ilf ilfVar, yih yihVar) {
        super(yihVar);
        this.b = ilfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, null, this);
    }
}
