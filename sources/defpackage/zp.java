package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zp {
    public static final zp a = new zp(new Bundle(), null);
    public final Bundle b;
    public List c;

    public zp(Bundle bundle, List list) {
        this.b = bundle;
        this.c = list;
    }

    public final List a() {
        b();
        return new ArrayList(this.c);
    }

    public final void b() {
        if (this.c == null) {
            ArrayList<String> stringArrayList = this.b.getStringArrayList("controlCategories");
            this.c = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.c = Collections.EMPTY_LIST;
            }
        }
    }

    public final boolean c() {
        b();
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        b();
        zpVar.b();
        return this.c.equals(zpVar.c);
    }

    public final int hashCode() {
        b();
        return this.c.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(a().toArray()) + " }";
    }
}
