package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wex implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wex(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo439andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        double dA;
        double dA2;
        switch (this.a) {
            case 0:
                wfo wfoVar = (wfo) obj;
                wcq.B(wfoVar);
                if (wcq.u(wfoVar)) {
                    return Double.valueOf(true != wfoVar.b ? 100.0d : 0.0d);
                }
                return Double.valueOf(true != wfoVar.b ? 30.0d : 90.0d);
            case 1:
                return ((wfo) obj).d;
            case 2:
                return new wfj(4.5d, 7.0d);
            case 3:
                return ((wfo) obj).g;
            case 4:
                wfo wfoVar2 = (wfo) obj;
                if (wfoVar2.b) {
                    wfj wfjVar = new wfj(24.0d, 29.0d);
                    double d = wfoVar2.c;
                    dA = wfjVar.a();
                } else {
                    dA = 98.0d;
                }
                return Double.valueOf(dA);
            case 5:
                return ((wfo) obj).g;
            case 6:
                return Double.valueOf(true != ((wfo) obj).b ? 50.0d : 60.0d);
            case 7:
                wfo wfoVar3 = (wfo) obj;
                if (wfoVar3.b) {
                    wfj wfjVar2 = new wfj(10.0d, 11.0d);
                    double d2 = wfoVar3.c;
                    dA2 = wfjVar2.a();
                } else {
                    wfj wfjVar3 = new wfj(96.0d, 96.0d);
                    double d3 = wfoVar3.c;
                    dA2 = wfjVar3.a();
                }
                return Double.valueOf(dA2);
            case 8:
                return ((wfo) obj).i;
            case 9:
                return Double.valueOf(true == ((wfo) obj).b ? 20.0d : 100.0d);
            case 10:
                return new wfj(3.0d, 4.5d);
            case 11:
                return new wfj(7.0d, 11.0d);
            case 12:
                return ((wfo) obj).g;
            case 13:
                return Double.valueOf(true == ((wfo) obj).b ? 90.0d : 10.0d);
            case 14:
                return new wfj(7.0d, 11.0d);
            case 15:
                return ((wfo) obj).d;
            case 16:
                wfo wfoVar4 = (wfo) obj;
                if (wcq.u(wfoVar4)) {
                    return Double.valueOf(true != wfoVar4.b ? 0.0d : 100.0d);
                }
                return Double.valueOf(true != wfoVar4.b ? 40.0d : 80.0d);
            case 17:
                return new wfj(4.5d, 7.0d);
            case 18:
                return ((wfo) obj).e;
            case 19:
                wfo wfoVar5 = (wfo) obj;
                if (wcq.u(wfoVar5)) {
                    return Double.valueOf(true == wfoVar5.b ? 90.0d : 10.0d);
                }
                wcq.B(wfoVar5);
                return Double.valueOf(true != wfoVar5.b ? 30.0d : 90.0d);
            default:
                return new wfj(4.5d, 7.0d);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
