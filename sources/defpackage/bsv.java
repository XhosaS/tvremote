package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bsv implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bsv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return this.b != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.b != 0) {
            return this.a.remove((String) obj);
        }
        buy buyVar = (buy) obj;
        String strName = buyVar.name();
        bsy bsyVar = (bsy) this.a;
        return strName + "[" + (btc.i(buyVar, bsyVar.f) ? btc.i(buyVar, bsyVar.g) ? "+" : "-" : "X");
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
