package defpackage;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
class kgr {
    public final kfq a;
    public final Feature b;

    public kgr(kfq kfqVar, Feature feature) {
        this.a = kfqVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof kgr)) {
            kgr kgrVar = (kgr) obj;
            if (kki.a(this.a, kgrVar.a) && kki.a(this.b, kgrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kkh.b("key", this.a, arrayList);
        kkh.b("feature", this.b, arrayList);
        return kkh.a(arrayList, this);
    }
}
