package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eak {
    public static final eak a;
    private static final String c;
    public final dzb b;

    static {
        int[] iArr = eaj.a;
        a = eaj.a(new rin(null, null));
        c = edt.Z(0);
    }

    public eak(dzb dzbVar) {
        this.b = dzbVar;
    }

    public final int a(int i) {
        return this.b.a(i);
    }

    public final int b() {
        return this.b.b();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            dzb dzbVar = this.b;
            if (i >= dzbVar.b()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(dzbVar.a(i)));
            i++;
        }
    }

    public final boolean d(int i) {
        return this.b.c(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eak) {
            return this.b.equals(((eak) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
