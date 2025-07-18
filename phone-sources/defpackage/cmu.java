package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmu extends ykt implements yjk {
    private final /* synthetic */ int g;
    public static final cmu f = new cmu(5);
    public static final cmu e = new cmu(4);
    public static final cmu d = new cmu(3);
    public static final cmu c = new cmu(2);
    public static final cmu b = new cmu(1);
    public static final cmu a = new cmu(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmu(int i) {
        super(0);
        this.g = i;
    }

    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        int i = this.g;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? UUID.randomUUID() : "DEFAULT_TEST_TAG" : UUID.randomUUID() : ygi.a : a.p() : ygi.a;
    }
}
