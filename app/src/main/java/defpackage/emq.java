package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
class emq implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        emp empVar = (emp) obj;
        emp empVar2 = (emp) obj2;
        int i = empVar.b.top;
        int i2 = empVar2.b.top;
        if (i != i2) {
            return i <= i2 ? -1 : 1;
        }
        int i3 = empVar.a;
        int i4 = empVar2.a;
        if (i3 == i4) {
            return 0;
        }
        return i3 <= i4 ? -1 : 1;
    }
}
