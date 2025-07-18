package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wfc implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wfc(int i) {
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
        switch (this.a) {
            case 0:
                return wcq.F((wfo) obj);
            case 1:
                return ((wfo) obj).g;
            case 2:
                return wfh.aR(true != ((wfo) obj).b ? 9.0d : 11.0d);
            case 3:
                return ((wfo) obj).e;
            case 4:
                int i = ((wfo) obj).k;
                return wfh.aR(6.0d);
            case 5:
                return ((wfo) obj).g;
            case 6:
                return wcq.F((wfo) obj);
            case 7:
                int i2 = ((wfo) obj).k;
                return wfh.aR(3.0d);
            case 8:
                return ((wfo) obj).g;
            case 9:
                return wcq.F((wfo) obj);
            case 10:
                int i3 = ((wfo) obj).k;
                return wfh.aR(4.5d);
            case 11:
                return ((wfo) obj).g;
            case 12:
                return ((wfo) obj).g;
            case 13:
                wfo wfoVar = (wfo) obj;
                int i4 = wfoVar.k;
                if (wfoVar.b) {
                    return Double.valueOf(12.0d);
                }
                if (wfs.c(wfoVar.g.b)) {
                    return Double.valueOf(94.0d);
                }
                int i5 = wfoVar.j;
                return Double.valueOf(92.0d);
            case 14:
                wfo wfoVar2 = (wfo) obj;
                int i6 = wfoVar2.k;
                int i7 = wfoVar2.j;
                return i7 == 2 ? Double.valueOf(1.9d) : i7 == 3 ? Double.valueOf(1.5d) : Double.valueOf(1.0d);
            case 15:
                return ((wfo) obj).f;
            case 16:
                wfo wfoVar3 = (wfo) obj;
                if (wfoVar3.b) {
                    return Double.valueOf(4.0d);
                }
                if (wfs.c(wfoVar3.g.b)) {
                    return Double.valueOf(90.0d);
                }
                int i8 = wfoVar3.j;
                return Double.valueOf(87.0d);
            case 17:
                wfo wfoVar4 = (wfo) obj;
                int i9 = wfoVar4.k;
                int i10 = wfoVar4.j;
                boolean z = wfoVar4.b;
                wfv wfvVar = wfoVar4.f;
                return Double.valueOf(z ? wfh.aP(wfvVar, 0.0d, 98.0d) : wfh.aO(wfvVar));
            case 18:
                int i11 = ((wfo) obj).k;
                return wfh.aR(4.5d);
            case 19:
                return ((wfo) obj).e;
            default:
                wfo wfoVar5 = (wfo) obj;
                int i12 = wfoVar5.k;
                if (wfoVar5.j != 2) {
                    return Double.valueOf(wfoVar5.b ? 80.0d : wfh.aO(wfoVar5.e));
                }
                boolean z2 = wfoVar5.b;
                wfv wfvVar2 = wfoVar5.e;
                return Double.valueOf(z2 ? wfh.aQ(wfvVar2, 0.0d, 98.0d) : wfh.aO(wfvVar2));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
