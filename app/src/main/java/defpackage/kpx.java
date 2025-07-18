package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpx extends kjn {
    public final wx t;
    private final wx u;
    private final wx v;

    public kpx(Context context, Looper looper, kjd kjdVar, kgd kgdVar, khm khmVar) {
        super(context, looper, 23, kjdVar, kgdVar, khmVar);
        this.t = new wx(0);
        this.u = new wx(0);
        this.v = new wx(0);
        new wx(0);
    }

    @Override // defpackage.kiz
    public final void H() {
        System.currentTimeMillis();
        wx wxVar = this.t;
        synchronized (wxVar) {
            wxVar.clear();
        }
        wx wxVar2 = this.u;
        synchronized (wxVar2) {
            wxVar2.clear();
        }
        wx wxVar3 = this.v;
        synchronized (wxVar3) {
            wxVar3.clear();
        }
    }

    public final boolean J(Feature feature) {
        Feature feature2;
        Feature[] featureArrP = p();
        if (featureArrP != null) {
            int i = 0;
            while (true) {
                if (i >= featureArrP.length) {
                    feature2 = null;
                    break;
                }
                feature2 = featureArrP[i];
                if (feature.a.equals(feature2.a)) {
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.a() >= feature.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 11717000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof kpl ? (kpl) iInterfaceQueryLocalInterface : new kpl(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.kiz
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return kow.p;
    }
}
