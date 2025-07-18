package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yib implements Comparator {
    public final /* synthetic */ yjv[] a;

    public /* synthetic */ yib(yjv[] yjvVarArr) {
        this.a = yjvVarArr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (int i = 0; i < 2; i++) {
            yjv yjvVar = this.a[i];
            int iY = wcq.Y((Comparable) yjvVar.a(obj), (Comparable) yjvVar.a(obj2));
            if (iY != 0) {
                return iY;
            }
        }
        return 0;
    }
}
