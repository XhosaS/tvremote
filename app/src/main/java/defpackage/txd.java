package defpackage;

import android.net.Uri;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class txd implements ttq {
    final /* synthetic */ txj a;

    public txd(txj txjVar) {
        this.a = txjVar;
    }

    @Override // defpackage.ttq
    public final void m(final Uri uri) {
        Function function = new Function() { // from class: txb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txn txnVarF = ((txo) obj).f();
                ((tws) txnVarF).f = uri;
                return txnVarF.a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        txj txjVar = this.a;
        if (txjVar.g(function)) {
            txjVar.e();
        }
    }

    @Override // defpackage.ttq
    public final void n() {
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("INTENT_API_MIC_CLOSE_REQUESTED", false, ypv.a, 107, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        txj txjVar = this.a;
        rqtVar.i("requestId", txjVar.f);
        txjVar.b.a(rqtVar);
    }

    @Override // defpackage.ttq
    public final void o() {
        this.a.f(new Function() { // from class: txc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txn txnVarF = ((txo) obj).f();
                ((tws) txnVarF).d = false;
                return txnVarF.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.ttq
    public final void p() {
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("INTENT_API_MIC_DEACTIVATED", false, ypv.a, 119, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        txj txjVar = this.a;
        rqtVar.i("requestId", txjVar.f);
        txjVar.b.a(rqtVar);
    }

    @Override // defpackage.ttq
    public final void q() {
        Function function = new Function() { // from class: txa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txo txoVar = (txo) obj;
                if (Objects.equals(txoVar.g(), false)) {
                    return txoVar;
                }
                txn txnVarF = txoVar.f();
                ((tws) txnVarF).d = true;
                return txnVarF.a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        txj txjVar = this.a;
        txjVar.f(function);
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("INTENT_API_MIC_OPENED", false, ypv.a, 106, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar.i("requestId", txjVar.f);
        txjVar.b.a(rqtVar);
    }

    @Override // defpackage.ttq
    public final void r(final int i) {
        this.a.f(new Function() { // from class: twz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txn txnVarF = ((txo) obj).f();
                txnVarF.c(i);
                return txnVarF.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
