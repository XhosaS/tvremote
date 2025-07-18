package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufi {
    public final String a;
    public final List b;

    public ufi(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ugg.a(!list.isEmpty(), "Missing param values", new Object[0]);
        this.a = str;
        arrayList.addAll(list);
    }

    public final String toString() {
        return ufm.a(this.a) + "=" + TextUtils.join("+", this.b);
    }
}
