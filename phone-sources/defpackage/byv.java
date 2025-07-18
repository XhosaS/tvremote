package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byv {
    public static final clx a = new cly(1.0f, 1.0f);

    public static final bzz a(bys bysVar) {
        bzz bzzVar = bysVar.i;
        if (bzzVar != null) {
            return bzzVar;
        }
        bty.a("LayoutNode should be attached to an owner");
        throw new yfs();
    }
}
