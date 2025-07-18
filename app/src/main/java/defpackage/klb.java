package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* compiled from: PG */
/* loaded from: classes.dex */
public class klb extends kes implements kkt {
    private static final keh a = new keh();
    private static final kdy l;
    private static final kei m;

    static {
        kla klaVar = new kla();
        l = klaVar;
        m = new kei("ClientTelemetry.API", klaVar);
    }

    public klb(Context context, kku kkuVar) {
        super(context, null, m, kkuVar, ker.a);
    }

    @Override // defpackage.kkt
    public final lvf a(final TelemetryData telemetryData) {
        kib kibVar = new kib();
        kibVar.c = new Feature[]{kbk.a};
        kibVar.b = false;
        kibVar.a = new khv() { // from class: kkz
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                kky kkyVar = (kky) ((klc) obj).v();
                Parcel parcelA = kkyVar.a();
                erv.b(parcelA, telemetryData);
                kkyVar.K(1, parcelA);
                ((lvj) obj2).a.p(null);
            }
        };
        return super.g(2, kibVar.a());
    }
}
