package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oah {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");
    public final Set b = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final pku c = new pku(this);

    final void a(BasePendingResult basePendingResult) {
        this.b.add(basePendingResult);
        basePendingResult.t(this.c);
    }
}
