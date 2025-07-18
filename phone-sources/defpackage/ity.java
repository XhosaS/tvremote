package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ity {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ity(CharSequence charSequence, Bundle bundle, Set set) {
        this.e = "com.google.android.libraries.notifications.REPLY_TEXT_KEY";
        this.b = charSequence;
        this.a = true;
        this.c = bundle;
        this.d = set;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yft] */
    public final ity a() {
        return (ity) this.b.a();
    }

    public ity(yow yowVar, hfx hfxVar, kdj kdjVar, boolean z) {
        this.d = yowVar;
        this.c = hfxVar;
        this.e = kdjVar;
        this.a = z;
        this.b = new iom(new ale(this, (yih) null, 6), new iaz(null, 0));
    }

    public ity(yow yowVar, boolean z, yjz yjzVar, ysx ysxVar) {
        this.d = yowVar;
        this.a = z;
        this.c = yjzVar;
        this.e = ysxVar;
        this.b = new iby(this);
    }

    public ity(yow yowVar, ysx ysxVar, boolean z, yjz yjzVar) {
        this.d = yowVar;
        this.e = ysxVar;
        this.a = z;
        this.c = yjzVar;
        this.b = ybn.g(1, new grq(this, 12));
    }

    public ity(Long l, Long l2, Map map, Map map2) {
        this.b = l;
        this.c = l2;
        this.d = map;
        this.e = map2;
        boolean z = true;
        if (map.size() <= 1 && map2.isEmpty()) {
            z = false;
        }
        this.a = z;
    }
}
