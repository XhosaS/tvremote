package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wez implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wez(int i) {
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
        double dA3 = 100.0d;
        switch (this.a) {
            case 0:
                wfo wfoVar = (wfo) obj;
                if (wfoVar.b) {
                    dA = 6.0d;
                } else {
                    wfj wfjVar = new wfj(87.0d, 80.0d);
                    double d = wfoVar.c;
                    dA = wfjVar.a();
                }
                break;
            case 1:
                break;
            case 2:
                wfo wfoVar2 = (wfo) obj;
                if (wfoVar2.b) {
                    wfj wfjVar2 = new wfj(17.0d, 21.0d);
                    double d2 = wfoVar2.c;
                    dA2 = wfjVar2.a();
                } else {
                    wfj wfjVar3 = new wfj(92.0d, 88.0d);
                    double d3 = wfoVar2.c;
                    dA2 = wfjVar3.a();
                }
                break;
            case 3:
                break;
            case 4:
                wfo wfoVar3 = (wfo) obj;
                if (wfoVar3.b) {
                    wfj wfjVar4 = new wfj(4.0d, 2.0d);
                    double d4 = wfoVar3.c;
                    dA3 = wfjVar4.a();
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                wfo wfoVar4 = (wfo) obj;
                if (!wcq.u(wfoVar4)) {
                    break;
                } else {
                    break;
                }
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                wfo wfoVar5 = (wfo) obj;
                if (!wcq.u(wfoVar5)) {
                    break;
                } else {
                    break;
                }
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                wfo wfoVar6 = (wfo) obj;
                if (!wcq.u(wfoVar6)) {
                    break;
                } else {
                    break;
                }
        }
        return ((wfo) obj).f;
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
