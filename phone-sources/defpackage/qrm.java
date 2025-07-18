package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableExtensionsKt;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrm {
    public final int a;
    private final List b;
    private final Bundle c = null;

    public qrm(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final ImmutableList a() {
        List list = this.b;
        if (list != null) {
            return ImmutableExtensionsKt.toImmutableList((Collection) list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrm)) {
            return false;
        }
        qrm qrmVar = (qrm) obj;
        if (this.a != qrmVar.a || !yks.e(this.b, qrmVar.b)) {
            return false;
        }
        Bundle bundle = qrmVar.c;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int i = this.a;
        a.bw(i);
        List list = this.b;
        return ((i * 31) + (list == null ? 0 : list.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickBehavior(behaviorType=");
        sb.append((Object) (this.a != 1 ? "BACKGROUND" : "APP_ACTIVITY"));
        sb.append(", activityIntents=");
        sb.append(this.b);
        sb.append(", appProvidedData=null)");
        return sb.toString();
    }
}
