package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wfa implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wfa(int i) {
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
                return ((wfo) obj).d;
            case 1:
                return new wfj(4.5d, 7.0d);
            case 2:
                return Double.valueOf(((wfo) obj).f.a.c);
            case 3:
                return Double.valueOf(((wfo) obj).d.a.c);
            case 4:
                return ((wfo) obj).e;
            case 5:
                return Double.valueOf(((wfo) obj).e.a.c);
            case 6:
                return ((wfo) obj).e;
            case 7:
                return Double.valueOf(true == ((wfo) obj).b ? 80.0d : 40.0d);
            case 8:
                return new wfj(4.5d, 7.0d);
            case 9:
                return ((wfo) obj).f;
            case 10:
                return ((wfo) obj).f;
            case 11:
                wfo wfoVar = (wfo) obj;
                if (wcq.u(wfoVar)) {
                    return Double.valueOf(true == wfoVar.b ? 10.0d : 90.0d);
                }
                return Double.valueOf(true != wfoVar.b ? 100.0d : 20.0d);
            case 12:
                return new wfj(7.0d, 11.0d);
            case 13:
                return ((wfo) obj).h;
            case 14:
                return Double.valueOf(true != ((wfo) obj).b ? 90.0d : 30.0d);
            case 15:
                return ((wfo) obj).d;
            case 16:
                return Double.valueOf(true == ((wfo) obj).b ? 80.0d : 40.0d);
            case 17:
                return ((wfo) obj).i;
            case 18:
                return Double.valueOf(true != ((wfo) obj).b ? 90.0d : 30.0d);
            case 19:
                return new wfj(1.0d, 3.0d);
            default:
                wfo wfoVar2 = (wfo) obj;
                if (wcq.u(wfoVar2)) {
                    return Double.valueOf(true != wfoVar2.b ? 49.0d : 60.0d);
                }
                wcq.B(wfoVar2);
                return Double.valueOf(true != wfoVar2.b ? 90.0d : 30.0d);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
