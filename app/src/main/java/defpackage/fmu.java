package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmu implements ulk {
    public static final fmt a = new fmt();
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/datastore/device/migrations/SuggestedQueriesDisplayTimestampsMigrationBuilder");
    private static final String[] c = {"sq_display_timestamp_for_search_tab", "sq_display_timestamp_for_media_srp", "sq_display_timestamp_for_for_you_tab", "sq_display_timestamp_for_movies_tab", "sq_display_timestamp_for_shows_tab", "sq_display_timestamp_for_apps_tab", "sq_display_timestamp_for_library_tab"};
    private final Context d;
    private final zyh e;

    public fmu(Context context, zyh zyhVar) {
        context.getClass();
        zyhVar.getClass();
        this.d = context;
        this.e = zyhVar;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.d, this.e);
        uljVarD.c = "com.google.android.katniss.setting";
        uljVarD.c((String[]) Arrays.copyOf(c, 7));
        uljVarD.d(false);
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) {
        fnp fnpVarC = (fnp) messageLite;
        ((zdv) b.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/SuggestedQueriesDisplayTimestampsMigrationBuilder", "migrate", 58, "SuggestedQueriesDisplayTimestampsMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fnpVarC == null) {
            fnp fnpVar = fnp.a;
            fnpVarC = fnq.c(new fno());
        }
        fno fnoVar = new fno();
        fnoVar.B(fnpVarC);
        fox foxVarI = fnq.i(fnoVar);
        fou fouVar = new fou();
        fouVar.B(foxVarI);
        fow fowVarB = fpa.b(fouVar);
        fov fovVar = new fov();
        fovVar.B(fowVarB);
        fmt fmtVar = a;
        abzy abzyVarA = fmtVar.a(ullVar, "sq_display_timestamp_for_search_tab");
        if ((fovVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fovVar.y();
        }
        fow fowVar = (fow) fovVar.b;
        fow fowVar2 = fow.a;
        fowVar.c = abzyVarA;
        fowVar.b |= 1;
        foz.e(fmtVar.a(ullVar, "sq_display_timestamp_for_media_srp"), fovVar);
        foz.c(fmtVar.a(ullVar, "sq_display_timestamp_for_for_you_tab"), fovVar);
        foz.f(fmtVar.a(ullVar, "sq_display_timestamp_for_movies_tab"), fovVar);
        foz.g(fmtVar.a(ullVar, "sq_display_timestamp_for_shows_tab"), fovVar);
        foz.b(fmtVar.a(ullVar, "sq_display_timestamp_for_apps_tab"), fovVar);
        foz.d(fmtVar.a(ullVar, "sq_display_timestamp_for_library_tab"), fovVar);
        fow fowVarA = foz.a(fovVar);
        if ((fouVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fouVar.y();
        }
        fox foxVar = (fox) fouVar.b;
        fox foxVar2 = fox.a;
        foxVar.c = fowVarA;
        foxVar.b |= 1;
        fox foxVarC = fpa.c(fouVar);
        if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fnoVar.y();
        }
        fnp fnpVar2 = (fnp) fnoVar.b;
        fnpVar2.m = foxVarC;
        fnpVar2.b |= 2048;
        return fnq.c(fnoVar);
    }
}
