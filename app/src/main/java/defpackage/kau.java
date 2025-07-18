package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kau extends kes implements jyx {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public kau(Context context) {
        kei keiVar = jyw.c;
        ked kedVar = kee.a;
        keq keqVar = new keq();
        keqVar.a = new kfp();
        super(context, null, keiVar, kedVar, keqVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.lvf k(final defpackage.jyq r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kau.k(jyq):lvf");
    }

    @Override // defpackage.jyx
    public final lvf a(jyv jyvVar) {
        return k(jyvVar);
    }

    @Override // defpackage.jyx
    public final lvf b(kah kahVar) {
        return k(kahVar);
    }

    public final lvf c(jyq jyqVar, kaa kaaVar) {
        kat katVar = new kat(this, jyqVar, this.j, kaaVar);
        super.j(2, katVar);
        lvj lvjVar = new lvj();
        katVar.d(new kkj(katVar, lvjVar));
        return lvjVar.a;
    }

    public final void d(final BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            lvq.c(Status.a);
            return;
        }
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: kan
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                AtomicBoolean atomicBoolean = kau.a;
                kap kapVar = new kap((lvj) obj2);
                kbb kbbVar = (kbb) ((kav) obj).v();
                Parcel parcelA = kbbVar.a();
                erv.c(parcelA, kapVar);
                erv.b(parcelA, batchedLogErrorParcelable);
                kbbVar.K(8, parcelA);
            }
        };
        kibVar.c = new Feature[]{jzx.a};
        kibVar.b = false;
        super.g(2, kibVar.a());
    }
}
