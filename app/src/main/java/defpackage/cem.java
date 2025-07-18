package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cem extends agtu implements agvb {
    /* synthetic */ boolean a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cem(Context context, agsw agswVar) {
        super(2, agswVar);
        this.b = context;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((cem) c(bool, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        cnj.a(this.b, RescheduleReceiver.class, this.a);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        cem cemVar = new cem(this.b, agswVar);
        cemVar.a = ((Boolean) obj).booleanValue();
        return cemVar;
    }
}
