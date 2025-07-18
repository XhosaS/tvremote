package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfn extends sbx {
    private final kfs a;
    private final kdh b;

    public kfn(kdh kdhVar, kfs kfsVar) {
        this.b = kdhVar;
        this.a = kfsVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new kfp();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ?? r4 = ((kdh) obj).a;
        kfp kfpVar = (kfp) obj2;
        ArrayList arrayList = new ArrayList(yfm.z(r4, 10));
        Iterator it = r4.iterator();
        while (it.hasNext()) {
            arrayList.add((kfu) this.a.l((kfr) it.next()));
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList);
        if (yks.e(kfpVar.a, immutableListCopyOf)) {
            return;
        }
        kfpVar.a = immutableListCopyOf;
        kfpVar.G(0);
    }
}
