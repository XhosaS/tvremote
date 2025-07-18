package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqq implements hqf {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final hqp b;

    public hqq(hqp hqpVar) {
        this.b = hqpVar;
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ cvi e(Object obj, int i, int i2, hll hllVar) {
        Uri uri = (Uri) obj;
        return new cvi(new hwa(uri), this.b.a(uri));
    }
}
