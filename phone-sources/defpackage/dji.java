package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dji extends ykt implements yjk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dji(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjk
    public final Object a() {
        int i = this.b;
        if (i == 0) {
            return this.a.a();
        }
        if (i != 1) {
            return this.a.a();
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ((cmv) this.a).w.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
