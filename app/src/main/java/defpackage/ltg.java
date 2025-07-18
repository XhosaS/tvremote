package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ltg extends kes {
    public ltg(Context context) {
        super(context, null, ltc.c, kee.a, ker.a);
    }

    public final lvf a() {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: ltd
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                ltm ltmVar = (ltm) obj;
                ltl ltlVar = (ltl) ltmVar.v();
                lte lteVar = new lte((lvj) obj2);
                Context context = ltmVar.b;
                ApiMetadata apiMetadataA = knv.a();
                Parcel parcelA = ltlVar.a();
                erv.c(parcelA, lteVar);
                erv.b(parcelA, apiMetadataA);
                ltlVar.K(1, parcelA);
            }
        };
        kibVar.d = 3901;
        return super.g(0, kibVar.a());
    }
}
