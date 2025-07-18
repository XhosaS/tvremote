package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsu extends bsn {
    private final String c;

    public bsu(bsw bswVar) {
        super(bswVar, null);
        this.c = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.bsn
    public final void b(bsw bswVar) {
        caz cazVarH = h();
        if (cazVarH != null) {
            if (bswVar == null) {
                bswVar = bsv.a;
            }
            cazVarH.a = bswVar;
            cbn.a.a(cazVarH.c, cazVarH.a);
        }
    }

    @Override // defpackage.cak
    public final /* synthetic */ Object ci() {
        return this.c;
    }

    @Override // defpackage.bsn
    public final boolean g(int i) {
        return (a.r(i, 3) || a.r(i, 4)) ? false : true;
    }
}
