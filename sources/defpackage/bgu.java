package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgu extends Exception {
    public bgu(Throwable th) {
        super("Library is not available: library either is not installed or was not loaded (AndroidManifest.xml is missing <uses-library>) or does not contain the class com.android.libraries.tv.tvsystem.media.TvAudioManager", th);
    }
}
