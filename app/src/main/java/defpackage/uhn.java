package defpackage;

import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhn implements uef {
    public ufd[] a;

    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) {
        List listA = ueeVar.a(ueeVar.b.f(ueeVar.f));
        ufd[] ufdVarArr = this.a;
        if (ufdVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                ufdVarArr[i].a(listA);
            }
        }
        return (OutputStream) listA.get(0);
    }
}
