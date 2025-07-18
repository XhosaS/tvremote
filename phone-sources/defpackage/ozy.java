package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Objects;
import j$.util.function.BiPredicate$CC;
import java.util.concurrent.ExecutionException;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozy implements ozh {
    private static final tvn a = tvn.n("GnpSdk");
    private final oyi b;
    private final Context c;
    private final uhp d;

    public ozy(Context context, uhp uhpVar, oyi oyiVar) {
        this.c = context;
        this.d = uhpVar;
        this.b = oyiVar;
    }

    @Override // defpackage.ozh
    public final ozg a() {
        return ozg.LANGUAGE;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final /* synthetic */ boolean test(Object obj, Object obj2) {
        ozj ozjVar = (ozj) obj2;
        if (((uzd) obj) == null) {
            if (ozjVar == null) {
                return false;
            }
            this.b.c(ozjVar.b, "TriggeringConditions is null in LanguagePredicate", new Object[0]);
            return false;
        }
        if (ozjVar == null) {
            ((tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/LanguagePredicate", "test", 59, "LanguagePredicate.java")).s("TriggeringConditionsEvalContext is null in LanguagePredicate");
            return false;
        }
        try {
            return Objects.equals(oyb.a(this.c), ((SharedPreferences) this.d.get()).getString("SYNC_LANGUAGE", null));
        } catch (InterruptedException | ExecutionException e) {
            ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/LanguagePredicate", "test", 'C', "LanguagePredicate.java")).s("Failed to retrieve SYNC_LANGUAGE_SHARED_PREFS_KEY from shared preferences.");
            return false;
        }
    }
}
