package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fur {
    public static final fur a = new fur(new Bundle(), null);
    public final Bundle b;
    public List c;

    public fur(Bundle bundle, List list) {
        this.b = bundle;
        this.c = list;
    }

    public static fur a(Bundle bundle) {
        if (bundle != null) {
            return new fur(bundle, null);
        }
        return null;
    }

    public final List b() {
        c();
        return new ArrayList(this.c);
    }

    public final void c() {
        if (this.c == null) {
            ArrayList<String> stringArrayList = this.b.getStringArrayList("controlCategories");
            this.c = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.c = Collections.EMPTY_LIST;
            }
        }
    }

    public final boolean d() {
        c();
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fur)) {
            return false;
        }
        fur furVar = (fur) obj;
        c();
        furVar.c();
        return this.c.equals(furVar.c);
    }

    public final int hashCode() {
        c();
        return this.c.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
