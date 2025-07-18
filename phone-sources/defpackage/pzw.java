package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pzw extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pzx c;
    int d;
    Bundle e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzw(pzx pzxVar, yih yihVar) {
        super(yihVar);
        this.c = pzxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, null, null, null, this);
    }
}
