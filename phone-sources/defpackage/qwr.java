package defpackage;

import com.google.common.collect.Ordering;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qwr extends Ordering {
    final /* synthetic */ Ordering a;

    public qwr(Ordering ordering) {
        this.a = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare(((rfc) obj).i, ((rfc) obj2).i);
    }
}
