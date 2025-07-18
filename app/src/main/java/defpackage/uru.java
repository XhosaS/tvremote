package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uru extends Exception {
    public uru(Throwable th) {
        super("Library is not available: library either is not installed or was not loaded (AndroidManifest.xml is missing <uses-library>) or does not contain the class com.android.libraries.tv.tvsystem.media.TvAudioManager", th);
    }
}
