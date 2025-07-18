package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jam extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ jan c;
    int d;
    Bundle e;
    kfz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jam(jan janVar, yih yihVar) {
        super(yihVar);
        this.c = janVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
