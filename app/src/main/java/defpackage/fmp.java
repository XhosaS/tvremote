package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmp implements ulk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/device/migrations/HotwordDataMigrationBuilder");
    private final Context b;
    private final zyh c;

    public fmp(Context context, zyh zyhVar) {
        context.getClass();
        zyhVar.getClass();
        this.b = context;
        this.c = zyhVar;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.b, this.c);
        uljVarD.c = "com.google.android.katniss.setting";
        uljVarD.c("hotowrd_toggle_state");
        uljVarD.d(false);
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) {
        fnp fnpVarC = (fnp) messageLite;
        ((zdv) a.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/HotwordDataMigrationBuilder", "migrate", 55, "HotwordDataMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fnpVarC == null) {
            fnp fnpVar = fnp.a;
            fnpVarC = fnq.c(new fno());
        }
        fno fnoVar = new fno();
        fnoVar.B(fnpVarC);
        fod fodVarF = fnq.f(fnoVar);
        fob fobVar = new fob();
        fobVar.B(fodVarF);
        SharedPreferences sharedPreferences = ullVar.a;
        ullVar.e("hotowrd_toggle_state");
        foe.b(!sharedPreferences.contains("hotowrd_toggle_state") ? foc.TOGGLE_UNSPECIFIED : ullVar.d("hotowrd_toggle_state", false) ? foc.TOGGLE_ON : foc.TOGGLE_OFF, fobVar);
        fod fodVarA = foe.a(fobVar);
        if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fnoVar.y();
        }
        fnp fnpVar2 = (fnp) fnoVar.b;
        fnpVar2.h = fodVarA;
        fnpVar2.b |= 32;
        return fnq.c(fnoVar);
    }
}
