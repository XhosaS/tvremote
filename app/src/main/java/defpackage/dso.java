package defpackage;

import com.facebook.litho.ComponentTree;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dso extends dyc {
    final /* synthetic */ ComponentTree a;
    private final String c;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dso(ComponentTree componentTree, String str, boolean z) {
        super(false);
        this.a = componentTree;
        boolean z2 = ebc.a;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.dyc
    public final void a(dyc dycVar) {
        this.a.w(false, this.c, this.d);
    }
}
