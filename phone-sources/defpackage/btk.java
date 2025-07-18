package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btk extends bsn {
    private final String c;

    public btk(bsw bswVar, byb bybVar) {
        super(bswVar, bybVar);
        this.c = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // defpackage.bsn
    public final void b(bsw bswVar) {
        caz cazVarH = h();
        if (cazVarH != null) {
            cazVarH.b = bswVar;
        }
    }

    @Override // defpackage.cak
    public final /* synthetic */ Object ci() {
        return this.c;
    }

    @Override // defpackage.bsn
    public final boolean g(int i) {
        return a.r(i, 3) || a.r(i, 4);
    }
}
