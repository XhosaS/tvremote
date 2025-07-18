package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zo {
    final List a;
    final boolean b;

    public zo(List list, boolean z) {
        if (list.isEmpty()) {
            this.a = Collections.EMPTY_LIST;
        } else {
            this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        }
        this.b = z;
    }

    public static zo a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                arrayList.add(zf.l((Bundle) parcelableArrayList.get(i)));
            }
        }
        return new zo(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final boolean b() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zf zfVar = (zf) list.get(i);
            if (zfVar == null || !zfVar.v()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.a.toArray()) + ", isValid=" + b() + " }";
    }
}
