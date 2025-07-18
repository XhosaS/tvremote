package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wfk implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wfk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo439andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        if (i == 0) {
            return Double.valueOf(50.0d);
        }
        if (i != 1) {
            return null;
        }
        wcq.G((wfo) obj);
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
