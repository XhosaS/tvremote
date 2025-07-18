package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jji extends sbx {
    public final jaf a;
    private final jjd b;
    private final cxe c;

    public jji(cxe cxeVar, jjd jjdVar, jaf jafVar) {
        jafVar.getClass();
        this.c = cxeVar;
        this.b = jjdVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jjz jjzVar = new jjz(1, (byte[]) null);
        jjzVar.c = new jeu(this, ixiVar, 12);
        jjzVar.a = new jev(this, ixiVar, 10);
        return jjzVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jjz jjzVar = (jjz) obj2;
        jjzVar.F(ixiVar.a, new String[0]);
        vun<wuw> vunVar = ((wux) ixiVar.b).b;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
        for (wuw wuwVar : vunVar) {
            jjd jjdVar = this.b;
            wuwVar.getClass();
            arrayList.add((jjg) jjdVar.l(new cxe(wuwVar, (byte[]) null)));
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList);
        if (yks.e(jjzVar.b, immutableListCopyOf)) {
            return;
        }
        jjzVar.b = immutableListCopyOf;
        jjzVar.G(0);
    }
}
