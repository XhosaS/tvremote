package defpackage;

import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ssi implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ssi(int i) {
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
                return ((ssc) obj).j;
            case 1:
                return sik.t((ssc) obj);
            case 2:
                return Double.valueOf(true != ((ssc) obj).b ? 100.0d : 20.0d);
            case 3:
                return ((ssc) obj).h;
            case 4:
                return sik.s((ssc) obj);
            case 5:
                return ((ssc) obj).e;
            case 6:
                return ((ssc) obj).h;
            case 7:
                return ((ssc) obj).i;
            case 8:
                return Double.valueOf(true == ((ssc) obj).b ? 30.0d : 90.0d);
            case 9:
                return ((ssc) obj).h;
            case 10:
                return sik.s((ssc) obj);
            case 11:
                return ((ssc) obj).h;
            case 12:
                return Double.valueOf(true != ((ssc) obj).b ? 10.0d : 90.0d);
            case 13:
                ssc sscVar = (ssc) obj;
                return Double.valueOf(sscVar.b ? new ssa(22.0d, 22.0d, 26.0d, 30.0d).a(sscVar.c) : new ssa(90.0d, 90.0d, 84.0d, 80.0d).a(sscVar.c));
            case 14:
                return ((ssc) obj).g;
            case 15:
                ssc sscVar2 = (ssc) obj;
                sik.z(sscVar2);
                sik.y(sscVar2);
                return Double.valueOf(sik.A(sscVar2.g.b(sscVar2.a.c)).c);
            case 16:
                return ((ssc) obj).b ? sik.w() : sik.x();
            case 17:
                return new ArrayList();
            case 18:
                return new ArrayList();
            case 19:
                return new ArrayList();
            default:
                return Instant.ofEpochSecond(((Long) obj).longValue());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
