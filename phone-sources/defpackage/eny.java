package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eny extends enz {
    public final Uri a;
    public final long b;
    public final String c;
    private final enw j;
    private final eoh k;

    public eny(long j, dze dzeVar, List list, eoe eoeVar, List list2, String str, long j2) {
        super(j, dzeVar, list, eoeVar, list2);
        this.a = Uri.parse(((enq) list.get(0)).a);
        long j3 = eoeVar.b;
        enw enwVar = j3 <= 0 ? null : new enw(null, eoeVar.a, j3);
        this.j = enwVar;
        this.c = str;
        this.b = j2;
        this.k = enwVar == null ? new eoh(new enw(null, 0L, j2)) : null;
    }

    public static eny a(long j, dze dzeVar, String str, long j2, long j3, long j4, long j5, List list, String str2, long j6) {
        eoe eoeVar = new eoe(new enw(null, j2, (j3 - j2) + 1), 1L, 0L, j4, (j5 - j4) + 1);
        ImmutableList immutableListOf = ImmutableList.of(new enq(str));
        ImmutableList.of();
        ImmutableList.of();
        return new eny(j, dzeVar, immutableListOf, eoeVar, list, str2, j6);
    }

    @Override // defpackage.enz
    public final eng k() {
        return this.k;
    }

    @Override // defpackage.enz
    public final enw l() {
        return this.j;
    }

    @Override // defpackage.enz
    public final String m() {
        return this.c;
    }
}
