package defpackage;

import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsj extends dyc {
    final /* synthetic */ ComponentTree a;
    private final int c;
    private final dzh d;
    private final String e;
    private final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsj(ComponentTree componentTree, int i, dzh dzhVar, String str, boolean z) {
        super(false);
        this.a = componentTree;
        boolean z2 = ebc.a;
        this.c = i;
        this.d = dzhVar;
        this.e = str;
        this.f = z;
    }

    @Override // defpackage.dyc
    public final void a(dyc dycVar) {
        this.a.l(null, this.c, this.e, this.d, this.f);
    }
}
