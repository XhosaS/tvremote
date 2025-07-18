package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eri extends erj {
    public final String a;
    public final List b;

    public eri(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.of());
    }

    public eri(String str, eri eriVar, String str2, long j, int i, long j2, dza dzaVar, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, eriVar, j, i, j2, dzaVar, str3, str4, j3, j4, z);
        this.a = str2;
        this.b = ImmutableList.copyOf((Collection) list);
    }
}
