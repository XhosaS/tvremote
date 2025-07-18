package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lwb extends kes implements lwj {
    public lwb(Context context, lwg lwgVar) {
        super(context, null, lwh.a, lwgVar, ker.a);
    }

    @Override // defpackage.lwj
    public final lvf a() {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lvx
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                lvy lvyVar = new lvy((lvj) obj2);
                lwp lwpVar = (lwp) ((lww) obj).v();
                Parcel parcelA = lwpVar.a();
                erv.c(parcelA, lvyVar);
                lwpVar.J(2, parcelA);
            }
        };
        kibVar.d = 4501;
        return super.g(0, kibVar.a());
    }

    @Override // defpackage.lwj
    public final void b(lwi lwiVar) {
        final khi khiVarB = khj.b(lwiVar, this.h, "lwi");
        final lwv lwvVar = ((lwg) this.f).b;
        khv khvVar = new khv() { // from class: lvv
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                lwv lwvVar2 = new lwv(khiVarB);
                ((lww) obj).J(lwvVar, lwvVar2, new lvz(this.a, (lvj) obj2, lwvVar2));
            }
        };
        khv khvVar2 = new khv() { // from class: lvw
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                lwb lwbVar = this.a;
                ((lww) obj).J(((lwg) lwbVar.f).b, null, new lwa(lwbVar, (lvj) obj2));
            }
        };
        kht khtVar = new kht();
        khtVar.a = khvVar;
        khtVar.b = khvVar2;
        khtVar.c = khiVarB;
        khtVar.d = new Feature[]{lvu.a};
        khtVar.f = 4507;
        h(khtVar.a());
    }
}
