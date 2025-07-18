package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dil implements dhe {
    public static final dam a = new dam("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, dam.a);
    private final dhc b;

    public dil() {
        this.b = null;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        dgr dgrVar = (dgr) obj;
        dhc dhcVar = this.b;
        if (dhcVar != null) {
            dhb dhbVarB = dhb.b(dgrVar);
            dqh dqhVar = dhcVar.a;
            Object objF = dqhVar.f(dhbVarB);
            dhbVarB.a();
            dgr dgrVar2 = (dgr) objF;
            if (dgrVar2 == null) {
                dqhVar.g(dhb.b(dgrVar), dgrVar);
            } else {
                dgrVar = dgrVar2;
            }
        }
        return new dhd(dgrVar, Collections.EMPTY_LIST, new dbf(dgrVar, ((Integer) danVar.b(a)).intValue()));
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    public dil(dhc dhcVar) {
        this.b = dhcVar;
    }
}
