package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqo extends kes implements kqf {
    private static final keh a = new keh();
    private static final kdy l;
    private static final kei m;

    static {
        kqm kqmVar = new kqm();
        l = kqmVar;
        m = new kei("MdiSync.API", kqmVar);
    }

    public kqo(Context context, kqg kqgVar) {
        super(context, null, m, kqgVar, ker.a);
    }

    @Override // defpackage.kqf
    public final lvf a(byte[] bArr, SyncOptions syncOptions, final CallerInfo callerInfo) {
        ((kqg) this.f).b();
        final SyncRequest syncRequest = new SyncRequest(1, bArr, syncOptions, Instant.now().toEpochMilli());
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: kql
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                kqp kqpVar = (kqp) obj;
                kqn kqnVar = new kqn((lvj) obj2);
                kqk kqkVar = (kqk) kqpVar.v();
                Context context = kqpVar.b;
                ApiMetadata apiMetadataA = knv.a();
                Parcel parcelA = kqkVar.a();
                erv.c(parcelA, kqnVar);
                erv.b(parcelA, syncRequest);
                erv.b(parcelA, callerInfo);
                erv.b(parcelA, apiMetadataA);
                kqkVar.J(1, parcelA);
            }
        };
        int i = syncRequest.d - 1;
        kibVar.c = (i == 1 || i == 2 || i == 3) ? new Feature[]{kqe.b} : i != 4 ? new Feature[0] : new Feature[]{kqe.a};
        kibVar.d = 15902;
        return super.g(0, kibVar.a());
    }
}
