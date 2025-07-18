package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omi extends nwq {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new ocv(), osk.r(null));
    }

    public omi(Context context) {
        super(context, omg.a, nwi.q, nwp.a);
    }

    public final onz a(String str) {
        oaf oafVar = new oaf();
        oafVar.a = new nig(str, 20);
        return r(oafVar.a());
    }

    public final onz b(String str, String str2) {
        if (nvk.d.h(this.w, 12451000) != 0) {
            return osk.q(new nwk(new Status(16)));
        }
        oaf oafVar = new oaf();
        oafVar.a = new nkx(str, str2, 9);
        return r(oafVar.a());
    }

    public final onz c(String str, String str2, String str3) {
        oaf oafVar = new oaf();
        oafVar.a = new nkv(str, str2, str3, 4);
        return r(oafVar.a());
    }

    public final onz d(final String str, final int i, final String[] strArr) {
        oaf oafVar = new oaf();
        oafVar.a = new nzz() { // from class: omh
            @Override // defpackage.nzz
            public final void a(Object obj, Object obj2) {
                int i2 = omi.a;
                omo omoVar = new omo((kwy) obj2);
                omp ompVar = (omp) ((omq) obj).L();
                Parcel parcelK = ompVar.k();
                ifl.e(parcelK, omoVar);
                parcelK.writeString(str);
                parcelK.writeInt(i);
                parcelK.writeStringArray(strArr);
                parcelK.writeByteArray(null);
                ompVar.m(1, parcelK);
            }
        };
        return r(oafVar.a());
    }
}
