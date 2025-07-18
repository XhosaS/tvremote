package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class txh implements twb {
    final /* synthetic */ txj a;

    public txh(txj txjVar) {
        this.a = txjVar;
    }

    @Override // defpackage.twb
    public final void b() {
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("INTENT_API_END_OF_SPEECH", false, ypv.a, 105, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        txj txjVar = this.a;
        rqtVar.i("requestId", txjVar.f);
        txjVar.b.a(rqtVar);
    }

    @Override // defpackage.twb
    public final void c(trr trrVar) {
        this.a.c(trrVar);
    }

    @Override // defpackage.twb
    public final void d(trr trrVar) {
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("INTENT_API_FALLBACK", false, ypv.a, 121, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        txj txjVar = this.a;
        rqtVar.i("requestId", txjVar.f);
        trb trbVar = trrVar.a;
        rqtVar.a(((trd) trbVar).a, trbVar.c());
        txjVar.b.a(rqtVar);
    }

    @Override // defpackage.twb
    public final void h(final tuw tuwVar) {
        this.a.f(new Function() { // from class: txg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txn txnVarF = ((txo) obj).f();
                ((tws) txnVarF).b = tuwVar;
                return txnVarF.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.twb
    public final void j(final tso tsoVar) {
        tuw tuwVar = tuw.a;
        tuv tuvVar = new tuv();
        String str = (String) tsoVar.c.get(0);
        if ((tuvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            tuvVar.y();
        }
        tuw tuwVar2 = (tuw) tuvVar.b;
        str.getClass();
        tuwVar2.b |= 1;
        tuwVar2.c = str;
        final tuw tuwVar3 = (tuw) tuvVar.v();
        txj txjVar = this.a;
        if (txjVar.g(new Function() { // from class: txe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txn txnVarF = ((txo) obj).f();
                tws twsVar = (tws) txnVarF;
                twsVar.b = tuwVar3;
                twsVar.c = tsoVar;
                return txnVarF.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })) {
            txjVar.e();
        }
    }

    @Override // defpackage.twb
    public final void l() {
        Function function = new Function() { // from class: txf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                txn txnVarF = ((txo) obj).f();
                txnVarF.b(true);
                return txnVarF.a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        txj txjVar = this.a;
        txjVar.f(function);
        rqo rqoVar = rpx.a;
        rqt rqtVar = new rqt(new rpz("INTENT_API_START_OF_SPEECH", false, ypv.a, 104, rpy.NONE, rpx.b, rpx.a, rpx.c, rpx.d));
        rqtVar.i("requestId", txjVar.f);
        txjVar.b.a(rqtVar);
    }

    @Override // defpackage.twb
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.twb
    public final void i() {
    }

    @Override // defpackage.twb
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.twb
    public final /* synthetic */ void g(adqj adqjVar) {
    }

    @Override // defpackage.twb
    public final /* synthetic */ void k(adrb adrbVar) {
    }

    @Override // defpackage.twb
    public final /* synthetic */ void f(txt txtVar, txv txvVar) {
    }
}
