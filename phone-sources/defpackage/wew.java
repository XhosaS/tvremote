package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wew implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wew(int i) {
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
                return Double.valueOf(((wfo) obj).h.a.c);
            case 1:
                return ((wfo) obj).h;
            case 2:
                return ((wfo) obj).h;
            case 3:
                return Double.valueOf(true != ((wfo) obj).b ? 30.0d : 80.0d);
            case 4:
                return new wfj(4.5d, 7.0d);
            case 5:
                return ((wfo) obj).i;
            case 6:
                return Double.valueOf(true != ((wfo) obj).b ? 40.0d : 80.0d);
            case 7:
                return new wfj(4.5d, 7.0d);
            case 8:
                return new wfj(1.0d, 3.0d);
            case 9:
                return ((wfo) obj).e;
            case 10:
                wfo wfoVar = (wfo) obj;
                boolean z = wfoVar.b;
                double d = true == z ? 30.0d : 90.0d;
                if (wcq.u(wfoVar)) {
                    return Double.valueOf(true != z ? 85.0d : 30.0d);
                }
                wcq.B(wfoVar);
                return Double.valueOf(d);
            case 11:
                return new wfj(1.0d, 3.0d);
            case 12:
                return ((wfo) obj).h;
            case 13:
                return Double.valueOf(true == ((wfo) obj).b ? 30.0d : 80.0d);
            case 14:
                return new wfj(1.0d, 3.0d);
            case 15:
                return ((wfo) obj).d;
            case 16:
                wfo wfoVar2 = (wfo) obj;
                wcq.B(wfoVar2);
                if (wcq.u(wfoVar2)) {
                    return Double.valueOf(true != wfoVar2.b ? 25.0d : 85.0d);
                }
                return Double.valueOf(true == wfoVar2.b ? 30.0d : 90.0d);
            case 17:
                return new wfj(1.0d, 3.0d);
            case 18:
                return ((wfo) obj).h;
            case 19:
                return ((wfo) obj).g;
            default:
                return Double.valueOf(true != ((wfo) obj).b ? 98.0d : 6.0d);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
