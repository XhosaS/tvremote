package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eef implements Comparable {
    public long b = -9223372036854775807L;
    public final List a = new ArrayList();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.b, ((eef) obj).b);
    }
}
