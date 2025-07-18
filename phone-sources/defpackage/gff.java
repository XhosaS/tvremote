package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gff extends gen {
    final /* synthetic */ gfh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gff(String[] strArr, gfh gfhVar) {
        super(strArr);
        this.b = gfhVar;
    }

    @Override // defpackage.gen
    public final void a(Set set) {
        hd hdVarA = hd.a();
        gfe gfeVar = new gfe(this.b, 0);
        if (hdVarA.c()) {
            gfeVar.run();
        } else {
            hdVarA.b(gfeVar);
        }
    }
}
