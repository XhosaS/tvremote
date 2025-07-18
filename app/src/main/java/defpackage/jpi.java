package defpackage;

import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpi {
    public final Map a = new LinkedHashMap();

    public final jph a(Class cls) {
        cls.getClass();
        SparseArray sparseArray = (SparseArray) this.a.get(cls);
        if (sparseArray != null) {
            return (jph) sparseArray.get(0);
        }
        return null;
    }
}
