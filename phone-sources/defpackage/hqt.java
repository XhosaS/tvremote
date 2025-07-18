package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqt implements hqf {
    public static final hlk a = new hlk("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, hlk.a);
    private final hfw b;

    public hqt(hfw hfwVar) {
        this.b = hfwVar;
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ cvi e(Object obj, int i, int i2, hll hllVar) {
        hfw hfwVar = this.b;
        hpw hpwVar = (hpw) obj;
        if (hfwVar != null) {
            hqe hqeVarB = hqe.b(hpwVar);
            hwl hwlVar = (hwl) hfwVar.a;
            Object objG = hwlVar.g(hqeVarB);
            hqeVarB.a();
            hpw hpwVar2 = (hpw) objG;
            if (hpwVar2 == null) {
                hwlVar.h(hqe.b(hpwVar), hpwVar);
            } else {
                hpwVar = hpwVar2;
            }
        }
        return new cvi(hpwVar, new hmd(hpwVar, ((Integer) hllVar.b(a)).intValue()));
    }

    public hqt() {
        this(null);
    }
}
