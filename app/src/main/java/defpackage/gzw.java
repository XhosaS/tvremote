package defpackage;

import android.content.Intent;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzw extends agtu implements agvb {
    final /* synthetic */ hab a;
    final /* synthetic */ Intent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzw(hab habVar, Intent intent, agsw agswVar) {
        super(2, agswVar);
        this.a = habVar;
        this.b = intent;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gzw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        Iterator it = this.a.m.iterator();
        while (it.hasNext()) {
            ((gzv) it.next()).a(this.b);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gzw(this.a, this.b, agswVar);
    }
}
