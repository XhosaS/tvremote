package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqs implements hqf {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final hqf b;

    public hqs(hqf hqfVar) {
        this.b = hqfVar;
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ cvi e(Object obj, int i, int i2, hll hllVar) {
        return this.b.e(new hpw(((Uri) obj).toString()), i, i2, hllVar);
    }
}
