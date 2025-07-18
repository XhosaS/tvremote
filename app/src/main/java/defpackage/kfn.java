package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfn extends kfj {
    public final khg b;

    public kfn(khg khgVar, lvj lvjVar) {
        super(4, lvjVar);
        this.b = khgVar;
    }

    @Override // defpackage.kfi
    public final boolean a(kgq kgqVar) {
        khp khpVar = (khp) kgqVar.f.get(this.b);
        return khpVar != null && khpVar.a.c;
    }

    @Override // defpackage.kfi
    public final Feature[] b(kgq kgqVar) {
        khp khpVar = (khp) kgqVar.f.get(this.b);
        if (khpVar == null) {
            return null;
        }
        return khpVar.a.b;
    }

    @Override // defpackage.kfj
    public final void c(kgq kgqVar) {
        khp khpVar = (khp) kgqVar.f.remove(this.b);
        if (khpVar == null) {
            this.a.a.s(false);
            return;
        }
        ((khs) khpVar.b).a.b.a(kgqVar.b, this.a);
        khi khiVar = khpVar.a.a;
        khiVar.a = null;
        khiVar.b = null;
    }

    @Override // defpackage.kfj, defpackage.kfo
    public final /* bridge */ /* synthetic */ void g(kgg kggVar, boolean z) {
    }
}
