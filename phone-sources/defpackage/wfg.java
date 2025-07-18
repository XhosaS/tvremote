package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wfg implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wfg(int i) {
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
        int i = this.a;
        Double dValueOf = Double.valueOf(1.7d);
        Double dValueOf2 = Double.valueOf(1.0d);
        switch (i) {
            case 0:
                return Double.valueOf(wfh.aO(((wfo) obj).d));
            case 1:
                return ((wfo) obj).d;
            case 2:
                int i2 = ((wfo) obj).k;
                return wfh.aR(6.0d);
            case 3:
                return ((wfo) obj).g;
            case 4:
                return Double.valueOf(true != ((wfo) obj).b ? 100.0d : 0.0d);
            case 5:
                return ((wfo) obj).g;
            case 6:
                wfo wfoVar = (wfo) obj;
                if (wfoVar.b) {
                    return Double.valueOf(15.0d);
                }
                if (wfs.c(wfoVar.g.b)) {
                    return Double.valueOf(92.0d);
                }
                int i3 = wfoVar.j;
                return Double.valueOf(90.0d);
            case 7:
                int i4 = ((wfo) obj).j;
                return i4 == 2 ? Double.valueOf(2.2d) : i4 == 3 ? dValueOf : dValueOf2;
            case 8:
                return ((wfo) obj).e;
            case 9:
                wfo wfoVar2 = (wfo) obj;
                int i5 = wfoVar2.k;
                int i6 = wfoVar2.j;
                return Double.valueOf(true == wfoVar2.b ? 25.0d : 90.0d);
            case 10:
                int i7 = ((wfo) obj).k;
                return null;
            case 11:
                wcq.G((wfo) obj);
                return null;
            case 12:
                return ((wfo) obj).g;
            case 13:
                wfo wfoVar3 = (wfo) obj;
                if (wfoVar3.b) {
                    return Double.valueOf(18.0d);
                }
                if (wfs.c(wfoVar3.g.b)) {
                    return Double.valueOf(99.0d);
                }
                int i8 = wfoVar3.j;
                return Double.valueOf(98.0d);
            case 14:
                wfo wfoVar4 = (wfo) obj;
                if (wfoVar4.b) {
                    int i9 = wfoVar4.j;
                    if (i9 == 2) {
                        return Double.valueOf(2.5d);
                    }
                    if (i9 == 3) {
                        return dValueOf;
                    }
                }
                return dValueOf2;
            case 15:
                return ((wfo) obj).g;
            case 16:
                return wcq.F((wfo) obj);
            case 17:
                int i10 = ((wfo) obj).k;
                return wfh.aR(1.5d);
            case 18:
                return ((wfo) obj).i;
            case 19:
                wfo wfoVar5 = (wfo) obj;
                int i11 = wfoVar5.k;
                boolean z = wfoVar5.b;
                wfv wfvVar = wfoVar5.i;
                return Double.valueOf(z ? wfh.aQ(wfvVar, 30.0d, 93.0d) : wfh.aP(wfvVar, 0.0d, 90.0d));
            default:
                int i12 = ((wfo) obj).k;
                return null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
