package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wff implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wff(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo439andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.function.Function] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return ((wcq) this.a).h();
            case 1:
                int i = ((wfo) obj).k;
                return ((wcq) this.a).r();
            case 2:
                return ((wcq) this.a).g();
            case 3:
                return ((wcq) this.a).h();
            case 4:
                return wcq.E((wfh) this.a, (wfo) obj);
            case 5:
                return wcq.D((wfh) this.a, (wfo) obj);
            case 6:
                return wcq.D((wfh) this.a, (wfo) obj);
            case 7:
                return wcq.E((wfh) this.a, (wfo) obj);
            default:
                wfo wfoVar = (wfo) obj;
                ?? r0 = this.a;
                return Double.valueOf(r0.apply(wfoVar) != null ? ((wfn) r0.apply(wfoVar)).b(wfoVar) : 50.0d);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
