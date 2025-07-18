package defpackage;

import android.os.PatternMatcher;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nrc implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ nrc(int i) {
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
                nrg nrgVar = nrg.a;
                return new npj(null);
            case 1:
                wfo wfoVar = (wfo) obj;
                wfoVar.getClass();
                return wfoVar.d;
            case 2:
                return new PatternMatcher((String) obj, 2);
            case 3:
                return osk.u((uwi) obj);
            case 4:
                return (qis) ((qip) obj);
            case 5:
                return rob.d((zaa) obj);
            case 6:
                return rob.c((zbh) obj);
            case 7:
                zbe zbeVar = (zbe) obj;
                return new roa(zbeVar, rob.d(zbeVar.c == 1 ? (zaa) zbeVar.d : zaa.a));
            case 8:
                return ((roc) obj).b();
            case 9:
                zbe zbeVar2 = (zbe) obj;
                return new roa(zbeVar2, rob.c(zbeVar2.c == 3 ? (zbh) zbeVar2.d : zbh.a));
            case 10:
                return Integer.valueOf(((rvy) obj).a().b);
            case 11:
                return new HashMap();
            case 12:
                return new HashSet();
            case 13:
                return new AtomicReference();
            case 14:
                Long l = ska.a;
                return new Semaphore(1);
            case 15:
                return ((ssc) obj).h;
            case 16:
                return ((ssc) obj).f;
            case 17:
                ssc sscVar = (ssc) obj;
                sik.z(sscVar);
                return Double.valueOf(true != sscVar.b ? 100.0d : 20.0d);
            case 18:
                return ((ssc) obj).f;
            case 19:
                return Double.valueOf(true != ((ssc) obj).b ? 40.0d : 80.0d);
            default:
                return ((ssc) obj).h;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
