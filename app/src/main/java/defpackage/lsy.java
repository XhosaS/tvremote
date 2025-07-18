package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.presencemanager.PresentUser;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lsy extends kes implements lsq {
    private static final keh a = new keh();
    private static final kdy l;
    private static final kei m;

    static {
        lsw lswVar = new lsw();
        l = lswVar;
        m = new kei("PresenceManager.PRESENCE_REPORT_API", lswVar);
    }

    public lsy(Context context) {
        super(context, null, m, kee.a, ker.a);
    }

    @Override // defpackage.lsq
    public final lvf a(final PresentUser presentUser) {
        kib kibVar = new kib();
        kibVar.c = new Feature[]{lsp.b};
        kibVar.a = new khv() { // from class: lsv
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                lsz lszVar = (lsz) obj;
                lsx lsxVar = new lsx((lvj) obj2);
                lsu lsuVar = (lsu) lszVar.v();
                Context context = lszVar.b;
                ApiMetadata apiMetadataA = knv.a();
                Parcel parcelA = lsuVar.a();
                erv.b(parcelA, presentUser);
                erv.c(parcelA, lsxVar);
                erv.b(parcelA, apiMetadataA);
                lsuVar.J(1, parcelA);
            }
        };
        kibVar.d = 25807;
        return super.g(1, kibVar.a());
    }
}
