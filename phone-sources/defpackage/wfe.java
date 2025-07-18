package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wfe implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wfe(int i) {
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
        Double dValueOf = Double.valueOf(1.0d);
        switch (i) {
            case 0:
                return Double.valueOf(true != ((wfo) obj).b ? 4.0d : 98.0d);
            case 1:
                return ((wfo) obj).g;
            case 2:
                wfo wfoVar = (wfo) obj;
                int i2 = wfoVar.k;
                int i3 = wfoVar.j;
                return i3 == 2 ? Double.valueOf(1.6d) : i3 == 3 ? Double.valueOf(1.4d) : dValueOf;
            case 3:
                return ((wfo) obj).d;
            case 4:
                int i4 = ((wfo) obj).k;
                return wfh.aR(6.0d);
            case 5:
                return ((wfo) obj).f;
            case 6:
                int i5 = ((wfo) obj).k;
                return wfh.aR(6.0d);
            case 7:
                return ((wfo) obj).e;
            case 8:
                int i6 = ((wfo) obj).k;
                return wfh.aR(6.0d);
            case 9:
                return ((wfo) obj).d;
            case 10:
                wfo wfoVar2 = (wfo) obj;
                int i7 = wfoVar2.j;
                if (i7 == 2) {
                    int i8 = wfoVar2.k;
                    return Double.valueOf(true != wfoVar2.b ? 40.0d : 80.0d);
                }
                if (i7 == 3) {
                    int i9 = wfoVar2.k;
                    return wfoVar2.b ? Double.valueOf(80.0d) : Double.valueOf(wfh.aO(wfoVar2.d));
                }
                wfv wfvVar = wfoVar2.d;
                return Double.valueOf(wfh.aP(wfvVar, 0.0d, true == wfs.b(wfvVar.b) ? 88.0d : 98.0d));
            case 11:
                int i10 = ((wfo) obj).k;
                return wfh.aR(4.5d);
            case 12:
                return ((wfo) obj).f;
            case 13:
                int i11 = ((wfo) obj).k;
                return wfh.aR(6.0d);
            case 14:
                return ((wfo) obj).g;
            case 15:
                return wfh.aR(7.0d);
            case 16:
                return ((wfo) obj).g;
            case 17:
                wfo wfoVar3 = (wfo) obj;
                int i12 = wfoVar3.k;
                if (wfoVar3.b) {
                    return Double.valueOf(6.0d);
                }
                if (wfs.c(wfoVar3.g.b)) {
                    return Double.valueOf(98.0d);
                }
                int i13 = wfoVar3.j;
                return Double.valueOf(96.0d);
            case 18:
                wfo wfoVar4 = (wfo) obj;
                int i14 = wfoVar4.k;
                int i15 = wfoVar4.j;
                return i15 == 2 ? Double.valueOf(1.3d) : i15 == 3 ? Double.valueOf(1.25d) : dValueOf;
            case 19:
                return ((wfo) obj).i;
            default:
                int i16 = ((wfo) obj).k;
                return wfh.aR(4.5d);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
