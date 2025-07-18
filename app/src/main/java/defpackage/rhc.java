package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhc implements rgy {
    private final lsd a;

    public rhc(lsd lsdVar) {
        this.a = lsdVar;
    }

    private static zyd l(lvf lvfVar) {
        return zud.h(otn.a(lvfVar), kej.class, new zvi() { // from class: rhb
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                kej kejVar = (kej) obj;
                throw new rgz(kejVar.a.f, kejVar.getMessage(), kejVar);
            }
        }, zwk.a);
    }

    @Override // defpackage.rgy
    public final zyd a(String str) {
        str.getClass();
        return l(this.a.a(str));
    }

    @Override // defpackage.rgy
    public final zyd b(final rgs rgsVar) {
        final lsd lsdVar = this.a;
        return l(lsdVar.b(rgsVar).b(zwk.a, new luj() { // from class: lru
            @Override // defpackage.luj
            public final Object a(lvf lvfVar) {
                boolean z = lvfVar.d() instanceof kfh;
                lsd lsdVar2 = lsdVar;
                rgs rgsVar2 = rgsVar;
                if (z) {
                    return lsdVar2.a(rgsVar2.c);
                }
                if (!(lvfVar.d() instanceof kej)) {
                    return lvfVar;
                }
                kej kejVar = (kej) lvfVar.d();
                kejVar.getClass();
                return kejVar.a.f == 29514 ? lsdVar2.a(rgsVar2.c) : lvfVar;
            }
        }));
    }

    @Override // defpackage.rgy
    public final zyd c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return l(this.a.q(str, str2).a(zwk.a, new rha()));
    }

    @Override // defpackage.rgy
    public final zyd d() {
        return l(this.a.c());
    }

    @Override // defpackage.rgy
    public final zyd e(String str, int i, String[] strArr, byte[] bArr) {
        str.getClass();
        strArr.getClass();
        return l(this.a.k(str, i, strArr, bArr));
    }

    @Override // defpackage.rgy
    public final zyd f(int[] iArr, String str, String str2) {
        iArr.getClass();
        str2.getClass();
        return l(this.a.l(iArr, str, str2));
    }

    @Override // defpackage.rgy
    public final zyd g(String str, aagu aaguVar) {
        return l(this.a.m(str, aaguVar));
    }

    @Override // defpackage.rgy
    public final zyd h(final String str, aagu aaguVar, final byte[] bArr) {
        bArr.getClass();
        final lsd lsdVar = this.a;
        return l(lsdVar.m(str, aaguVar).b(zwk.a, new luj() { // from class: lrn
            @Override // defpackage.luj
            public final Object a(lvf lvfVar) {
                return lsdVar.d(str, bArr, lvfVar);
            }
        }));
    }

    @Override // defpackage.rgy
    public final zyd i(String str, String str2) {
        str2.getClass();
        return l(this.a.n(str, str2).a(zwk.a, new rha()));
    }

    @Override // defpackage.rgy
    public final boolean j() {
        return this.a.o(12200000);
    }

    @Override // defpackage.rgy
    public final zyd k(rlw rlwVar) {
        final String str;
        lsd lsdVar = this.a;
        final khi khiVarB = khj.b(rlwVar, lsdVar.h, lsn.class.getSimpleName());
        String strA = klq.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + "|" + System.identityHashCode(lsn.class);
        }
        khv khvVar = new khv() { // from class: lro
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i = lsd.a;
                lsm lsmVar = (lsm) ((lsn) obj).v();
                lsb lsbVar = new lsb(khiVarB);
                Parcel parcelA = lsmVar.a();
                parcelA.writeString(str);
                erv.c(parcelA, lsbVar);
                lsmVar.J(28, parcelA);
            }
        };
        khv khvVar2 = new khv() { // from class: lrp
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i = lsd.a;
            }
        };
        kht khtVar = new kht();
        khtVar.c = khiVarB;
        khtVar.a = khvVar;
        khtVar.b = khvVar2;
        khtVar.d = new Feature[]{lrd.d};
        khtVar.e = false;
        return l(lsdVar.h(khtVar.a()));
    }
}
