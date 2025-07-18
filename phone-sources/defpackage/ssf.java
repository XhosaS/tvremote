package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ssf implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ssf(int i) {
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
                return ((ssc) obj).i;
            case 1:
                ssc sscVar = (ssc) obj;
                return Double.valueOf(sscVar.b ? new ssa(4.0d, 4.0d, 2.0d, 0.0d).a(sscVar.c) : 100.0d);
            case 2:
                return Double.valueOf(true != ((ssc) obj).b ? 50.0d : 60.0d);
            case 3:
                return ((ssc) obj).h;
            case 4:
                return Double.valueOf(true != ((ssc) obj).b ? 95.0d : 20.0d);
            case 5:
                return sik.v();
            case 6:
                return ((ssc) obj).g;
            case 7:
                return ((ssc) obj).f;
            case 8:
                return ((ssc) obj).j;
            case 9:
                return ((ssc) obj).h;
            case 10:
                return Double.valueOf(true != ((ssc) obj).b ? 40.0d : 80.0d);
            case 11:
                return ((ssc) obj).h;
            case 12:
                return Double.valueOf(true != ((ssc) obj).b ? 90.0d : 10.0d);
            case 13:
                return ((ssc) obj).h;
            case 14:
                ssc sscVar2 = (ssc) obj;
                return Double.valueOf(sscVar2.b ? new ssa(12.0d, 12.0d, 16.0d, 20.0d).a(sscVar2.c) : new ssa(94.0d, 94.0d, 92.0d, 90.0d).a(sscVar2.c));
            case 15:
                return ((ssc) obj).i;
            case 16:
                return Double.valueOf(true != ((ssc) obj).b ? 30.0d : 80.0d);
            case 17:
                return ((ssc) obj).h;
            case 18:
                return Double.valueOf(true == ((ssc) obj).b ? 90.0d : 20.0d);
            case 19:
                ssc sscVar3 = (ssc) obj;
                return Double.valueOf(sscVar3.b ? 6.0d : new ssa(87.0d, 87.0d, 80.0d, 75.0d).a(sscVar3.c));
            default:
                return ((ssc) obj).j;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
