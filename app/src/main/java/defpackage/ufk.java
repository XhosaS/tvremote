package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufk {
    public final String a;
    public final List b;

    public ufk(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ufm.a(this.a));
        List list = this.b;
        if (list.isEmpty()) {
            return sb.toString();
        }
        sb.append("(");
        sb.append(TextUtils.join(",", list));
        sb.append(")");
        return sb.toString();
    }
}
