package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igz {
    private static final tui a = tui.l("com/google/android/apps/googletv/app/common/FallbackUtilsKt");

    public static final void a(String str, boolean z, yjk yjkVar, yjk yjkVar2, yjv yjvVar, yjv yjvVar2) {
        if (!z) {
            b(str, yjkVar2, yjvVar2);
            return;
        }
        try {
            yjkVar.a();
        } catch (Exception e) {
            ((tug) ((tug) a.g().h(tvo.a, "GTVM-FallbackUtils")).i(e).j("com/google/android/apps/googletv/app/common/FallbackUtilsKt", "fallbackToOldFeatureIfFlagNotEnabledOrNewFeatureFails", 37, "FallbackUtils.kt")).v("Updated code path for %s failed to execute", str);
            yjvVar.a(e);
            b(str, yjkVar2, yjvVar2);
        }
    }

    public static final void b(String str, yjk yjkVar, yjv yjvVar) {
        try {
            yjkVar.a();
        } catch (Exception e) {
            ((tug) ((tug) a.g().h(tvo.a, "GTVM-FallbackUtils")).i(e).j("com/google/android/apps/googletv/app/common/FallbackUtilsKt", "invokeOldFeatureWithExceptionHandling", 54, "FallbackUtils.kt")).v("Old code path for %s failed to execute", str);
            yjvVar.a(e);
        }
    }
}
