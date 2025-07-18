package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wey implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wey(int i) {
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
                return Double.valueOf(true != ((wfo) obj).b ? 95.0d : 20.0d);
            case 1:
                return ((wfo) obj).g;
            case 2:
                return new wfj(7.0d, 11.0d);
            case 3:
                return ((wfo) obj).f;
            case 4:
                wfo wfoVar = (wfo) obj;
                if (wcq.u(wfoVar)) {
                    return Double.valueOf(true != wfoVar.b ? 100.0d : 0.0d);
                }
                wcq.B(wfoVar);
                return Double.valueOf(true == wfoVar.b ? 90.0d : 30.0d);
            case 5:
                return new wfj(4.5d, 7.0d);
            case 6:
                return ((wfo) obj).g;
            case 7:
                wfo wfoVar2 = (wfo) obj;
                if (wfoVar2.b) {
                    wfj wfjVar = new wfj(12.0d, 16.0d);
                    double d = wfoVar2.c;
                    dA = wfjVar.a();
                } else {
                    wfj wfjVar2 = new wfj(94.0d, 92.0d);
                    double d2 = wfoVar2.c;
                    dA = wfjVar2.a();
                }
                return Double.valueOf(dA);
            case 8:
                return ((wfo) obj).g;
            case 9:
                return Double.valueOf(((wfo) obj).g.a.c);
            case 10:
                return ((wfo) obj).g;
            case 11:
                wfo wfoVar3 = (wfo) obj;
                if (wfoVar3.b) {
                    wfj wfjVar3 = new wfj(22.0d, 26.0d);
                    double d3 = wfoVar3.c;
                    dA2 = wfjVar3.a();
                } else {
                    wfj wfjVar4 = new wfj(90.0d, 84.0d);
                    double d4 = wfoVar3.c;
                    dA2 = wfjVar4.a();
                }
                return Double.valueOf(dA2);
            case 12:
                return ((wfo) obj).d;
            case 13:
                return Double.valueOf(true != ((wfo) obj).b ? 80.0d : 40.0d);
            case 14:
                return new wfj(4.5d, 7.0d);
            case 15:
                return ((wfo) obj).g;
            case 16:
                return Double.valueOf(0.0d);
            case 17:
                return ((wfo) obj).g;
            case 18:
                return ((wfo) obj).i;
            case 19:
                wfo wfoVar4 = (wfo) obj;
                if (wcq.u(wfoVar4)) {
                    return Double.valueOf(true != wfoVar4.b ? 10.0d : 90.0d);
                }
                return Double.valueOf(true == wfoVar4.b ? 90.0d : 30.0d);
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
