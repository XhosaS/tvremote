package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kno extends kes implements kew {
    public kno(Context context) {
        super(context, null, knq.a, kee.a, ker.a);
    }

    public final lvf a() {
        kib kibVar = new kib();
        kibVar.c = new Feature[]{knh.a};
        kibVar.a = new khv() { // from class: knm
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                kni kniVar = (kni) obj;
                knn knnVar = new knn((lvj) obj2);
                knl knlVar = (knl) kniVar.v();
                Context context = kniVar.b;
                ApiMetadata apiMetadataA = knv.a();
                Parcel parcelA = knlVar.a();
                erv.c(parcelA, knnVar);
                erv.b(parcelA, apiMetadataA);
                knlVar.J(1, parcelA);
            }
        };
        kibVar.d = 32001;
        return super.g(0, kibVar.a());
    }
}
