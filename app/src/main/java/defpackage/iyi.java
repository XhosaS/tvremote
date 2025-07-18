package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.apps.tvsearch.suggestions.starters.FallbackSuggestionDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyi implements aejg {
    public static FallbackSuggestionDatabase b(Context context, Executor executor) {
        context.getClass();
        executor.getClass();
        bmi bmiVarA = bly.a(context, FallbackSuggestionDatabase.class, "fallback_suggestion_database");
        bmiVarA.b(iyb.a);
        bmiVarA.d = executor;
        bmiVarA.g = bmiVarA.b != null ? new Intent(bmiVarA.a, (Class<?>) MultiInstanceInvalidationService.class) : null;
        FallbackSuggestionDatabase fallbackSuggestionDatabase = (FallbackSuggestionDatabase) bmiVarA.a();
        fallbackSuggestionDatabase.getClass();
        return fallbackSuggestionDatabase;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
