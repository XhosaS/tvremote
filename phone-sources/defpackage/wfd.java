package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wfd implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wfd(int i) {
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
        double dAP;
        switch (this.a) {
            case 0:
                return ((wfo) obj).i;
            case 1:
                int i = ((wfo) obj).k;
                return wfh.aR(4.5d);
            case 2:
                wfo wfoVar = (wfo) obj;
                if (!wfoVar.b) {
                    int i2 = wfoVar.j;
                    if (i2 == 2) {
                        return Double.valueOf(2.5d);
                    }
                    if (i2 == 3) {
                        return Double.valueOf(1.7d);
                    }
                }
                return Double.valueOf(1.0d);
            case 3:
                int i3 = ((wfo) obj).k;
                return wfh.aR(6.0d);
            case 4:
                return ((wfo) obj).d;
            case 5:
                int i4 = ((wfo) obj).k;
                return wfh.aR(6.0d);
            case 6:
                return ((wfo) obj).i;
            case 7:
                wfo wfoVar2 = (wfo) obj;
                int i5 = wfoVar2.k;
                boolean z = wfoVar2.b;
                wfv wfvVar = wfoVar2.i;
                return Double.valueOf(z ? wfh.aQ(wfvVar, 0.0d, 98.0d) : wfh.aO(wfvVar));
            case 8:
                int i6 = ((wfo) obj).k;
                return wfh.aR(4.5d);
            case 9:
                return ((wfo) obj).g;
            case 10:
                return ((wfo) obj).d;
            case 11:
                wfo wfoVar3 = (wfo) obj;
                int i7 = wfoVar3.k;
                int i8 = wfoVar3.j;
                if (i8 == 2) {
                    return Double.valueOf(true == wfoVar3.b ? 30.0d : 90.0d);
                }
                if (i8 == 3) {
                    return Double.valueOf(wfoVar3.b ? wfh.aQ(wfoVar3.d, 35.0d, 93.0d) : wfh.aP(wfoVar3.d, 0.0d, 90.0d));
                }
                if (wfoVar3.b) {
                    dAP = wfh.aQ(wfoVar3.d, 66.0d, 93.0d);
                } else {
                    wfv wfvVar2 = wfoVar3.d;
                    dAP = wfh.aP(wfvVar2, 66.0d, true == wfs.b(wfvVar2.b) ? 88.0d : 93.0d);
                }
                return Double.valueOf(dAP);
            case 12:
                int i9 = ((wfo) obj).k;
                return null;
            case 13:
                wcq.G((wfo) obj);
                return null;
            case 14:
                return ((wfo) obj).f;
            case 15:
                wfo wfoVar4 = (wfo) obj;
                int i10 = wfoVar4.k;
                int i11 = wfoVar4.j;
                if (i11 == 2) {
                    return Double.valueOf(wfoVar4.b ? wfh.aP(wfoVar4.f, 0.0d, 93.0d) : wfh.aP(wfoVar4.f, 0.0d, 96.0d));
                }
                if (i11 == 3) {
                    return Double.valueOf(wfh.aP(wfoVar4.f, 0.0d, true != wfoVar4.b ? 100.0d : 93.0d));
                }
                return Double.valueOf(wfoVar4.b ? wfh.aP(wfoVar4.f, 0.0d, 93.0d) : wfh.aP(wfoVar4.f, 72.0d, 100.0d));
            case 16:
                wfo wfoVar5 = (wfo) obj;
                int i12 = wfoVar5.k;
                if (wfoVar5.b) {
                    return Double.valueOf(9.0d);
                }
                if (wfs.c(wfoVar5.g.b)) {
                    return Double.valueOf(96.0d);
                }
                int i13 = wfoVar5.j;
                return Double.valueOf(94.0d);
            case 17:
                int i14 = ((wfo) obj).k;
                return null;
            case 18:
                wcq.G((wfo) obj);
                return null;
            case 19:
                return ((wfo) obj).g;
            default:
                wfo wfoVar6 = (wfo) obj;
                int i15 = wfoVar6.k;
                if (wfoVar6.b) {
                    return Double.valueOf(4.0d);
                }
                if (wfs.c(wfoVar6.g.b)) {
                    return Double.valueOf(99.0d);
                }
                int i16 = wfoVar6.j;
                return Double.valueOf(98.0d);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
