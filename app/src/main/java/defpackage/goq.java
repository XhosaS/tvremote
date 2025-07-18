package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goq implements agux {
    @Override // defpackage.agux
    public final /* synthetic */ Object a(Object obj) {
        int i;
        try {
            i = ((vsx) obj).a.getInt(1);
        } catch (RuntimeException e) {
            ((zdv) ((zdv) gor.a.d()).p(e).q("com/google/android/apps/tvsearch/media/control/keycodeinjector/KeyCodeInjectorImpl$getSupportedKeyCodes$2", "invoke-JfnmSAo", 68, "KeyCodeInjectorImpl.kt")).u("Failed to read supported key code");
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
