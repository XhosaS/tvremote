package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgc implements dhe {
    @Override // defpackage.dhe
    public final dhd a(Object obj, int i, int i2, dan danVar) {
        return new dhd(new dpt(obj), Collections.EMPTY_LIST, new dfz(obj.toString()));
    }

    @Override // defpackage.dhe
    public final boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
