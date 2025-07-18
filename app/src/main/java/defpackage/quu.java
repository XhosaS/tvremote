package defpackage;

import j$.util.Comparator$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class quu {
    public final yrp a;

    public quu(final aehf aehfVar) {
        this.a = yru.a(new yrp() { // from class: qut
            @Override // defpackage.yrp
            public final Object eV() {
                Comparator comparatorComparing = Comparator$CC.comparing(new Function() { // from class: qur
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo116andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((rdn) obj).a().b);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, Comparator$CC.reverseOrder());
                Iterable iterable = (Iterable) aehfVar.a();
                int i = yyk.e;
                comparatorComparing.getClass();
                Object[] objArrJ = zag.j(iterable);
                int length = objArrJ.length;
                zbw.b(objArrJ, length);
                Arrays.sort(objArrJ, comparatorComparing);
                return yyk.h(objArrJ, length);
            }
        });
    }
}
