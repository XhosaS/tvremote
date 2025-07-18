package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jyg extends kes implements jxz {
    private static final keh a = new keh();
    private static final kdy l;
    private static final kei m;

    static {
        jyf jyfVar = new jyf();
        l = jyfVar;
        m = new kei("AccountDataService.API", jyfVar);
    }

    public jyg(Context context) {
        super(context, null, m, ked.a, new keq().a());
    }

    @Override // defpackage.jxz
    public final lvf a(final String str) {
        kib kibVar = new kib();
        kibVar.c = new Feature[]{jwf.e};
        kibVar.a = new khv() { // from class: jyd
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                jye jyeVar = new jye((lvj) obj2);
                jya jyaVar = (jya) ((jyh) obj).v();
                Parcel parcelA = jyaVar.a();
                erv.c(parcelA, jyeVar);
                parcelA.writeString(str);
                jyaVar.J(14, parcelA);
            }
        };
        kibVar.d = 1649;
        return super.g(1, kibVar.a());
    }
}
