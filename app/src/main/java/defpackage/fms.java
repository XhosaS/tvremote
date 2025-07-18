package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fms implements ulk {
    public static final fmr a = new fmr();
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/datastore/device/migrations/SuggestedQueriesBackoffDurationsMigrationBuilder");
    private final Context c;
    private final zyh d;

    public fms(Context context, zyh zyhVar) {
        context.getClass();
        zyhVar.getClass();
        this.c = context;
        this.d = zyhVar;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.c, this.d);
        uljVarD.c = "com.google.android.katniss.libas.suggestedqueries";
        uljVarD.c("sq_default_backoff_duration_min", "sq_backoff_duration_min_for_search_tab", "sq_backoff_duration_min_for_media_srp", "sq_backoff_duration_min_for_for_you_tab", "sq_backoff_duration_min_for_movies_tab", "sq_backoff_duration_min_for_shows_tab", "sq_backoff_duration_min_for_apps_tab", "sq_backoff_duration_min_for_library_tab");
        uljVarD.d(false);
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) {
        fnp fnpVarC = (fnp) messageLite;
        ((zdv) b.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/SuggestedQueriesBackoffDurationsMigrationBuilder", "migrate", 55, "SuggestedQueriesBackoffDurationsMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fnpVarC == null) {
            fnp fnpVar = fnp.a;
            fnpVarC = fnq.c(new fno());
        }
        fno fnoVar = new fno();
        fnoVar.B(fnpVarC);
        fox foxVarI = fnq.i(fnoVar);
        fou fouVar = new fou();
        fouVar.B(foxVarI);
        fot fotVarA = fpa.a(fouVar);
        fos fosVar = new fos();
        fosVar.B(fotVarA);
        fmr fmrVar = a;
        foy.c(fmrVar.a(ullVar, "sq_default_backoff_duration_min"), fosVar);
        abwf abwfVarA = fmrVar.a(ullVar, "sq_backoff_duration_min_for_search_tab");
        if ((fosVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fosVar.y();
        }
        fot fotVar = (fot) fosVar.b;
        fot fotVar2 = fot.a;
        fotVar.d = abwfVarA;
        fotVar.b |= 2;
        foy.f(fmrVar.a(ullVar, "sq_backoff_duration_min_for_media_srp"), fosVar);
        foy.d(fmrVar.a(ullVar, "sq_backoff_duration_min_for_for_you_tab"), fosVar);
        foy.g(fmrVar.a(ullVar, "sq_backoff_duration_min_for_movies_tab"), fosVar);
        foy.h(fmrVar.a(ullVar, "sq_backoff_duration_min_for_shows_tab"), fosVar);
        foy.b(fmrVar.a(ullVar, "sq_backoff_duration_min_for_apps_tab"), fosVar);
        foy.e(fmrVar.a(ullVar, "sq_backoff_duration_min_for_library_tab"), fosVar);
        fot fotVarA2 = foy.a(fosVar);
        if ((fouVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fouVar.y();
        }
        fox foxVar = (fox) fouVar.b;
        fox foxVar2 = fox.a;
        foxVar.d = fotVarA2;
        foxVar.b |= 2;
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
