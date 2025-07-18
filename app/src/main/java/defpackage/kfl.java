package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfl extends kfj {
    public final khp b;

    public kfl(khp khpVar, lvj lvjVar) {
        super(3, lvjVar);
        this.b = khpVar;
    }

    @Override // defpackage.kfi
    public final boolean a(kgq kgqVar) {
        return this.b.a.c;
    }

    @Override // defpackage.kfi
    public final Feature[] b(kgq kgqVar) {
        return this.b.a.b;
    }

    @Override // defpackage.kfj
    public final void c(kgq kgqVar) {
        khp khpVar = this.b;
        kho khoVar = khpVar.a;
        khoVar.a(kgqVar.b, this.a);
        khg khgVar = khoVar.a.b;
        if (khgVar != null) {
            kgqVar.f.put(khgVar, khpVar);
        }
    }

    @Override // defpackage.kfj, defpackage.kfo
    public final /* bridge */ /* synthetic */ void g(kgg kggVar, boolean z) {
    }
}
