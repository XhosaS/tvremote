package defpackage;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zae extends yxo {
    final /* synthetic */ Iterable a;
    final /* synthetic */ Comparator b;

    public zae(Iterable iterable, Comparator comparator) {
        this.a = iterable;
        this.b = comparator;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zao(zag.d(this.a, new yqi() { // from class: zad
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((Iterable) obj).iterator();
            }
        }), this.b);
    }
}
