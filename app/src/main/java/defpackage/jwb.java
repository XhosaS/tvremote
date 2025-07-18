package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwb extends kes implements jvx {
    private static final keh a = new keh();
    private static final kdy l;
    private static final kei m;

    static {
        jvz jvzVar = new jvz();
        l = jvzVar;
        m = new kei("Audit.API", jvzVar);
    }

    public jwb(Context context) {
        super(context, null, m, null, ker.a);
    }

    @Override // defpackage.jvx
    public final lvf a(final LogAuditRecordsRequest logAuditRecordsRequest) {
        kib kibVar = new kib();
        kibVar.d = 6901;
        kibVar.a = new khv() { // from class: jvy
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                jwd jwdVar = (jwd) obj;
                jwa jwaVar = new jwa((lvj) obj2);
                jwe jweVar = (jwe) jwdVar.v();
                Context context = jwdVar.b;
                ApiMetadata apiMetadataA = knv.a();
                Parcel parcelA = jweVar.a();
                erv.b(parcelA, logAuditRecordsRequest);
                erv.c(parcelA, jwaVar);
                erv.b(parcelA, apiMetadataA);
                jweVar.J(1, parcelA);
            }
        };
        return super.g(1, kibVar.a());
    }
}
