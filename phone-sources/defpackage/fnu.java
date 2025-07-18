package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnu {
    public static final fqx a;
    public static final fqx b;
    public static final eak c;
    public final fqx d;
    public final eak e;
    public final ImmutableList f;
    public final ImmutableList g;

    static {
        HashSet hashSet = new HashSet();
        fki.p(hashSet);
        a = new fqx(hashSet);
        HashSet hashSet2 = new HashSet();
        fki.o(fqw.b, hashSet2);
        fki.p(hashSet2);
        b = new fqx(hashSet2);
        int[] iArr = eaj.a;
        rin rinVar = new rin(null, null);
        rinVar.l(eaj.a);
        c = eaj.a(rinVar);
    }

    public fnu(fqx fqxVar, eak eakVar, ImmutableList immutableList, ImmutableList immutableList2) {
        this.d = fqxVar;
        this.e = eakVar;
        this.f = immutableList;
        this.g = immutableList2;
    }
}
