package defpackage;

import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class enz {
    public final long d;
    public final dze e;
    public final ImmutableList f;
    public final long g;
    public final List h;
    public final enw i;

    public enz(long j, dze dzeVar, List list, eof eofVar, List list2) {
        a.H(!list.isEmpty());
        this.d = j;
        this.e = dzeVar;
        this.f = ImmutableList.copyOf((Collection) list);
        this.h = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.i = eofVar.i(this);
        this.g = edt.B(eofVar.j, 1000000L, eofVar.i);
    }

    public static enz n(long j, dze dzeVar, List list, eof eofVar, List list2, String str) {
        if (eofVar instanceof eoe) {
            return new eny(j, dzeVar, list, (eoe) eofVar, list2, str, -1L);
        }
        if (eofVar instanceof eoa) {
            return new enx(j, dzeVar, list, (eoa) eofVar, list2);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract eng k();

    public abstract enw l();

    public abstract String m();
}
