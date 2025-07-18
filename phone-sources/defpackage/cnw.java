package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnw extends ykt implements yjv {
    final /* synthetic */ cny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnw(cny cnyVar) {
        super(1);
        this.a = cnyVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cny cnyVar = this.a;
        yjk yjkVar = (yjk) obj;
        Handler handler = cnyVar.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            yjkVar.a();
        } else {
            Handler handler2 = cnyVar.getHandler();
            if (handler2 != null) {
                handler2.post(new caw(yjkVar, 7));
            }
        }
        return ygi.a;
    }
}
