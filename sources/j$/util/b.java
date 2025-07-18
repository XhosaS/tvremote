package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator, Serializable {
    public final /* synthetic */ Comparator a;
    public final /* synthetic */ Function b;

    public /* synthetic */ b(Function function, Comparator comparator) {
        this.a = comparator;
        this.b = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function function = this.b;
        return this.a.compare(function.apply(obj), function.apply(obj2));
    }
}
