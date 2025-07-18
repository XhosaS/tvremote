package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ssh implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ssh(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo439andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Failed to inline method: sik.s(ssc):java.lang.Double */
    /* JADX WARN: Unknown register number '(r12v0 'obj' java.lang.Object)' in method call: sik.s(ssc):java.lang.Double */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return sik.s((ssc) obj);
            case 1:
                return Double.valueOf(true != ((ssc) obj).b ? 0.12d : 0.2d);
            case 2:
                return ((ssc) obj).e;
            case 3:
                ssc sscVar = (ssc) obj;
                sik.y(sscVar);
                return Double.valueOf(sscVar.a.c);
            case 4:
                return ((ssc) obj).h;
            case 5:
                return Double.valueOf(true == ((ssc) obj).b ? 6.0d : 98.0d);
            case 6:
                return ((ssc) obj).h;
            case 7:
                ssc sscVar2 = (ssc) obj;
                return Double.valueOf(sscVar2.b ? new ssa(17.0d, 17.0d, 21.0d, 25.0d).a(sscVar2.c) : new ssa(92.0d, 92.0d, 88.0d, 85.0d).a(sscVar2.c));
            case 8:
                return ((ssc) obj).h;
            case 9:
                return Double.valueOf(true != ((ssc) obj).b ? 10.0d : 90.0d);
            case 10:
                return sik.u();
            case 11:
                return ((ssc) obj).g;
            case 12:
                return ((ssc) obj).i;
            case 13:
                return Double.valueOf(true == ((ssc) obj).b ? 30.0d : 80.0d);
            case 14:
                return ((ssc) obj).h;
            case 15:
                ssc sscVar3 = (ssc) obj;
                return Double.valueOf(sscVar3.b ? new ssa(24.0d, 24.0d, 29.0d, 34.0d).a(sscVar3.c) : 98.0d);
            case 16:
                return ((ssc) obj).e;
            case 17:
                return sik.t((ssc) obj);
            case 18:
                return ((ssc) obj).e;
            case 19:
                return Double.valueOf(true == ((ssc) obj).b ? 40.0d : 80.0d);
            default:
                return sik.v();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
