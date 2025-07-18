package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grb extends yiz implements yjz {
    /* synthetic */ boolean a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grb(Context context, yih yihVar) {
        super(2, yihVar);
        this.b = context;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((grb) create(bool, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        grb grbVar = new grb(this.b, yihVar);
        grbVar.a = ((Boolean) obj).booleanValue();
        return grbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ybn.f(obj);
        gvo.a(this.b, RescheduleReceiver.class, this.a);
        return ygi.a;
    }
}
