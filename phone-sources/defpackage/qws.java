package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qws {
    public static final /* synthetic */ int a = 0;
    private static final Ordering b = Ordering.explicit(rez.INCOGNITO, rez.PRIVACY_ADVISOR, rez.SETTINGS, rez.HELP_AND_FEEDBACK);
    private final qwn c;
    private boolean d;

    public qws(qwn qwnVar) {
        this.c = qwnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList a() {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ArrayList arrayList = new ArrayList();
        UnmodifiableIterator it = this.c.e.i.iterator();
        while (it.hasNext()) {
            rfc rfcVar = (rfc) it.next();
            rez rezVar = rfcVar.i;
            a.ab(true ^ rezVar.equals(rez.CUSTOM));
            if (!this.d || !rezVar.equals(rez.PRIVACY_ADVISOR)) {
                arrayList.add(rfcVar);
            }
        }
        UnmodifiableIterator it2 = new qwr(b).immutableSortedCopy(arrayList).iterator();
        while (it2.hasNext()) {
            builder.add((ImmutableList.Builder) new rdn(new rgt((rfc) it2.next(), 1)));
        }
        return builder.build();
    }

    public final void b() {
        this.d = true;
    }
}
