package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdp extends ykt implements yjk {
    final /* synthetic */ can a;
    final /* synthetic */ bne b;
    final /* synthetic */ pku c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdp(can canVar, bne bneVar, pku pkuVar) {
        super(0);
        this.a = canVar;
        this.b = bneVar;
        this.c = pkuVar;
    }

    @Override // defpackage.yjk
    public final /* bridge */ /* synthetic */ Object a() {
        can canVar = this.a;
        canVar.removeOnAttachStateChangeListener(this.b);
        ((ArrayList) dad.j(canVar).a).remove(this.c);
        return ygi.a;
    }
}
